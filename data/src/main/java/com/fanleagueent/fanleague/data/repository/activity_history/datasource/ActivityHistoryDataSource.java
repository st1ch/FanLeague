package com.fanleagueent.fanleague.data.repository.activity_history.datasource;

import com.fanleagueent.fanleague.data.entity.entities.activity_history.ActivityHistoryAllDataEntity;
import io.reactivex.Maybe;
import io.reactivex.MaybeTransformer;
import java.util.List;

/**
 * Created by Artem Getman on 16.03.17.
 * a.e.getman@gmail.com
 */

public interface ActivityHistoryDataSource {

  Maybe<List<ActivityHistoryAllDataEntity>> getHistoryAll(int offset);

  MaybeTransformer<List<ActivityHistoryAllDataEntity>, List<ActivityHistoryAllDataEntity>> saveHistoryAll(
      int offset);

  Maybe<List<ActivityHistoryAllDataEntity>> getHistoryFriends(int offset);

  MaybeTransformer<List<ActivityHistoryAllDataEntity>, List<ActivityHistoryAllDataEntity>> saveHistoryFriends(
      int offset);

  Maybe<List<ActivityHistoryAllDataEntity>> getHistoryTeams(int offset);

  MaybeTransformer<List<ActivityHistoryAllDataEntity>, List<ActivityHistoryAllDataEntity>> saveHistoryTeams(
      int offset);

  Maybe<List<ActivityHistoryAllDataEntity>> getHistoryLeagues(int offset);

  MaybeTransformer<List<ActivityHistoryAllDataEntity>, List<ActivityHistoryAllDataEntity>> saveHistoryLeagues(
      int offset);

  Maybe<List<ActivityHistoryAllDataEntity>> getHistoryBets(int offset);

  MaybeTransformer<List<ActivityHistoryAllDataEntity>, List<ActivityHistoryAllDataEntity>> saveHistoryBets(
      int offset);
}
