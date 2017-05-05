package com.fanleagueent.fanleague.presentation.presentation.authorization;

import android.content.Intent;

import com.fanleagueent.fanleague.presentation.presentation.Presenter;
import com.fanleagueent.fanleague.presentation.view.authorization.AuthorizationView;

/**
 * Created by st1ch on 02.11.2016.
 */

public interface LogInPresenter extends Presenter<LogInPresenter.LogInView> {

    void logInUsernameOrEmail(String login, String password);

    void logInFacebook();

    void handleFacebookLogInResult(int requestCode, int resultCode, Intent data);

    void logInGoogle();

    void handleGoogleLogInResult(int requestCode, int resultCode, Intent data);

    interface LogInView extends AuthorizationView {
        void startFacebookRegistration();

        void showErrorInputLoginPassSnackbar();
    }
}
