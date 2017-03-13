package com.fanleagueent.fanleague.data.net.api;

import com.fanleagueent.fanleague.data.constants.ApiConfig;
import com.fanleagueent.fanleague.data.net.requests.chat.RecipientsRequest;
import com.fanleagueent.fanleague.data.net.requests.leagues.InviteToLeagueUserRequest;
import com.fanleagueent.fanleague.data.net.requests.teams.InviteToTeamUserRequest;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;
import rx.Observable;


/**
 * Created by st1ch on 23.01.17.
 */

public interface LockerRoomAPI {

  String LOCKER = "/locker";
  String MY = "/my";
  String WALL = "/wall";
  String PRIVACY = "/privacy";
  String PROGRESS = "/progress";
  String TROPHIES = "/trophies";
  String ALL = "/all";

  String TEAMS_LEAGUES_LIST = "/invite/teams_leagues_list";

  String LEAGUE_INVITE = "/leagues/invite";
  String TEAM_INVITE = "/teams/invite";
  String FRIEND_ADD = "/friends/send_request";
  String MESSENGER = "/messenger";
  String CREATE_THREAD = "/create_thread";

  String USER = "user";
  String PATH_USER = "/{" + USER + "}";

  @GET(ApiConfig.API_VERSION + LOCKER + MY + WALL) Observable<BaseResponse<MyWallData>> getMyWall();

  @GET(ApiConfig.API_VERSION + LOCKER + PATH_USER + ALL)
  Observable<BaseResponse<PublicWallData>> getUserWall(@Path(USER) String userId);

  @PATCH(ApiConfig.API_VERSION + LOCKER + MY + PRIVACY)
  Observable<BaseResponse<Privacy>> updateMyWallPrivacy(@Body Privacy privacy);

  @GET(ApiConfig.API_VERSION + LOCKER + MY + PROGRESS)
  Observable<BaseResponse<ProgressData>> getMyProgress();

  @GET(ApiConfig.API_VERSION + LOCKER + MY + TROPHIES)
  Observable<BaseResponse<TrophiesData>> getMyTrophies();

  @GET(ApiConfig.API_VERSION + LOCKER + TEAMS_LEAGUES_LIST)
  Observable<BaseResponse<TeamsLeaguesListData>> getTeamsAndLeaguesList();

  @POST(ApiConfig.API_VERSION + TEAM_INVITE) Observable<TeamResponse> inviteUserToTeam(
      @Body InviteToTeamUserRequest inviteToTeamUserRequest);

  @POST(ApiConfig.API_VERSION + LEAGUE_INVITE) Observable<LeagueResponse> inviteUserToLeague(
      @Body InviteToLeagueUserRequest inviteToLeagueUserRequest);

  @FormUrlEncoded
  @POST(ApiConfig.API_VERSION + FRIEND_ADD)
  Observable<BaseDataResponse> addFriend(@Field(RECIPIENT_ID) String recipientId);

  @POST(ApiConfig.API_VERSION + MESSENGER + CREATE_THREAD)
  Observable<ChatResponse> createThread(@Body RecipientsRequest recipientsRequest);
}
