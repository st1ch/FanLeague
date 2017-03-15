package com.fanleagueent.fanleague.domain.models.leagues;

import java.util.List;

/**
 * Created by alexeyverbitskiy on 12/8/16.
 */

public class LeaguesData {

  private List<League> leaguesList;
  private int totalCount;

  public List<League> getLeagueList() {
    return leaguesList;
  }

  public int getTotalCount() {
    return totalCount;
  }

  public void setLeaguesList(List<League> leaguesList) {
    this.leaguesList = leaguesList;
  }

  public void setTotalCount(int totalCount) {
    this.totalCount = totalCount;
  }

  @Override public String toString() {
    return "LeaguesData{" + "leaguesList=" + leaguesList + ", totalCount=" + totalCount + '}';
  }
}

