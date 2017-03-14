package com.fanleagueent.fanleague.data.entity.mappers.games;

import com.fanleagueent.fanleague.data.entity.entities.games.BetEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.games.Bet;

/**
 * Created by Artem Getman on 14.03.17.
 * a.e.getman@gmail.com
 */

public class BetMapper implements Mapper<BetEntity, Bet> {

  @Override public Bet transform(BetEntity obj) {
    Bet bet = new Bet();

    bet.setId(obj.getId());
    bet.setUserId(obj.getUserId());
    bet.setWeek(obj.getWeek());
    bet.setBets(obj.getBets());
    bet.setPrice(obj.getPrice());
    bet.setBetsPlayed(obj.getBetsPlayed());
    bet.setPrize(obj.getPrize());
    bet.setUpdatedAt(obj.getUpdatedAt());
    bet.setCreatedAt(obj.getCreatedAt());
    bet.setWeekLabel(obj.getWeekLabel());

    return bet;
  }
}
