package com.fanleagueent.fanleague.data.entity.entities.chat;

import com.google.gson.annotations.SerializedName;

/**
 * Created by alexeyverbitskiy on 2/24/17.
 */

public class AuthorEntity {
  @SerializedName("name")
  private String name;

  @SerializedName("avatar")
  private String avatar;

  public String getName() {
    return name;
  }

  public String getAvatar() {
    return avatar;
  }

  @Override public String toString() {
    return "AuthorEntity{" + "name='" + name + '\'' + ", avatarEntity='" + avatar + '\'' + '}';
  }
}
