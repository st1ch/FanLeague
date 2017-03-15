package com.fanleagueent.fanleague.data.entity.mappers.leagues;

import com.fanleagueent.fanleague.data.entity.entities.leagues.LeagueEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.leagues.League;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Artem Getman on 14.03.17.
 * a.e.getman@gmail.com
 */

public class LeagueListMapper implements Mapper<List<LeagueEntity>, List<League>> {

  private LeaguesMapperFactory leaguesMapperFactory;

  public LeagueListMapper(LeaguesMapperFactory leaguesMapperFactory) {
    this.leaguesMapperFactory = leaguesMapperFactory;
  }

  @Override public List<League> transform(List<LeagueEntity> obj) {
    List<League> leagues = new ArrayList<>();

    for (LeagueEntity entity : obj) {
      leagues.add(leaguesMapperFactory.getLeagueMapper().transform(entity));
    }

    return leagues;
  }
}
