package com.fanleagueent.fanleague.domain.models.games;

import java.util.List;

/**
 * Created by st1ch on 02.02.17.
 */

public class HistoryGameweeksBetDetails {

  private HistoryBetDetails historyBetDetails;
  private List<Gameweek> gameweekList;

  public HistoryGameweeksBetDetails(HistoryBetDetails historyBetDetails,
      List<Gameweek> gameweekList) {
    this.historyBetDetails = historyBetDetails;
    this.gameweekList = gameweekList;
  }

  public HistoryBetDetails getHistoryBetDetails() {
    return historyBetDetails;
  }

  public void setHistoryBetDetails(HistoryBetDetails historyBetDetails) {
    this.historyBetDetails = historyBetDetails;
  }

  public List<Gameweek> getGameweekList() {
    return gameweekList;
  }

  public void setGameweekList(List<Gameweek> gameweekList) {
    this.gameweekList = gameweekList;
  }

  @Override public String toString() {
    return "HistoryGameweeksBetDetails{" +
        "historyBetDetails=" + historyBetDetails +
        ", gameweekEntityList=" + gameweekList +
        '}';
  }
}
