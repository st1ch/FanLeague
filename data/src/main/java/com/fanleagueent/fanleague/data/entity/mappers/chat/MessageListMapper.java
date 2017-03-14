package com.fanleagueent.fanleague.data.entity.mappers.chat;

import com.fanleagueent.fanleague.data.entity.entities.chat.MessageEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.chat.Message;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Artem Getman on 14.03.17.
 * a.e.getman@gmail.com
 */

public class MessageListMapper implements Mapper<List<MessageEntity>, List<Message>> {

  private ChatMapperFactory chatMapperFactory;

  public MessageListMapper(ChatMapperFactory chatMapperFactory) {
    this.chatMapperFactory = chatMapperFactory;
  }

  @Override public List<Message> transform(List<MessageEntity> obj) throws RuntimeException {
    List<Message> messages = new ArrayList<>();

    for (MessageEntity messageEntity : obj) {
      messages.add(chatMapperFactory.getMessageMapper().transform(messageEntity));
    }

    return messages;
  }
}
