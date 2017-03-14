package com.fanleagueent.fanleague.domain.models.games;

/**
 * Created by st1ch on 03.02.17.
 */

public class Winners {
  private int winners13;
  private int winners12;
  private int winners11;
  private int winners10;
  private int winnersTree;

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
    return "WinnersEntity{"
        + "winnersTree="
        + winnersTree
        + ", winners10="
        + winners10
        + ", winners11="
        + winners11
        + ", winners12="
        + winners12
        + ", winners13="
        + winners13
        + '}';
  }
}
