package com.fanleagueent.fanleague.data.entity.mappers.friends;

import com.fanleagueent.fanleague.data.entity.entities.friends.FriendsDataEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.friends.FriendsData;

/**
 * Created by Artem Getman on 14.03.17.
 * a.e.getman@gmail.com
 */

public class FriendsDataMapper implements Mapper<FriendsDataEntity, FriendsData> {

  private FriendMapperFactory friendMapperFactory;

  public FriendsDataMapper(FriendMapperFactory friendMapperFactory) {
    this.friendMapperFactory = friendMapperFactory;
  }

  @Override public FriendsData transform(FriendsDataEntity obj) {
    FriendsData friendsData = new FriendsData();

    friendsData.setFriendsCount(obj.getFriendsCount());
    friendsData.setFriendList(
        friendMapperFactory.getFriendListMapper().transform(obj.getFriendEntityList()));

    return friendsData;
  }
}
