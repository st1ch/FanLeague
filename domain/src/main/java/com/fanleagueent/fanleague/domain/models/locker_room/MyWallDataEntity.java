package com.fanleagueent.fanleague.domain.models.locker_room;

import com.google.gson.annotations.SerializedName;

/**
 * Created by st1ch on 23.01.17.
 */

public class MyWallDataEntity {

  @SerializedName("wallEntity") private WallEntity wallEntity;

  @SerializedName("privacyEntity") private PrivacyEntity privacyEntity;

  @SerializedName("user") private LockerUserEntity user;

  public WallEntity getWallEntity() {
    return wallEntity;
  }

  public void setWallEntity(WallEntity wallEntity) {
    this.wallEntity = wallEntity;
  }

  public PrivacyEntity getPrivacyEntity() {
    return privacyEntity;
  }

  public void setPrivacyEntity(PrivacyEntity privacyEntity) {
    this.privacyEntity = privacyEntity;
  }

  public LockerUserEntity getUser() {
    return user;
  }

  public void setUser(LockerUserEntity user) {
    this.user = user;
  }

  @Override public String toString() {
    return "MyWallDataEntity{" +
        "wallEntity=" + wallEntity +
        ", privacyEntity=" + privacyEntity +
        ", user=" + user +
        '}';
  }
}
