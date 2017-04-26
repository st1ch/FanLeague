package com.fanleagueent.fanleague.data.entity.mappers.teams;

import com.fanleagueent.fanleague.data.entity.entities.teams.TeamAdminsDataEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.teams.TeamAdminsData;

/**
 * Created by Artem Getman on 15.03.17.
 * a.e.getman@gmail.com
 */

public class TeamAdminsDataMapper implements Mapper<TeamAdminsDataEntity, TeamAdminsData> {

  private TeamsMapperFactory teamsMapperFactory;

  public TeamAdminsDataMapper(TeamsMapperFactory teamsMapperFactory) {
    this.teamsMapperFactory = teamsMapperFactory;
  }

  @Override public TeamAdminsData transform(TeamAdminsDataEntity obj) {
    TeamAdminsData teamAdminsData = new TeamAdminsData();

    teamAdminsData.setTeamMemberEntities(
        teamsMapperFactory.getTeamMemberListMapper().transform(obj.getTeamMembersList()));

    return teamAdminsData;
  }
}
