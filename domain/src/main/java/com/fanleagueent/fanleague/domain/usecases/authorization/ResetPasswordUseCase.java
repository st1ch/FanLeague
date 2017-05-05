package com.fanleagueent.fanleague.domain.usecases.authorization;

import com.fanleagueent.fanleague.data.repositories.auth.AuthorizationService;
import com.fanleagueent.fanleague.domain.schedulers.ObserveOn;
import com.fanleagueent.fanleague.domain.schedulers.SubscribeOn;
import com.fanleagueent.fanleague.domain.usecases.UseCase;

import javax.inject.Inject;

import rx.Observable;

/**
 * Created by st1ch on 03.11.2016.
 */

public class ResetPasswordUseCase extends UseCase<Boolean> {

    private AuthorizationService authorizationService;
    private String email;

    @Inject
    public ResetPasswordUseCase(SubscribeOn subscribeOn, ObserveOn observeOn,
                                AuthorizationService authorizationService) {
        super(subscribeOn, observeOn);
        this.authorizationService = authorizationService;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    protected Observable<Boolean> getUseCase() {
        return authorizationService.resetLink(email);
    }
}
