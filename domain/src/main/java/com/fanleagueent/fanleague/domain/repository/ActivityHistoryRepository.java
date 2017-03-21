package com.fanleagueent.fanleague.domain.repository;

import com.fanleagueent.fanleague.domain.models.activity_history.ActivityHistoryAllData;
import com.fanleagueent.fanleague.domain.models.activity_history.ActivityHistoryBet;
import com.fanleagueent.fanleague.domain.models.activity_history.ActivityHistoryGroup;
import com.fanleagueent.fanleague.domain.models.activity_history.ActivityHistoryUser;
import io.reactivex.Flowable;
import java.util.List;

/**
 * Created by Artem Getman on 16.03.17.
 * a.e.getman@gmail.com
 */

public interface ActivityHistoryRepository {

  Flowable<List<ActivityHistoryAllData>> getHistoryAll(int offset);

  Flowable<List<ActivityHistoryUser>> getHistoryFriends(int offset);

  Flowable<List<ActivityHistoryGroup>> getHistoryTeams(int offset);

  Flowable<List<ActivityHistoryGroup>> getHistoryLeagues(int offset);

  Flowable<List<ActivityHistoryBet>> getHistoryBets(int offset);

}
