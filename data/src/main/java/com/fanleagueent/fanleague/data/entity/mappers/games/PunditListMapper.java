package com.fanleagueent.fanleague.data.entity.mappers.games;

import com.fanleagueent.fanleague.data.entity.entities.games.PunditEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.games.Pundit;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Artem Getman on 14.03.17.
 * a.e.getman@gmail.com
 */

public class PunditListMapper implements Mapper<List<PunditEntity>, List<Pundit>> {

  private GamesMapperFactory gamesMapperFactory;

  public PunditListMapper(GamesMapperFactory gamesMapperFactory) {
    this.gamesMapperFactory = gamesMapperFactory;
  }

  @Override public List<Pundit> transform(List<PunditEntity> obj) {
    List<Pundit> pundits = new ArrayList<>();

    for (PunditEntity punditEntity : obj) {
      pundits.add(gamesMapperFactory.getPunditMapper().transform(punditEntity));
    }

    return pundits;
  }
}
