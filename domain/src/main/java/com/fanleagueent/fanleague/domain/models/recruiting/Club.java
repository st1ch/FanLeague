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
