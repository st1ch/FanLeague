package com.fanleagueent.fanleague.domain.models.teams;

import java.util.List;

/**
 * Created by st1ch on 23.11.16.
 */

public class TeamsData {

  private List<Team> teamsList;
  private int totalCount;

  public List<Team> getTeamList() {
    return teamsList;
  }

  public int getTotalCount() {
    return totalCount;
  }

  public void setTeamsList(List<Team> teamsList) {
    this.teamsList = teamsList;
  }

  public void setTotalCount(int totalCount) {
    this.totalCount = totalCount;
  }

  @Override public String toString() {
    return "TeamsData{" + "teamsList=" + teamsList + ", totalCount=" + totalCount + '}';
  }
}
