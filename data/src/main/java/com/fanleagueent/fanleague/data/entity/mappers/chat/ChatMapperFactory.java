package com.fanleagueent.fanleague.data.entity.mappers.chat;

import com.fanleagueent.fanleague.data.entity.entities.chat.AuthorEntity;
import com.fanleagueent.fanleague.data.entity.entities.chat.ChatDataEntity;
import com.fanleagueent.fanleague.data.entity.entities.chat.ChatTypeDataEntity;
import com.fanleagueent.fanleague.data.entity.entities.chat.ChatUserEntity;
import com.fanleagueent.fanleague.data.entity.entities.chat.MessageDataEntity;
import com.fanleagueent.fanleague.data.entity.entities.chat.MessageEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
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

public interface ChatMapperFactory {
  Mapper<AuthorEntity, Author> getAuthorMapper();

  Mapper<ChatDataEntity, ChatData> getChatDataMapper();

  Mapper<List<ChatDataEntity>, List<ChatData>> getChatDataListMapper();

  Mapper<ChatTypeDataEntity, ChatTypeData> getChatTypeDataMapper();

  Mapper<ChatUserEntity, ChatUser> getChatUserMapper();

  Mapper<Map<String, ChatUserEntity>, Map<String, ChatUser>> getChatUserMapMapper();

  Mapper<MessageDataEntity, MessageData> getMessageDataMapper();

  Mapper<MessageEntity, Message> getMessageMapper();

  Mapper<List<MessageEntity>, List<Message>> getMessageListMapper();
}
