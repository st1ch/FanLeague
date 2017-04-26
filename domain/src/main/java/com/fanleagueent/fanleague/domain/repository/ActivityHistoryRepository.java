package com.fanleagueent.fanleague.domain.repository;

import com.fanleagueent.fanleague.domain.models.activity_history.ActivityHistoryAllData;
import io.reactivex.Flowable;
import java.util.List;

/**
 * Created by Artem Getman on 16.03.17.
 * a.e.getman@gmail.com
 */

public interface ActivityHistoryRepository {

  Flowable<List<ActivityHistoryAllData>> getHistoryAll(int offset);

  Flowable<List<ActivityHistoryAllData>> getHistoryFriends(int offset);

  Flowable<List<ActivityHistoryAllData>> getHistoryTeams(int offset);

  Flowable<List<ActivityHistoryAllData>> getHistoryLeagues(int offset);

  Flowable<List<ActivityHistoryAllData>> getHistoryBets(int offset);
}
