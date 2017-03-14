package com.fanleagueent.fanleague.data.entity.mappers.games;

import com.fanleagueent.fanleague.data.entity.entities.games.PunditEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.data.entity.mappers.MapperFactory;
import com.fanleagueent.fanleague.domain.models.games.Pundit;

/**
 * Created by Artem Getman on 14.03.17.
 * a.e.getman@gmail.com
 */

public class PunditMapper implements Mapper<PunditEntity, Pundit> {

  private MapperFactory mapperFactory;

  public PunditMapper(MapperFactory mapperFactory) {
    this.mapperFactory = mapperFactory;
  }

  @Override public Pundit transform(PunditEntity obj) {
    Pundit pundit = new Pundit();

    pundit.setId(obj.getId());
    pundit.setAvatarEntity(
        mapperFactory.userMapperFactory().getAvatarMapper().transform(obj.getAvatarEntity()));
    pundit.setTitle(obj.getTitle());
    pundit.setContent(obj.getContent());
    pundit.setExpert(
        mapperFactory.gamesMapperFactory().getExpertMapper().transform(obj.getExpert()));
    pundit.setStatus(obj.getStatus());
    pundit.setPublishDate(obj.getPublishDate());
    pundit.setRecommendations(mapperFactory.gamesMapperFactory()
        .getPunditRecommendationListMapper()
        .transform(obj.getRecommendations()));

    return pundit;
  }
}
