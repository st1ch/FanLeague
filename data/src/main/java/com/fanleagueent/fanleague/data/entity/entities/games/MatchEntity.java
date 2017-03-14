package com.fanleagueent.fanleague.data.entity.entities.games;

import com.google.gson.annotations.SerializedName;
import java.util.Date;
import java.util.List;

/**
 * Created by st1ch on 22.12.16.
 */

public class MatchEntity {

  @SerializedName("_id") private String id;

  @SerializedName("datetime") private Date datetime;

  @SerializedName("updated_at") private String updatedAt;

  @SerializedName("venue") private String venue;

  @SerializedName("week") private int week;

  @SerializedName("result") private ResultEntity resultEntity;

  @SerializedName("bet_rates") private List<BetRateEntity> betRateEntities;

  @SerializedName("home_team") private GameTeamEntity homeTeam;

  @SerializedName("away_team") private GameTeamEntity awayTeam;

  @SerializedName("tournament") private TournamentEntity tournamentEntity;

  public String getId() {
    return id;
  }

  public Date getDatetime() {
    return datetime;
  }

  public String getUpdatedAt() {
    return updatedAt;
  }

  public String getVenue() {
    return venue;
  }

  public int getWeek() {
    return week;
  }

  public ResultEntity getResultEntity() {
    return resultEntity;
  }

  public List<BetRateEntity> getBetRateEntities() {
    return betRateEntities;
  }

  public GameTeamEntity getHomeTeam() {
    return homeTeam;
  }

  public GameTeamEntity getAwayTeam() {
    return awayTeam;
  }

  public TournamentEntity getTournamentEntity() {
    return tournamentEntity;
  }

  @Override public String toString() {
    return "MatchEntity{"
        + "id='"
        + id
        + '\''
        + ", datetime="
        + datetime
        + ", updatedAt='"
        + updatedAt
        + '\''
        + ", venue='"
        + venue
        + '\''
        + ", week="
        + week
        + ", resultEntity="
        + resultEntity
        + ", betRateEntities="
        + betRateEntities
        + ", homeTeam="
        + homeTeam
        + ", awayTeam="
        + awayTeam
        + ", tournamentEntity="
        + tournamentEntity
        + '}';
  }
}
