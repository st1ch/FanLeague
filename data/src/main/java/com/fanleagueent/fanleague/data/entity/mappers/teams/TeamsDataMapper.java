package com.fanleagueent.fanleague.data.entity.mappers.teams;

import com.fanleagueent.fanleague.data.entity.entities.teams.TeamsDataEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.teams.TeamsData;

/**
 * Created by Artem Getman on 16.03.17.
 * a.e.getman@gmail.com
 */

public class TeamsDataMapper implements Mapper<TeamsDataEntity, TeamsData> {

  private TeamsMapperFactory teamsMapperFactory;

  public TeamsDataMapper(TeamsMapperFactory teamsMapperFactory) {
    this.teamsMapperFactory = teamsMapperFactory;
  }

  @Override public TeamsData transform(TeamsDataEntity obj) {
    TeamsData teamsData = new TeamsData();

    teamsData.setTotalCount(obj.getTotalCount());
    teamsData.setTeamsList(teamsMapperFactory.getTeamListMapper().transform(obj.getTeamList()));

    return teamsData;
  }
}
