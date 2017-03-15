package com.fanleagueent.fanleague.domain.models.leagues;

/**
 * Created by alexeyverbitskiy on 12/8/16.
 */

public class LeagueData {

  private League league;
  private String threadId;
  private LeagueMessagesData leagueMessagesData;

  public League getLeague() {
    return league;
  }

  public String getThreadId() {
    return threadId;
  }

  public LeagueMessagesData getLeagueMessagesData() {
    return leagueMessagesData;
  }

  public void setLeague(League league) {
    this.league = league;
  }

  public void setThreadId(String threadId) {
    this.threadId = threadId;
  }

  public void setLeagueMessagesData(LeagueMessagesData leagueMessagesData) {
    this.leagueMessagesData = leagueMessagesData;
  }

  @Override public String toString() {
    return "LeagueData{"
        + "league="
        + league
        + ", threadId='"
        + threadId
        + '\''
        + ", leagueMessagesData="
        + leagueMessagesData
        + '}';
  }
}
