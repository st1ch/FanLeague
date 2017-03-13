package com.fanleagueent.fanleague.data.net.api;

import com.fanleagueent.fanleague.data.constants.ApiConfig;
import com.fanleagueent.fanleague.data.entity.BaseResponse;
import com.fanleagueent.fanleague.data.entity.entities.user.ConnectCountsEntity;
import com.fanleagueent.fanleague.data.entity.entities.user.FavoriteClubEntity;
import com.fanleagueent.fanleague.data.entity.entities.user.NationalitiesEntity;
import com.fanleagueent.fanleague.data.entity.entities.user.ProfessionsEntity;
import com.fanleagueent.fanleague.data.entity.entities.user.UserDataEntity;
import com.fanleagueent.fanleague.data.net.requests.auth.TokenCredentials;
import com.fanleagueent.fanleague.data.net.requests.user.ChangeDisplayNameRequest;
import com.fanleagueent.fanleague.data.net.requests.user.ChangeEmailRequest;
import com.fanleagueent.fanleague.data.net.requests.user.ChangePasswordRequest;
import com.fanleagueent.fanleague.data.net.requests.user.ChangePrivacyRequest;
import com.fanleagueent.fanleague.data.net.requests.user.NotificationsRequest;
import com.fanleagueent.fanleague.data.net.requests.user.UpdateUserRequest;
import okhttp3.MultipartBody;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Part;
import rx.Observable;

/**
 * Created by st1ch on 02.11.2016.
 */

public interface UserAPI {

  String SETTINGS = "/settings";
  String PERSONAL = "/personal";
  String INFORMATION = "/information";
  String GENERAL = "/general";
  String EMAIL = "/email";
  String RESET_LINK = "/send-reset-link";
  String CHANGE_PASSWORD = "/change-password";
  String AVATAR = "/avatarEntity";
  String CONNECT = "/connect";
  String DISCONNECT = "/disconnect";
  String FACEBOOK = "/facebook";
  String GOOGLE = "/google";
  String PROFESSIONS = "/professions";
  String NATIONALITIES = "/nationalities";
  String FOOTBALL_CLUBS = "/football_clubs";
  String PRIVACY = "/privacy";
  String DISPLAY_NAME = "/display-name";
  String NOTIFICATIONS = "/notifications";
  String COUNTS = "/counts";

  @GET(ApiConfig.API_VERSION + SETTINGS + PERSONAL) Observable<BaseResponse<UserDataEntity>> getUser();

  @PATCH(ApiConfig.API_VERSION + SETTINGS + PERSONAL + INFORMATION + GENERAL)
  Observable<BaseResponse<UserDataEntity>> updateUser(@Body UpdateUserRequest updateUserRequest);

  @POST(ApiConfig.API_VERSION + SETTINGS + PERSONAL + EMAIL + RESET_LINK)
  Observable<BaseResponse<Boolean>> changeEmail(@Body ChangeEmailRequest changeEmailRequest);

  @POST(ApiConfig.API_VERSION + SETTINGS + PERSONAL + CHANGE_PASSWORD)
  Observable<BaseResponse<UserDataEntity>> changePassword(@Body ChangePasswordRequest changePasswordRequest);

  @PATCH(ApiConfig.API_VERSION + SETTINGS + PERSONAL + CONNECT + FACEBOOK)
  Observable<BaseResponse<UserDataEntity>> connectFacebook(@Body TokenCredentials tokenCredentials);

  @PATCH(ApiConfig.API_VERSION + SETTINGS + PERSONAL + DISCONNECT + FACEBOOK)
  Observable<BaseResponse<UserDataEntity>> disconnectFacebook();

  @PATCH(ApiConfig.API_VERSION + SETTINGS + PERSONAL + CONNECT + GOOGLE)
  Observable<BaseResponse<UserDataEntity>> connectGoogle(@Body TokenCredentials tokenCredentials);

  @PATCH(ApiConfig.API_VERSION + SETTINGS + PERSONAL + DISCONNECT + GOOGLE)
  Observable<BaseResponse<UserDataEntity>> disconnectGoogle();

  @Multipart @POST(ApiConfig.API_VERSION + SETTINGS + PERSONAL + INFORMATION + AVATAR)
  Observable<BaseResponse<UserDataEntity>> changeAvatar(@Part MultipartBody.Part file);

  @DELETE(ApiConfig.API_VERSION + SETTINGS + PERSONAL + INFORMATION + AVATAR)
  Observable<BaseResponse<UserDataEntity>> deleteAvatar();

  @GET(ApiConfig.API_VERSION + SETTINGS + PROFESSIONS)
  Observable<BaseResponse<ProfessionsEntity>> getProfessionList();

  @GET(ApiConfig.API_VERSION + SETTINGS + NATIONALITIES)
  Observable<BaseResponse<NationalitiesEntity>> getNationalityList();

  @GET(ApiConfig.API_VERSION + SETTINGS + FOOTBALL_CLUBS)
  Observable<BaseResponse<FavoriteClubEntity>> getFavoriteClubsList();

  @PATCH(ApiConfig.API_VERSION + SETTINGS + PERSONAL + PRIVACY)
  Observable<BaseResponse<UserDataEntity>> changePrivacy(@Body ChangePrivacyRequest changePrivacyRequest);

  @PATCH(ApiConfig.API_VERSION + SETTINGS + PERSONAL + PRIVACY + DISPLAY_NAME)
  Observable<BaseResponse<UserDataEntity>> changeDisplayName(
      @Body ChangeDisplayNameRequest changeDisplayNameRequest);

  @PATCH(ApiConfig.API_VERSION + SETTINGS + PERSONAL + NOTIFICATIONS)
  Observable<BaseResponse<UserDataEntity>> changeNotifications(@Body NotificationsRequest notificationsRequest);

  @GET(ApiConfig.API_VERSION + SETTINGS + COUNTS)
  Observable<BaseResponse<ConnectCountsEntity>> getConnectCounts();
}
