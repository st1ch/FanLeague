package com.fanleagueent.fanleague.data.entity.mappers.activity_history;

import com.fanleagueent.fanleague.data.entity.entities.activity_history.ActivityHistoryAllDataEntity;
import com.fanleagueent.fanleague.data.entity.entities.activity_history.ActivityHistoryBetEntity;
import com.fanleagueent.fanleague.data.entity.entities.activity_history.ActivityHistoryGroupEntity;
import com.fanleagueent.fanleague.data.entity.entities.activity_history.ActivityHistoryUserEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.data.entity.mappers.MapperFactory;
import com.fanleagueent.fanleague.domain.models.activity_history.ActivityHistoryAllData;
import com.fanleagueent.fanleague.domain.models.activity_history.ActivityHistoryBet;
import com.fanleagueent.fanleague.domain.models.activity_history.ActivityHistoryGroup;
import com.fanleagueent.fanleague.domain.models.activity_history.ActivityHistoryUser;

/**
 * Created by Artem Getman on 13.03.17.
 * a.e.getman@gmail.com
 */

public class ActivityHistoryMapperFactoryImpl implements ActivityHistoryMapperFactory {

  private MapperFactory mapperFactory;

  public ActivityHistoryMapperFactoryImpl(MapperFactory mapperFactory) {
    this.mapperFactory = mapperFactory;
  }

  @Override
  public Mapper<ActivityHistoryAllDataEntity, ActivityHistoryAllData> getActivityHistoryAllDataMapper() {
    return new AllDataMapper(this);
  }

  @Override
  public Mapper<ActivityHistoryBetEntity, ActivityHistoryBet> getActivityHistoryBetMapper() {
    return new BetMapper();
  }

  @Override
  public Mapper<ActivityHistoryGroupEntity, ActivityHistoryGroup> getActivityHistoryGroupMapper() {
    return new GroupMapper(mapperFactory);
  }

  @Override
  public Mapper<ActivityHistoryUserEntity, ActivityHistoryUser> getActivityHistoryUserMapper() {
    return new UserMapper(mapperFactory);
  }
}
