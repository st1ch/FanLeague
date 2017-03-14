package com.fanleagueent.fanleague.data.entity.mappers.friends;

import com.fanleagueent.fanleague.data.entity.entities.friends.FriendEntity;
import com.fanleagueent.fanleague.data.entity.entities.friends.FriendsDataEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.friends.Friend;
import com.fanleagueent.fanleague.domain.models.friends.FriendsData;
import java.util.List;

/**
 * Created by Artem Getman on 14.03.17.
 * a.e.getman@gmail.com
 */

public interface FriendMapperFactory {
  Mapper<FriendEntity, Friend> getFriendMapper();

  Mapper<List<FriendEntity>, List<Friend>> getFriendListMapper();

  Mapper<FriendsDataEntity, FriendsData> getFriendsDataMapper();
}
