package com.fanleagueent.fanleague.data.entity.entities.locker_room;

import com.google.gson.annotations.SerializedName;

/**
 * Created by st1ch on 24.01.17.
 */

public class PublicWallDataEntity {

  @SerializedName("user") private LockerUserEntity user;
  @SerializedName("wall") private PublicWallEntity publicWallEntity;
  @SerializedName("progressEntity") private ProgressEntity progressEntity;
  @SerializedName("trophiesEntity") private TrophiesEntity trophiesEntity;

  public LockerUserEntity getUser() {
    return user;
  }

  public void setUser(LockerUserEntity user) {
    this.user = user;
  }

  public PublicWallEntity getPublicWallEntity() {
    return publicWallEntity;
  }

  public void setPublicWallEntity(PublicWallEntity publicWallEntity) {
    this.publicWallEntity = publicWallEntity;
  }

  public ProgressEntity getProgressEntity() {
    return progressEntity;
  }

  public void setProgressEntity(ProgressEntity progressEntity) {
    this.progressEntity = progressEntity;
  }

  public TrophiesEntity getTrophiesEntity() {
    return trophiesEntity;
  }

  public void setTrophiesEntity(TrophiesEntity trophiesEntity) {
    this.trophiesEntity = trophiesEntity;
  }

  @Override public String toString() {
    return "PublicWallDataEntity{" +
        "user=" + user +
        ", publicWallEntity=" + publicWallEntity +
        ", progressEntity=" + progressEntity +
        ", trophiesEntity=" + trophiesEntity +
        '}';
  }
}
