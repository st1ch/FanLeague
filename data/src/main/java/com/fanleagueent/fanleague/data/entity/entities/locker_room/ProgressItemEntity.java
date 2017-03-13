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

  public void setCurrentLevel(int currentLevel) {
    this.currentLevel = currentLevel;
  }

  public int getCurrentValue() {
    return currentValue;
  }

  public void setCurrentValue(int currentValue) {
    this.currentValue = currentValue;
  }

  public int getNextLevel() {
    return nextLevel;
  }

  public void setNextLevel(int nextLevel) {
    this.nextLevel = nextLevel;
  }

  public int getNextLevelBonus() {
    return nextLevelBonus;
  }

  public void setNextLevelBonus(int nextLevelBonus) {
    this.nextLevelBonus = nextLevelBonus;
  }

  public int getNextLevelValue() {
    return nextValue;
  }

  public void setNextValue(int nextValue) {
    this.nextValue = nextValue;
  }

  @Override public String toString() {
    return "ProgressItemEntity{" +
        "currentLevel=" + currentLevel +
        ", currentValue=" + currentValue +
        ", nextLevel=" + nextLevel +
        ", nextLevelBonus=" + nextLevelBonus +
        ", nextValue=" + nextValue +
        '}';
  }
}
