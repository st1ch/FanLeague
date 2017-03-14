package com.fanleagueent.fanleague.data.entity.mappers.games;

import com.fanleagueent.fanleague.data.entity.entities.games.CurrentBetDataEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.games.CurrentBetData;

/**
 * Created by Artem Getman on 14.03.17.
 * a.e.getman@gmail.com
 */

public class CurrentBetDataMapper implements Mapper<CurrentBetDataEntity, CurrentBetData> {

  private GamesMapperFactory gamesMapperFactory;

  public CurrentBetDataMapper(GamesMapperFactory gamesMapperFactory) {
    this.gamesMapperFactory = gamesMapperFactory;
  }

  @Override public CurrentBetData transform(CurrentBetDataEntity obj) {
    CurrentBetData currentBetData = new CurrentBetData();

    currentBetData.setBet(gamesMapperFactory.getBetMapper().transform(obj.getBetEntity()));
    currentBetData.setGameweek(
        gamesMapperFactory.getGameweekMapper().transform(obj.getGameweekEntity()));

    return currentBetData;
  }
}
