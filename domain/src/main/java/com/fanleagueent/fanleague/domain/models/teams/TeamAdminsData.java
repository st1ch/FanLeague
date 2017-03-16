package com.fanleagueent.fanleague.domain.models.teams;

import java.util.List;

/**
 * Created by st1ch on 23.11.16.
 */

public class TeamAdminsData {

  private List<TeamMember> teamMemberEntities;

  public List<TeamMember> getTeamMembersList() {
    return teamMemberEntities;
  }

  public void setTeamMemberEntities(List<TeamMember> teamMemberEntities) {
    this.teamMemberEntities = teamMemberEntities;
  }

  @Override public String toString() {
    return "TeamAdminsData{" + "teamMemberEntities=" + teamMemberEntities + '}';
  }
}
