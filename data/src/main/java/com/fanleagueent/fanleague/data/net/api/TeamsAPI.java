package com.fanleagueent.fanleague.data.net.api;

import com.fanleagueent.fanleague.data.constants.ApiConfig;
import com.fanleagueent.fanleague.data.net.requests.auth.TokenRequest;
import com.fanleagueent.fanleague.data.net.requests.teams.AmountRequest;
import com.fanleagueent.fanleague.data.net.requests.teams.CreateTeamRequest;
import com.fanleagueent.fanleague.data.net.requests.teams.InviteToTeamUserRequest;
import com.fanleagueent.fanleague.data.net.requests.teams.UpdateTeamRequest;
import com.fanleagueent.fanleague.data.net.requests.user.UserRequest;
import okhttp3.MultipartBody;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

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

    @GET(ApiConfig.API_VERSION + TEAMS)
    Observable<TeamsResponse> getTeamsList(@Query(OFFSET) int offset);

    @GET(ApiConfig.API_VERSION + TEAMS + PATH_TEAM_SLUG)
    Observable<TeamResponse> getTeamInfo(@Path(SLUG) String slug);

    @POST(ApiConfig.API_VERSION + TEAMS)
    Observable<TeamResponse> createTeam(@Body CreateTeamRequest createTeamRequest);

    @PATCH(ApiConfig.API_VERSION + TEAMS + PATH_TEAM_ID)
    Observable<TeamResponse> updateTeamInfo(@Path(TEAM_ID) String teamId,
        @Body UpdateTeamRequest updateTeamRequest);

    @DELETE(ApiConfig.API_VERSION + TEAMS + PATH_TEAM_ID)
    Observable<TeamResponse> deleteTeam(@Path(TEAM_ID) String teamId);

    @PATCH(ApiConfig.API_VERSION + TEAMS + PATH_TEAM_ID + OWNER)
    Observable<TeamResponse> changeTeamOwner(@Path(TEAM_ID) String teamId,
        @Body UserRequest userRequest);

    @Multipart
    @POST(ApiConfig.API_VERSION + TEAMS + PATH_TEAM_ID + IMAGE)
    Observable<TeamResponse> changeTeamAvatar(@Path(TEAM_ID) String teamId,
        @Part MultipartBody.Part file);

    @DELETE(ApiConfig.API_VERSION + TEAMS + PATH_TEAM_ID + IMAGE)
    Observable<TeamResponse> deleteTeamAvatar(@Path(TEAM_ID) String teamId);

    @PATCH(ApiConfig.API_VERSION + TEAMS + PATH_TEAM_ID + WEEKLY_BETTING_AMOUNT)
    Observable<TeamResponse> changeWeeklyBettingAmount(@Path(TEAM_ID) String teamId,
        @Body AmountRequest amountRequest);

    @PUT(ApiConfig.API_VERSION + TEAMS + PATH_TEAM_ID + WEEKLY_BETTING_AMOUNT + ACCEPT)
    Observable<TeamResponse> acceptWeeklyBettingAmount(@Path(TEAM_ID) String teamId);

    @GET(ApiConfig.API_VERSION + TEAMS + PATH_TEAM_ID + MEMBERS)
    Observable<TeamMembersResponse> getTeamMembers(@Path(TEAM_ID) String teamId,
        @Query(QUERY) String searchQuery);

    @GET(ApiConfig.API_VERSION + TEAMS + PATH_TEAM_ID + MEMBERS + SIMPLE)
    Observable<TeamMembersResponse> getTeamSimpleMembers(@Path(TEAM_ID) String teamId);

    @DELETE(ApiConfig.API_VERSION + TEAMS + PATH_TEAM_ID + MEMBERS + PATH_USER_ID)
    Observable<TeamResponse> deleteTeamMember(@Path(TEAM_ID) String teamId,
        @Path(USER_ID) String userId);

    @GET(ApiConfig.API_VERSION + TEAMS + PATH_TEAM_ID + ADMINS)
    Observable<TeamAdminsResponse> getAdmins(@Path(TEAM_ID) String teamId);

    @PUT(ApiConfig.API_VERSION + TEAMS + PATH_TEAM_ID + ADMINS + PATH_USER_ID)
    Observable<TeamResponse> addTeamAdmin(@Path(TEAM_ID) String teamId,
        @Path(USER_ID) String userId);

    @DELETE(ApiConfig.API_VERSION + TEAMS + PATH_TEAM_ID + ADMINS + PATH_USER_ID)
    Observable<TeamResponse> deleteTeamAdmin(@Path(TEAM_ID) String teamId,
        @Path(USER_ID) String userId);

    @GET(ApiConfig.API_VERSION + TEAMS + INVITATIONS)
    Observable<TeamsResponse> getTeamInvitations();

    @GET(ApiConfig.API_VERSION + TEAMS + INVITES)
    Observable<TeamsResponse> getTeamInvites();

    @POST(ApiConfig.API_VERSION + TEAMS + INVITE)
    Observable<TeamResponse> inviteUserToTeam(@Body InviteToTeamUserRequest inviteToTeamUserRequest);

    @POST(ApiConfig.API_VERSION + TEAMS + INVITE + ACCEPT)
    Observable<TeamResponse> acceptTeamInvitation(@Body TokenRequest tokenRequest);

    @POST(ApiConfig.API_VERSION + TEAMS + INVITE + DECLINE)
    Observable<TeamResponse> declineTeamInvitation(@Body TokenRequest tokenRequest);

    @GET(ApiConfig.API_VERSION + FRIENDS + GET_ALL_FRIENDS)
    Observable<FriendsResponse> getAllFriends(@Query(OFFSET) int offset,
        @Query(TEAM_ID) String teamId);

    @GET(ApiConfig.API_VERSION + FRIENDS + SEARCH)
    Observable<FriendsResponse> searchFriends(@Query(QUERY) String searchQuery,
        @Query(OFFSET) int offset, @Query(TEAM_ID) String teamId);
}
