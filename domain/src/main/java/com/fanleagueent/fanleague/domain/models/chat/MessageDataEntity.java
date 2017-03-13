package com.fanleagueent.fanleague.domain.models.chat;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * Created by alexeyverbitskiy on 2/11/17.
 */

public class MessageDataEntity {
  @SerializedName("thread")
  private ChatData chatData;

  @SerializedName("messages")
  private List<Message> messageList;

  public ChatData getChatData() {
    return chatData;
  }

  public List<Message> getMessageList() {
    return messageList;
  }
}
