package com.fanleagueent.fanleague.data.entity.mappers.dashboard;

import com.fanleagueent.fanleague.data.entity.entities.dashboard.DashboardEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.data.entity.mappers.MapperFactory;
import com.fanleagueent.fanleague.domain.models.dashboard.Dashboard;

/**
 * Created by Artem Getman on 05.05.17.
 * a.e.getman@gmail.com
 */

public class DashboardMapper implements Mapper<DashboardEntity, Dashboard> {

  private MapperFactory mapperFactory;

  public DashboardMapper(MapperFactory mapperFactory) {
    this.mapperFactory = mapperFactory;
  }

  @Override public Dashboard transform(DashboardEntity obj) {
    DashboardMapperFactory dashboardMapperFactory = mapperFactory.dashboardMapperFactory();
    return Dashboard.builder()
        .chatDataList(mapperFactory.chatMapperFactory()
            .getChatDataListMapper()
            .transform(obj.getChatDataList()))
        .community(dashboardMapperFactory.getCommunityMapper().transform(obj.getCommunityEntity()))
        .gameWeekDashboard(dashboardMapperFactory.getGameweekDashboardMapper()
            .transform(obj.getGameWeekDashboardEntity()))
        .latestScore(dashboardMapperFactory.getLatestScoreMapper().transform(obj.getLatestScore()))
        .tutorialList(
            dashboardMapperFactory.getTutorialListMapper().transform(obj.getTutorialEntityList()))
        .updateList(dashboardMapperFactory.getUpdateListMapper().transform(obj.getUpdateList()))
        .build();
  }
}
