package com.fanleagueent.fanleague.data.entity.entities.chat;

import com.fanleagueent.fanleague.data.entity.entities.user.AvatarEntity;
import com.google.gson.annotations.SerializedName;

/**
 * Created by alexeyverbitskiy on 2/2/17.
 */

public class ChatTypeData {

  @SerializedName("has_bet_medal")
  private boolean hasBetMedal;

  @SerializedName("level")
  private int level;

  @SerializedName("image_sizes")
  private AvatarEntity avatar;

  public boolean isHasBetMedal() {
    return hasBetMedal;
  }

  public int getLevel() {
    return level;
  }

  public AvatarEntity getAvatar() {
    return avatar;
  }

  @Override public String toString() {
    return "ChatTypeData{" +
        "hasBetMedal=" + hasBetMedal +
        ", level=" + level +
        ", avatarEntity=" + avatar +
        '}';
  }

}
