package com.fanleagueent.fanleague.data.entity.mappers.user;

import com.fanleagueent.fanleague.data.entity.entities.user.UserDataEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.user.UserData;

/**
 * Created by alexeyverbitskiy on 3/14/17.
 */

public class UserDataMapper implements Mapper<UserDataEntity, UserData> {

  private UserMapperFactory userMapperFactory;

  public UserDataMapper(UserMapperFactory userMapperFactory) {
    this.userMapperFactory = userMapperFactory;
  }

  @Override public UserData transform(UserDataEntity obj) {
    UserData userData = new UserData();
    userData.setUser(userMapperFactory.getUserMapper().transform(obj.getUserEntity()));
    return userData;
  }
}
