package com.fanleagueent.fanleague.data.repository.authorization;

import android.support.annotation.NonNull;
import com.fanleagueent.fanleague.data.cache.PreferenceHelper;
import com.fanleagueent.fanleague.data.entity.entities.authorization.AuthorizationEntity;
import com.fanleagueent.fanleague.data.entity.mappers.MapperFactory;
import com.fanleagueent.fanleague.data.exception.FacebookEmailException;
import com.fanleagueent.fanleague.data.net.api.AuthorizationAPI;
import com.fanleagueent.fanleague.data.net.requests.auth.AuthStandardRequest;
import com.fanleagueent.fanleague.data.net.requests.auth.EmailStandardRequest;
import com.fanleagueent.fanleague.data.net.requests.auth.FBCredentials;
import com.fanleagueent.fanleague.data.net.requests.auth.GoogleCredentials;
import com.fanleagueent.fanleague.data.observables.BaseResponseObservable;
import com.fanleagueent.fanleague.domain.models.user.User;
import com.fanleagueent.fanleague.domain.repository.AuthorizationService;
import io.reactivex.Maybe;

/**
 * Created by st1ch on 01.11.2016.
 */

public class AuthorizationServiceImpl implements AuthorizationService {

  private final AuthorizationAPI api;
  private final PreferenceHelper preferenceHelper;
  private MapperFactory mapperFactory;

  public AuthorizationServiceImpl(AuthorizationAPI api, PreferenceHelper preferenceHelper,
      MapperFactory mapperFactory) {
    this.api = api;
    this.preferenceHelper = preferenceHelper;
    this.mapperFactory = mapperFactory;
  }

  @Override public Maybe<User> signUpStandard(@NonNull String email) {
    return api.registrationStandard(new EmailStandardRequest(email))
        .flatMap(BaseResponseObservable::new)
        .flatMap(authorizationResponse -> {

          AuthorizationEntity data = authorizationResponse.getData();

          User user =
              mapperFactory.userMapperFactory().getUserMapper().transform(data.getUserEntity());

          saveUserToken(user.getId(), data.getAccessToken());

          return Maybe.just(user);
        });
  }

  @Override public Maybe<User> loginStandard(@NonNull String login, @NonNull String password) {
    return api.loginStandard(new AuthStandardRequest(login, password))
        .flatMap(BaseResponseObservable::new)
        .flatMap(authorizationResponse -> {

          AuthorizationEntity data = authorizationResponse.getData();

          User user =
              mapperFactory.userMapperFactory().getUserMapper().transform(data.getUserEntity());

          saveUserToken(user.getId(), data.getAccessToken());

          return Maybe.just(user);
        });
  }

  @Override public Maybe<User> loginFacebook(@NonNull String code, @NonNull String email) {
    return api.loginFacebook(new FBCredentials(code, email)).flatMap(response -> {
      if (response.code() == 422) {
        return Maybe.error(new FacebookEmailException());
      } else {
        return Maybe.just(response.body());
      }
    }).flatMap(BaseResponseObservable::new).flatMap(authorizationResponse -> {

      AuthorizationEntity data = authorizationResponse.getData();

      User user = mapperFactory.userMapperFactory().getUserMapper().transform(data.getUserEntity());

      saveUserToken(user.getId(), data.getAccessToken());

      return Maybe.just(user);
    });
  }

  @Override public Maybe<User> loginGoogle(@NonNull String code) {
    return api.loginGoogle(new GoogleCredentials(code))
        .flatMap(BaseResponseObservable::new)
        .flatMap(authorizationResponse -> {

          AuthorizationEntity data = authorizationResponse.getData();

          User user =
              mapperFactory.userMapperFactory().getUserMapper().transform(data.getUserEntity());

          saveUserToken(user.getId(), data.getAccessToken());

          return Maybe.just(user);
        });
  }

  @Override public Maybe<Boolean> resetLink(@NonNull String email) {
    return api.resetLink(new EmailStandardRequest(email))
        .flatMap(BaseResponseObservable::new)
        .map(o -> true);
  }

  private void saveUserToken(String userId, String accessToken) {
    preferenceHelper.setAccessToken(accessToken);
    preferenceHelper.setUserId(userId);
  }
}
