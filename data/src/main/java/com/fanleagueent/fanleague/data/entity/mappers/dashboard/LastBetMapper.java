package com.fanleagueent.fanleague.data.entity.mappers.dashboard;

import com.fanleagueent.fanleague.data.entity.entities.dashboard.LastBetEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.dashboard.LastBet;

/**
 * Created by Artem Getman on 05.05.17.
 * a.e.getman@gmail.com
 */

public class LastBetMapper implements Mapper<LastBetEntity, LastBet> {
  @Override public LastBet transform(LastBetEntity obj) {
    return LastBet.builder()
        .betsPlayed(obj.getBetsPlayed())
        .gw(obj.getGw())
        .weekLabel(obj.getWeekLabel())
        .build();
  }
}
