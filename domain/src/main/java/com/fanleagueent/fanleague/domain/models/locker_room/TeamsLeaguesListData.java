package com.fanleagueent.fanleague.domain.models.locker_room;

import java.util.List;

/**
 * Created by st1ch on 23.01.17.
 */

public class TeamsLeaguesListData {

  private List<CommunityItem> teamsList;
  private List<CommunityItem> leaguesList;

  public List<CommunityItem> getTeamsList() {
    return teamsList;
  }

  public void setTeamsList(List<CommunityItem> teamsList) {
    this.teamsList = teamsList;
  }

  public List<CommunityItem> getLeaguesList() {
    return leaguesList;
  }

  public void setLeaguesList(List<CommunityItem> leaguesList) {
    this.leaguesList = leaguesList;
  }

  @Override public String toString() {
    return "TeamsLeaguesListDataEntity{" +
        "teamsList=" + teamsList +
        ", leaguesList=" + leaguesList +
        '}';
  }
}
