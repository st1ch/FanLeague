package com.fanleagueent.fanleague.data.entity.entities.locker_room;

import com.google.gson.annotations.SerializedName;

/**
 * Created by st1ch on 23.01.17.
 */

public class ProgressItemEntity {
  @SerializedName("current_level") private int currentLevel;
  @SerializedName("current_value") private int currentValue;
  @SerializedName("next_level") private int nextLevel;
  @SerializedName("next_level_bonus") private int nextLevelBonus;
  @SerializedName("next_value") private int nextValue;

  public int getCurrentLevel() {
    return currentLevel;
  }

  public int getCurrentValue() {
    return currentValue;
  }

  public int getNextLevel() {
    return nextLevel;
  }

  public int getNextLevelBonus() {
    return nextLevelBonus;
  }

  public int getNextLevelValue() {
    return nextValue;
  }
}
