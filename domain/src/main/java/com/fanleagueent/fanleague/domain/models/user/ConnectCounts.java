package com.fanleagueent.fanleague.domain.models.user;

/**
 * Created by st1ch on 06.02.17.
 */

public class ConnectCounts {
  private int teams;
  private int leagues;
  private int friends;

  public int getTeams() {
    return teams;
  }

  public void setTeams(int teams) {
    this.teams = teams;
  }

  public int getLeagues() {
    return leagues;
  }

  public void setLeagues(int leagues) {
    this.leagues = leagues;
  }

  public int getFriends() {
    return friends;
  }

  public void setFriends(int friends) {
    this.friends = friends;
  }

  @Override public String toString() {
    return "ConnectCountsEntity{" +
        "friends=" + friends +
        ", leagues=" + leagues +
        ", teams=" + teams +
        '}';
  }
}
