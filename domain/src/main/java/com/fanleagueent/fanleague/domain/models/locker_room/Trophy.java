package com.fanleagueent.fanleague.domain.models.locker_room;

/**
 * Created by st1ch on 23.01.17.
 */

public class Trophy {

  private int value;
  private int nextValue;
  private int nextLevelPoints;
  private int level;
  private int nextLevel;
  private String description;

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
    return "TrophyEntity{"
        + "value="
        + value
        + ", nextValue="
        + nextValue
        + ", nextLevelPoints="
        + nextLevelPoints
        + ", level="
        + level
        + ", nextLevel="
        + nextLevel
        + ", description='"
        + description
        + '\''
        + '}';
  }
}
