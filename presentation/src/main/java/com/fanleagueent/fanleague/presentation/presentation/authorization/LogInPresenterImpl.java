package com.fanleagueent.fanleague.presentation.presentation.authorization;

import android.content.Intent;
import android.text.TextUtils;

import com.fanleagueent.fanleague.data.exception.FacebookEmailException;
import com.fanleagueent.fanleague.domain.models.user.User;
import com.fanleagueent.fanleague.domain.subscribers.BaseProgressSubscriber;
import com.fanleagueent.fanleague.domain.subscribers.BaseUseCaseSubscriber;
import com.fanleagueent.fanleague.presentation.presentation.ProgressConnectionPresenter;

import java.io.File;


/**
 * Created by st1ch on 02.11.2016.
 */

public class LogInPresenterImpl extends ProgressConnectionPresenter<LogInPresenter.LogInView>
    implements LogInPresenter {

  private LogInStandardUseCase logInStandardUseCase;
  private LogInFacebookUseCase logInFacebookUseCase;
  private LogInGoogleUseCase logInGoogleUseCase;
  private LoadAvatarUseCase loadAvatarUseCase;
  private RegisterFCMUseCase registerFCMUseCase;

  public LogInPresenterImpl(LogInStandardUseCase logInStandardUseCase,
      LogInFacebookUseCase logInFacebookUseCase, LogInGoogleUseCase logInGoogleUseCase,
      LoadAvatarUseCase loadAvatarUseCase, RegisterFCMUseCase registerFCMUseCase) {
    this.logInStandardUseCase = logInStandardUseCase;
    this.logInFacebookUseCase = logInFacebookUseCase;
    this.logInGoogleUseCase = logInGoogleUseCase;
    this.loadAvatarUseCase = loadAvatarUseCase;
    this.registerFCMUseCase = registerFCMUseCase;
  }

  @Override public void onDestroy() {
    logInGoogleUseCase.unsubscribe();
    logInStandardUseCase.unsubscribe();
    logInFacebookUseCase.unsubscribe();
  }

  @Override public void logInUsernameOrEmail(String login, String password) {
    try {
      checkViewBound();
      getView().hideKeyboard();

      checkConnection();
      if (checkLoginPass(login, password)) {
        logInStandardUseCase.setCredentials(login, password);
        logInStandardUseCase.execute(getLogInSubscriber());
      } else {
        getView().showErrorInputLoginPassSnackbar();
      }
    } catch (ViewNotBoundException | ConnectionException e) {
      e.printStackTrace();
    }
  }

  @Override public void logInFacebook() {
    try {
      checkViewBound();
      getView().hideKeyboard();

      checkConnection();
      logInFacebookUseCase.execute(getFacebookLogInSubscriber());
    } catch (ViewNotBoundException | ConnectionException e) {
      e.printStackTrace();
    }
  }

  @Override public void handleFacebookLogInResult(int requestCode, int resultCode, Intent data) {
    logInFacebookUseCase.handleActivityResult(requestCode, resultCode, data);
  }

  @Override public void logInGoogle() {
    try {
      checkViewBound();
      getView().hideKeyboard();

      checkConnection();
      logInGoogleUseCase.logIn();
    } catch (ViewNotBoundException | ConnectionException e) {
      e.printStackTrace();
    }
  }

  @Override public void handleGoogleLogInResult(int requestCode, int resultCode, Intent data) {
    if (requestCode == REQUEST_CODE_GOOGLE_SIGN_IN) {
      logInGoogleUseCase.setSignInResult(data);
      logInGoogleUseCase.execute(getLogInSubscriber());
    }
  }

  private BaseProgressSubscriber<User> getLogInSubscriber() {
    return new BaseProgressSubscriber<User>(this) {
      @Override public void onNext(User user) {
        super.onNext(user);
        try {
          checkViewBound();

          getView().onSuccess();
          loadAvatarUseCase.setUser(user);
          loadAvatarUseCase.execute(loadAvatarSubscriber());

          registerFCMUseCase.execute(registerFCMSubscriber());
        } catch (ViewNotBoundException e) {
          e.printStackTrace();
        }
      }
    };
  }

  private BaseProgressSubscriber<User> getFacebookLogInSubscriber() {
    return new BaseProgressSubscriber<User>(this) {
      @Override public void onError(Throwable e) {
        super.onError(e);
        try {
          checkViewBound();
          if (e instanceof FacebookEmailException) {
            getView().startFacebookRegistration();
          }
        } catch (ViewNotBoundException e1) {
          e1.printStackTrace();
        }
      }

      @Override public void onNext(User user) {
        super.onNext(user);
        try {
          checkViewBound();

          getView().onSuccess();
          loadAvatarUseCase.setUser(user);
          loadAvatarUseCase.execute(loadAvatarSubscriber());

          registerFCMUseCase.execute(registerFCMSubscriber());
        } catch (ViewNotBoundException e) {
          e.printStackTrace();
        }
      }
    };
  }

  private BaseUseCaseSubscriber<File> loadAvatarSubscriber() {
    return new BaseUseCaseSubscriber<>();
  }

  private BaseUseCaseSubscriber<Boolean> registerFCMSubscriber() {
    return new BaseUseCaseSubscriber<>();
  }

  private boolean checkLoginPass(String login, String password) {
    return !TextUtils.isEmpty(login) && !TextUtils.isEmpty(password);
  }
}
