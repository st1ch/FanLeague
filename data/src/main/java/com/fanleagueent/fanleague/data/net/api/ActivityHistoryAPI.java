package com.fanleagueent.fanleague.data.net.api;

import com.fanleagueent.fanleague.data.constants.ApiConfig;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by alexeyverbitskiy on 3/2/17.
 */

public interface ActivityHistoryAPI {

  String HISTORY = "/history";
  String ALL = "/all";
  String FRIENDS = "/friends";
  String TEAMS = "/teams";
  String LEAGUES = "/leagues";
  String BETS = "/bets";

  String OFFSET = "offset";

  @GET(ApiConfig.API_VERSION + HISTORY + ALL) Observable<BaseResponse<List<ActivityHistoryAllData>>> getHistoryAll(
      @Query(OFFSET) int offset);

  @GET(ApiConfig.API_VERSION + HISTORY + FRIENDS) Observable<BaseResponse<List<ActivityHistoryAllData>>> getHistoryFriends(
      @Query(OFFSET) int offset);

  @GET(ApiConfig.API_VERSION + HISTORY + TEAMS) Observable<BaseResponse<List<ActivityHistoryAllData>>> getHistoryTeams(
      @Query(OFFSET) int offset);

  @GET(ApiConfig.API_VERSION + HISTORY + LEAGUES) Observable<BaseResponse<List<ActivityHistoryAllData>>> getHistoryLeagues(
      @Query(OFFSET) int offset);

  @GET(ApiConfig.API_VERSION + HISTORY + BETS) Observable<BaseResponse<List<ActivityHistoryAllData>>> getHistoryBets(
      @Query(OFFSET) int offset);

}
