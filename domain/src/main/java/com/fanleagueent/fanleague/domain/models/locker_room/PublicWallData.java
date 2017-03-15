package com.fanleagueent.fanleague.domain.models.locker_room;

/**
 * Created by st1ch on 24.01.17.
 */

public class PublicWallData {

  private LockerUser user;
  private PublicWall publicWall;
  private Progress progress;
  private Trophies trophies;

  public LockerUser getUser() {
    return user;
  }

  public void setUser(LockerUser user) {
    this.user = user;
  }

  public PublicWall getPublicWall() {
    return publicWall;
  }

  public void setPublicWall(PublicWall publicWall) {
    this.publicWall = publicWall;
  }

  public Progress getProgress() {
    return progress;
  }

  public void setProgress(Progress progress) {
    this.progress = progress;
  }

  public Trophies getTrophies() {
    return trophies;
  }

  public void setTrophies(Trophies trophies) {
    this.trophies = trophies;
  }

  @Override public String toString() {
    return "PublicWallDataEntity{"
        + "user="
        + user
        + ", publicWallEntity="
        + publicWall
        + ", progressEntity="
        + progress
        + ", trophiesEntity="
        + trophies
        + '}';
  }
}
