package com.fanleagueent.fanleague.data.net.requests.games;

import com.fanleagueent.fanleague.domain.models.games.MatchBet;
import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by st1ch on 22.12.16.
 */

public class CreateTeamBetRequest {

  @SerializedName("team_id") String teamId;

  @SerializedName("matches") Map<String, int[]> matchList;

  @SerializedName("is_remove_previous") boolean isRemovePrevious;

  public CreateTeamBetRequest(String teamId, Map<String, MatchBet>  matchList, boolean isRemovePrevious) {
    this.teamId = teamId;
    this.matchList = new HashMap<>();
    for(String matchId : matchList.keySet()){
      this.matchList.put(matchId, matchList.get(matchId).getBetValues());
    }
    this.isRemovePrevious = isRemovePrevious;
  }

  public String getTeamId() {
    return teamId;
  }

  public void setTeamId(String teamId) {
    this.teamId = teamId;
  }

  public Map<String, int[]> getMatchList() {
    return matchList;
  }

  public void setMatchList(Map<String, int[]> matchList) {
    this.matchList = matchList;
  }

  public boolean isRemovePrevious() {
    return isRemovePrevious;
  }

  public void setRemovePrevious(boolean removePrevious) {
    isRemovePrevious = removePrevious;
  }
}
