package com.fanleagueent.fanleague.data.entity.entities.leagues;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * Created by alexeyverbitskiy on 12/8/16.
 */

public class LeaguesDataEntity {

  @SerializedName("leagues") private List<LeagueEntity> leaguesList;

  @SerializedName("total") private int totalCount;

  public List<LeagueEntity> getLeagueList() {
    return leaguesList;
  }

  public int getTotalCount() {
    return totalCount;
  }
}
