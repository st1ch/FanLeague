package com.fanleagueent.fanleague.data.entity.entities.teams;

import com.fanleagueent.fanleague.data.entity.entities.chat.MessageEntity;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * Created by alexeyverbitskiy on 2/22/17.
 */

public class TeamMessagesDataEntity {

  @SerializedName("unread_count")
  private int unreadCount;

  @SerializedName("list")
  private List<MessageEntity> messageEntityList;

  public int getUnreadCount() {
    return unreadCount;
  }

  public List<MessageEntity> getMessageEntityList() {
    return messageEntityList;
  }
}
