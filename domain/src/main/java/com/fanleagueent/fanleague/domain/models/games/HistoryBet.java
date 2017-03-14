package com.fanleagueent.fanleague.domain.models.games;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by st1ch on 23.12.16.
 */

public class HistoryBet {

  private String id;
  private int week;
  private Map<String, int[]> bets;
  private float price;
  private String betsPlayed;
  private float prize;
  private Date createdAt;
  private String weekLabel;
  private boolean isTeam;
  private PlayHistoryTypeData playHistoryTypeData;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public float getPrize() {
    return prize;
  }

  public void setPrize(float prize) {
    this.prize = prize;
  }

  public float getPrice() {
    return price;
  }

  public void setPrice(float price) {
    this.price = price;
  }

  public int getWeek() {
    return week;
  }

  public void setWeek(int week) {
    this.week = week;
  }

  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public String getWeekLabel() {
    return weekLabel;
  }

  public void setWeekLabel(String weekLabel) {
    this.weekLabel = weekLabel;
  }

  public Map<String, MatchBet> getBets() {
    Map<String, MatchBet> matchBets = new HashMap<>();
    for (String matchId : bets.keySet()) {
      matchBets.put(matchId, new MatchBet(bets.get(matchId)));
    }
    return matchBets;
  }

  public void setBets(Map<String, int[]> bets) {
    this.bets = bets;
  }

  public String getBetsPlayed() {
    return betsPlayed;
  }

  public void setBetsPlayed(String betsPlayed) {
    this.betsPlayed = betsPlayed;
  }

  public boolean isTeam() {
    return isTeam;
  }

  public void setTeam(boolean team) {
    isTeam = team;
  }

  public PlayHistoryTypeData getPlayHistoryTypeData() {
    return playHistoryTypeData;
  }

  public void setPlayHistoryTypeData(PlayHistoryTypeData playHistoryTypeData) {
    this.playHistoryTypeData = playHistoryTypeData;
  }

  @Override public String toString() {
    return "HistoryBetEntity{"
        + "id='"
        + id
        + '\''
        + ", week="
        + week
        + ", bets="
        + bets
        + ", price="
        + price
        + ", betsPlayed='"
        + betsPlayed
        + '\''
        + ", prize="
        + prize
        + ", createdAt='"
        + createdAt
        + '\''
        + ", weekLabel='"
        + weekLabel
        + '\''
        + ", isTeam="
        + isTeam
        + ", playHistoryTypeDataEntity="
        + playHistoryTypeData
        + '}';
  }
}
