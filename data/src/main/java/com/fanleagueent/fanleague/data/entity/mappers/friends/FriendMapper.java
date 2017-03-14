package com.fanleagueent.fanleague.data.entity.mappers.friends;

import com.fanleagueent.fanleague.data.entity.entities.friends.FriendEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.data.entity.mappers.MapperFactory;
import com.fanleagueent.fanleague.data.entity.mappers.user.UserMapperFactory;
import com.fanleagueent.fanleague.domain.models.friends.Friend;

/**
 * Created by Artem Getman on 14.03.17.
 * a.e.getman@gmail.com
 */

public class FriendMapper implements Mapper<FriendEntity, Friend> {

  private MapperFactory mapperFactory;

  public FriendMapper(MapperFactory mapperFactory) {
    this.mapperFactory = mapperFactory;
  }

  @Override public Friend transform(FriendEntity obj) {
    UserMapperFactory userMapperFactory = mapperFactory.userMapperFactory();
    Friend friend = new Friend();

    friend.setId(obj.getId());
    friend.setUsername(obj.getUsername());
    friend.setEmail(obj.getEmail());
    friend.setAvatar(
        userMapperFactory.getAvatarMapper().transform(obj.getAvatarEntity()));
    friend.setDisplayName(obj.getDisplayName());
    friend.setFullName(obj.getFullName());
    friend.setGoogleConnected(obj.isGoogleConnected());
    friend.setFacebookConnected(obj.isFacebookConnected());
    friend.setLevel(obj.getLevel());
    friend.setPercentAge(obj.getPercentAge());
    friend.setFriendship(userMapperFactory.getFriendshipMapper().transform(obj.getFriendship()));
    friend.setNationality(obj.getNationality());
    friend.setAverageWinningBets(obj.getAverageWinningBets());
    friend.setAdmin(obj.isAdmin());
    friend.setOwner(obj.isOwner());
    friend.setTeamInvited(obj.isTeamInvited());
    friend.setLeagueInvited(obj.isLeagueInvited());

    return friend;
  }
}
