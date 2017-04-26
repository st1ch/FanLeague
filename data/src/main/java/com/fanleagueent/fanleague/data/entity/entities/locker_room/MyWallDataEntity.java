package com.fanleagueent.fanleague.data.entity.entities.locker_room;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

/**
 * Created by st1ch on 23.01.17.
 */
public class MyWallDataEntity {
  @SerializedName("wall") @Getter private WallEntity wallEntity;
  @SerializedName("privacy") @Getter private PrivacyEntity privacyEntity;
  @SerializedName("user") @Getter private LockerUserEntity user;
}
