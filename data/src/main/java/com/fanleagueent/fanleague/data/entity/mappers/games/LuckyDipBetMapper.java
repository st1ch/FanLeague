package com.fanleagueent.fanleague.data.entity.mappers.games;

import com.fanleagueent.fanleague.data.entity.entities.games.LuckyDipBetEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.games.LuckyDipBet;

/**
 * Created by Artem Getman on 14.03.17.
 * a.e.getman@gmail.com
 */

public class LuckyDipBetMapper implements Mapper<LuckyDipBetEntity, LuckyDipBet> {

  @Override public LuckyDipBet transform(LuckyDipBetEntity obj) {
    LuckyDipBet luckyDipBet = new LuckyDipBet();

    luckyDipBet.setPrice(obj.getPrice());
    luckyDipBet.setBets(obj.getBets());
    luckyDipBet.setSystem(obj.getSystem());

    return luckyDipBet;
  }
}
