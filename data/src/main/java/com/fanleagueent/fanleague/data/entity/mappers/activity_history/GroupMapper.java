package com.fanleagueent.fanleague.data.entity.mappers.activity_history;

import com.fanleagueent.fanleague.data.entity.entities.activity_history.ActivityHistoryGroupEntity;
import com.fanleagueent.fanleague.data.entity.mappers.MapperFactory;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.activity_history.ActivityHistoryGroup;

/**
 * Created by Artem Getman on 13.03.17.
 * a.e.getman@gmail.com
 */

public class GroupMapper
    implements Mapper<ActivityHistoryGroupEntity, ActivityHistoryGroup> {

  private MapperFactory mapperFactory;

  public GroupMapper(MapperFactory mapperFactory) {
    this.mapperFactory = mapperFactory;
  }

  @Override public ActivityHistoryGroup transform(ActivityHistoryGroupEntity obj)
      throws RuntimeException {
    ActivityHistoryGroup activityHistoryGroup = new ActivityHistoryGroup();

    activityHistoryGroup.setId(obj.getId());
    activityHistoryGroup.setSlug(obj.getSlug());
    activityHistoryGroup.setName(obj.getName());
    activityHistoryGroup.setAvatar(
        mapperFactory.userMapperFactory().getAvatarMapper().transform(obj.getAvatarEntity()));

    return activityHistoryGroup;
  }
}
