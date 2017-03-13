package com.fanleagueent.fanleague.domain.models.locker_room;

import com.fanleagueent.fanleague.domain.models.user.User;

/**
 * Created by st1ch on 23.01.17.
 */

public class TrophiesData {

  private User userEntity;

  private Trophies trophies;

  public User getUserEntity() {
    return userEntity;
  }

  public void setUserEntity(User userEntity) {
    this.userEntity = userEntity;
  }

  public Trophies getTrophies() {
    return trophies;
  }

  public void setTrophies(Trophies trophies) {
    this.trophies = trophies;
  }

  @Override public String toString() {
    return "TrophiesDataEntity{" +
        "trophiesEntity=" + trophies +
        ", userEntity=" + userEntity +
        '}';
  }
}
