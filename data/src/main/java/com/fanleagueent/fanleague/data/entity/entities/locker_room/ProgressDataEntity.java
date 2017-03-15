package com.fanleagueent.fanleague.data.entity.entities.locker_room;

import com.fanleagueent.fanleague.data.entity.entities.user.UserEntity;
import com.google.gson.annotations.SerializedName;

/**
 * Created by st1ch on 23.01.17.
 */

public class ProgressDataEntity {

  @SerializedName("user") private UserEntity userEntity;
  @SerializedName("progress") private ProgressEntity progressEntity;

  public UserEntity getUserEntity() {
    return userEntity;
  }

  public ProgressEntity getProgressEntity() {
    return progressEntity;
  }
}
