package com.fanleagueent.fanleague.domain.models.games;

import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by st1ch on 05.01.17.
 */

public class PunditRecommendationEntity {

  @SerializedName("_id") private String id;

  @SerializedName("expert_id") private String expertId;

  @SerializedName("week") private int week;

  @SerializedName("price") private double price;

  @SerializedName("system") private String system;

  @SerializedName("system_name") private String systemName;

  @SerializedName("matches") private Map<String, int[]> bets;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getExpertId() {
    return expertId;
  }

  public void setExpertId(String expertId) {
    this.expertId = expertId;
  }

  public int getWeek() {
    return week;
  }

  public void setWeek(int week) {
    this.week = week;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public String getSystem() {
    return system;
  }

  public void setSystem(String system) {
    this.system = system;
  }

  public String getSystemName() {
    return systemName;
  }

  public void setSystemName(String systemName) {
    this.systemName = systemName;
  }

  public Map<String, int[]> getBets() {
    return bets;
  }

  public Map<String, MatchBet> getMatchBets(){
    Map<String, MatchBet> matchBets = new HashMap<>();
    for(String matchId : bets.keySet()){
      matchBets.put(matchId, new MatchBet(bets.get(matchId)));
    }
    return matchBets;
  }

  public void setBets(Map<String, int[]> bets) {
    this.bets = bets;
  }

  @Override public String toString() {
    return "PunditRecommendationEntity{" +
        "id='" + id + '\'' +
        ", expertId='" + expertId + '\'' +
        ", week=" + week +
        ", price=" + price +
        ", system='" + system + '\'' +
        ", systemName='" + systemName + '\'' +
        ", bets=" + bets +
        '}';
  }
}
