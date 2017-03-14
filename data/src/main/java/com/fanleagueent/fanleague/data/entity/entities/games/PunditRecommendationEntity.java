package com.fanleagueent.fanleague.data.entity.entities.games;

import com.google.gson.annotations.SerializedName;
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

  public String getExpertId() {
    return expertId;
  }

  public int getWeek() {
    return week;
  }

  public double getPrice() {
    return price;
  }

  public String getSystem() {
    return system;
  }

  public String getSystemName() {
    return systemName;
  }

  public Map<String, int[]> getBets() {
    return bets;
  }

  @Override public String toString() {
    return "PunditRecommendationEntity{"
        + "id='"
        + id
        + '\''
        + ", expertId='"
        + expertId
        + '\''
        + ", week="
        + week
        + ", price="
        + price
        + ", system='"
        + system
        + '\''
        + ", systemName='"
        + systemName
        + '\''
        + ", bets="
        + bets
        + '}';
  }
}
