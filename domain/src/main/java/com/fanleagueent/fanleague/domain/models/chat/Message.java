package com.fanleagueent.fanleague.domain.models.chat;

import io.reactivex.annotations.NonNull;

/**
 * Created by alexeyverbitskiy on 2/7/17.
 */

public class Message implements Comparable<Message> {

  private String id;
  private String threadId;
  private String userId;
  private String body;
  private long timestamp;
  private String updatedAt;
  private String createdAt;
  private boolean isMyMessage;
  private Author author;

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

  public Author getAuthor() {
    return author;
  }

  public void setId(String id) {
    this.id = id;
  }

  public void setThreadId(String threadId) {
    this.threadId = threadId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public void setTimestamp(long timestamp) {
    this.timestamp = timestamp;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public void setMyMessage(boolean myMessage) {
    isMyMessage = myMessage;
  }

  public void setAuthor(Author author) {
    this.author = author;
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
        + author
        + '}';
  }

  @Override public int compareTo(@NonNull Message message) {
    return id.compareTo(message.getId());
  }
}
