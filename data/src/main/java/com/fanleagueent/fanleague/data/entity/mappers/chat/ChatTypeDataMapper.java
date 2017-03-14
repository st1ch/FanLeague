package com.fanleagueent.fanleague.data.entity.mappers.chat;

import com.fanleagueent.fanleague.data.entity.entities.chat.ChatTypeDataEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.data.entity.mappers.MapperFactory;
import com.fanleagueent.fanleague.domain.models.chat.ChatTypeData;

/**
 * Created by Artem Getman on 14.03.17.
 * a.e.getman@gmail.com
 */

public class ChatTypeDataMapper implements Mapper<ChatTypeDataEntity, ChatTypeData> {

  private MapperFactory mapperFactory;

  public ChatTypeDataMapper(MapperFactory mapperFactory) {
    this.mapperFactory = mapperFactory;
  }

  @Override public ChatTypeData transform(ChatTypeDataEntity obj) {
    ChatTypeData chatTypeData = new ChatTypeData();

    chatTypeData.setHasBetMedal(obj.isHasBetMedal());
    chatTypeData.setLevel(obj.getLevel());
    chatTypeData.setAvatar(
        mapperFactory.userMapperFactory().getAvatarMapper().transform(obj.getAvatar()));

    return chatTypeData;
  }
}
