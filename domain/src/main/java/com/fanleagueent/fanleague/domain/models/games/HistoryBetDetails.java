package com.fanleagueent.fanleague.domain.models.games;

/**
 * Created by st1ch on 02.02.17.
 */

public class HistoryBetDetails {

  private HistoryBetEntity historyBetEntity;
  private GameweekEntity gameweekEntity;

  public HistoryBetDetails(HistoryBetEntity historyBetEntity, GameweekEntity gameweekEntity) {
    this.historyBetEntity = historyBetEntity;
    this.gameweekEntity = gameweekEntity;
  }

  public HistoryBetEntity getHistoryBetEntity() {
    return historyBetEntity;
  }

  public void setHistoryBetEntity(HistoryBetEntity historyBetEntity) {
    this.historyBetEntity = historyBetEntity;
  }

  public GameweekEntity getGameweekEntity() {
    return gameweekEntity;
  }

  public void setGameweekEntity(GameweekEntity gameweekEntity) {
    this.gameweekEntity = gameweekEntity;
  }

  @Override public String toString() {
    return "HistoryBetDetails{" +
        "historyBetEntity=" + historyBetEntity +
        ", gameweekEntity=" + gameweekEntity +
        '}';
  }
}
