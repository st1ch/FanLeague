package com.fanleagueent.fanleague.data.entity.entities.chat;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * Created by alexeyverbitskiy on 2/11/17.
 */

public class MessageDataEntity {
  @SerializedName("thread")
  private ChatDataEntity chatDataEntity;

  @SerializedName("messages")
  private List<MessageEntity> messageEntityList;

  public ChatDataEntity getChatDataEntity() {
    return chatDataEntity;
  }

  public List<MessageEntity> getMessageEntityList() {
    return messageEntityList;
  }
}
