package com.fanleagueent.fanleague.data.entity.mappers.games;

import com.fanleagueent.fanleague.data.entity.entities.games.HistoryBetEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.games.HistoryBet;

/**
 * Created by Artem Getman on 14.03.17.
 * a.e.getman@gmail.com
 */

public class HistoryBetMapper implements Mapper<HistoryBetEntity, HistoryBet> {

  private GamesMapperFactory gamesMapperFactory;

  public HistoryBetMapper(GamesMapperFactory gamesMapperFactory) {
    this.gamesMapperFactory = gamesMapperFactory;
  }

  @Override public HistoryBet transform(HistoryBetEntity obj) {
    HistoryBet historyBet = new HistoryBet();

    historyBet.setId(obj.getId());
    historyBet.setWeek(obj.getWeek());
    historyBet.setBets(obj.getBets());
    historyBet.setPrice(obj.getPrice());
    historyBet.setPrize(obj.getPrize());
    historyBet.setBetsPlayed(obj.getBetsPlayed());
    historyBet.setCreatedAt(obj.getCreatedAt());
    historyBet.setWeekLabel(obj.getWeekLabel());
    historyBet.setTeam(obj.isTeam());
    historyBet.setPlayHistoryTypeData(gamesMapperFactory.getPlayHistoryTypeDataMapper()
        .transform(obj.getPlayHistoryTypeDataEntity()));

    return historyBet;
  }
}
