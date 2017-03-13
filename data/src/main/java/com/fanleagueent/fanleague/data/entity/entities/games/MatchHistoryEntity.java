package com.fanleagueent.fanleague.data.entity.entities.games;

import com.google.gson.annotations.SerializedName;
import java.util.Date;

/**
 * Created by st1ch on 19.01.17.
 */

public class MatchHistoryEntity {
  @SerializedName("home_team_name")
  private String homeTeamName;

  @SerializedName("away_team_name")
  private String awayTeamName;

  @SerializedName("home_team_score")
  private int homeTeamScore;

  @SerializedName("away_team_score")
  private int awayTeamScore;

  @SerializedName("date")
  private Date date;

  public String getHomeTeamName() {
    return homeTeamName;
  }

  public void setHomeTeamName(String homeTeamName) {
    this.homeTeamName = homeTeamName;
  }

  public String getAwayTeamName() {
    return awayTeamName;
  }

  public void setAwayTeamName(String awayTeamName) {
    this.awayTeamName = awayTeamName;
  }

  public int getHomeTeamScore() {
    return homeTeamScore;
  }

  public void setHomeTeamScore(int homeTeamScore) {
    this.homeTeamScore = homeTeamScore;
  }

  public int getAwayTeamScore() {
    return awayTeamScore;
  }

  public void setAwayTeamScore(int awayTeamScore) {
    this.awayTeamScore = awayTeamScore;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  @Override public String toString() {
    return "MatchHistoryEntity{" +
        "homeTeamName='" + homeTeamName + '\'' +
        ", awayTeamName='" + awayTeamName + '\'' +
        ", homeTeamScore=" + homeTeamScore +
        ", awayTeamScore=" + awayTeamScore +
        ", date=" + date +
        '}';
  }
}
