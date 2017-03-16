package com.fanleagueent.fanleague.domain.models.teams;

import com.fanleagueent.fanleague.domain.models.chat.Message;
import java.util.List;

/**
 * Created by alexeyverbitskiy on 2/22/17.
 */

public class TeamMessagesData {

  private int unreadCount;
  private List<Message> messageList;

  public int getUnreadCount() {
    return unreadCount;
  }

  public List<Message> getMessageList() {
    return messageList;
  }

  public void setUnreadCount(int unreadCount) {
    this.unreadCount = unreadCount;
  }

  public void setMessageList(List<Message> messageList) {
    this.messageList = messageList;
  }

  @Override public String toString() {
    return "TeamMessagesData{"
        + "unreadCount="
        + unreadCount
        + ", messageList="
        + messageList
        + '}';
  }
}
