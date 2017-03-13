package com.fanleagueent.fanleague.data.entity.entities.games;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * Created by st1ch on 12.01.17.
 */

public class GetTeamsDataEntity {

  @SerializedName("teams") private List<PlayTeamEntity> teamsList;

  @SerializedName("total") private int totalCount;

  public List<PlayTeamEntity> getTeamsList() {
    return teamsList;
  }

  public int getTotalCount() {
    return totalCount;
  }
}
