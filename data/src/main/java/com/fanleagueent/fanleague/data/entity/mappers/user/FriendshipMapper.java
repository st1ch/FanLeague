package com.fanleagueent.fanleague.data.entity.mappers.user;

import com.fanleagueent.fanleague.data.entity.entities.user.FriendshipEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.friends.Friendship;

/**
 * Created by alexeyverbitskiy on 3/14/17.
 */

public class FriendshipMapper implements Mapper<FriendshipEntity, Friendship> {

  public FriendshipMapper() {
  }

  @Override public Friendship transform(FriendshipEntity obj) {
    Friendship friendship = new Friendship();
    friendship.setFriends(obj.isFriends());
    friendship.setHasRequestPending(obj.isHasRequestPending());
    friendship.setReceivedRequestPending(obj.isReceivedRequestPending());
    friendship.setFriendsOnFacebook(obj.isFriendsOnFacebook());
    friendship.setMutualFriendsCount(obj.getMutualFriendsCount());

    return friendship;
  }
}
