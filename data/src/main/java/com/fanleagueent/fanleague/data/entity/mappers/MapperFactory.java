package com.fanleagueent.fanleague.data.entity.mappers;

import com.fanleagueent.fanleague.data.entity.mappers.activity_history.ActivityHistoryMapperFactory;
import com.fanleagueent.fanleague.data.entity.mappers.user.UserMapperFactory;

public interface MapperFactory {

  UserMapperFactory userMapperFactory();

  ActivityHistoryMapperFactory activityHistoryMapperFactory();

}
