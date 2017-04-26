package com.fanleagueent.fanleague.data.repository.activity_history;

import com.fanleagueent.fanleague.data.entity.mappers.MapperFactory;
import com.fanleagueent.fanleague.data.entity.mappers.activity_history.ActivityHistoryMapperFactory;
import com.fanleagueent.fanleague.data.repository.activity_history.datasource.ActivityHistoryDataSource;
import com.fanleagueent.fanleague.domain.models.activity_history.ActivityHistoryAllData;
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
      ActivityHistoryDataSource local, MapperFactory mapperFactory) {
    this.remote = remote;
    this.local = local;
    this.activityHistoryMapperFactory = mapperFactory.activityHistoryMapperFactory();
  }

  @Override public Flowable<List<ActivityHistoryAllData>> getHistoryAll(int offset) {
    return Flowable.concatArrayDelayError(local.getHistoryAll(offset).toFlowable(),
        remote.getHistoryAll(offset).compose(local.saveHistoryAll(offset)).toFlowable())
        .filter(activityHistoryAllDataEntities -> activityHistoryAllDataEntities != null
            && !activityHistoryAllDataEntities.isEmpty())
        .map(entities -> activityHistoryMapperFactory.getActivityHistoryAllDataListMapper()
            .transform(entities));
  }

  @Override public Flowable<List<ActivityHistoryAllData>> getHistoryFriends(int offset) {
    return Flowable.concatArrayDelayError(local.getHistoryFriends(offset).toFlowable(),
        remote.getHistoryFriends(offset).toFlowable())
        .filter(activityHistoryAllDataEntities -> activityHistoryAllDataEntities != null
            && !activityHistoryAllDataEntities.isEmpty())
        .map(o -> activityHistoryMapperFactory.getActivityHistoryAllDataListMapper().transform(o));
  }

  @Override public Flowable<List<ActivityHistoryAllData>> getHistoryTeams(int offset) {
    return Flowable.concatArrayDelayError(local.getHistoryTeams(offset).toFlowable(),
        remote.getHistoryTeams(offset).toFlowable())
        .filter(activityHistoryAllDataEntities -> activityHistoryAllDataEntities != null
            && !activityHistoryAllDataEntities.isEmpty())
        .map(o -> activityHistoryMapperFactory.getActivityHistoryAllDataListMapper().transform(o));
  }

  @Override public Flowable<List<ActivityHistoryAllData>> getHistoryLeagues(int offset) {
    return Flowable.concatArrayDelayError(local.getHistoryLeagues(offset).toFlowable(),
        remote.getHistoryLeagues(offset).toFlowable())
        .filter(activityHistoryAllDataEntities -> activityHistoryAllDataEntities != null
            && !activityHistoryAllDataEntities.isEmpty())
        .map(o -> activityHistoryMapperFactory.getActivityHistoryAllDataListMapper().transform(o));
  }

  @Override public Flowable<List<ActivityHistoryAllData>> getHistoryBets(int offset) {
    return Flowable.concatArrayDelayError(local.getHistoryBets(offset).toFlowable(),
        remote.getHistoryBets(offset).toFlowable())
        .filter(activityHistoryAllDataEntities -> activityHistoryAllDataEntities != null
            && !activityHistoryAllDataEntities.isEmpty())
        .map(o -> activityHistoryMapperFactory.getActivityHistoryAllDataListMapper().transform(o));
  }
}
