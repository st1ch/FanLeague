package com.fanleagueent.fanleague.domain.models.activity_history;

import com.fanleagueent.fanleague.domain.models.user.Avatar;

/**
 * Created by alexeyverbitskiy on 3/3/17.
 */

public class ActivityHistoryUser {
  private String id;

  private Avatar avatarEntity;

  private boolean hasBetMedal;

  private int level;

  public String getId() {
    return id;
  }

  public Avatar getAvatarEntity() {
    return avatarEntity;
  }

  public boolean isHasBetMedal() {
    return hasBetMedal;
  }

  public int getLevel() {
    return level;
  }
}
