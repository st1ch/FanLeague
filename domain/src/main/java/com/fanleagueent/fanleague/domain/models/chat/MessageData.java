package com.fanleagueent.fanleague.domain.models.chat;

import java.util.List;

/**
 * Created by alexeyverbitskiy on 2/11/17.
 */

public class MessageData {
  private ChatData chatData;
  private List<Message> messageList;

  public ChatData getChatData() {
    return chatData;
  }

  public List<Message> getMessageList() {
    return messageList;
  }

  public void setChatData(ChatData chatData) {
    this.chatData = chatData;
  }

  public void setMessageList(List<Message> messageList) {
    this.messageList = messageList;
  }

  @Override public String toString() {
    return "MessageData{" + "chatData=" + chatData + ", messageList=" + messageList + '}';
  }
}
