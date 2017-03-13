package com.fanleagueent.fanleague.data.net.api;

import com.fanleagueent.fanleague.data.constants.ApiConfig;
import com.fanleagueent.fanleague.data.entity.BaseResponse;
import com.fanleagueent.fanleague.data.entity.entities.games.CreateBetDataEntity;
import com.fanleagueent.fanleague.data.entity.entities.games.CurrentBetDataEntity;
import com.fanleagueent.fanleague.data.entity.entities.games.GameweekEntity;
import com.fanleagueent.fanleague.data.entity.entities.games.GetTeamsDataEntity;
import com.fanleagueent.fanleague.data.entity.entities.games.HistoryBetEntity;
import com.fanleagueent.fanleague.data.entity.entities.games.LuckyDipBetEntity;
import com.fanleagueent.fanleague.data.entity.entities.games.PunditSimpleEntity;
import com.fanleagueent.fanleague.data.entity.entities.games.PunditsDataEntity;
import com.fanleagueent.fanleague.data.entity.entities.games.StandingsDataEntity;
import com.fanleagueent.fanleague.data.entity.entities.user.UserDataEntity;
import com.fanleagueent.fanleague.data.net.requests.games.CreateBetRequest;
import com.fanleagueent.fanleague.data.net.requests.games.CreateTeamBetRequest;
import java.util.List;
import java.util.Map;
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
  Observable<BaseResponse<GameweekEntity>> getCurrentGameweekMatches();

  @GET(ApiConfig.API_VERSION + GAMES + STANDINGS) Observable<BaseResponse<StandingsDataEntity>> getStandings();

  @GET(ApiConfig.API_VERSION + GAMES + PERSONAL) Observable<BaseResponse<CurrentBetDataEntity>> getCurrentBet();

  @POST(ApiConfig.API_VERSION + GAMES + PERSONAL + CREATE_BET)
  Observable<BaseResponse<CreateBetDataEntity>> createBet(@Body CreateBetRequest createBetRequest);

  @DELETE(ApiConfig.API_VERSION + GAMES + PERSONAL + CANCEL_BET)
  Observable<BaseResponse<UserDataEntity>> cancelBet();

  @GET(ApiConfig.API_VERSION + GAMES + PERSONAL + RANDOM_BET)
  Observable<BaseResponse<Map<String, int[]>>> getRandomBet();

  @GET(ApiConfig.API_VERSION + GAMES + PERSONAL + HISTORY)
  Observable<BaseResponse> getPersonalBetsHistory(@Query(OFFSET) int offset);

  @GET(ApiConfig.API_VERSION + GAMES + TEAM) Observable<BaseResponse<CurrentBetDataEntity>> getTeamCurrentBet(
      @Query(TEAM_ID) String teamId);

  @POST(ApiConfig.API_VERSION + GAMES + TEAM + CREATE_BET)
  Observable<BaseResponse<CurrentBetDataEntity>> createTeamBet(@Body CreateTeamBetRequest createTeamBetRequest);

  @DELETE(ApiConfig.API_VERSION + GAMES + TEAM + PATH_TEAM_ID + CANCEL_BET)
  Observable<BaseResponse<CurrentBetDataEntity>> cancelTeamBet(@Path(TEAM_ID) String teamId);

  @GET(ApiConfig.API_VERSION + GAMES + TEAM + TEAM_LIST) Observable<BaseResponse<GetTeamsDataEntity>> getTeamsList(
      @Query(OFFSET) int offset);

  @GET(ApiConfig.API_VERSION + GAMES + TEAM + HISTORY)
  Observable<BaseResponse> getTeamBetsHistory(@Query(TEAM_ID) String teamId,
      @Query(OFFSET) int offset, @Query(LIMIT) int limit);

  @GET(ApiConfig.API_VERSION + GAMES + EXPERT + LIST)
  Observable<BaseResponse<List<PunditSimpleEntity>>> getExpertList();

  @GET(ApiConfig.API_VERSION + GAMES + GAMEWEEKS)
  Observable<BaseResponse<List<GameweekEntity>>> getGameweeksList();

  @GET(ApiConfig.API_VERSION + GAMES + HISTORY)
  Observable<BaseResponse<List<HistoryBetEntity>>> getGameweekBetsHistory(
      @Query(GAMEWEEK) int gameweekNumber);

  @GET(ApiConfig.API_VERSION + GAMES + STANDINGS_BY_MATCH_ID)
  Observable<BaseResponse<StandingsDataEntity>> getStandingsByMatchId(@Query(MATCH_ID) String matchId);

  @GET(ApiConfig.API_VERSION + PUNDITS + POSTS) Observable<BaseResponse<PunditsDataEntity>> getPunditsPosts(
      @Query(DISPLAY) String display);

  @GET(ApiConfig.API_VERSION + GAMES + LUCKY_DIP_SET) Observable<BaseResponse<List<LuckyDipBetEntity>>> getLuckyDipSet();
}
