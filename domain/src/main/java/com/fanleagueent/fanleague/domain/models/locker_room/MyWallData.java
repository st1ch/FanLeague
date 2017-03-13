package com.fanleagueent.fanleague.domain.models.locker_room;

/**
 * Created by st1ch on 23.01.17.
 */

public class MyWallData {

  private Wall wall;

  private Privacy privacy;

  private LockerUser user;

  public Wall getWall() {
    return wall;
  }

  public void setWall(Wall wall) {
    this.wall = wall;
  }

  public Privacy getPrivacy() {
    return privacy;
  }

  public void setPrivacy(Privacy privacy) {
    this.privacy = privacy;
  }

  public LockerUser getUser() {
    return user;
  }

  public void setUser(LockerUser user) {
    this.user = user;
  }

  @Override public String toString() {
    return "MyWallDataEntity{"
        + "wallEntity="
        + wall
        + ", privacyEntity="
        + privacy
        + ", user="
        + user
        + '}';
  }
}
