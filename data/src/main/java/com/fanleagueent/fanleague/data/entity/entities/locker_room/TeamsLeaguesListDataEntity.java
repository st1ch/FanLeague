package com.fanleagueent.fanleague.data.entity.entities.locker_room;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * Created by st1ch on 23.01.17.
 */

public class TeamsLeaguesListDataEntity {

  @SerializedName("teams") private List<CommunityItemEntity> teamsList;
  @SerializedName("leagues") private List<CommunityItemEntity> leaguesList;

  public List<CommunityItemEntity> getTeamsList() {
    return teamsList;
  }

  public void setTeamsList(List<CommunityItemEntity> teamsList) {
    this.teamsList = teamsList;
  }

  public List<CommunityItemEntity> getLeaguesList() {
    return leaguesList;
  }

  public void setLeaguesList(List<CommunityItemEntity> leaguesList) {
    this.leaguesList = leaguesList;
  }

  @Override public String toString() {
    return "TeamsLeaguesListDataEntity{" +
        "teamsList=" + teamsList +
        ", leaguesList=" + leaguesList +
        '}';
  }
}
