package com.fanleagueent.fanleague.data.entity.mappers.dashboard;

import com.fanleagueent.fanleague.data.entity.entities.dashboard.GameWeekDashboardEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.data.entity.mappers.MapperFactory;
import com.fanleagueent.fanleague.domain.models.dashboard.GameWeekDashboard;

/**
 * Created by Artem Getman on 05.05.17.
 * a.e.getman@gmail.com
 */

public class GameweekDashboardMapper implements Mapper<GameWeekDashboardEntity, GameWeekDashboard> {

  private MapperFactory mapperFactory;

  @Override public GameWeekDashboard transform(GameWeekDashboardEntity obj) {
    return GameWeekDashboard.builder()
        .aggregatedPrizepot(obj.getPot())
        .week(obj.getWeek())
        .pot(obj.getPot())
        .prizePot(mapperFactory.gamesMapperFactory().getPrizePotMapper().transform(obj.getPrizePot()))
        .maxUserPrize(obj.getMaxUserPrize())
        .build();
  }
}
