package com.fanleagueent.fanleague.data.entity.mappers.activity_history;

import com.fanleagueent.fanleague.data.entity.entities.activity_history.ActivityHistoryGroupEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.activity_history.ActivityHistoryGroup;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Artem Getman on 21.03.17.
 * a.e.getman@gmail.com
 */

public class GroupListMapper
    implements Mapper<List<ActivityHistoryGroupEntity>, List<ActivityHistoryGroup>> {

  private ActivityHistoryMapperFactory activityHistoryMapperFactory;

  public GroupListMapper(ActivityHistoryMapperFactory activityHistoryMapperFactory) {
    this.activityHistoryMapperFactory = activityHistoryMapperFactory;
  }

  @Override public List<ActivityHistoryGroup> transform(List<ActivityHistoryGroupEntity> obj) {
    List<ActivityHistoryGroup> activityHistoryGroups = new ArrayList<>();

    for (ActivityHistoryGroupEntity entity : obj) {
      activityHistoryGroups.add(
          activityHistoryMapperFactory.getActivityHistoryGroupMapper().transform(entity));
    }

    return activityHistoryGroups;
  }
}
