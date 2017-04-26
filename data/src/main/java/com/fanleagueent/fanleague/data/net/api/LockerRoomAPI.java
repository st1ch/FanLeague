package com.fanleagueent.fanleague.data.net.api;

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

  //@GET(ApiConfig.API_VERSION + LOCKER + MY + WALL) Observable<BaseResponse<MyWallDataEntity>> getMyWall();
  //
  //@GET(ApiConfig.API_VERSION + LOCKER + PATH_USER + ALL)
  //Observable<BaseResponse<PublicWallDataEntity>> getUserWall(@Path(USER) String userId);
  //
  //@PATCH(ApiConfig.API_VERSION + LOCKER + MY + PRIVACY)
  //Observable<BaseResponse<PrivacyEntity>> updateMyWallPrivacy(@Body Privacy privacy);
  //
  //@GET(ApiConfig.API_VERSION + LOCKER + MY + PROGRESS)
  //Observable<BaseResponse<ProgressDataEntity>> getMyProgress();
  //
  //@GET(ApiConfig.API_VERSION + LOCKER + MY + TROPHIES)
  //Observable<BaseResponse<TrophiesDataEntity>> getMyTrophies();
  //
  //@GET(ApiConfig.API_VERSION + LOCKER + TEAMS_LEAGUES_LIST)
  //Observable<BaseResponse<TeamsLeaguesListDataEntity>> getTeamsAndLeaguesList();
  //
  //@POST(ApiConfig.API_VERSION + TEAM_INVITE) Observable<BaseResponse<TeamDataEntity>> inviteUserToTeam(
  //    @Body InviteToTeamUserRequest inviteToTeamUserRequest);
  //
  //@POST(ApiConfig.API_VERSION + LEAGUE_INVITE) Observable<BaseResponse<LeagueDataEntity> > inviteUserToLeague(
  //    @Body InviteToLeagueUserRequest inviteToLeagueUserRequest);
  //
  //@FormUrlEncoded @POST(ApiConfig.API_VERSION + FRIEND_ADD) Observable<BaseResponse<List<Boolean>>> addFriend(
  //    @Field(RECIPIENT_ID) String recipientId);
  //
  //@POST(ApiConfig.API_VERSION + MESSENGER + CREATE_THREAD) Observable<BaseResponse<ChatDataEntity>> createThread(
  //    @Body RecipientsRequest recipientsRequest);
}
