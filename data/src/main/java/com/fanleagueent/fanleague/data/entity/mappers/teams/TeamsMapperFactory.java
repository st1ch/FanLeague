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

public interface TeamsMapperFactory {

  Mapper<InvitationDataEntity, InvitationData> getInvitationDataMapper();

  Mapper<InvitationEntity, Invitation> getInvitationMapper();

  Mapper<List<InvitationEntity>, List<Invitation>> getInvitationListMapper();

  Mapper<TeamAdminsDataEntity, TeamAdminsData> getTeamAdminsDataMapper();

  Mapper<TeamDataEntity, TeamData> getTeamDataMapper();

  Mapper<TeamEntity, Team> getTeamMapper();

  Mapper<List<TeamEntity>, List<Team>> getTeamListMapper();

  Mapper<TeamMemberEntity, TeamMember> getTeamMemberMapper();

  Mapper<List<TeamMemberEntity>, List<TeamMember>> getTeamMemberListMapper();

  Mapper<TeamMessagesDataEntity, TeamMessagesData> getTeamMessagesDataMapper();

  Mapper<TeamsDataEntity, TeamsData> getTeamsDataMapper();

  Mapper<TeamUserDataEntity, TeamUserData> getTeamUserDataMapper();
}
