package com.fanleagueent.fanleague.data.entity.mappers.games;

import com.fanleagueent.fanleague.data.entity.entities.games.PrizesEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.games.Prizes;

/**
 * Created by Artem Getman on 14.03.17.
 * a.e.getman@gmail.com
 */

public class PrizesMapper implements Mapper<PrizesEntity, Prizes> {

  @Override public Prizes transform(PrizesEntity obj) {
    Prizes prizes = new Prizes();

    prizes.setPrize10(obj.getPrize10());
    prizes.setPrize11(obj.getPrize11());
    prizes.setPrize12(obj.getPrize12());
    prizes.setPrize13(obj.getPrize13());
    prizes.setTree(obj.getTree());

    return prizes;
  }
}
