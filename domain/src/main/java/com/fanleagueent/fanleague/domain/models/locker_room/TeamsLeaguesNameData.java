package com.fanleagueent.fanleague.domain.models.locker_room;

/**
 * Created by st1ch on 23.01.17.
 */

public class TeamsLeaguesNameData {

  private String name;
  private TeamsLeaguesListData teamsLeaguesListData;

  public TeamsLeaguesNameData(String name, TeamsLeaguesListData teamsLeaguesListData) {
    this.name = name;
    this.teamsLeaguesListData = teamsLeaguesListData;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TeamsLeaguesListData getTeamsLeaguesListData() {
    return teamsLeaguesListData;
  }

  public void setTeamsLeaguesListData(TeamsLeaguesListData teamsLeaguesListData) {
    this.teamsLeaguesListData = teamsLeaguesListData;
  }

  @Override public String toString() {
    return "TeamsLeaguesNameDataEntity{"
        + "name='"
        + name
        + '\''
        + ", teamsLeaguesListDataEntity="
        + teamsLeaguesListData
        + '}';
  }
}
