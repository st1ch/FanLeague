package com.fanleagueent.fanleague.data.entity.mappers.teams;

import com.fanleagueent.fanleague.data.entity.entities.teams.TeamUserDataEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.data.entity.mappers.MapperFactory;
import com.fanleagueent.fanleague.domain.models.teams.TeamUserData;

/**
 * Created by Artem Getman on 16.03.17.
 * a.e.getman@gmail.com
 */

public class TeamUserDataMapper implements Mapper<TeamUserDataEntity, TeamUserData> {

  private MapperFactory mapperFactory;

  public TeamUserDataMapper(MapperFactory mapperFactory) {
    this.mapperFactory = mapperFactory;
  }

  @Override public TeamUserData transform(TeamUserDataEntity obj) {
    TeamUserData teamUserData = new TeamUserData();

    teamUserData.setUserEntity(
        mapperFactory.userMapperFactory().getUserMapper().transform(obj.getUserEntity()));
    teamUserData.setTeam(
        mapperFactory.teamsMapperFactory().getTeamMapper().transform(obj.getTeamEntity()));

    return teamUserData;
  }
}
