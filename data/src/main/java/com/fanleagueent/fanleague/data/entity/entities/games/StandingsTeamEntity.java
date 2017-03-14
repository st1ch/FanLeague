package com.fanleagueent.fanleague.data.entity.entities.games;

import com.google.gson.annotations.SerializedName;

/**
 * Created by st1ch on 03.01.17.
 */

public class StandingsTeamEntity {

  @SerializedName("team_id") private String teamId;

  @SerializedName("team_name") private String teamName;

  @SerializedName("rank") private int rank;

  @SerializedName("points") private int points;

  @SerializedName("matches_played") private int matchesPlayed;

  @SerializedName("matches_won") private int matchesWon;

  @SerializedName("matches_lost") private int matchesLost;

  @SerializedName("matches_drawn") private int matchesDrawn;

  @SerializedName("goal_difference") private int goalDifference;

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

  public int getGoalDifference() {
    return goalDifference;
  }

  public void setGoalDifference(int goalDifference) {
    this.goalDifference = goalDifference;
  }

  @Override public String toString() {
    return "StandingsTeamEntity{"
        + "teamId='"
        + teamId
        + '\''
        + ", teamName='"
        + teamName
        + '\''
        + ", rank="
        + rank
        + ", points="
        + points
        + ", matchesPlayed="
        + matchesPlayed
        + ", matchesWon="
        + matchesWon
        + ", matchesLost="
        + matchesLost
        + ", matchesDrawn="
        + matchesDrawn
        + ", goalDifference="
        + goalDifference
        + '}';
  }
}
