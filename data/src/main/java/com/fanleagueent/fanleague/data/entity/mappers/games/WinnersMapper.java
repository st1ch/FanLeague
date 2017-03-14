package com.fanleagueent.fanleague.data.entity.mappers.games;

import com.fanleagueent.fanleague.data.entity.entities.games.WinnersEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.games.Winners;

/**
 * Created by Artem Getman on 14.03.17.
 * a.e.getman@gmail.com
 */

public class WinnersMapper implements Mapper<WinnersEntity, Winners> {

  @Override public Winners transform(WinnersEntity obj) {
    Winners winners = new Winners();

    winners.setWinners10(obj.getWinners10());
    winners.setWinners11(obj.getWinners11());
    winners.setWinners12(obj.getWinners12());
    winners.setWinners13(obj.getWinners13());
    winners.setWinnersTree(obj.getWinnersTree());

    return winners;
  }
}
