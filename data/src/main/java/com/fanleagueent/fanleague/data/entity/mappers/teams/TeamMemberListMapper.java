package com.fanleagueent.fanleague.data.entity.mappers.teams;

import com.fanleagueent.fanleague.data.entity.entities.teams.TeamMemberEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.teams.TeamMember;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Artem Getman on 16.03.17.
 * a.e.getman@gmail.com
 */

public class TeamMemberListMapper implements Mapper<List<TeamMemberEntity>, List<TeamMember>> {

  private TeamsMapperFactory teamsMapperFactory;

  public TeamMemberListMapper(TeamsMapperFactory teamsMapperFactory) {
    this.teamsMapperFactory = teamsMapperFactory;
  }

  @Override public List<TeamMember> transform(List<TeamMemberEntity> obj) {
    List<TeamMember> teamMembers = new ArrayList<>();

    for (TeamMemberEntity entity : obj) {
      teamMembers.add(teamsMapperFactory.getTeamMemberMapper().transform(entity));
    }

    return teamMembers;
  }
}
