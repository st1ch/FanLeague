package com.fanleagueent.fanleague.domain.models.recruiting;

/**
 * Created by Artem Getman on 21.02.17.
 * a.e.getman@gmail.com
 */

public class Club {
  private String id;
  private String name;
  private String updatedAt;
  private String adminTeamId;

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getUpdatedAt() {
    return updatedAt;
  }

  public String getAdminTeamId() {
    return adminTeamId;
  }

  public void setId(String id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public void setAdminTeamId(String adminTeamId) {
    this.adminTeamId = adminTeamId;
  }

  @Override public String toString() {
    return "ClubEntity{"
        + "id='"
        + id
        + '\''
        + ", name='"
        + name
        + '\''
        + ", updatedAt='"
        + updatedAt
        + '\''
        + ", adminTeamId='"
        + adminTeamId
        + '\''
        + '}';
  }
}
