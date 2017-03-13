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

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }

  public AvatarEntity getAvatarEntity() {
    return avatarEntity;
  }

  public void setAvatarEntity(AvatarEntity avatarEntity) {
    this.avatarEntity = avatarEntity;
  }

  public int getCurrentLevel() {
    return currentLevel;
  }

  public void setCurrentLevel(int currentLevel) {
    this.currentLevel = currentLevel;
  }

  public boolean isHasBetMedal() {
    return hasBetMedal;
  }

  public void setHasBetMedal(boolean hasBetMedal) {
    this.hasBetMedal = hasBetMedal;
  }

  @Override public String toString() {
    return "PlayHistoryTypeDataEntity{" +
        "id='" + id + '\'' +
        ", name='" + name + '\'' +
        ", slug='" + slug + '\'' +
        ", currentLevel=" + currentLevel +
        ", hasBetMedal=" + hasBetMedal +
        ", avatarEntity=" + avatarEntity +
        '}';
  }
}
