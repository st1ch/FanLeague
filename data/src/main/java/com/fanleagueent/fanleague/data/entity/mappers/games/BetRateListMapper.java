package com.fanleagueent.fanleague.data.entity.mappers.games;

import com.fanleagueent.fanleague.data.entity.entities.games.BetRateEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.games.BetRate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Artem Getman on 14.03.17.
 * a.e.getman@gmail.com
 */

public class BetRateListMapper implements Mapper<List<BetRateEntity>, List<BetRate>> {

  private GamesMapperFactory gamesMapperFactory;

  public BetRateListMapper(GamesMapperFactory gamesMapperFactory) {
    this.gamesMapperFactory = gamesMapperFactory;
  }

  @Override public List<BetRate> transform(List<BetRateEntity> obj) {
    List<BetRate> betRates = new ArrayList<>();

    for (BetRateEntity bet : obj) {
      betRates.add(gamesMapperFactory.getBetRateMapper().transform(bet));
    }

    return betRates;
  }
}
