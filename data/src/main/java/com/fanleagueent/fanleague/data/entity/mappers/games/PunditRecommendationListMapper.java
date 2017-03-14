package com.fanleagueent.fanleague.data.entity.mappers.games;

import com.fanleagueent.fanleague.data.entity.entities.games.PunditRecommendationEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.games.PunditRecommendation;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Artem Getman on 14.03.17.
 * a.e.getman@gmail.com
 */

public class PunditRecommendationListMapper
    implements Mapper<List<PunditRecommendationEntity>, List<PunditRecommendation>> {

  private GamesMapperFactory gamesMapperFactory;

  public PunditRecommendationListMapper(GamesMapperFactory gamesMapperFactory) {
    this.gamesMapperFactory = gamesMapperFactory;
  }

  @Override public List<PunditRecommendation> transform(List<PunditRecommendationEntity> obj) {
    List<PunditRecommendation> punditRecommendations = new ArrayList<>();

    for (PunditRecommendationEntity punditEntity : obj) {
      punditRecommendations.add(
          gamesMapperFactory.getPunditRecommendationMapper().transform(punditEntity));
    }

    return punditRecommendations;
  }
}
