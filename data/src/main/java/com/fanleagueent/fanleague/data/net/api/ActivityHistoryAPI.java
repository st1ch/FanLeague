package com.fanleagueent.fanleague.data.net.api;

import com.fanleagueent.fanleague.data.constants.ApiConfig;
import com.fanleagueent.fanleague.data.entity.BaseResponse;
import com.fanleagueent.fanleague.data.entity.entities.activity_history.ActivityHistoryAllDataEntity;
import java.util.List;
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

  @GET(ApiConfig.API_VERSION + HISTORY + ALL)
  Observable<BaseResponse<List<ActivityHistoryAllDataEntity>>> getHistoryAll(@Query(OFFSET) int offset);

  @GET(ApiConfig.API_VERSION + HISTORY + FRIENDS)
  Observable<BaseResponse<List<ActivityHistoryAllDataEntity>>> getHistoryFriends(
      @Query(OFFSET) int offset);

  @GET(ApiConfig.API_VERSION + HISTORY + TEAMS)
  Observable<BaseResponse<List<ActivityHistoryAllDataEntity>>> getHistoryTeams(@Query(OFFSET) int offset);

  @GET(ApiConfig.API_VERSION + HISTORY + LEAGUES)
  Observable<BaseResponse<List<ActivityHistoryAllDataEntity>>> getHistoryLeagues(
      @Query(OFFSET) int offset);

  @GET(ApiConfig.API_VERSION + HISTORY + BETS)
  Observable<BaseResponse<List<ActivityHistoryAllDataEntity>>> getHistoryBets(@Query(OFFSET) int offset);
}
