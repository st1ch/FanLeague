package com.fanleagueent.fanleague.domain.models.teams;

import com.fanleagueent.fanleague.data.entity.entities.chat.Message;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * Created by alexeyverbitskiy on 2/22/17.
 */

public class TeamMessagesDataEntity {

  @SerializedName("unread_count")
  private int unreadCount;

  @SerializedName("list")
  private List<Message> messageList;

  public int getUnreadCount() {
    return unreadCount;
  }

  public List<Message> getMessageList() {
    return messageList;
  }
}
