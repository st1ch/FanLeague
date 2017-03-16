package com.fanleagueent.fanleague.data.entity.mappers.teams;

import com.fanleagueent.fanleague.data.entity.entities.teams.TeamMemberEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.data.entity.mappers.MapperFactory;
import com.fanleagueent.fanleague.domain.models.teams.TeamMember;

/**
 * Created by Artem Getman on 16.03.17.
 * a.e.getman@gmail.com
 */

public class TeamMemberMapper implements Mapper<TeamMemberEntity, TeamMember> {

  private MapperFactory mapperFactory;

  public TeamMemberMapper(MapperFactory mapperFactory) {
    this.mapperFactory = mapperFactory;
  }

  @Override public TeamMember transform(TeamMemberEntity obj) {
    TeamMember teamMember = new TeamMember();

    teamMember.setId(obj.getId());
    teamMember.setUsername(obj.getUsername());
    teamMember.setEmail(obj.getEmail());
    teamMember.setAvatar(
        mapperFactory.userMapperFactory().getAvatarMapper().transform(obj.getAvatarEntity()));
    teamMember.setDisplayName(obj.getDisplayName());
    teamMember.setFullName(obj.getFullName());
    teamMember.setGoogleConnected(obj.isGoogleConnected());
    teamMember.setFacebookConnected(obj.isFacebookConnected());
    teamMember.setLevel(obj.getLevel());
    teamMember.setPercentAge(obj.getPercentAge());
    teamMember.setFriendship(
        mapperFactory.userMapperFactory().getFriendshipMapper().transform(obj.getFriendship()));
    teamMember.setNationality(obj.getNationality());
    teamMember.setAverageWinningBets(obj.getAverageWinningBets());
    teamMember.setAdmin(obj.isAdmin());
    teamMember.setOwner(obj.isOwner());

    return teamMember;
  }
}
