package com.fanleagueent.fanleague.data.net.api;

import com.fanleagueent.fanleague.data.constants.ApiConfig;
import com.fanleagueent.fanleague.data.entity.BaseResponse;
import com.fanleagueent.fanleague.data.entity.entities.friends.FriendsDataEntity;
import com.fanleagueent.fanleague.data.entity.entities.leagues.LeagueAdminDataEntity;
import com.fanleagueent.fanleague.data.entity.entities.leagues.LeagueDataEntity;
import com.fanleagueent.fanleague.data.entity.entities.leagues.LeagueMemberDataEntity;
import com.fanleagueent.fanleague.data.entity.entities.leagues.LeaguesDataEntity;
import com.fanleagueent.fanleague.data.entity.entities.leagues.SimpleLeagueMemberDataEntity;
import com.fanleagueent.fanleague.data.net.requests.auth.TokenRequest;
import com.fanleagueent.fanleague.data.net.requests.leagues.CreateLeagueRequest;
import com.fanleagueent.fanleague.data.net.requests.leagues.InviteToLeagueUserRequest;
import com.fanleagueent.fanleague.data.net.requests.leagues.UpdateLeagueRequest;
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

import static com.fanleagueent.fanleague.data.net.api.TeamsAPI.PATH_USER_ID;

/**
 * Created by alexeyverbitskiy on 12/8/16.
 */

public interface LeaguesAPI {

  String LEAGUES = "/leagues";
  String OWNER = "/owner";
  String IMAGE = "/image";
  String MEMBERS = "/members";
  String ADMINS = "/admins";
  String INVITE = "/invite";
  String ACCEPT = "/accept";
  String DECLINE = "/decline";
  String INVITATIONS = "/invitations";
  String INVITES = "/invites";
  String SIMPLE = "/simple";

  String SLUG = "slug";
  String SLUG_PARAM = "/{" + SLUG + "}";
  String LEAGUE_ID = "league_id";
  String USER_ID = "user_id";
  String PATH_LEAGUE_PARAM = "/{" + LEAGUE_ID + "}";
  String PATH_USER_PARAM = "/{" + USER_ID + "}";
  String GET_ALL_FRIENDS = "/get_list";

  String FRIENDS = "/friends";
  String SEARCH = "/player_search";

  String QUERY = "query";
  String OFFSET = "offset";

  @GET(ApiConfig.API_VERSION + LEAGUES) Observable<BaseResponse<LeaguesDataEntity>> getLeaguesList(
      @Query(OFFSET) int offset);

  @POST(ApiConfig.API_VERSION + LEAGUES) Observable<BaseResponse<LeagueDataEntity> > createLeague(
      @Body CreateLeagueRequest createLeagueRequest);

  @GET(ApiConfig.API_VERSION + LEAGUES + SLUG_PARAM) Observable<BaseResponse<LeagueDataEntity> > getOne(
      @Path(SLUG) String slug);

  @PATCH(ApiConfig.API_VERSION + LEAGUES + PATH_LEAGUE_PARAM)
  Observable<BaseResponse<LeagueDataEntity> > updateLeague(@Path(LEAGUE_ID) String leagueId,
      @Body UpdateLeagueRequest updateLeagueRequest);

  @DELETE(ApiConfig.API_VERSION + LEAGUES + PATH_LEAGUE_PARAM)
  Observable<BaseResponse<LeagueDataEntity> > deleteLeague(@Path(LEAGUE_ID) String leagueId);

  @PATCH(ApiConfig.API_VERSION + LEAGUES + PATH_LEAGUE_PARAM + OWNER)
  Observable<BaseResponse<LeagueDataEntity> > changeLeagueOwner(@Path(LEAGUE_ID) String leagueId,
      @Body UserRequest userRequest);

