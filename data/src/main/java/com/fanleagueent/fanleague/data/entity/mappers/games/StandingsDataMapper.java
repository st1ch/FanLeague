package com.fanleagueent.fanleague.data.entity.mappers.games;

import com.fanleagueent.fanleague.data.entity.entities.games.StandingsDataEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.games.StandingsData;

/**
 * Created by Artem Getman on 14.03.17.
 * a.e.getman@gmail.com
 */

public class StandingsDataMapper implements Mapper<StandingsDataEntity, StandingsData> {

  private GamesMapperFactory gamesMapperFactory;

  public StandingsDataMapper(GamesMapperFactory gamesMapperFactory) {
    this.gamesMapperFactory = gamesMapperFactory;
  }

  @Override public StandingsData transform(StandingsDataEntity obj) {
    StandingsData standingsData = new StandingsData();

    standingsData.setGamesHistory(
        gamesMapperFactory.getMatchHistoryListMapper().transform(obj.getGamesHistory()));
    standingsData.setTeamList(
        gamesMapperFactory.getStandingsTeamListMapper().transform(obj.getTeamList()));

    return standingsData;
  }
}
