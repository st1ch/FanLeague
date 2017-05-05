package com.fanleagueent.fanleague.domain.usecases.authorization;

import com.fanleagueent.fanleague.domain.models.user.User;
import com.fanleagueent.fanleague.domain.repository.AuthorizationService;
import com.fanleagueent.fanleague.domain.schedulers.ObserveOn;
import com.fanleagueent.fanleague.domain.schedulers.SubscribeOn;
import com.fanleagueent.fanleague.domain.usecases.UseCase;

import javax.inject.Inject;

import io.reactivex.Maybe;


/**
 * Created by st1ch on 02.11.2016.
 */

public class LogInStandardUseCase extends UseCase<User> {

    private AuthorizationService authorizationService;
    private String login;
    private String password;

    @Inject
    public LogInStandardUseCase(SubscribeOn subscribeOn, ObserveOn observeOn,
                                AuthorizationService authorizationService) {
        super(subscribeOn, observeOn);
        this.authorizationService = authorizationService;
    }

    public void setCredentials(String login, String password) {
        this.login = login;
        this.password = password;
    }

    @Override
    protected Maybe<User> getUseCase() {
        return authorizationService.loginStandard(login, password);
    }

}
