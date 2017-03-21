package com.fanleagueent.fanleague.data.repository.activity_history;

import com.fanleagueent.fanleague.data.entity.mappers.activity_history.ActivityHistoryMapperFactory;
import com.fanleagueent.fanleague.data.repository.activity_history.datasource.ActivityHistoryDataSource;
import com.fanleagueent.fanleague.domain.models.activity_history.ActivityHistoryAllData;
import com.fanleagueent.fanleague.domain.models.activity_history.ActivityHistoryBet;
import com.fanleagueent.fanleague.domain.models.activity_history.ActivityHistoryGroup;
import com.fanleagueent.fanleague.domain.models.activity_history.ActivityHistoryUser;
import com.fanleagueent.fanleague.domain.repository.ActivityHistoryRepository;
import io.reactivex.Flowable;
import java.util.List;

/**
 * Created by Artem Getman on 16.03.17.
 * a.e.getman@gmail.com
 */

public class ActivityHistoryRepositoryImpl implements ActivityHistoryRepository {

  private ActivityHistoryDataSource remote;
  private ActivityHistoryDataSource local;
  private ActivityHistoryMapperFactory activityHistoryMapperFactory;

  public ActivityHistoryRepositoryImpl(ActivityHistoryDataSource remote,
      ActivityHistoryDataSource local, ActivityHistoryMapperFactory activityHistoryMapperFactory) {
    this.remote = remote;
    this.local = local;
    this.activityHistoryMapperFactory = activityHistoryMapperFactory;
  }

  @Override public Flowable<List<ActivityHistoryAllData>> getHistoryAll(int offset) {
    return local.getHistoryAll(offset)
        .concatWith(remote.getHistoryAll(offset))
        .map(o -> activityHistoryMapperFactory.getActivityHistoryAllDataListMapper().transform(o));
  }

  @Override public Flowable<List<ActivityHistoryUser>> getHistoryFriends(int offset) {
    return local.getHistoryFriends(offset)
        .concatWith(remote.getHistoryFriends(offset))
        .map(o -> activityHistoryMapperFactory.getActivityHistoryUserListMapper().transform(o));
  }

  @Override public Flowable<List<ActivityHistoryGroup>> getHistoryTeams(int offset) {
    return local.getHistoryTeams(offset)
        .concatWith(remote.getHistoryTeams(offset))
        .map(o -> activityHistoryMapperFactory.getActivityHistoryGroupListMapper().transform(o));
  }

  @Override public Flowable<List<ActivityHistoryGroup>> getHistoryLeagues(int offset) {
    return local.getHistoryLeagues(offset)
        .concatWith(remote.getHistoryLeagues(offset))
        .map(o -> activityHistoryMapperFactory.getActivityHistoryGroupListMapper().transform(o));
  }

  @Override public Flowable<List<ActivityHistoryBet>> getHistoryBets(int offset) {
    return local.getHistoryBets(offset)
        .concatWith(remote.getHistoryBets(offset))
        .map(o -> activityHistoryMapperFactory.getActivityHistoryBetListMapper().transform(o));
  }
}
