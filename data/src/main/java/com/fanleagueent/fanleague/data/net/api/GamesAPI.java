package com.fanleagueent.fanleague.data.net.api;

import com.fanleagueent.fanleague.data.entity.BaseResponse;
import com.fanleagueent.fanleague.data.net.requests.games.CreateBetRequest;
import com.fanleagueent.fanleague.data.net.requests.games.CreateTeamBetRequest;
import java.util.List;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by st1ch on 22.12.16.
 */

public interface GamesAPI {
  String GAMES = "/games";

  String GAMEWEEK_MATCHES = "/gameweek_matches";
  String STANDINGS = "/standings";

  String LUCKY_DIP_SET = "/lucky_dip_set";
  String PERSONAL = "/personal";
  String CREATE_BET = "/create_bet";
  String CANCEL_BET = "/cancel_bet";
  String RANDOM_BET = "/random_bet";

  String HISTORY = "/history";
  String GAMEWEEKS = "/gameweeks";
  String ALL = "/all";
  String FRIENDS = "/friends";
  String TEAMS = "/teams";
  String LEAGUES = "/leagues";
  String BETS = "/bets";

  String TEAM = "/team";
  String TEAM_LIST = "/teams_list";

  String EXPERT = "/expert";
  String LIST = "/list";

  String PUNDITS = "/pundits";
  String POSTS = "/posts";

  String STANDINGS_BY_MATCH_ID = "/standings_by_match";

  String OFFSET = "offset";
  String TEAM_ID = "team_id";
  String MATCH_ID = "match_id";
  String LIMIT = "limit";
  String DISPLAY = "display";
  String MOBILE = "mobile";
  String GAMEWEEK = "gameweek";

  String PATH_TEAM_ID = "/{" + TEAM_ID + "}";

  @GET(ApiConfig.API_VERSION + GAMES + GAMEWEEK_MATCHES)
  Observable<GameweekResponse> getCurrentGameweekMatches();

  @GET(ApiConfig.API_VERSION + GAMES + STANDINGS) Observable<StandingsResponse> getStandings();

  @GET(ApiConfig.API_VERSION + GAMES + PERSONAL) Observable<CurrentBetResponse> getCurrentBet();

  @POST(ApiConfig.API_VERSION + GAMES + PERSONAL + CREATE_BET)
  Observable<CreateBetResponse> createBet(@Body CreateBetRequest createBetRequest);

  @DELETE(ApiConfig.API_VERSION + GAMES + PERSONAL + CANCEL_BET)
  Observable<UserResponse> cancelBet();

  @GET(ApiConfig.API_VERSION + GAMES + PERSONAL + RANDOM_BET)
  Observable<RandomBetResponse> getRandomBet();

  @GET(ApiConfig.API_VERSION + GAMES + PERSONAL + HISTORY)
  Observable<GameweekHistoryResponse> getPersonalBetsHistory(@Query(OFFSET) int offset);

  @GET(ApiConfig.API_VERSION + GAMES + TEAM) Observable<CurrentBetResponse> getTeamCurrentBet(
      @Query(TEAM_ID) String teamId);

  @POST(ApiConfig.API_VERSION + GAMES + TEAM + CREATE_BET)
  Observable<CurrentBetResponse> createTeamBet(@Body CreateTeamBetRequest createTeamBetRequest);

  @DELETE(ApiConfig.API_VERSION + GAMES + TEAM + PATH_TEAM_ID + CANCEL_BET)
  Observable<CurrentBetResponse> cancelTeamBet(@Path(TEAM_ID) String teamId);

  @GET(ApiConfig.API_VERSION + GAMES + TEAM + TEAM_LIST) Observable<GetTeamsResponse> getTeamsList(
      @Query(OFFSET) int offset);

  @GET(ApiConfig.API_VERSION + GAMES + TEAM + HISTORY)
  Observable<GameweekHistoryResponse> getTeamBetsHistory(@Query(TEAM_ID) String teamId,
      @Query(OFFSET) int offset, @Query(LIMIT) int limit);

  @GET(ApiConfig.API_VERSION + GAMES + EXPERT + LIST)
  Observable<BaseResponse<List<PunditSimple>>> getExpertList();

  @GET(ApiConfig.API_VERSION + GAMES + GAMEWEEKS)
  Observable<BaseResponse<List<Gameweek>>> getGameweeksList();

  @GET(ApiConfig.API_VERSION + GAMES + HISTORY)
  Observable<BaseResponse<List<HistoryBet>>> getGameweekBetsHistory(
      @Query(GAMEWEEK) int gameweekNumber);

  @GET(ApiConfig.API_VERSION + GAMES + STANDINGS_BY_MATCH_ID)
  Observable<StandingsResponse> getStandingsByMatchId(@Query(MATCH_ID) String matchId);

  @GET(ApiConfig.API_VERSION + PUNDITS + POSTS) Observable<PunditsResponse> getPunditsPosts(
      @Query(DISPLAY) String display);

  @GET(ApiConfig.API_VERSION + GAMES + LUCKY_DIP_SET) Observable<LuckyDipResponse> getLuckyDipSet();
}
