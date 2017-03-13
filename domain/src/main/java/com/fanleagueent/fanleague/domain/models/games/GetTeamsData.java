package com.fanleagueent.fanleague.domain.models.games;

import java.util.List;

/**
 * Created by st1ch on 12.01.17.
 */

public class GetTeamsData {

  private List<PlayTeam> teamsList;

  private int totalCount;

  public List<PlayTeam> getTeamsList() {
    return teamsList;
  }

  public int getTotalCount() {
    return totalCount;
  }
}
