package com.fanleagueent.fanleague.data.entity.entities.games;

import com.google.gson.annotations.SerializedName;

/**
 * Created by st1ch on 03.02.17.
 */

public class WinnersEntity {
  @SerializedName("13") private int winners13;
  @SerializedName("12") private int winners12;
  @SerializedName("11") private int winners11;
  @SerializedName("10") private int winners10;
  @SerializedName("tree") private int winnersTree;

  public int getWinners13() {
    return winners13;
  }

  public void setWinners13(int winners13) {
    this.winners13 = winners13;
  }

  public int getWinners12() {
    return winners12;
  }

  public void setWinners12(int winners12) {
    this.winners12 = winners12;
  }

  public int getWinners11() {
    return winners11;
  }

  public void setWinners11(int winners11) {
    this.winners11 = winners11;
  }

  public int getWinners10() {
    return winners10;
  }

  public void setWinners10(int winners10) {
    this.winners10 = winners10;
  }

  public int getWinnersTree() {
    return winnersTree;
  }

  public void setWinnersTree(int winnersTree) {
    this.winnersTree = winnersTree;
  }

  @Override public String toString() {
    return "WinnersEntity{" +
        "winnersTree=" + winnersTree +
        ", winners10=" + winners10 +
        ", winners11=" + winners11 +
        ", winners12=" + winners12 +
        ", winners13=" + winners13 +
        '}';
  }
}
