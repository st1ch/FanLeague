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

  public PublicWallEntity getPublicWallEntity() {
    return publicWallEntity;
  }

  public ProgressEntity getProgressEntity() {
    return progressEntity;
  }

  public TrophiesEntity getTrophiesEntity() {
    return trophiesEntity;
  }
}
