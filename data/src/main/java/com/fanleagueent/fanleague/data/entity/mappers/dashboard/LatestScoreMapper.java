package com.fanleagueent.fanleague.data.entity.mappers.dashboard;

import com.fanleagueent.fanleague.data.entity.entities.dashboard.LatestScoreEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.dashboard.LatestScore;

/**
 * Created by Artem Getman on 05.05.17.
 * a.e.getman@gmail.com
 */

public class LatestScoreMapper implements Mapper<LatestScoreEntity, LatestScore> {

  private DashboardMapperFactory dashboardMapperFactory;

  public LatestScoreMapper(DashboardMapperFactory dashboardMapperFactory) {
    this.dashboardMapperFactory = dashboardMapperFactory;
  }

  @Override public LatestScore transform(LatestScoreEntity obj) {
    return LatestScore.builder()
        .hasLast(obj.isHasLast())
        .lastBet(dashboardMapperFactory.getLastBetMapper().transform(obj.getLastBet()))
        .seasonAverage(obj.getSeasonAverage())
        .build();
  }
}
