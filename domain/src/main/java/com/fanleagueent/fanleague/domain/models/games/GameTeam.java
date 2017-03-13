package com.fanleagueent.fanleague.domain.models.games;

/**
 * Created by st1ch on 22.12.16.
 */

public class GameTeam {

  private String id;
  private String name;
  private String updatedAt;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override public String toString() {
    return "GameTeamEntity{"
        + "id='"
        + id
        + '\''
        + ", name='"
        + name
        + '\''
        + ", updatedAt='"
        + updatedAt
        + '\''
        + '}';
  }
}
