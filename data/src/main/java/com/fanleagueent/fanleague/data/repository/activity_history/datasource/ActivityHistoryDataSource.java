package com.fanleagueent.fanleague.data.repository.activity_history.datasource;

import com.fanleagueent.fanleague.data.entity.entities.activity_history.ActivityHistoryAllDataEntity;
import com.fanleagueent.fanleague.data.entity.entities.activity_history.ActivityHistoryBetEntity;
import com.fanleagueent.fanleague.data.entity.entities.activity_history.ActivityHistoryGroupEntity;
import com.fanleagueent.fanleague.data.entity.entities.activity_history.ActivityHistoryUserEntity;
import io.reactivex.Maybe;
import java.util.List;

/**
 * Created by Artem Getman on 16.03.17.
 * a.e.getman@gmail.com
 */

public interface ActivityHistoryDataSource {

  Maybe<List<ActivityHistoryAllDataEntity>> getHistoryAll(int offset);

  Maybe<List<ActivityHistoryUserEntity>> getHistoryFriends(int offset);

  Maybe<List<ActivityHistoryGroupEntity>> getHistoryTeams(int offset);

  Maybe<List<ActivityHistoryGroupEntity>> getHistoryLeagues(int offset);

  Maybe<List<ActivityHistoryBetEntity>> getHistoryBets(int offset);
}
