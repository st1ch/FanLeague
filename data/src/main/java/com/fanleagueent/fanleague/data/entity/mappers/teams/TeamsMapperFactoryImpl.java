package com.fanleagueent.fanleague.data.entity.mappers.teams;

import com.fanleagueent.fanleague.data.entity.entities.teams.InvitationDataEntity;
import com.fanleagueent.fanleague.data.entity.entities.teams.InvitationEntity;
import com.fanleagueent.fanleague.data.entity.entities.teams.TeamAdminsDataEntity;
import com.fanleagueent.fanleague.data.entity.entities.teams.TeamDataEntity;
import com.fanleagueent.fanleague.data.entity.entities.teams.TeamEntity;
import com.fanleagueent.fanleague.data.entity.entities.teams.TeamMemberEntity;
import com.fanleagueent.fanleague.data.entity.entities.teams.TeamMessagesDataEntity;
import com.fanleagueent.fanleague.data.entity.entities.teams.TeamUserDataEntity;
import com.fanleagueent.fanleague.data.entity.entities.teams.TeamsDataEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.data.entity.mappers.MapperFactory;
import com.fanleagueent.fanleague.domain.models.teams.Invitation;
import com.fanleagueent.fanleague.domain.models.teams.InvitationData;
import com.fanleagueent.fanleague.domain.models.teams.Team;
import com.fanleagueent.fanleague.domain.models.teams.TeamAdminsData;
import com.fanleagueent.fanleague.domain.models.teams.TeamData;
import com.fanleagueent.fanleague.domain.models.teams.TeamMember;
import com.fanleagueent.fanleague.domain.models.teams.TeamMessagesData;
import com.fanleagueent.fanleague.domain.models.teams.TeamUserData;
import com.fanleagueent.fanleague.domain.models.teams.TeamsData;
import java.util.List;

/**
 * Created by Artem Getman on 15.03.17.
 * a.e.getman@gmail.com
 */

public class TeamsMapperFactoryImpl implements TeamsMapperFactory {

  private MapperFactory mapperFactory;

  public TeamsMapperFactoryImpl(MapperFactory mapperFactory) {
    this.mapperFactory = mapperFactory;
  }

  @Override public Mapper<InvitationDataEntity, InvitationData> getInvitationDataMapper() {
    return new InvitationDataMapper(this);
  }

  @Override public Mapper<InvitationEntity, Invitation> getInvitationMapper() {
    return new InvitationMapper();
  }

  @Override public Mapper<List<InvitationEntity>, List<Invitation>> getInvitationListMapper() {
    return new InvitationListMapper(this);
  }

  @Override public Mapper<TeamAdminsDataEntity, TeamAdminsData> getTeamAdminsDataMapper() {
    return new TeamAdminsDataMapper(this);
  }

  @Override public Mapper<TeamDataEntity, TeamData> getTeamDataMapper() {
    return new TeamDataMapper(this);
  }

  @Override public Mapper<TeamEntity, Team> getTeamMapper() {
    return new TeamMapper(mapperFactory);
  }

  @Override public Mapper<List<TeamEntity>, List<Team>> getTeamListMapper() {
    return new TeamListMapper(this);
  }

  @Override public Mapper<TeamMemberEntity, TeamMember> getTeamMemberMapper() {
    return new TeamMemberMapper(mapperFactory);
  }

  @Override public Mapper<List<TeamMemberEntity>, List<TeamMember>> getTeamMemberListMapper() {
    return new TeamMemberListMapper(this);
  }

  @Override public Mapper<TeamMessagesDataEntity, TeamMessagesData> getTeamMessagesDataMapper() {
    return new TeamMessagesDataMapper(mapperFactory);
  }

  @Override public Mapper<TeamsDataEntity, TeamsData> getTeamsDataMapper() {
    return new TeamsDataMapper(this);
  }

  @Override public Mapper<TeamUserDataEntity, TeamUserData> getTeamUserDataMapper() {
    return new TeamUserDataMapper(mapperFactory);
  }
}
