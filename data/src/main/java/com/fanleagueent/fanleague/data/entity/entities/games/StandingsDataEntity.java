package com.fanleagueent.fanleague.data.entity.entities.games;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * Created by st1ch on 22.12.16.
 */

public class StandingsDataEntity {

  @SerializedName("teamsTable") private List<StandingsTeamEntity> teamList;

  @SerializedName("gamesHistory") private List<MatchHistoryEntity> gamesHistory;

  public List<StandingsTeamEntity> getTeamList() {
    return teamList;
  }

  public List<MatchHistoryEntity> getGamesHistory() {
    return gamesHistory;
  }

  @Override public String toString() {
    return "StandingsDataEntity{" + "teamList=" + teamList + ", gamesHistory=" + gamesHistory + '}';
  }
}
