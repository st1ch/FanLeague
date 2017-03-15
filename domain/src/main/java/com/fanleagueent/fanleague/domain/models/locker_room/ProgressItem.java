package com.fanleagueent.fanleague.domain.models.locker_room;

/**
 * Created by st1ch on 23.01.17.
 */

public class ProgressItem {
  private int currentLevel;
  private int currentValue;
  private int nextLevel;
  private int nextLevelBonus;
  private int nextValue;

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
    return "ProgressItemEntity{"
        + "currentLevel="
        + currentLevel
        + ", currentValue="
        + currentValue
        + ", nextLevel="
        + nextLevel
        + ", nextLevelBonus="
        + nextLevelBonus
        + ", nextValue="
        + nextValue
        + '}';
  }
}
