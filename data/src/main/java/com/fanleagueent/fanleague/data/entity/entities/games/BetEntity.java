package com.fanleagueent.fanleague.data.entity.entities.games;

import com.google.gson.annotations.SerializedName;
import java.util.Map;

/**
 * Created by st1ch on 23.12.16.
 */

public class BetEntity {

  @SerializedName("_id") private String id;

  @SerializedName("user_id") private String userId;

  @SerializedName("week") private int week;

  @SerializedName("matches") private Map<String, int[]> bets;

  @SerializedName("price") private float price;

  @SerializedName("bets_played") private String betsPlayed;

  @SerializedName("prize") private float prize;

  @SerializedName("updated_at") private String updatedAt;

  @SerializedName("created_at") private String createdAt;

  @SerializedName("week_label") private String weekLabel;

  public String getId() {
    return id;
  }

  public float getPrize() {
    return prize;
  }

  public float getPrice() {
    return price;
  }

  public int getWeek() {
    return week;
  }

  public String getCreatedAt() {
    return createdAt;
  }

  public String getWeekLabel() {
    return weekLabel;
  }

  public String getUserId() {
    return userId;
  }

  public String getUpdatedAt() {
    return updatedAt;
  }

  public Map<String, int[]> getBets() {
    return bets;
  }

  public String getBetsPlayed() {
    return betsPlayed;
  }

  @Override public String toString() {
    return "BetEntity{"
        + "id='"
        + id
        + '\''
        + ", prize="
        + prize
        + ", price="
        + price
        + ", week="
        + week
        + ", createdAt='"
        + createdAt
        + '\''
        + ", weekLabel='"
        + weekLabel
        + '\''
        + ", userId='"
        + userId
        + '\''
        + ", updatedAt='"
        + updatedAt
        + '\''
        + ", bets="
        + bets
        + ", betsPlayed='"
        + betsPlayed
        + '\''
        + '}';
  }
}
