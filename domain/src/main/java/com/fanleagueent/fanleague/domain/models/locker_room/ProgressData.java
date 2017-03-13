package com.fanleagueent.fanleague.domain.models.locker_room;

import com.fanleagueent.fanleague.domain.models.user.User;

/**
 * Created by st1ch on 23.01.17.
 */

public class ProgressData {

  private User userEntity;
  private Progress progress;

  public User getUserEntity() {
    return userEntity;
  }

  public void setUserEntity(User userEntity) {
    this.userEntity = userEntity;
  }

  public Progress getProgress() {
    return progress;
  }

  public void setProgress(Progress progress) {
    this.progress = progress;
  }

  @Override public String toString() {
    return "ProgressDataEntity{" +
        "userEntity=" + userEntity +
        ", progressEntity=" + progress +
        '}';
  }
}
