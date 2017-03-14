package com.fanleagueent.fanleague.data.entity.mappers.games;

import com.fanleagueent.fanleague.data.entity.entities.games.MatchEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.games.Match;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Artem Getman on 14.03.17.
 * a.e.getman@gmail.com
 */

public class MatchListMapper implements Mapper<List<MatchEntity>, List<Match>> {

  private GamesMapperFactory gamesMapperFactory;

  public MatchListMapper(GamesMapperFactory gamesMapperFactory) {
    this.gamesMapperFactory = gamesMapperFactory;
  }

  @Override public List<Match> transform(List<MatchEntity> obj) {
    List<Match> matches = new ArrayList<>();

    for (MatchEntity matchEntity : obj) {
      matches.add(gamesMapperFactory.getMatchMapper().transform(matchEntity));
    }

    return matches;
  }
}
