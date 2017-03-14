package com.fanleagueent.fanleague.data.entity.mappers.games;

import com.fanleagueent.fanleague.data.entity.entities.games.BetRateEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.games.BetRate;

/**
 * Created by Artem Getman on 14.03.17.
 * a.e.getman@gmail.com
 */

public class BetRateMapper implements Mapper<BetRateEntity, BetRate> {
  @Override public BetRate transform(BetRateEntity obj) {
    BetRate betRate = new BetRate();

    betRate.setCommunityRate(obj.getCommunityRate());
    betRate.setExpertsRate(obj.getExpertsRate());

    return betRate;
  }
}
