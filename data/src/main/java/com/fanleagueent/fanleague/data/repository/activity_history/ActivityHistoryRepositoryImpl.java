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
    return Flowable.concatArrayDelayError(local.getHistoryAll(offset).toFlowable(),
        remote.getHistoryAll(offset).toFlowable())
        .map(o -> activityHistoryMapperFactory.getActivityHistoryAllDataListMapper().transform(o));
  }

  @Override public Flowable<List<ActivityHistoryUser>> getHistoryFriends(int offset) {
    return Flowable.concatArrayDelayError(local.getHistoryFriends(offset).toFlowable(),
        remote.getHistoryFriends(offset).toFlowable())
        .map(o -> activityHistoryMapperFactory.getActivityHistoryUserListMapper().transform(o));
  }

  @Override public Flowable<List<ActivityHistoryGroup>> getHistoryTeams(int offset) {
    return Flowable.concatArrayDelayError(local.getHistoryTeams(offset).toFlowable(),
        remote.getHistoryTeams(offset).toFlowable())
        .map(o -> activityHistoryMapperFactory.getActivityHistoryGroupListMapper().transform(o));
  }

  @Override public Flowable<List<ActivityHistoryGroup>> getHistoryLeagues(int offset) {
    return Flowable.concatArrayDelayError(local.getHistoryLeagues(offset).toFlowable(),
        remote.getHistoryLeagues(offset).toFlowable())
        .map(o -> activityHistoryMapperFactory.getActivityHistoryGroupListMapper().transform(o));
  }

  @Override public Flowable<List<ActivityHistoryBet>> getHistoryBets(int offset) {
    return Flowable.concatArrayDelayError(local.getHistoryBets(offset).toFlowable(),
        remote.getHistoryBets(offset).toFlowable())
        .map(o -> activityHistoryMapperFactory.getActivityHistoryBetListMapper().transform(o));
  }
}
