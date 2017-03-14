package com.fanleagueent.fanleague.domain.models.chat;

import com.fanleagueent.fanleague.domain.models.user.Avatar;

/**
 * Created by alexeyverbitskiy on 2/2/17.
 */

public class ChatTypeData {
  private boolean hasBetMedal;
  private int level;
  private Avatar avatar;

  public boolean isHasBetMedal() {
    return hasBetMedal;
  }

  public int getLevel() {
    return level;
  }

  public Avatar getAvatar() {
    return avatar;
  }

  public void setHasBetMedal(boolean hasBetMedal) {
    this.hasBetMedal = hasBetMedal;
  }

  public void setLevel(int level) {
    this.level = level;
  }

  public void setAvatar(Avatar avatar) {
    this.avatar = avatar;
  }

  @Override public String toString() {
    return "ChatTypeData{" +
        "hasBetMedal=" + hasBetMedal +
        ", level=" + level +
        ", avatarEntity=" + avatar +
        '}';
  }

}
