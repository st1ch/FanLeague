package com.fanleagueent.fanleague.domain.models.teams;

/**
 * Created by st1ch on 23.11.16.
 */

public class TeamData {

  private Team team;

  private String threadId;

  private TeamMessagesData teamMessagesData;

  public Team getTeam() {
    return team;
  }

  public String getThreadId() {
    return threadId;
  }

  public TeamMessagesData getTeamMessagesData() {
    return teamMessagesData;
  }

  public void setTeam(Team team) {
    this.team = team;
  }

  public void setThreadId(String threadId) {
    this.threadId = threadId;
  }

  public void setTeamMessagesData(TeamMessagesData teamMessagesData) {
    this.teamMessagesData = teamMessagesData;
  }

  @Override public String toString() {
    return "TeamData{"
        + "team="
        + team
        + ", threadId='"
        + threadId
        + '\''
        + ", teamMessagesData="
        + teamMessagesData
        + '}';
  }
}
