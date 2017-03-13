package com.fanleagueent.fanleague.data.entity.entities.games;

import com.google.gson.annotations.SerializedName;
import java.util.Date;
import java.util.List;

/**
 * Created by st1ch on 22.12.16.
 */

public class GameweekEntity {

  @SerializedName("_id") private String id;

  @SerializedName("bet_closing_time") private Date betClosingTime;

  @SerializedName("matches") private List<MatchEntity> matchEntities;

  @SerializedName("prize_pot") private PrizePotEntity prizePotEntity;

  @SerializedName("week") private int week;

  @SerializedName("is_matchday") private boolean isMatchday;

  @SerializedName("is_closed") private boolean isClosed;

  @SerializedName("is_user_can_manipulate_bet") private boolean isUserCanManipulateBet;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Date getBetClosingTime() {
    return betClosingTime;
  }

  public void setBetClosingTime(Date betClosingTime) {
    this.betClosingTime = betClosingTime;
  }

  public List<MatchEntity> getMatchEntities() {
    return matchEntities;
  }

  public void setMatchEntities(List<MatchEntity> matchEntities) {
    this.matchEntities = matchEntities;
  }

  public PrizePotEntity getPrizePotEntity() {
    return prizePotEntity;
  }

  public void setPrizePotEntity(PrizePotEntity prizePotEntity) {
    this.prizePotEntity = prizePotEntity;
  }

  public int getWeek() {
    return week;
  }

  public void setWeek(int week) {
    this.week = week;
  }

  public boolean isMatchday() {
    return isMatchday;
  }

  public void setMatchday(boolean matchday) {
    isMatchday = matchday;
  }

  public boolean isClosed() {
    return isClosed;
  }

  public void setClosed(boolean closed) {
    isClosed = closed;
  }

  public boolean isUserCanManipulateBet() {
    return isUserCanManipulateBet;
  }

  public void setUserCanManipulateBet(boolean userCanManipulateBet) {
    isUserCanManipulateBet = userCanManipulateBet;
  }

  @Override public String toString() {
    return "GameweekEntity{" +
        "id='" + id + '\'' +
        ", betClosingTime=" + betClosingTime +
        ", matchEntities=" + matchEntities +
        ", prizePotEntity=" + prizePotEntity +
        ", week=" + week +
        ", isMatchday=" + isMatchday +
        ", isClosed=" + isClosed +
        ", isUserCanManipulateBet=" + isUserCanManipulateBet +
        '}';
  }
}
