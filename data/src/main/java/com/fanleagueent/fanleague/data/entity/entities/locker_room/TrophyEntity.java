package com.fanleagueent.fanleague.data.entity.entities.locker_room;

import com.google.gson.annotations.SerializedName;

/**
 * Created by st1ch on 23.01.17.
 */

public class TrophyEntity {

  @SerializedName("value") private int value;
  @SerializedName("next_value") private int nextValue;
  @SerializedName("next_level_points") private int nextLevelPoints;
  @SerializedName("level") private int level;
  @SerializedName("next_level") private int nextLevel;
  @SerializedName("description") private String description;

  public int getValue() {
    return value;
  }

  public int getNextValue() {
    return nextValue;
  }

  public int getNextLevelPoints() {
    return nextLevelPoints;
  }

  public int getLevel() {
    return level;
  }

  public int getNextLevel() {
    return nextLevel;
  }

  public String getDescription() {
    return description;
  }
}
