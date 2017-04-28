package com.fanleagueent.fanleague.data.repository.authorization;

import android.support.annotation.NonNull;
import com.fanleagueent.fanleague.data.cache.PreferenceHelper;
import com.fanleagueent.fanleague.data.entity.BaseResponse;
import com.fanleagueent.fanleague.data.entity.entities.authorization.AuthorizationEntity;
import com.fanleagueent.fanleague.data.entity.mappers.MapperFactory;
import com.fanleagueent.fanleague.data.exception.FacebookEmailException;
import com.fanleagueent.fanleague.data.exception.NetworkConnectionException;
import com.fanleagueent.fanleague.data.net.api.AuthorizationAPI;
import com.fanleagueent.fanleague.data.net.requests.auth.AuthStandardRequest;
import com.fanleagueent.fanleague.data.net.requests.auth.EmailStandardRequest;
import com.fanleagueent.fanleague.data.net.requests.auth.FBCredentials;
import com.fanleagueent.fanleague.data.net.requests.auth.GoogleCredentials;
import com.fanleagueent.fanleague.data.observables.BaseResponseObservable;
import com.fanleagueent.fanleague.data.repository.BaseRemoteDataSource;
import com.fanleagueent.fanleague.data.utils.ConnectionUtil;
import com.fanleagueent.fanleague.domain.models.user.User;
import com.fanleagueent.fanleague.domain.repository.AuthorizationService;
import io.reactivex.Maybe;
import io.reactivex.MaybeTransformer;

/**
 * Created by st1ch on 01.11.2016.
 */

public class AuthorizationServiceImpl extends BaseRemoteDataSource implements AuthorizationService {

  private final AuthorizationAPI api;
  private final PreferenceHelper preferenceHelper;
  private MapperFactory mapperFactory;

  public AuthorizationServiceImpl(ConnectionUtil connectionUtil, AuthorizationAPI api,
      PreferenceHelper preferenceHelper, MapperFactory mapperFactory) {
    super(connectionUtil);
    this.api = api;
    this.preferenceHelper = preferenceHelper;
    this.mapperFactory = mapperFactory;
  }

  @Override public Maybe<User> signUpStandard(@NonNull String email) {
    try {
      checkConnection();

      return api.registrationStandard(new EmailStandardRequest(email))
          .flatMap(BaseResponseObservable::new)
          .map(BaseResponse::getData)
          .compose(saveToken());
    } catch (NetworkConnectionException e) {
      return Maybe.error(e);
    }
  }

  @Override public Maybe<User> loginStandard(@NonNull String login, @NonNull String password) {
    try {
      checkConnection();

      return api.loginStandard(new AuthStandardRequest(login, password))
          .flatMap(BaseResponseObservable::new)
          .map(BaseResponse::getData)
          .compose(saveToken());
    } catch (NetworkConnectionException e) {
      return Maybe.error(e);
    }
  }

  @Override public Maybe<User> loginFacebook(@NonNull String code, @NonNull String email) {
    try {
      checkConnection();

      return api.loginFacebook(new FBCredentials(code, email)).flatMap(response -> {
        if (response.code() == 422) {
          return Maybe.error(new FacebookEmailException());
        } else {
          return Maybe.just(response.body());
        }
      }).flatMap(BaseResponseObservable::new).map(BaseResponse::getData).compose(saveToken());
    } catch (NetworkConnectionException e) {
      return Maybe.error(e);
    }
  }

  @Override public Maybe<User> loginGoogle(@NonNull String code) {
    try {
      checkConnection();

      return api.loginGoogle(new GoogleCredentials(code))
          .flatMap(BaseResponseObservable::new)
          .map(BaseResponse::getData)
          .compose(saveToken());
    } catch (NetworkConnectionException e) {
      return Maybe.error(e);
    }
  }

  @Override public Maybe<Boolean> resetLink(@NonNull String email) {
    try {
      checkConnection();

      return api.resetLink(new EmailStandardRequest(email))
          .flatMap(BaseResponseObservable::new)
          .map(o -> true);
    } catch (NetworkConnectionException e) {
      return Maybe.error(e);
    }
  }

  @NonNull private MaybeTransformer<AuthorizationEntity, User> saveToken() {
    return upstream -> upstream.map(authorizationEntity -> {

      User user = mapperFactory.userMapperFactory()
          .getUserMapper()
          .transform(authorizationEntity.getUserEntity());

      saveUserToken(user.getId(), authorizationEntity.getAccessToken());

      return user;
    });
  }

  private void saveUserToken(String userId, String accessToken) {
    preferenceHelper.setAccessToken(accessToken);
    preferenceHelper.setUserId(userId);
  }
}
