package com.fanleagueent.fanleague.data.entity.mappers.user;

import com.fanleagueent.fanleague.data.entity.entities.user.SystemMessageEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.user.SystemMessage;

/**
 * Created by alexeyverbitskiy on 3/14/17.
 */

public class SystemMessageMapper implements Mapper<SystemMessageEntity, SystemMessage> {

  public SystemMessageMapper() {
  }

  @Override public SystemMessage transform(SystemMessageEntity obj) {
    return new SystemMessage(obj.getId(), obj.getText(), obj.getUpdatedAt());
  }
}
