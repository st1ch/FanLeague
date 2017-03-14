package com.fanleagueent.fanleague.data.entity.entities.games;

import com.google.gson.annotations.SerializedName;

/**
 * Created by st1ch on 22.12.16.
 */

public class GameTeamEntity {

  @SerializedName("_id") private String id;

  @SerializedName("name") private String name;

  @SerializedName("updated_at") private String updatedAt;

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getUpdatedAt() {
    return updatedAt;
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
