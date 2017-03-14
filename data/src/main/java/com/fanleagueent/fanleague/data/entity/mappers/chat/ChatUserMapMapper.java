package com.fanleagueent.fanleague.data.entity.mappers.chat;

import com.fanleagueent.fanleague.data.entity.entities.chat.ChatUserEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.chat.ChatUser;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Artem Getman on 14.03.17.
 * a.e.getman@gmail.com
 */

public class ChatUserMapMapper
    implements Mapper<Map<String, ChatUserEntity>, Map<String, ChatUser>> {

  private ChatMapperFactory chatMapperFactory;

  public ChatUserMapMapper(ChatMapperFactory chatMapperFactory) {
    this.chatMapperFactory = chatMapperFactory;
  }

  @Override public Map<String, ChatUser> transform(Map<String, ChatUserEntity> obj)
      throws RuntimeException {
    Map<String, ChatUser> chatUsers = new HashMap<>();

    for (String key : obj.keySet()) {
      chatUsers.put(key, chatMapperFactory.getChatUserMapper().transform(obj.get(key)));
    }

    return chatUsers;
  }
}
