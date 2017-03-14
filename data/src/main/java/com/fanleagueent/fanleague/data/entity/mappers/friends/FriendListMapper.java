package com.fanleagueent.fanleague.data.entity.mappers.friends;

import com.fanleagueent.fanleague.data.entity.entities.friends.FriendEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.friends.Friend;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Artem Getman on 14.03.17.
 * a.e.getman@gmail.com
 */

public class FriendListMapper implements Mapper<List<FriendEntity>, List<Friend>> {

  private FriendMapperFactory friendMapperFactory;

  public FriendListMapper(FriendMapperFactory friendMapperFactory) {
    this.friendMapperFactory = friendMapperFactory;
  }

  @Override public List<Friend> transform(List<FriendEntity> obj) {
    List<Friend> friends = new ArrayList<>();

    for (FriendEntity friendEntity : obj) {
      friends.add(friendMapperFactory.getFriendMapper().transform(friendEntity));
    }

    return friends;
  }
}
