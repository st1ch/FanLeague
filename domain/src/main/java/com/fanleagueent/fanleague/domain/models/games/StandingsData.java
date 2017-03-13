package com.fanleagueent.fanleague.domain.models.games;

import java.util.List;

/**
 * Created by st1ch on 22.12.16.
 */

public class StandingsData {

  private List<StandingsTeam> teamList;
  private List<MatchHistory> gamesHistory;

  public List<StandingsTeam> getTeamList() {
    return teamList;
  }

  public void setTeamList(List<StandingsTeam> teamList) {
    this.teamList = teamList;
  }

  public List<MatchHistory> getGamesHistory() {
    return gamesHistory;
  }

  public void setGamesHistory(List<MatchHistory> gamesHistory) {
    this.gamesHistory = gamesHistory;
  }

  @Override public String toString() {
    return "StandingsDataEntity{" +
        "teamList=" + teamList +
        ", gamesHistory=" + gamesHistory +
        '}';
  }
}
