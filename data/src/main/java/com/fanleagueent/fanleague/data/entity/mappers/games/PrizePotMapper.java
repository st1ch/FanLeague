package com.fanleagueent.fanleague.data.entity.mappers.games;

import com.fanleagueent.fanleague.data.entity.entities.games.PrizePotEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.games.PrizePot;

/**
 * Created by Artem Getman on 14.03.17.
 * a.e.getman@gmail.com
 */

public class PrizePotMapper implements Mapper<PrizePotEntity, PrizePot> {

  private GamesMapperFactory gamesMapperFactory;

  public PrizePotMapper(GamesMapperFactory gamesMapperFactory) {
    this.gamesMapperFactory = gamesMapperFactory;
  }

  @Override public PrizePot transform(PrizePotEntity obj) {
    PrizePot prizePot = new PrizePot();

    prizePot.setPot(obj.getPot());
    prizePot.setTurnover(obj.getTurnover());
    prizePot.setPrizes(gamesMapperFactory.getPrizesMapper().transform(obj.getPrizesEntity()));
    prizePot.setWinners(gamesMapperFactory.getWinnersMapper().transform(obj.getWinnersEntity()));

    return prizePot;
  }
}
