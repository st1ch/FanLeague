package com.fanleagueent.fanleague.domain.models.leagues;

import com.fanleagueent.fanleague.domain.models.chat.Message;
import java.util.List;

/**
 * Created by alexeyverbitskiy on 2/22/17.
 */

public class LeagueMessagesData {

  private int unreadCount;
  private List<Message> messageList;

  public int getUnreadCount() {
    return unreadCount;
  }

  public List<Message> getMessageList() {
    return messageList;
  }
}
