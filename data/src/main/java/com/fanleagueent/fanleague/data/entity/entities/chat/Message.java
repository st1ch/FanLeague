package com.fanleagueent.fanleague.data.entity.entities.chat;

import com.google.gson.annotations.SerializedName;

/**
 * Created by alexeyverbitskiy on 2/7/17.
 */

public class Message {

  @SerializedName("_id")
  private String id;

  @SerializedName("thread_id")
  private String threadId;

  @SerializedName("user_id")
  private String userId;

  @SerializedName("body")
  private String body;

  @SerializedName("timestamp")
  private long timestamp;

  @SerializedName("updated_at")
  private String updatedAt;

  @SerializedName("created_at")
  private String createdAt;

  @SerializedName("is_my_message")
  private boolean isMyMessage;

  @SerializedName("author")
  private AuthorEntity authorEntity;

  public String getId() {
    return id;
  }

  public String getThreadId() {
    return threadId;
  }

  public String getUserId() {
    return userId;
  }

  public String getBody() {
    return body;
  }

  public long getTimestamp() {
    return timestamp;
  }

  public String getUpdatedAt() {
    return updatedAt;
  }

  public String getCreatedAt() {
    return createdAt;
  }

  public boolean isMyMessage() {
    return isMyMessage;
  }

  public AuthorEntity getAuthorEntity() {
    return authorEntity;
  }

  @Override public String toString() {
    return "Message{"
        + "id='"
        + id
        + '\''
        + ", threadId='"
        + threadId
        + '\''
        + ", userId='"
        + userId
        + '\''
        + ", body='"
        + body
        + '\''
        + ", timestamp="
        + timestamp
        + ", updatedAt='"
        + updatedAt
        + '\''
        + ", createdAt='"
        + createdAt
        + '\''
        + ", isMyMessage="
        + isMyMessage
        + ", authorEntity="
        + authorEntity
        + '}';
  }

}
