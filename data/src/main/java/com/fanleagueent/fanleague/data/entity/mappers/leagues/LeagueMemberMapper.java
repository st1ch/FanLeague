package com.fanleagueent.fanleague.data.entity.mappers.leagues;

import com.fanleagueent.fanleague.data.entity.entities.leagues.LeagueMemberEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.data.entity.mappers.MapperFactory;
import com.fanleagueent.fanleague.domain.models.leagues.LeagueMember;

/**
 * Created by Artem Getman on 14.03.17.
 * a.e.getman@gmail.com
 */

public class LeagueMemberMapper implements Mapper<LeagueMemberEntity, LeagueMember> {

  private MapperFactory mapperFactory;

  public LeagueMemberMapper(MapperFactory mapperFactory) {
    this.mapperFactory = mapperFactory;
  }

  @Override public LeagueMember transform(LeagueMemberEntity obj) {
    LeagueMember leagueMember = new LeagueMember();

    leagueMember.setId(obj.getId());
    leagueMember.setUsername(obj.getUsername());
    leagueMember.setEmail(obj.getEmail());
    leagueMember.setAvatar(
        mapperFactory.userMapperFactory().getAvatarMapper().transform(obj.getAvatarEntity()));
    leagueMember.setDisplayName(obj.getDisplayName());
    leagueMember.setFullName(obj.getFullName());
    leagueMember.setGoogleConnected(obj.isGoogleConnected());
    leagueMember.setFacebookConnected(obj.isFacebookConnected());
    leagueMember.setLevel(obj.getLevel());
    leagueMember.setPercentAge(obj.getPercentAge());
    leagueMember.setFriendship(
        mapperFactory.userMapperFactory().getFriendshipMapper().transform(obj.getFriendship()));
    leagueMember.setNationality(obj.getNationality());
    leagueMember.setAverageWinningBets(obj.getAverageWinningBets());
    leagueMember.setAdmin(obj.isAdmin());
    leagueMember.setOwner(obj.isOwner());

    return leagueMember;
  }
}
