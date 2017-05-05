package com.fanleagueent.fanleague.domain.usecases.authorization;

import android.content.Intent;
import android.text.TextUtils;

import com.fanleagueent.fanleague.data.repositories.auth.AuthorizationService;
import com.fanleagueent.fanleague.data.repositories.user.UserRepository;
import com.fanleagueent.fanleague.domain.models.user.User;
import com.fanleagueent.fanleague.domain.schedulers.ObserveOn;
import com.fanleagueent.fanleague.domain.schedulers.SubscribeOn;
import com.fanleagueent.fanleague.domain.usecases.UseCase;
import com.fanleagueent.fanleague.utils.FacebookManager;
import com.fanleagueent.fanleague.utils.PreferenceHelper;

import javax.inject.Inject;

import rx.Observable;

/**
 * Created by st1ch on 03.11.2016.
 */

public class LogInFacebookUseCase extends UseCase<User> {

    private AuthorizationService authorizationService;
    private UserRepository userRepository;
    private PreferenceHelper preferenceHelper;
    private FacebookManager facebookManager;
    private SubscribeOn subscribeOn;
    private ObserveOn observeOn;
    private String token;
    private String email;

    @Inject
    public LogInFacebookUseCase(SubscribeOn subscribeOn, ObserveOn observeOn,
                                AuthorizationService authorizationService,
                                UserRepository userRepository,
                                PreferenceHelper preferenceHelper,
                                FacebookManager facebookManager) {
        super(subscribeOn, observeOn);
        this.authorizationService = authorizationService;
        this.userRepository = userRepository;
        this.preferenceHelper = preferenceHelper;
        this.facebookManager = facebookManager;
        this.subscribeOn = subscribeOn;
        this.observeOn = observeOn;
    }

    public void handleActivityResult(int requestCode, int resultCode, Intent data) {
        facebookManager.handleActivityResult(requestCode, resultCode, data);
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    protected Observable<User> getUseCase() {
        token = preferenceHelper.getFacebookToken();
        if (TextUtils.isEmpty(token)) {
            facebookManager.logIn();
            return facebookManager.init()
                    .flatMap(facebookUser -> {
                        token = facebookUser.getToken();
                        preferenceHelper.saveFacebookToken(token);
                        return authorizationService.loginFacebook(token, facebookUser.getEmail())
                                .subscribeOn(subscribeOn.getScheduler())
                                .observeOn(observeOn.getScheduler());
                    })
                    .flatMap(user -> userRepository.saveUser(user));

        } else return authorizationService.loginFacebook(token, email)
                .map(user -> {
                    preferenceHelper.clearFacebookToken();
                    return user;
                })
                .subscribeOn(subscribeOn.getScheduler())
                .observeOn(observeOn.getScheduler())
                .flatMap(user -> userRepository.saveUser(user));
    }
}
