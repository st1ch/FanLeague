package com.fanleagueent.fanleague.data.entity.mappers.games;

import com.fanleagueent.fanleague.data.entity.entities.games.PlayTeamEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.data.entity.mappers.MapperFactory;
import com.fanleagueent.fanleague.domain.models.games.PlayTeam;

/**
 * Created by Artem Getman on 14.03.17.
 * a.e.getman@gmail.com
 */

public class PlayTeamMapper implements Mapper<PlayTeamEntity, PlayTeam> {

  private MapperFactory mapperFactory;

  public PlayTeamMapper(MapperFactory mapperFactory) {
    this.mapperFactory = mapperFactory;
  }

  @Override public PlayTeam transform(PlayTeamEntity obj) {
    PlayTeam playTeam = new PlayTeam();

    playTeam.setId(obj.getId());
    playTeam.setName(obj.getName());
    playTeam.setSlug(obj.getSlug());
    playTeam.setOwnerId(obj.getOwnerId());
    playTeam.setWeeklyBettingAmountPerMember(obj.getWeeklyBettingAmountPerMember());
    playTeam.setMembersCount(obj.getMembersCount());
    playTeam.setAvatarEntity(
        mapperFactory.userMapperFactory().getAvatarMapper().transform(obj.getAvatarEntity()));
    playTeam.setAverageWinningBets(obj.getAverageWinningBets());
    playTeam.setAverageWinningMoneyAmount(obj.getAverageWinningMoneyAmount());
    playTeam.setCurrentUserAdmin(obj.isCurrentUserAdmin());
    playTeam.setCurrentUserOwner(obj.isCurrentUserOwner());
    playTeam.setTmpWeeklyBettingAmount(obj.getTmpWeeklyBettingAmount());
    playTeam.setWeeklyBudget(obj.getWeeklyBudget());
    playTeam.setAdminsList(obj.getAdminsList());
    playTeam.setStatusList(obj.getStatusList());

    return playTeam;
  }
}
