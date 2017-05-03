package com.fanleagueent.fanleague.data.entity.mappers.chat;

import com.fanleagueent.fanleague.data.entity.entities.chat.ChatDataEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.chat.ChatData;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Artem Getman on 14.03.17.
 * a.e.getman@gmail.com
 */

public class ChatDataListMapper implements Mapper<List<ChatDataEntity>, List<ChatData>> {

  private ChatMapperFactory mapperFactory;

  public ChatDataListMapper(ChatMapperFactory mapperFactory) {
    this.mapperFactory = mapperFactory;
  }

  @Override public List<ChatData> transform(List<ChatDataEntity> obj) {
    List<ChatData> chatDataList = new ArrayList<>();

    for (ChatDataEntity entity : obj) {
      chatDataList.add(mapperFactory.getChatDataMapper().transform(entity));
    }

    return chatDataList;
  }
}
