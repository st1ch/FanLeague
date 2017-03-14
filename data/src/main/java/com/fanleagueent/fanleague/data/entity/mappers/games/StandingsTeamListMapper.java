package com.fanleagueent.fanleague.data.entity.mappers.games;

import com.fanleagueent.fanleague.data.entity.entities.games.StandingsTeamEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.games.StandingsTeam;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Artem Getman on 14.03.17.
 * a.e.getman@gmail.com
 */

public class StandingsTeamListMapper
    implements Mapper<List<StandingsTeamEntity>, List<StandingsTeam>> {

  private GamesMapperFactory gamesMapperFactory;

  public StandingsTeamListMapper(GamesMapperFactory gamesMapperFactory) {
    this.gamesMapperFactory = gamesMapperFactory;
  }

  @Override public List<StandingsTeam> transform(List<StandingsTeamEntity> obj) {
    List<StandingsTeam> standingsTeams = new ArrayList<>();

    for (StandingsTeamEntity entity : obj) {
      standingsTeams.add(gamesMapperFactory.getStandingsTeamMapper().transform(entity));
    }

    return standingsTeams;
  }
}
