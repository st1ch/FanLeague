package com.fanleagueent.fanleague.data.entity.mappers.leagues;

import com.fanleagueent.fanleague.data.entity.entities.leagues.LeagueEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.data.entity.mappers.MapperFactory;
import com.fanleagueent.fanleague.domain.models.leagues.League;

/**
 * Created by Artem Getman on 14.03.17.
 * a.e.getman@gmail.com
 */

public class LeagueMapper implements Mapper<LeagueEntity, League> {

  private MapperFactory mapperFactory;

  public LeagueMapper(MapperFactory mapperFactory) {
    this.mapperFactory = mapperFactory;
  }

  @Override public League transform(LeagueEntity obj) {
    League league = new League();

    league.setId(obj.getId());
    league.setName(obj.getName());
    league.setSlug(obj.getSlug());
    league.setOwnerId(obj.getOwnerId());
    league.setUpdatedAt(obj.getUpdatedAt());
    league.setCreatedAt(obj.getCreatedAt());
    league.setAdminsList(obj.getAdminsList());
    league.setMembersCount(obj.getMembersCount());
    league.setAvatar(
        mapperFactory.userMapperFactory().getAvatarMapper().transform(obj.getAvatarEntity()));
    league.setCurrentUserOwner(obj.isCurrentUserOwner());
    league.setCurrentUserAdmin(obj.isCurrentUserAdmin());
    league.setAverageWinningBets(obj.getAverageWinningBets());
    league.setAverageWinningMoneyAmount(obj.getAverageWinningMoneyAmount());
    league.setAcceptToken(obj.getAcceptToken());
    league.setDenyToken(obj.getDenyToken());
    league.setInvitedBy(obj.getInvitedBy());

    return league;
  }
}
