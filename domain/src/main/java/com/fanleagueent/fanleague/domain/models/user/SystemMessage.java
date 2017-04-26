package com.fanleagueent.fanleague.domain.models.user;

/**
 * Created by alexeyverbitskiy on 3/21/17.
 */

public class SystemMessage {

  private String id;

  private String text;

  private String updatedAt;

  public String getId() {
    return id;
  }

  public String getText() {
    return text;
  }

  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setId(String id) {
    this.id = id;
  }

  public void setText(String text) {
    this.text = text;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    SystemMessage that = (SystemMessage) o;

    return id != null ? id.equals(that.id) : that.id == null;
  }

  @Override public String toString() {
    return "SystemMessage{"
        + "id='"
        + id
        + '\''
        + ", text='"
        + text
        + '\''
        + ", updatedAt='"
        + updatedAt
        + '\''
        + '}';
  }

  @Override public int hashCode() {
    return id != null ? id.hashCode() : 0;
  }
}
