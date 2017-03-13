package com.fanleagueent.fanleague.domain.models.games;

/**
 * Created by st1ch on 03.01.17.
 */

public class StandingsTeam {

  private String teamId;

  private String teamName;

  private int rank;

  private int points;

  private int matchesPlayed;

  private int matchesWon;

  private int matchesLost;

  private int matchesDrawn;

  private int goalDifference;

  public String getTeamId() {
    return teamId;
  }

  public String getTeamName() {
    return teamName;
  }

  public int getRank() {
    return rank;
  }

  public int getPoints() {
    return points;
  }

  public int getMatchesPlayed() {
    return matchesPlayed;
  }

  public int getMatchesWon() {
    return matchesWon;
  }

  public int getMatchesLost() {
    return matchesLost;
  }

  public int getMatchesDrawn() {
    return matchesDrawn;
  }

  public void setTeamId(String teamId) {
    this.teamId = teamId;
  }

  public void setTeamName(String teamName) {
    this.teamName = teamName;
  }

  public void setRank(int rank) {
    this.rank = rank;
  }

  public void setPoints(int points) {
    this.points = points;
  }

  public void setMatchesPlayed(int matchesPlayed) {
    this.matchesPlayed = matchesPlayed;
  }

  public void setMatchesWon(int matchesWon) {
    this.matchesWon = matchesWon;
  }

  public void setMatchesLost(int matchesLost) {
    this.matchesLost = matchesLost;
  }

  public void setMatchesDrawn(int matchesDrawn) {
    this.matchesDrawn = matchesDrawn;
  }

  public int getGoalDifference() {
    return goalDifference;
  }

  public void setGoalDifference(int goalDifference) {
    this.goalDifference = goalDifference;
  }

  @Override public String toString() {
    return "StandingsTeamEntity{" +
        "teamId='" + teamId + '\'' +
        ", teamName='" + teamName + '\'' +
        ", rank=" + rank +
        ", points=" + points +
        ", matchesPlayed=" + matchesPlayed +
        ", matchesWon=" + matchesWon +
        ", matchesLost=" + matchesLost +
        ", matchesDrawn=" + matchesDrawn +
        ", goalDifference=" + goalDifference +
        '}';
  }
}
