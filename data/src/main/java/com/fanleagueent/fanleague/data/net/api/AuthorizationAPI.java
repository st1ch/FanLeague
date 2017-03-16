package com.fanleagueent.fanleague.data.net.api;

import com.fanleagueent.fanleague.data.constants.ApiConfig;
import com.fanleagueent.fanleague.data.entity.BaseResponse;
import com.fanleagueent.fanleague.data.entity.entities.authorization.AuthorizationEntity;
import com.fanleagueent.fanleague.data.net.requests.auth.AuthStandardRequest;
import com.fanleagueent.fanleague.data.net.requests.auth.EmailStandardRequest;
import com.fanleagueent.fanleague.data.net.requests.auth.FBCredentials;
import com.fanleagueent.fanleague.data.net.requests.auth.GoogleCredentials;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.POST;
import rx.Observable;

/**
 * Created by st1ch on 01.11.2016.
 */

public interface AuthorizationAPI {

  String AUTH = "/auth";
  String LOGIN = "/login";
  String REGISTRATION = "/registration";
  String STANDARD = "/standard";
  String FACEBOOK = "/facebook";
  String GOOGLE = "/google";
  String PASSWORD = "/password";
  String RESET_LINK = "/send-reset-link";

  @POST(ApiConfig.API_VERSION + AUTH + REGISTRATION + STANDARD)
  Observable<BaseResponse<AuthorizationEntity>> registrationStandard(
      @Body EmailStandardRequest emailStandardRequest);

  @POST(ApiConfig.API_VERSION + AUTH + LOGIN + STANDARD)
  Observable<BaseResponse<AuthorizationEntity>> loginStandard(
      @Body AuthStandardRequest authCredentials);

  @POST(ApiConfig.API_VERSION + AUTH + LOGIN + FACEBOOK)
  Observable<Response<BaseResponse<AuthorizationEntity>>> loginFacebook(
      @Body FBCredentials fbCredentials);

  @POST(ApiConfig.API_VERSION + AUTH + LOGIN + GOOGLE)
  Observable<BaseResponse<AuthorizationEntity>> loginGoogle(
      @Body GoogleCredentials googleCredentials);

  @POST(ApiConfig.API_VERSION + AUTH + PASSWORD + RESET_LINK)
  Observable<BaseResponse<Object>> resetLink(@Body EmailStandardRequest emailStandardRequest);
}
