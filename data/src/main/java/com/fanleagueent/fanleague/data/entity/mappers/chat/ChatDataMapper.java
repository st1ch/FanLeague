package com.fanleagueent.fanleague.data.entity.mappers.chat;

import com.fanleagueent.fanleague.data.entity.entities.chat.ChatDataEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.chat.ChatData;

/**
 * Created by Artem Getman on 14.03.17.
 * a.e.getman@gmail.com
 */

public class ChatDataMapper implements Mapper<ChatDataEntity, ChatData> {

  private ChatMapperFactory mapperFactory;

  public ChatDataMapper(ChatMapperFactory mapperFactory) {
    this.mapperFactory = mapperFactory;
  }

  @Override public ChatData transform(ChatDataEntity obj) {
    ChatData chatData = new ChatData();

    chatData.setId(obj.getId());
    chatData.setSubject(obj.getSubject());
    chatData.setThreadType(obj.getThreadType());
    chatData.setUpdatedAt(obj.getUpdatedAt());
    chatData.setCreatedAt(obj.getCreatedAt());
    chatData.setLatestMessage(
        mapperFactory.getMessageMapper().transform(obj.getLatestMessageEntity()));
    chatData.setChatTypeData(
        mapperFactory.getChatTypeDataMapper().transform(obj.getChatTypeDataEntity()));
    chatData.setThreadUsersMap(
        mapperFactory.getChatUserMapMapper().transform(obj.getThreadUsersMap()));
    chatData.setUnreadCount(obj.getUnreadCount());

    return chatData;
  }
}
