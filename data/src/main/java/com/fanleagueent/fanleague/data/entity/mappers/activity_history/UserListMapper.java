package com.fanleagueent.fanleague.data.entity.mappers.activity_history;

import com.fanleagueent.fanleague.data.entity.entities.activity_history.ActivityHistoryUserEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.activity_history.ActivityHistoryUser;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Artem Getman on 21.03.17.
 * a.e.getman@gmail.com
 */

public class UserListMapper
    implements Mapper<List<ActivityHistoryUserEntity>, List<ActivityHistoryUser>> {

  private ActivityHistoryMapperFactory activityHistoryMapperFactory;

  public UserListMapper(ActivityHistoryMapperFactory activityHistoryMapperFactory) {
    this.activityHistoryMapperFactory = activityHistoryMapperFactory;
  }

  @Override public List<ActivityHistoryUser> transform(List<ActivityHistoryUserEntity> obj) {
    List<ActivityHistoryUser> activityHistoryUsers = new ArrayList<>();

    for (ActivityHistoryUserEntity entity : obj) {
      activityHistoryUsers.add(
          activityHistoryMapperFactory.getActivityHistoryUserMapper().transform(entity));
    }

    return activityHistoryUsers;
  }
}
