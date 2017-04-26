package com.fanleagueent.fanleague.data.entity.mappers.teams;

import com.fanleagueent.fanleague.data.entity.entities.teams.TeamDataEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.teams.TeamData;

/**
 * Created by Artem Getman on 15.03.17.
 * a.e.getman@gmail.com
 */

public class TeamDataMapper implements Mapper<TeamDataEntity, TeamData> {

  private TeamsMapperFactory teamsMapperFactory;

  public TeamDataMapper(TeamsMapperFactory teamsMapperFactory) {
    this.teamsMapperFactory = teamsMapperFactory;
  }

  @Override public TeamData transform(TeamDataEntity obj) {
    TeamData teamData = new TeamData();

    teamData.setTeam(teamsMapperFactory.getTeamMapper().transform(obj.getTeamEntity()));
    teamData.setThreadId(obj.getThreadId());
    teamData.setTeamMessagesData(
        teamsMapperFactory.getTeamMessagesDataMapper().transform(obj.getTeamMessagesDataEntity()));

    return teamData;
  }
}
