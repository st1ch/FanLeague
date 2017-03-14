package com.fanleagueent.fanleague.domain.models.chat;

/**
 * Created by alexeyverbitskiy on 2/24/17.
 */

public class Author {
  private String name;
  private String avatar;

  public String getName() {
    return name;
  }

  public String getAvatar() {
    return avatar;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }

  @Override public String toString() {
    return "AuthorEntity{" + "name='" + name + '\'' + ", avatarEntity='" + avatar + '\'' + '}';
  }
}
