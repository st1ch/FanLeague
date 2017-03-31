package com.fanleagueent.fanleague.data.repository.activity_history.datasource;

import com.fanleagueent.fanleague.data.entity.entities.activity_history.ActivityHistoryAllDataEntity;
import io.reactivex.Maybe;
import java.util.List;

/**
 * Created by Artem Getman on 16.03.17.
 * a.e.getman@gmail.com
 */

public interface ActivityHistoryDataSource {

  Maybe<List<ActivityHistoryAllDataEntity>> getHistoryAll(int offset);

  Maybe<List<ActivityHistoryAllDataEntity>> getHistoryFriends(int offset);

  Maybe<List<ActivityHistoryAllDataEntity>> getHistoryTeams(int offset);

  Maybe<List<ActivityHistoryAllDataEntity>> getHistoryLeagues(int offset);

  Maybe<List<ActivityHistoryAllDataEntity>> getHistoryBets(int offset);
}
