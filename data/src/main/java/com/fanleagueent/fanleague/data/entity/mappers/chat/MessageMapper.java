package com.fanleagueent.fanleague.data.entity.mappers.chat;

import com.fanleagueent.fanleague.data.entity.entities.chat.MessageEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.chat.Message;

/**
 * Created by Artem Getman on 14.03.17.
 * a.e.getman@gmail.com
 */

public class MessageMapper implements Mapper<MessageEntity, Message> {

  private ChatMapperFactory chatMapperFactory;

  public MessageMapper(ChatMapperFactory chatMapperFactory) {
    this.chatMapperFactory = chatMapperFactory;
  }

  @Override public Message transform(MessageEntity obj) throws RuntimeException {
    Message message = new Message();

    message.setId(obj.getId());
    message.setThreadId(obj.getThreadId());
    message.setUserId(obj.getUserId());
    message.setBody(obj.getBody());
    message.setTimestamp(obj.getTimestamp());
    message.setUpdatedAt(obj.getUpdatedAt());
    message.setCreatedAt(obj.getCreatedAt());
    message.setMyMessage(obj.isMyMessage());
    message.setAuthor(chatMapperFactory.getAuthorMapper().transform(obj.getAuthorEntity()));

    return message;
  }
}
