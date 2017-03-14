package com.fanleagueent.fanleague.domain.models.games;

import com.fanleagueent.fanleague.domain.models.user.Avatar;

/**
 * Created by st1ch on 01.02.17.
 */

public class PlayHistoryTypeData {

  private String id;
  private String name;
  private String slug;
  private int currentLevel;
  private boolean hasBetMedal;
  private Avatar avatarEntity;

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

  public Avatar getAvatarEntity() {
    return avatarEntity;
  }

  public void setAvatarEntity(Avatar avatarEntity) {
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
