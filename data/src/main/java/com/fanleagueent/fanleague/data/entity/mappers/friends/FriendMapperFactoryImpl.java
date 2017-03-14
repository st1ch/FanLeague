package com.fanleagueent.fanleague.data.entity.mappers.friends;

import com.fanleagueent.fanleague.data.entity.entities.friends.FriendEntity;
import com.fanleagueent.fanleague.data.entity.entities.friends.FriendsDataEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.data.entity.mappers.MapperFactory;
import com.fanleagueent.fanleague.domain.models.friends.Friend;
import com.fanleagueent.fanleague.domain.models.friends.FriendsData;
import java.util.List;

/**
 * Created by Artem Getman on 14.03.17.
 * a.e.getman@gmail.com
 */

public class FriendMapperFactoryImpl implements FriendMapperFactory {

  private MapperFactory mapperFactory;

  public FriendMapperFactoryImpl(MapperFactory mapperFactory) {
    this.mapperFactory = mapperFactory;
  }

  @Override public Mapper<FriendEntity, Friend> getFriendMapper() {
    return new FriendMapper(mapperFactory);
  }

  @Override public Mapper<List<FriendEntity>, List<Friend>> getFriendListMapper() {
    return new FriendListMapper(this);
  }

  @Override public Mapper<FriendsDataEntity, FriendsData> getFriendsDataMapper() {
    return new FriendsDataMapper(this);
  }
}
