package com.fanleagueent.fanleague.data.entity.mappers;

import com.fanleagueent.fanleague.data.entity.mappers.activity_history.ActivityHistoryMapperFactory;
import com.fanleagueent.fanleague.data.entity.mappers.activity_history.ActivityHistoryMapperFactoryImpl;
import com.fanleagueent.fanleague.data.entity.mappers.user.UserMapperFactory;

public class MapperFactoryImpl implements MapperFactory {

  @Override public UserMapperFactory userMapperFactory() {
    return null;
  }

  @Override public ActivityHistoryMapperFactory activityHistoryMapperFactory() {
    return new ActivityHistoryMapperFactoryImpl(this);
  }
}
