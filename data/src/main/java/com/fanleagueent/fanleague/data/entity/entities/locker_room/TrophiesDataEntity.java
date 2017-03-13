package com.fanleagueent.fanleague.data.entity.entities.locker_room;

import com.fanleagueent.fanleague.data.entity.entities.user.UserEntity;
import com.google.gson.annotations.SerializedName;

/**
 * Created by st1ch on 23.01.17.
 */

public class TrophiesDataEntity {

  @SerializedName("user") private UserEntity userEntity;

  @SerializedName("trophies") private TrophiesEntity trophiesEntity;

  public UserEntity getUserEntity() {
    return userEntity;
  }

  public void setUserEntity(UserEntity userEntity) {
    this.userEntity = userEntity;
  }

  public TrophiesEntity getTrophiesEntity() {
    return trophiesEntity;
  }

  public void setTrophiesEntity(TrophiesEntity trophiesEntity) {
    this.trophiesEntity = trophiesEntity;
  }

  @Override public String toString() {
    return "TrophiesDataEntity{" +
        "trophiesEntity=" + trophiesEntity +
        ", userEntity=" + userEntity +
        '}';
  }
}
