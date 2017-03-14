package com.fanleagueent.fanleague.data.entity.mappers.games;

import com.fanleagueent.fanleague.data.entity.entities.games.PlayTeamEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.games.PlayTeam;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Artem Getman on 14.03.17.
 * a.e.getman@gmail.com
 */

public class PlayTeamListMapper implements Mapper<List<PlayTeamEntity>, List<PlayTeam>> {

  private GamesMapperFactory gamesMapperFactory;

  public PlayTeamListMapper(GamesMapperFactory gamesMapperFactory) {
    this.gamesMapperFactory = gamesMapperFactory;
  }

  @Override public List<PlayTeam> transform(List<PlayTeamEntity> obj) {
    List<PlayTeam> playTeams = new ArrayList<>();

    for (PlayTeamEntity playTeam : obj) {
      playTeams.add(gamesMapperFactory.getPlayTeamMapper().transform(playTeam));
    }

    return playTeams;
  }
}
