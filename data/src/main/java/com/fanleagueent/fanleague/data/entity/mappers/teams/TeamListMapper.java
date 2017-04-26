package com.fanleagueent.fanleague.data.entity.mappers.teams;

import com.fanleagueent.fanleague.data.entity.entities.teams.TeamEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.teams.Team;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Artem Getman on 16.03.17.
 * a.e.getman@gmail.com
 */

public class TeamListMapper implements Mapper<List<TeamEntity>, List<Team>> {

  private TeamsMapperFactory teamsMapperFactory;

  public TeamListMapper(TeamsMapperFactory teamsMapperFactory) {
    this.teamsMapperFactory = teamsMapperFactory;
  }

  @Override public List<Team> transform(List<TeamEntity> obj) {
    List<Team> teams = new ArrayList<>();

    for (TeamEntity entity : obj) {
      teams.add(teamsMapperFactory.getTeamMapper().transform(entity));
    }

    return teams;
  }
}
