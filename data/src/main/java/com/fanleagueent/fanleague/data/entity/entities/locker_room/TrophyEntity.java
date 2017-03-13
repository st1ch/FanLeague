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

  public void setValue(int value) {
    this.value = value;
  }

  public int getNextValue() {
    return nextValue;
  }

  public void setNextValue(int nextValue) {
    this.nextValue = nextValue;
  }

  public int getNextLevelPoints() {
    return nextLevelPoints;
  }

  public void setNextLevelPoints(int nextLevelPoints) {
    this.nextLevelPoints = nextLevelPoints;
  }

  public int getLevel() {
    return level;
  }

  public void setLevel(int level) {
    this.level = level;
  }

  public int getNextLevel() {
    return nextLevel;
  }

  public void setNextLevel(int nextLevel) {
    this.nextLevel = nextLevel;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override public String toString() {
    return "TrophyEntity{" +
        "value=" + value +
        ", nextValue=" + nextValue +
        ", nextLevelPoints=" + nextLevelPoints +
        ", level=" + level +
        ", nextLevel=" + nextLevel +
        ", description='" + description + '\'' +
        '}';
  }
}
