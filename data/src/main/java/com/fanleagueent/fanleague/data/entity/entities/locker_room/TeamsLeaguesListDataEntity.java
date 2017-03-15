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

  public List<CommunityItemEntity> getLeaguesList() {
    return leaguesList;
  }
}
