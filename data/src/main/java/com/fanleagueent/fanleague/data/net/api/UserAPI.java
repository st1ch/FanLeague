package com.fanleagueent.fanleague.data.net.api;

import com.fanleagueent.fanleague.data.constants.ApiConfig;
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

  @GET(ApiConfig.API_VERSION + SETTINGS + PERSONAL) Observable<UserResponse> getUser();

  @PATCH(ApiConfig.API_VERSION + SETTINGS + PERSONAL + INFORMATION + GENERAL)
  Observable<UserResponse> updateUser(@Body UpdateUserRequest updateUserRequest);

  @POST(ApiConfig.API_VERSION + SETTINGS + PERSONAL + EMAIL + RESET_LINK)
  Observable<BaseBooleanResponse> changeEmail(@Body ChangeEmailRequest changeEmailRequest);

  @POST(ApiConfig.API_VERSION + SETTINGS + PERSONAL + CHANGE_PASSWORD)
  Observable<UserResponse> changePassword(@Body ChangePasswordRequest changePasswordRequest);

  @PATCH(ApiConfig.API_VERSION + SETTINGS + PERSONAL + CONNECT + FACEBOOK)
  Observable<UserResponse> connectFacebook(@Body TokenCredentials tokenCredentials);

  @PATCH(ApiConfig.API_VERSION + SETTINGS + PERSONAL + DISCONNECT + FACEBOOK)
  Observable<UserResponse> disconnectFacebook();

  @PATCH(ApiConfig.API_VERSION + SETTINGS + PERSONAL + CONNECT + GOOGLE)
  Observable<UserResponse> connectGoogle(@Body TokenCredentials tokenCredentials);

  @PATCH(ApiConfig.API_VERSION + SETTINGS + PERSONAL + DISCONNECT + GOOGLE)
  Observable<UserResponse> disconnectGoogle();

  @Multipart @POST(ApiConfig.API_VERSION + SETTINGS + PERSONAL + INFORMATION + AVATAR)
  Observable<UserResponse> changeAvatar(@Part MultipartBody.Part file);

  @DELETE(ApiConfig.API_VERSION + SETTINGS + PERSONAL + INFORMATION + AVATAR)
  Observable<UserResponse> deleteAvatar();

  @GET(ApiConfig.API_VERSION + SETTINGS + PROFESSIONS)
  Observable<DataTitleResponse<ProfessionResponse>> getProfessionList();

  @GET(ApiConfig.API_VERSION + SETTINGS + NATIONALITIES)
  Observable<DataTitleResponse<NationalityResponse>> getNationalityList();

  @GET(ApiConfig.API_VERSION + SETTINGS + FOOTBALL_CLUBS)
  Observable<FavoriteClubsResponse> getFavoriteClubsList();

  @PATCH(ApiConfig.API_VERSION + SETTINGS + PERSONAL + PRIVACY)
  Observable<UserResponse> changePrivacy(@Body ChangePrivacyRequest changePrivacyRequest);

  @PATCH(ApiConfig.API_VERSION + SETTINGS + PERSONAL + PRIVACY + DISPLAY_NAME)
  Observable<UserResponse> changeDisplayName(
      @Body ChangeDisplayNameRequest changeDisplayNameRequest);

  @PATCH(ApiConfig.API_VERSION + SETTINGS + PERSONAL + NOTIFICATIONS)
  Observable<UserResponse> changeNotifications(@Body NotificationsRequest notificationsRequest);

  @GET(ApiConfig.API_VERSION + SETTINGS + COUNTS)
  Observable<ConnectCountsResponse> getConnectCounts();
}
