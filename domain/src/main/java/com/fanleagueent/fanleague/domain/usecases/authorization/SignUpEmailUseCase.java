package com.fanleagueent.fanleague.domain.usecases.authorization;

import com.fanleagueent.fanleague.data.repositories.auth.AuthorizationService;
import com.fanleagueent.fanleague.data.repositories.user.UserRepository;
import com.fanleagueent.fanleague.domain.models.user.User;
import com.fanleagueent.fanleague.domain.schedulers.ObserveOn;
import com.fanleagueent.fanleague.domain.schedulers.SubscribeOn;
import com.fanleagueent.fanleague.domain.usecases.UseCase;

import javax.inject.Inject;

import rx.Observable;

/**
 * Created by st1ch on 01.11.2016.
 */

public class SignUpEmailUseCase extends UseCase<User> {

    private AuthorizationService authorizationService;
    private UserRepository userRepository;
    private String email;

    @Inject
    public SignUpEmailUseCase(SubscribeOn subscribeOn, ObserveOn observeOn,
                              AuthorizationService authorizationService,
                              UserRepository userRepository) {
        super(subscribeOn, observeOn);
        this.authorizationService = authorizationService;
        this.userRepository = userRepository;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    protected Observable<User> getUseCase() {
        return authorizationService.signUpStandard(email)
                .flatMap(user -> userRepository.saveUser(user));
    }

}
