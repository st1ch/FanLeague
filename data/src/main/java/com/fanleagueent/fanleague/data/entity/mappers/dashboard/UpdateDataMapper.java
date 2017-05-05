package com.fanleagueent.fanleague.data.entity.mappers.dashboard;

import com.fanleagueent.fanleague.data.entity.entities.dashboard.UpdateDataEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.dashboard.UpdateData;

/**
 * Created by Artem Getman on 05.05.17.
 * a.e.getman@gmail.com
 */

public class UpdateDataMapper implements Mapper<UpdateDataEntity, UpdateData> {

  private DashboardMapperFactory dashboardMapperFactory;

  public UpdateDataMapper(DashboardMapperFactory dashboardMapperFactory) {
    this.dashboardMapperFactory = dashboardMapperFactory;
  }

  @Override public UpdateData transform(UpdateDataEntity obj) {
    return UpdateData.builder()
        .update(dashboardMapperFactory.getUpdateMapper().transform(obj.getUpdate()))
        .build();
  }
}
