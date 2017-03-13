package com.fanleagueent.fanleague.domain.models.chat;

import java.util.Map;

/**
 * Created by alexeyverbitskiy on 2/2/17.
 */

public class ChatData implements Comparable<ChatData> {
  private String id;
  private String subject;
  private String threadType;
  private String updatedAt;
  private String createdAt;
  private Message latestMessage;
  private ChatTypeData chatTypeData;
  private Map<String, ChatUser> threadUsersMap;
  private int unreadCount;

  public String getId() {
    return id;
  }

  public String getSubject() {
    return subject;
  }

  public String getThreadType() {
    return threadType;
  }

  public String getUpdatedAt() {
    return updatedAt;
  }

  public String getCreatedAt() {
    return createdAt;
  }

  public Message getLatestMessage() {
    return latestMessage;
  }

  public ChatTypeData getChatTypeData() {
    return chatTypeData;
  }

  public Map<String, ChatUser> getThreadUsersMap() {
    return threadUsersMap;
  }

  public int getUnreadCount() {
    return unreadCount;
  }

  @Override public String toString() {
    return "ChatDataEntity{" +
        "id='" + id + '\'' +
        ", subject='" + subject + '\'' +
        ", threadType='" + threadType + '\'' +
        ", updatedAt='" + updatedAt + '\'' +
        ", createdAt='" + createdAt + '\'' +
        ", latestMessage='" + latestMessage + '\'' +
        ", chatTypeData=" + chatTypeData +
        ", threadUsersMap=" + threadUsersMap +
        ", unreadCount=" + unreadCount +
        '}';
  }

  @Override public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    ChatData chatData = (ChatData) o;

    return id != null ? id.equals(chatData.id) : chatData.id == null;
  }

  @Override public int hashCode() {
    return id != null ? id.hashCode() : 0;
  }

  @Override public int compareTo(ChatData chatData) {
    return id.compareTo(chatData.getId());
  }
}
