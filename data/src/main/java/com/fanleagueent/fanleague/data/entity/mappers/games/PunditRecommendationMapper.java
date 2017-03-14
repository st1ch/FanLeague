package com.fanleagueent.fanleague.data.entity.mappers.games;

import com.fanleagueent.fanleague.data.entity.entities.games.PunditRecommendationEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.games.PunditRecommendation;

/**
 * Created by Artem Getman on 14.03.17.
 * a.e.getman@gmail.com
 */

public class PunditRecommendationMapper
    implements Mapper<PunditRecommendationEntity, PunditRecommendation> {

  @Override public PunditRecommendation transform(PunditRecommendationEntity obj) {
    PunditRecommendation punditRecommendation = new PunditRecommendation();

    punditRecommendation.setId(obj.getId());
    punditRecommendation.setWeek(obj.getWeek());
    punditRecommendation.setPrice(obj.getPrice());
    punditRecommendation.setSystem(obj.getSystem());
    punditRecommendation.setSystemName(obj.getSystemName());
    punditRecommendation.setExpertId(obj.getExpertId());
    punditRecommendation.setBets(obj.getBets());

    return punditRecommendation;
  }
}
