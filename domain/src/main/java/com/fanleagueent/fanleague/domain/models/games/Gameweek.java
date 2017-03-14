package com.fanleagueent.fanleague.domain.models.games;

import java.util.Date;
import java.util.List;

/**
 * Created by st1ch on 22.12.16.
 */

public class Gameweek {

  private String id;

  private Date betClosingTime;

  private List<Match> matchEntities;

  private PrizePot prizePot;

  private int week;

  private boolean isMatchday;

  private boolean isClosed;

  private boolean isUserCanManipulateBet;

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

  public List<Match> getMatchEntities() {
    return matchEntities;
  }

  public void setMatchEntities(List<Match> matchEntities) {
    this.matchEntities = matchEntities;
  }

  public PrizePot getPrizePot() {
    return prizePot;
  }

  public void setPrizePot(PrizePot prizePot) {
    this.prizePot = prizePot;
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
    return "GameweekEntity{"
        + "id='"
        + id
        + '\''
        + ", betClosingTime="
        + betClosingTime
        + ", matchEntities="
        + matchEntities
        + ", prizePotEntity="
        + prizePot
        + ", week="
        + week
        + ", isMatchday="
        + isMatchday
        + ", isClosed="
        + isClosed
        + ", isUserCanManipulateBet="
        + isUserCanManipulateBet
        + '}';
  }
}
