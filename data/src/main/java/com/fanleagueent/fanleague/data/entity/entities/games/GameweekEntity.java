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

  public Date getBetClosingTime() {
    return betClosingTime;
  }

  public List<MatchEntity> getMatchEntities() {
    return matchEntities;
  }

  public PrizePotEntity getPrizePotEntity() {
    return prizePotEntity;
  }

  public int getWeek() {
    return week;
  }

  public boolean isMatchday() {
    return isMatchday;
  }

  public boolean isClosed() {
    return isClosed;
  }

  public boolean isUserCanManipulateBet() {
    return isUserCanManipulateBet;
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
        + prizePotEntity
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
