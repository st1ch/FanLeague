package com.fanleagueent.fanleague.data.entity.entities.games;

import com.fanleagueent.fanleague.data.entity.entities.user.AvatarEntity;
import com.google.gson.annotations.SerializedName;

/**
 * Created by st1ch on 01.02.17.
 */

public class PlayHistoryTypeDataEntity {

  @SerializedName("_id") private String id;
  @SerializedName("name") private String name;
  @SerializedName("slug") private String slug;
  @SerializedName("current_level") private int currentLevel;
  @SerializedName("has_bet_medal") private boolean hasBetMedal;
  @SerializedName("image_sizes") private AvatarEntity avatarEntity;

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getSlug() {
    return slug;
  }

  public AvatarEntity getAvatarEntity() {
    return avatarEntity;
  }

  public int getCurrentLevel() {
    return currentLevel;
  }

  public boolean isHasBetMedal() {
    return hasBetMedal;
  }

  @Override public String toString() {
    return "PlayHistoryTypeDataEntity{"
        + "id='"
        + id
        + '\''
        + ", name='"
        + name
        + '\''
        + ", slug='"
        + slug
        + '\''
        + ", currentLevel="
        + currentLevel
        + ", hasBetMedal="
        + hasBetMedal
        + ", avatarEntity="
        + avatarEntity
        + '}';
  }
}
