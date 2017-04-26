package com.fanleagueent.fanleague.domain.repository;

import com.fanleagueent.fanleague.domain.models.user.User;
import io.reactivex.Maybe;

/**
 * Created by st1ch on 01.11.2016.
 */

public interface AuthorizationService {
  Maybe<User> signUpStandard(String email);

  Maybe<User> loginStandard(String login, String password);

  Maybe<User> loginFacebook(String code, String email);

  Maybe<User> loginGoogle(String code);

  Maybe<Boolean> resetLink(String email);
}
