package com.fanleagueent.fanleague.data.entity.mappers.pundits;

import com.fanleagueent.fanleague.data.entity.entities.pundits.PunditPostDataEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.data.entity.mappers.MapperFactory;
import com.fanleagueent.fanleague.domain.models.pundits.PunditPostData;

/**
 * Created by Artem Getman on 15.03.17.
 * a.e.getman@gmail.com
 */

public class PunditPostDataMapper implements Mapper<PunditPostDataEntity, PunditPostData> {

  private MapperFactory mapperFactory;

  public PunditPostDataMapper(MapperFactory mapperFactory) {
    this.mapperFactory = mapperFactory;
  }

  @Override public PunditPostData transform(PunditPostDataEntity obj) {
    PunditPostData punditPostData = new PunditPostData();

    punditPostData.setGameweek(
        mapperFactory.gamesMapperFactory().getGameweekMapper().transform(obj.getGameweek()));
    punditPostData.setPost(
        mapperFactory.punditsMapperFactory().getPunditPostMapper().transform(obj.getPost()));

    return punditPostData;
  }
}
