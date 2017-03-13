package com.fanleagueent.fanleague.domain.models.games;

import java.util.List;

/**
 * Created by st1ch on 02.02.17.
 */

public class HistoryGameweeksBetDetails {

  private HistoryBetDetails historyBetDetails;
  private List<GameweekEntity> gameweekEntityList;

  public HistoryGameweeksBetDetails(HistoryBetDetails historyBetDetails,
      List<GameweekEntity> gameweekEntityList) {
    this.historyBetDetails = historyBetDetails;
    this.gameweekEntityList = gameweekEntityList;
  }

  public HistoryBetDetails getHistoryBetDetails() {
    return historyBetDetails;
  }

  public void setHistoryBetDetails(HistoryBetDetails historyBetDetails) {
    this.historyBetDetails = historyBetDetails;
  }

  public List<GameweekEntity> getGameweekEntityList() {
    return gameweekEntityList;
  }

  public void setGameweekEntityList(List<GameweekEntity> gameweekEntityList) {
    this.gameweekEntityList = gameweekEntityList;
  }

  @Override public String toString() {
    return "HistoryGameweeksBetDetails{" +
        "historyBetDetails=" + historyBetDetails +
        ", gameweekEntityList=" + gameweekEntityList +
        '}';
  }
}
