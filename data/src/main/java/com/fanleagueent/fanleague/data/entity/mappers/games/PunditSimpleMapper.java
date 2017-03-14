package com.fanleagueent.fanleague.data.entity.mappers.games;

import com.fanleagueent.fanleague.data.entity.entities.games.PunditSimpleEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.data.entity.mappers.MapperFactory;
import com.fanleagueent.fanleague.domain.models.games.PunditSimple;

/**
 * Created by Artem Getman on 14.03.17.
 * a.e.getman@gmail.com
 */

public class PunditSimpleMapper implements Mapper<PunditSimpleEntity, PunditSimple> {

  private MapperFactory mapperFactory;

  public PunditSimpleMapper(MapperFactory mapperFactory) {
    this.mapperFactory = mapperFactory;
  }

  @Override public PunditSimple transform(PunditSimpleEntity obj) {
    PunditSimple punditSimple = new PunditSimple();

    punditSimple.setId(obj.getId());
    punditSimple.setName(obj.getName());
    punditSimple.setAvatarEntity(
        mapperFactory.userMapperFactory().getAvatarMapper().transform(obj.getAvatarEntity()));
    punditSimple.setRecommendations(mapperFactory.gamesMapperFactory()
        .getPunditRecommendationListMapper()
        .transform(obj.getRecommendations()));

    return punditSimple;
  }
}
