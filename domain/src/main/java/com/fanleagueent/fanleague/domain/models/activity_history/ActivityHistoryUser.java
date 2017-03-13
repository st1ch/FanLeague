package com.fanleagueent.fanleague.domain.models.activity_history;

import com.fanleagueent.fanleague.domain.models.user.Avatar;

/**
 * Created by alexeyverbitskiy on 3/3/17.
 */

public class ActivityHistoryUser {
  private String id;

  private Avatar avatar;

  private boolean hasBetMedal;

  private int level;

  public String getId() {
    return id;
  }

  public Avatar getAvatar() {
    return avatar;
  }

  public boolean isHasBetMedal() {
    return hasBetMedal;
  }

  public int getLevel() {
    return level;
  }

  public void setId(String id) {
    this.id = id;
  }

  public void setAvatar(Avatar avatar) {
    this.avatar = avatar;
  }

  public void setHasBetMedal(boolean hasBetMedal) {
    this.hasBetMedal = hasBetMedal;
  }

  public void setLevel(int level) {
    this.level = level;
  }
}
