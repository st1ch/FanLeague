package com.fanleagueent.fanleague.data.entity.mappers.teams;

import com.fanleagueent.fanleague.data.entity.entities.teams.TeamEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.data.entity.mappers.MapperFactory;
import com.fanleagueent.fanleague.domain.models.teams.Team;

/**
 * Created by Artem Getman on 16.03.17.
 * a.e.getman@gmail.com
 */

public class TeamMapper implements Mapper<TeamEntity, Team> {

  private MapperFactory mapperFactory;

  public TeamMapper(MapperFactory mapperFactory) {
    this.mapperFactory = mapperFactory;
  }

  @Override public Team transform(TeamEntity obj) {
    Team team = new Team();

    team.setId(obj.getId());
    team.setSlug(obj.getSlug());
    team.setName(obj.getName());
    team.setOwnerId(obj.getOwnerId());
    team.setOnlyAdminCanChangeBet(obj.isOnlyAdminCanChangeBet());
    team.setWeeklyBettingAmountPerMember(obj.getWeeklyBettingAmountPerMember());
    team.setAdminsList(obj.getAdminsList());
    team.setCreatedAt(obj.getCreatedAt());
    team.setUpdatedAt(obj.getUpdatedAt());
    team.setUserIds(obj.getUserIds());
    team.setMembersCount(obj.getMembersCount());
    team.setAvatarEntity(
        mapperFactory.userMapperFactory().getAvatarMapper().transform(obj.getAvatarEntity()));
    team.setStatusList(obj.getStatusList());
    team.setAcceptToken(obj.getAcceptToken());
    team.setDenyToken(obj.getDenyToken());
    team.setAverageWinningBets(obj.getAverageWinningBets());
    team.setAverageWinningMoneyAmount(obj.getAverageWinningMoneyAmount());
    team.setCurrentUserAdmin(obj.isCurrentUserAdmin());
    team.setCurrentUserOwner(obj.isCurrentUserOwner());
    team.setInvitedBy(obj.getInvitedBy());
    team.setTmpWeeklyBettingAmount(obj.getTmpWeeklyBettingAmount());

    return team;
  }
}
