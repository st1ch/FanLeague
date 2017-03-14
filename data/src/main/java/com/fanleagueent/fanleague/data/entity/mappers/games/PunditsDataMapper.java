package com.fanleagueent.fanleague.data.entity.mappers.games;

import com.fanleagueent.fanleague.data.entity.entities.games.PunditsDataEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.games.PunditsData;

/**
 * Created by Artem Getman on 14.03.17.
 * a.e.getman@gmail.com
 */

public class PunditsDataMapper implements Mapper<PunditsDataEntity, PunditsData> {

  private GamesMapperFactory gamesMapperFactory;

  public PunditsDataMapper(GamesMapperFactory gamesMapperFactory) {
    this.gamesMapperFactory = gamesMapperFactory;
  }

  @Override public PunditsData transform(PunditsDataEntity obj) {
    PunditsData punditsData = new PunditsData();

    punditsData.setPunditList(
        gamesMapperFactory.getPunditListMapper().transform(obj.getPunditEntityList()));

    return punditsData;
  }
}
