package com.fanleagueent.fanleague.domain.usecases.authorization;

import android.content.Intent;

import com.fanleagueent.fanleague.data.repositories.auth.AuthorizationService;
import com.fanleagueent.fanleague.data.repositories.user.UserRepository;
import com.fanleagueent.fanleague.domain.models.user.User;
import com.fanleagueent.fanleague.domain.schedulers.ObserveOn;
import com.fanleagueent.fanleague.domain.schedulers.SubscribeOn;
import com.fanleagueent.fanleague.domain.usecases.UseCase;
import com.fanleagueent.fanleague.utils.GooglePlusManager;

import javax.inject.Inject;

import rx.Observable;

/**
 * Created by st1ch on 04.11.2016.
 */

public class LogInGoogleUseCase extends UseCase<User> {

    private AuthorizationService authorizationService;
    private UserRepository userRepository;
    private GooglePlusManager googlePlusManager;

    private Intent signInResult;

    @Inject
    public LogInGoogleUseCase(SubscribeOn subscribeOn, ObserveOn observeOn,
                              AuthorizationService authorizationService,
                              UserRepository userRepository,
                              GooglePlusManager googlePlusManager) {
        super(subscribeOn, observeOn);
        this.authorizationService = authorizationService;
        this.userRepository = userRepository;
        this.googlePlusManager = googlePlusManager;
    }

    public void logIn() {
        googlePlusManager.logIn();
    }

    public void setSignInResult(Intent signInResult) {
        this.signInResult = signInResult;
    }

    @Override
    protected Observable<User> getUseCase() {
        final String[] token = new String[1];
        return googlePlusManager.handleGoogleLogInResult(signInResult)
                .flatMap(googleUser -> {
                    googlePlusManager.disconnect();
                    token[0] = googleUser.getToken();
                    return authorizationService.loginGoogle(token[0]);
                })
                .flatMap(user -> userRepository.saveUser(user));
    }

}
