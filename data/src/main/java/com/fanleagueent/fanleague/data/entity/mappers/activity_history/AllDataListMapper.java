package com.fanleagueent.fanleague.data.entity.mappers.activity_history;

import com.fanleagueent.fanleague.data.entity.entities.activity_history.ActivityHistoryAllDataEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.activity_history.ActivityHistoryAllData;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Artem Getman on 21.03.17.
 * a.e.getman@gmail.com
 */

public class AllDataListMapper
    implements Mapper<List<ActivityHistoryAllDataEntity>, List<ActivityHistoryAllData>> {

  private ActivityHistoryMapperFactory activityHistoryMapperFactory;

  public AllDataListMapper(ActivityHistoryMapperFactory activityHistoryMapperFactory) {
    this.activityHistoryMapperFactory = activityHistoryMapperFactory;
  }

  @Override public List<ActivityHistoryAllData> transform(List<ActivityHistoryAllDataEntity> obj) {
    List<ActivityHistoryAllData> activityHistoryAllDatas = new ArrayList<>();

    for (ActivityHistoryAllDataEntity entity : obj) {
      activityHistoryAllDatas.add(
          activityHistoryMapperFactory.getActivityHistoryAllDataMapper().transform(entity));
    }

    return activityHistoryAllDatas;
  }
}
