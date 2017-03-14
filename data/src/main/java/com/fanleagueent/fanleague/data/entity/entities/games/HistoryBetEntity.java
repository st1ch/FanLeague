package com.fanleagueent.fanleague.data.entity.entities.games;

import com.google.gson.annotations.SerializedName;
import java.util.Date;
import java.util.Map;

/**
 * Created by st1ch on 23.12.16.
 */

public class HistoryBetEntity {

  @SerializedName("_id") private String id;

  @SerializedName("week") private int week;

  @SerializedName("matches") private Map<String, int[]> bets;

  @SerializedName("price") private float price;

  @SerializedName("bets_played") private String betsPlayed;

  @SerializedName("prize") private float prize;

  @SerializedName("created_at") private Date createdAt;

  @SerializedName("week_label") private String weekLabel;

  @SerializedName("is_team") private boolean isTeam;

  @SerializedName("type_data") private PlayHistoryTypeDataEntity playHistoryTypeDataEntity;

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

  public Date getCreatedAt() {
    return createdAt;
  }

  public String getWeekLabel() {
    return weekLabel;
  }

  public Map<String, int[]> getBets() {
    return bets;
  }

  public String getBetsPlayed() {
    return betsPlayed;
  }

  public boolean isTeam() {
    return isTeam;
  }

  public PlayHistoryTypeDataEntity getPlayHistoryTypeDataEntity() {
    return playHistoryTypeDataEntity;
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
        + playHistoryTypeDataEntity
        + '}';
  }
}
