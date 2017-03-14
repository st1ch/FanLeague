package com.fanleagueent.fanleague.data.entity.entities.chat;

import com.google.gson.annotations.SerializedName;
import java.util.Map;

/**
 * Created by alexeyverbitskiy on 2/2/17.
 */

public class ChatDataEntity {
  @SerializedName("_id")
  private String id;

  @SerializedName("subject")
  private String subject;

  //TODO change in type
  @SerializedName("thread_type")
  private String threadType;

  @SerializedName("updated_at")
  private String updatedAt;

  @SerializedName("created_at")
  private String createdAt;

  @SerializedName("latest_message")
  private MessageEntity latestMessageEntity;

  @SerializedName("type_data")
  private ChatTypeDataEntity chatTypeDataEntity;

  @SerializedName("thread_users")
  private Map<String, ChatUserEntity> threadUsersMap;

  @SerializedName("unread_count")
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

  public MessageEntity getLatestMessageEntity() {
    return latestMessageEntity;
  }

  public ChatTypeDataEntity getChatTypeDataEntity() {
    return chatTypeDataEntity;
  }

  public Map<String, ChatUserEntity> getThreadUsersMap() {
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
        ", latestMessage='" + latestMessageEntity + '\'' +
        ", chatTypeData=" + chatTypeDataEntity +
        ", threadUsersMap=" + threadUsersMap +
        ", unreadCount=" + unreadCount +
        '}';
  }

  @Override public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    ChatDataEntity chatDataEntity = (ChatDataEntity) o;

    return id != null ? id.equals(chatDataEntity.id) : chatDataEntity.id == null;
  }

  @Override public int hashCode() {
    return id != null ? id.hashCode() : 0;
  }

}
