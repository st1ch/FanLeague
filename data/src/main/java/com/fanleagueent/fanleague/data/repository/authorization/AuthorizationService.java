package com.fanleagueent.fanleague.data.repository.authorization;

import android.support.annotation.NonNull;
import com.fanleagueent.fanleague.domain.models.user.User;
import rx.Observable;

/**
 * Created by st1ch on 01.11.2016.
 */

public interface AuthorizationService {
  Observable<User> signUpStandard(@NonNull String email);

  Observable<User> loginStandard(@NonNull String login, @NonNull String password);

  Observable<User> loginFacebook(@NonNull String code, @NonNull String email);

  Observable<User> loginGoogle(@NonNull String code);

  Observable<Boolean> resetLink(@NonNull String email);
}
