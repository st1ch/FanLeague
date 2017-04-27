package com.fanleagueent.fanleague.data.entity.mappers.user;

import com.fanleagueent.fanleague.data.entity.entities.user.SystemMessageEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.user.SystemMessage;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alexeyverbitskiy on 3/14/17.
 */

public class SystemMessageListMapper implements Mapper<List<SystemMessageEntity>, List<SystemMessage>> {

  private UserMapperFactory userMapperFactory;

  public SystemMessageListMapper(UserMapperFactory userMapperFactory) {
    this.userMapperFactory = userMapperFactory;
  }

  @Override public List<SystemMessage> transform(List<SystemMessageEntity> obj) {
    List<SystemMessage> systemMessageList = new ArrayList<>();
    for (SystemMessageEntity systemMessageEntity : obj) {
      systemMessageList.add(userMapperFactory.getSystemMessage().transform(systemMessageEntity));
    }
    return systemMessageList;
  }
}
