package com.fanleagueent.fanleague.data.entity.mappers.chat;

import com.fanleagueent.fanleague.data.entity.entities.chat.MessageDataEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.chat.MessageData;

/**
 * Created by Artem Getman on 14.03.17.
 * a.e.getman@gmail.com
 */

public class MessageDataMapper implements Mapper<MessageDataEntity, MessageData> {

  private ChatMapperFactory chatMapperFactory;

  public MessageDataMapper(ChatMapperFactory chatMapperFactory) {
    this.chatMapperFactory = chatMapperFactory;
  }

  @Override public MessageData transform(MessageDataEntity obj) throws RuntimeException {
    MessageData messageData = new MessageData();

    messageData.setChatData(
        chatMapperFactory.getChatDataMapper().transform(obj.getChatDataEntity()));
    messageData.setMessageList(
        chatMapperFactory.getMessageListMapper().transform(obj.getMessageEntityList()));

    return messageData;
  }
}
