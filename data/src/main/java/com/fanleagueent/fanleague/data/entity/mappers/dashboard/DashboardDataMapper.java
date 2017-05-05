package com.fanleagueent.fanleague.data.entity.mappers.dashboard;

import com.fanleagueent.fanleague.data.entity.entities.dashboard.DashboardDataEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.dashboard.DashboardData;

/**
 * Created by Artem Getman on 05.05.17.
 * a.e.getman@gmail.com
 */

public class DashboardDataMapper implements Mapper<DashboardDataEntity, DashboardData> {

  private DashboardMapperFactory dashboardMapperFactory;

  public DashboardDataMapper(DashboardMapperFactory dashboardMapperFactory) {
    this.dashboardMapperFactory = dashboardMapperFactory;
  }

  @Override public DashboardData transform(DashboardDataEntity obj) {
    return DashboardData.builder()
        .dashboard(dashboardMapperFactory.getDashboardMapper().transform(obj.getDashboard()))
        .build();
  }
}
