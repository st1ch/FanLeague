package com.fanleagueent.fanleague.data.entity.entities.games;

import com.google.gson.annotations.SerializedName;

/**
 * Created by st1ch on 22.12.16.
 */

public class TournamentEntity {

  @SerializedName("_id") private String id;

  @SerializedName("name") private String name;

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  @Override public String toString() {
    return "TournamentEntity{" + "id='" + id + '\'' + ", name='" + name + '\'' + '}';
  }
}