  @Multipart @POST(ApiConfig.API_VERSION + LEAGUES + PATH_LEAGUE_PARAM + IMAGE)
  Observable<BaseResponse<LeagueDataEntity> > changeLeagueImage(@Path(LEAGUE_ID) String leagueId,
      @Part MultipartBody.Part file);

  @DELETE(ApiConfig.API_VERSION + LEAGUES + PATH_LEAGUE_PARAM + IMAGE)
  Observable<BaseResponse<LeagueDataEntity> > deleteLeagueImage(@Path(LEAGUE_ID) String leagueId);

  @GET(ApiConfig.API_VERSION + LEAGUES + PATH_LEAGUE_PARAM + MEMBERS)
  Observable<BaseResponse<LeagueMemberDataEntity>> getLeagueMembersList(@Path(LEAGUE_ID) String leagueId,
      @Query(QUERY) String query, @Query(OFFSET) int offset);

  @DELETE(ApiConfig.API_VERSION + LEAGUES + PATH_LEAGUE_PARAM + MEMBERS + PATH_USER_PARAM)
  Observable<BaseResponse<LeagueDataEntity> > deleteLeagueMember(@Path(LEAGUE_ID) String leagueId,
      @Path(USER_ID) String userId);

  @GET(ApiConfig.API_VERSION + LEAGUES + PATH_LEAGUE_PARAM + ADMINS)
  Observable<BaseResponse<LeagueAdminDataEntity>> getAdmins(@Path(LEAGUE_ID) String leagueId);

  @GET(ApiConfig.API_VERSION + LEAGUES + PATH_LEAGUE_PARAM + MEMBERS + SIMPLE)
  Observable<BaseResponse<SimpleLeagueMemberDataEntity>> getSimpleMembers(@Path(LEAGUE_ID) String leagueId);

  @PUT(ApiConfig.API_VERSION + LEAGUES + PATH_LEAGUE_PARAM + ADMINS + PATH_USER_ID)
  Observable<BaseResponse<LeagueDataEntity> > addLeagueAdmin(@Path(LEAGUE_ID) String leagueId,
      @Path(USER_ID) String userId);

  @DELETE(ApiConfig.API_VERSION + LEAGUES + PATH_LEAGUE_PARAM + ADMINS + PATH_USER_ID)
  Observable<BaseResponse<LeagueDataEntity> > deleteLeagueAdmin(@Path(LEAGUE_ID) String leagueId,
      @Path(USER_ID) String userId);

  @POST(ApiConfig.API_VERSION + LEAGUES + INVITE) Observable<BaseResponse<LeagueDataEntity> > inviteUserToLeague(
      @Body InviteToLeagueUserRequest inviteToLeagueUserRequest);

  @POST(ApiConfig.API_VERSION + LEAGUES + INVITE + ACCEPT)
  Observable<BaseResponse<LeagueDataEntity> > acceptLeagueInvite(@Body TokenRequest tokenRequest);

  @POST(ApiConfig.API_VERSION + LEAGUES + INVITE + DECLINE)
  Observable<BaseResponse<LeagueDataEntity> > declineLeagueInvite(@Body TokenRequest tokenRequest);

  @GET(ApiConfig.API_VERSION + LEAGUES + INVITATIONS)
  Observable<BaseResponse<LeaguesDataEntity>> getLeagueInvitations();

  @GET(ApiConfig.API_VERSION + LEAGUES + INVITES) Observable<BaseResponse<LeaguesDataEntity>> getLeagueInvites();

  @GET(ApiConfig.API_VERSION + FRIENDS + GET_ALL_FRIENDS) Observable<BaseResponse<FriendsDataEntity>> getAllFriends(
      @Query(OFFSET) int offset, @Query(LEAGUE_ID) String leagueId);

  @GET(ApiConfig.API_VERSION + FRIENDS + SEARCH) Observable<BaseResponse<FriendsDataEntity>> searchFriends(
      @Query(QUERY) String searchQuery, @Query(OFFSET) int offset,
      @Query(LEAGUE_ID) String leagueId);
}
