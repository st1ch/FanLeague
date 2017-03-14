package com.fanleagueent.fanleague.data.entity.mappers.activity_history;

import com.fanleagueent.fanleague.data.entity.entities.activity_history.ActivityHistoryUserEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.data.entity.mappers.MapperFactory;
import com.fanleagueent.fanleague.domain.models.activity_history.ActivityHistoryUser;

/**
 * Created by Artem Getman on 13.03.17.
 * a.e.getman@gmail.com
 */

public class UserMapper implements Mapper<ActivityHistoryUserEntity, ActivityHistoryUser> {

  private MapperFactory mapperFactory;

  public UserMapper(MapperFactory mapperFactory) {
    this.mapperFactory = mapperFactory;
  }

  @Override public ActivityHistoryUser transform(ActivityHistoryUserEntity obj) {

    ActivityHistoryUser activityHistoryUser = new ActivityHistoryUser();

    activityHistoryUser.setId(obj.getId());
    activityHistoryUser.setLevel(obj.getLevel());
    activityHistoryUser.setHasBetMedal(obj.isHasBetMedal());
    activityHistoryUser.setAvatar(
        mapperFactory.userMapperFactory().getAvatarMapper().transform(obj.getAvatarEntity()));

    return activityHistoryUser;
  }
}
