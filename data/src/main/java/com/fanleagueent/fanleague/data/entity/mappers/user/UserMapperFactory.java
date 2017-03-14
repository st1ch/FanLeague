package com.fanleagueent.fanleague.data.entity.mappers.user;

import com.fanleagueent.fanleague.data.entity.entities.user.FriendshipEntity;
import com.fanleagueent.fanleague.data.entity.entities.user.AvatarEntity;
import com.fanleagueent.fanleague.data.entity.entities.user.UserEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.friends.Friendship;
import com.fanleagueent.fanleague.domain.models.user.Avatar;
import com.fanleagueent.fanleague.domain.models.user.User;

/**
 * Created by Artem Getman on 13.03.17.
 * a.e.getman@gmail.com
 */

public interface UserMapperFactory {

  Mapper<UserEntity, User> getUserMapper();

  Mapper<AvatarEntity, Avatar> getAvatarMapper();

  Mapper<FriendshipEntity, Friendship> getFriendshipMapper();

}
