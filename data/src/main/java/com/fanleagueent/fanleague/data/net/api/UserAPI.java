package com.fanleagueent.fanleague.data.net.api;

import com.fanleagueent.fanleague.data.constants.ApiConfig;
import com.fanleagueent.fanleague.data.entity.BaseResponse;
import com.fanleagueent.fanleague.data.entity.entities.locker_room.MyWallDataEntity;
import com.fanleagueent.fanleague.data.entity.entities.locker_room.PrivacyEntity;
import com.fanleagueent.fanleague.data.entity.entities.user.ConnectCountsEntity;
import com.fanleagueent.fanleague.data.entity.entities.user.CountriesEntity;
import com.fanleagueent.fanleague.data.entity.entities.user.FavoriteClubDataEntity;
import com.fanleagueent.fanleague.data.entity.entities.user.NationalitiesEntity;
import com.fanleagueent.fanleague.data.entity.entities.user.ProfessionsEntity;
import com.fanleagueent.fanleague.data.entity.entities.user.SystemMessageEntity;
import com.fanleagueent.fanleague.data.entity.entities.user.UserDataEntity;
import com.fanleagueent.fanleague.data.net.requests.auth.TokenCredentials;
import com.fanleagueent.fanleague.data.net.requests.user.ChangeDepositRequest;
import com.fanleagueent.fanleague.data.net.requests.user.ChangeDisplayNameRequest;
import com.fanleagueent.fanleague.data.net.requests.user.ChangeEmailRequest;
import com.fanleagueent.fanleague.data.net.requests.user.ChangePasswordRequest;
import com.fanleagueent.fanleague.data.net.requests.user.ChangePrivacyRequest;
import com.fanleagueent.fanleague.data.net.requests.user.ChangeWagerRequest;
import com.fanleagueent.fanleague.data.net.requests.user.NotificationsRequest;
import com.fanleagueent.fanleague.data.net.requests.user.UpdateUserRequest;
import io.reactivex.Maybe;
import java.util.List;
import okhttp3.MultipartBody;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;

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
  String AVATAR = "/avatar";
  String CONNECT = "/connect";
  String DISCONNECT = "/disconnect";
  String FACEBOOK = "/facebook";
  String GOOGLE = "/google";
  String PROFESSIONS = "/professions";
  String NATIONALITIES = "/nationalities";
  String COUNTRIES = "/countries";
  String FOOTBALL_CLUBS = "/football_clubs";
  String DISPLAY_NAME = "/display-name";
  String NOTIFICATIONS = "/notifications";
  String COUNTS = "/counts";
  String MESSENGER = "/messenger";
  String SYSTEM = "/system";
  String READ = "/read";
  String SYSTEM_MESSAGE_ID = "system_message_id";
  String PATH_SYSTEM_MESSAGE_ID = "/{" + SYSTEM_MESSAGE_ID + "}";
  String LOCKER = "/locker";
  String MY = "/my";
  String PRIVACY = "/privacy";
  String WALL = "/wall";

  String GET_UNREAD_THREADS = "/messenger/unread_threads";

  String CHANGE_WEEKLY_DEPOSIT_LIMIT = "/weekly-deposit-limit";
  String CHANGE_WEEKLY_WAGER_LIMIT = "/weekly-wager-limit";

  @GET(ApiConfig.API_VERSION + SETTINGS + PERSONAL) Maybe<BaseResponse<UserDataEntity>> getUser();

  @PATCH(ApiConfig.API_VERSION + SETTINGS + PERSONAL + INFORMATION + GENERAL)
  Maybe<BaseResponse<UserDataEntity>> updateUser(@Body UpdateUserRequest updateUserRequest);

  @PATCH(ApiConfig.API_VERSION + SETTINGS + PERSONAL + INFORMATION + CHANGE_WEEKLY_DEPOSIT_LIMIT)
  Maybe<BaseResponse<UserDataEntity>> changeDepositLimit(@Body ChangeDepositRequest changeDepositRequest);

  @PATCH(ApiConfig.API_VERSION + SETTINGS + PERSONAL + INFORMATION + CHANGE_WEEKLY_WAGER_LIMIT)
  Maybe<BaseResponse<UserDataEntity>> changeWagerLimit(@Body ChangeWagerRequest changeWagerRequest);

  @POST(ApiConfig.API_VERSION + SETTINGS + PERSONAL + EMAIL + RESET_LINK)
  Maybe<BaseResponse<Boolean>> changeEmail(@Body ChangeEmailRequest changeEmailRequest);

  @POST(ApiConfig.API_VERSION + SETTINGS + PERSONAL + CHANGE_PASSWORD)
  Maybe<BaseResponse<UserDataEntity>> changePassword(@Body ChangePasswordRequest changePasswordRequest);

  @PATCH(ApiConfig.API_VERSION + SETTINGS + PERSONAL + CONNECT + FACEBOOK)
  Maybe<BaseResponse<UserDataEntity>> connectFacebook(@Body TokenCredentials tokenCredentials);

  @PATCH(ApiConfig.API_VERSION + SETTINGS + PERSONAL + DISCONNECT + FACEBOOK)
  Maybe<BaseResponse<UserDataEntity>> disconnectFacebook();

  @PATCH(ApiConfig.API_VERSION + SETTINGS + PERSONAL + CONNECT + GOOGLE)
  Maybe<BaseResponse<UserDataEntity>> connectGoogle(@Body TokenCredentials tokenCredentials);

  @PATCH(ApiConfig.API_VERSION + SETTINGS + PERSONAL + DISCONNECT + GOOGLE)
  Maybe<BaseResponse<UserDataEntity>> disconnectGoogle();

  @Multipart @POST(ApiConfig.API_VERSION + SETTINGS + PERSONAL + INFORMATION + AVATAR)
  Maybe<BaseResponse<UserDataEntity>> changeAvatar(@Part MultipartBody.Part file);

  @DELETE(ApiConfig.API_VERSION + SETTINGS + PERSONAL + INFORMATION + AVATAR)
  Maybe<BaseResponse<UserDataEntity>> deleteAvatar();

  @GET(ApiConfig.API_VERSION + SETTINGS + PROFESSIONS)
  Maybe<BaseResponse<ProfessionsEntity>> getProfessionList();

  @GET(ApiConfig.API_VERSION + SETTINGS + NATIONALITIES)
  Maybe<BaseResponse<NationalitiesEntity>> getNationalityList();

  @GET(ApiConfig.API_VERSION + SETTINGS + COUNTRIES)
  Maybe<BaseResponse<CountriesEntity>> getCountryList();

  @GET(ApiConfig.API_VERSION + SETTINGS + FOOTBALL_CLUBS)
  Maybe<BaseResponse<FavoriteClubDataEntity>> getFavoriteClubsList();

  @PATCH(ApiConfig.API_VERSION + SETTINGS + PERSONAL + PRIVACY) Maybe<BaseResponse<UserDataEntity>> changePrivacy(
      @Body ChangePrivacyRequest changePrivacyRequest);

  @PATCH(ApiConfig.API_VERSION + SETTINGS + PERSONAL + PRIVACY + DISPLAY_NAME)
  Maybe<BaseResponse<UserDataEntity>> changeDisplayName(@Body ChangeDisplayNameRequest changeDisplayNameRequest);

  @PATCH(ApiConfig.API_VERSION + SETTINGS + PERSONAL + NOTIFICATIONS)
  Maybe<BaseResponse<UserDataEntity>> changeNotifications(@Body NotificationsRequest notificationsRequest);

  @GET(ApiConfig.API_VERSION + SETTINGS + COUNTS) Maybe<BaseResponse<ConnectCountsEntity>> getConnectCounts();

  @GET(ApiConfig.API_VERSION + MESSENGER + SYSTEM)
  Maybe<BaseResponse<List<SystemMessageEntity>>> getSystemMessages();

  @PATCH(ApiConfig.API_VERSION + MESSENGER + SYSTEM + PATH_SYSTEM_MESSAGE_ID + READ)
  Maybe<BaseResponse<List<Void>>> readMessage(@Path(SYSTEM_MESSAGE_ID) String systemMessageId);

  @GET(ApiConfig.API_VERSION + GET_UNREAD_THREADS)
  Maybe<BaseResponse<List<String>>> getUnreadThreads();

  @GET(ApiConfig.API_VERSION + LOCKER + MY + WALL) Maybe<BaseResponse<MyWallDataEntity>> getMyWall();

  @PATCH(ApiConfig.API_VERSION + LOCKER + MY + PRIVACY)
  Maybe<BaseResponse<MyWallDataEntity>> updateMyWallPrivacy(@Body PrivacyEntity privacy);
}
