package com.fanleagueent.fanleague.data.entity.entities.activity_history;

import com.fanleagueent.fanleague.data.entity.entities.user.AvatarEntity;
import com.google.gson.annotations.SerializedName;

/**
 * Created by alexeyverbitskiy on 3/3/17.
 */

public class ActivityHistoryUserEntity {
  @SerializedName("_id") private String id;

  @SerializedName("avatar_sizes") private AvatarEntity avatarEntity;

  @SerializedName("has_bet_medal") private boolean hasBetMedal;

  @SerializedName("level") private int level;

  public String getId() {
    return id;
  }

  public AvatarEntity getAvatarEntity() {
    return avatarEntity;
  }

  public boolean isHasBetMedal() {
    return hasBetMedal;
  }

  public int getLevel() {
    return level;
  }
}
