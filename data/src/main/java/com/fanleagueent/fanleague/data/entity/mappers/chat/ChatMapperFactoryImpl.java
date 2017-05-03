package com.fanleagueent.fanleague.data.entity.mappers.chat;

import com.fanleagueent.fanleague.data.entity.entities.chat.AuthorEntity;
import com.fanleagueent.fanleague.data.entity.entities.chat.ChatDataEntity;
import com.fanleagueent.fanleague.data.entity.entities.chat.ChatTypeDataEntity;
import com.fanleagueent.fanleague.data.entity.entities.chat.ChatUserEntity;
import com.fanleagueent.fanleague.data.entity.entities.chat.MessageDataEntity;
import com.fanleagueent.fanleague.data.entity.entities.chat.MessageEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.data.entity.mappers.MapperFactory;
import com.fanleagueent.fanleague.domain.models.chat.Author;
import com.fanleagueent.fanleague.domain.models.chat.ChatData;
import com.fanleagueent.fanleague.domain.models.chat.ChatTypeData;
import com.fanleagueent.fanleague.domain.models.chat.ChatUser;
import com.fanleagueent.fanleague.domain.models.chat.Message;
import com.fanleagueent.fanleague.domain.models.chat.MessageData;
import java.util.List;
import java.util.Map;

/**
 * Created by Artem Getman on 14.03.17.
 * a.e.getman@gmail.com
 */

public class ChatMapperFactoryImpl implements ChatMapperFactory {

  private MapperFactory mapperFactory;

  public ChatMapperFactoryImpl(MapperFactory mapperFactory) {
    this.mapperFactory = mapperFactory;
  }

  @Override public Mapper<AuthorEntity, Author> getAuthorMapper() {
    return new AuthorMapper();
  }

  @Override public Mapper<ChatDataEntity, ChatData> getChatDataMapper() {
    return new ChatDataMapper(this);
  }

  @Override public Mapper<List<ChatDataEntity>, List<ChatData>> getChatDataListMapper() {
    return new ChatDataListMapper(this);
  }

  @Override public Mapper<ChatTypeDataEntity, ChatTypeData> getChatTypeDataMapper() {
    return new ChatTypeDataMapper(mapperFactory);
  }

  @Override public Mapper<ChatUserEntity, ChatUser> getChatUserMapper() {
    return new ChatUserDataMapper(mapperFactory);
  }

  @Override
  public Mapper<Map<String, ChatUserEntity>, Map<String, ChatUser>> getChatUserMapMapper() {
    return new ChatUserMapMapper(this);
  }

  @Override public Mapper<MessageDataEntity, MessageData> getMessageDataMapper() {
    return new MessageDataMapper(this);
  }

  @Override public Mapper<MessageEntity, Message> getMessageMapper() {
    return new MessageMapper(this);
  }

  @Override public Mapper<List<MessageEntity>, List<Message>> getMessageListMapper() {
    return new MessageListMapper(this);
  }
}
