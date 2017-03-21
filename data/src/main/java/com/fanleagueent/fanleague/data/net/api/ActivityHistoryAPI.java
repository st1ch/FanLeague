package com.fanleagueent.fanleague.data.net.api;

import com.fanleagueent.fanleague.data.constants.ApiConfig;
import com.fanleagueent.fanleague.data.entity.BaseResponse;
import com.fanleagueent.fanleague.data.entity.entities.activity_history.ActivityHistoryAllDataEntity;
import com.fanleagueent.fanleague.data.entity.entities.activity_history.ActivityHistoryBetEntity;
import com.fanleagueent.fanleague.data.entity.entities.activity_history.ActivityHistoryGroupEntity;
import com.fanleagueent.fanleague.data.entity.entities.activity_history.ActivityHistoryUserEntity;
import io.reactivex.Maybe;
import java.util.List;
import retrofit2.http.GET;
import retrofit2.http.Query;

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
  Maybe<BaseResponse<List<ActivityHistoryAllDataEntity>>> getHistoryAll(@Query(OFFSET) int offset);

  @GET(ApiConfig.API_VERSION + HISTORY + FRIENDS)
  Maybe<BaseResponse<List<ActivityHistoryUserEntity>>> getHistoryFriends(
      @Query(OFFSET) int offset);

  @GET(ApiConfig.API_VERSION + HISTORY + TEAMS)
  Maybe<BaseResponse<List<ActivityHistoryGroupEntity>>> getHistoryTeams(@Query(OFFSET) int offset);

  @GET(ApiConfig.API_VERSION + HISTORY + LEAGUES)
  Maybe<BaseResponse<List<ActivityHistoryGroupEntity>>> getHistoryLeagues(
      @Query(OFFSET) int offset);

  @GET(ApiConfig.API_VERSION + HISTORY + BETS)
  Maybe<BaseResponse<List<ActivityHistoryBetEntity>>> getHistoryBets(@Query(OFFSET) int offset);
}
