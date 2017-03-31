package com.fanleagueent.fanleague.data.net.api;

/**
 * Created by st1ch on 23.11.16.
 */

public interface TeamsAPI {

    String TEAMS = "/teams";
    String TEAM_ID = "team_id";
    String SLUG = "slug";
    String PATH_TEAM_ID = "/{" + TEAM_ID + "}";
    String PATH_TEAM_SLUG = "/{" + SLUG + "}";
    String USER_ID = "user_id";
    String PATH_USER_ID = "/{" + USER_ID + "}";

    String OWNER = "/owner";
    String IMAGE = "/image";
    String WEEKLY_BETTING_AMOUNT = "/weekly-betting-amount";
    String INVITE = "/invite";
    String ACCEPT = "/accept";
    String DECLINE = "/decline";
    String MEMBERS = "/members";
    String SIMPLE = "/simple";
    String ADMINS = "/admins";
    String INVITATIONS = "/invitations";
    String INVITES = "/invites";

    String FRIENDS = "/friends";
    String SEARCH = "/player_search";
    String GET_ALL_FRIENDS = "/get_list";

    String QUERY = "query";
    String OFFSET = "offset";

    //@GET(ApiConfig.API_VERSION + TEAMS)
    //Observable<BaseResponse<TeamsDataEntity>> getTeamsList(@Query(OFFSET) int offset);
    //
    //@GET(ApiConfig.API_VERSION + TEAMS + PATH_TEAM_SLUG)
    //Observable<BaseResponse<TeamDataEntity>> getTeamInfo(@Path(SLUG) String slug);
    //
    //@POST(ApiConfig.API_VERSION + TEAMS)
    //Observable<BaseResponse<TeamDataEntity>> createTeam(@Body CreateTeamRequest createTeamRequest);
    //
    //@PATCH(ApiConfig.API_VERSION + TEAMS + PATH_TEAM_ID)
    //Observable<BaseResponse<TeamDataEntity>> updateTeamInfo(@Path(TEAM_ID) String teamId,
    //    @Body UpdateTeamRequest updateTeamRequest);
    //
    //@DELETE(ApiConfig.API_VERSION + TEAMS + PATH_TEAM_ID)
    //Observable<BaseResponse<TeamDataEntity>> deleteTeam(@Path(TEAM_ID) String teamId);
    //
    //@PATCH(ApiConfig.API_VERSION + TEAMS + PATH_TEAM_ID + OWNER)
    //Observable<BaseResponse<TeamDataEntity>> changeTeamOwner(@Path(TEAM_ID) String teamId,
    //    @Body UserRequest userRequest);
    //
    //@Multipart
    //@POST(ApiConfig.API_VERSION + TEAMS + PATH_TEAM_ID + IMAGE)
    //Observable<BaseResponse<TeamDataEntity>> changeTeamAvatar(@Path(TEAM_ID) String teamId,
    //    @Part MultipartBody.Part file);
    //
    //@DELETE(ApiConfig.API_VERSION + TEAMS + PATH_TEAM_ID + IMAGE)
    //Observable<BaseResponse<TeamDataEntity>> deleteTeamAvatar(@Path(TEAM_ID) String teamId);
    //
    //@PATCH(ApiConfig.API_VERSION + TEAMS + PATH_TEAM_ID + WEEKLY_BETTING_AMOUNT)
    //Observable<BaseResponse<TeamDataEntity>> changeWeeklyBettingAmount(@Path(TEAM_ID) String teamId,
    //    @Body AmountRequest amountRequest);
    //
    //@PUT(ApiConfig.API_VERSION + TEAMS + PATH_TEAM_ID + WEEKLY_BETTING_AMOUNT + ACCEPT)
    //Observable<BaseResponse<TeamDataEntity>> acceptWeeklyBettingAmount(@Path(TEAM_ID) String teamId);
    //
    //@GET(ApiConfig.API_VERSION + TEAMS + PATH_TEAM_ID + MEMBERS)
    //Observable<BaseResponse<TeamMembersDataEntity>> getTeamMembers(@Path(TEAM_ID) String teamId,
    //    @Query(QUERY) String searchQuery);
    //
    //@GET(ApiConfig.API_VERSION + TEAMS + PATH_TEAM_ID + MEMBERS + SIMPLE)
    //Observable<BaseResponse<TeamMembersDataEntity>> getTeamSimpleMembers(@Path(TEAM_ID) String teamId);
    //
    //@DELETE(ApiConfig.API_VERSION + TEAMS + PATH_TEAM_ID + MEMBERS + PATH_USER_ID)
    //Observable<BaseResponse<TeamDataEntity>> deleteTeamMember(@Path(TEAM_ID) String teamId,
    //    @Path(USER_ID) String userId);
    //
    //@GET(ApiConfig.API_VERSION + TEAMS + PATH_TEAM_ID + ADMINS)
    //Observable<BaseResponse<TeamAdminsDataEntity>> getAdmins(@Path(TEAM_ID) String teamId);
    //
    //@PUT(ApiConfig.API_VERSION + TEAMS + PATH_TEAM_ID + ADMINS + PATH_USER_ID)
    //Observable<BaseResponse<TeamDataEntity>> addTeamAdmin(@Path(TEAM_ID) String teamId,
    //    @Path(USER_ID) String userId);
    //
    //@DELETE(ApiConfig.API_VERSION + TEAMS + PATH_TEAM_ID + ADMINS + PATH_USER_ID)
    //Observable<BaseResponse<TeamDataEntity>> deleteTeamAdmin(@Path(TEAM_ID) String teamId,
    //    @Path(USER_ID) String userId);
    //
    //@GET(ApiConfig.API_VERSION + TEAMS + INVITATIONS)
    //Observable<BaseResponse<TeamsDataEntity>> getTeamInvitations();
    //
    //@GET(ApiConfig.API_VERSION + TEAMS + INVITES)
    //Observable<BaseResponse<TeamsDataEntity>> getTeamInvites();
    //
    //@POST(ApiConfig.API_VERSION + TEAMS + INVITE)
    //Observable<BaseResponse<TeamDataEntity>> inviteUserToTeam(@Body InviteToTeamUserRequest inviteToTeamUserRequest);
    //
    //@POST(ApiConfig.API_VERSION + TEAMS + INVITE + ACCEPT)
    //Observable<BaseResponse<TeamDataEntity>> acceptTeamInvitation(@Body TokenRequest tokenRequest);
    //
    //@POST(ApiConfig.API_VERSION + TEAMS + INVITE + DECLINE)
    //Observable<BaseResponse<TeamDataEntity>> declineTeamInvitation(@Body TokenRequest tokenRequest);
    //
    //@GET(ApiConfig.API_VERSION + FRIENDS + GET_ALL_FRIENDS)
    //Observable<BaseResponse<FriendsDataEntity>> getAllFriends(@Query(OFFSET) int offset,
    //    @Query(TEAM_ID) String teamId);
    //
    //@GET(ApiConfig.API_VERSION + FRIENDS + SEARCH)
    //Observable<BaseResponse<FriendsDataEntity>> searchFriends(@Query(QUERY) String searchQuery,
    //    @Query(OFFSET) int offset, @Query(TEAM_ID) String teamId);
}
