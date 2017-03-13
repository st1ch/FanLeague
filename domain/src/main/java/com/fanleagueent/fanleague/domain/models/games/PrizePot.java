package com.fanleagueent.fanleague.domain.models.games;

/**
 * Created by st1ch on 22.12.16.
 */

public class PrizePot {

  private String turnover;

  private String pot;

  private Prizes prizes;

  private Winners winners;

  public String getTurnover() {
    return turnover;
  }

  public void setTurnover(String turnover) {
    this.turnover = turnover;
  }

  public String getPot() {
    return pot;
  }

  public void setPot(String pot) {
    this.pot = pot;
  }

  public Prizes getPrizes() {
    return prizes;
  }

  public void setPrizes(Prizes prizes) {
    this.prizes = prizes;
  }

  public Winners getWinners() {
    return winners;
  }

  public void setWinners(Winners winners) {
    this.winners = winners;
  }

  @Override public String toString() {
    return "PrizePotEntity{" +
        "turnover='" + turnover + '\'' +
        ", pot='" + pot + '\'' +
        ", prizesEntity=" + prizes +
        ", winnersEntity=" + winners +
        '}';
  }
}
