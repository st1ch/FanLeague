package com.fanleagueent.fanleague.domain.models.leagues;

import java.util.List;

/**
 * Created by alexeyverbitskiy on 12/8/16.
 */

public class LeagueAdminData {

  private List<LeagueMember> leagueMemberEntities;

  public List<LeagueMember> getAdminsList() {
    return leagueMemberEntities;
  }

  public void setLeagueMemberEntities(List<LeagueMember> leagueMemberEntities) {
    this.leagueMemberEntities = leagueMemberEntities;
  }

  @Override public String toString() {
    return "LeagueAdminData{" + "leagueMemberEntities=" + leagueMemberEntities + '}';
  }
}
