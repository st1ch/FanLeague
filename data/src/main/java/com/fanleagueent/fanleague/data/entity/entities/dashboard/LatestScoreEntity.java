package com.fanleagueent.fanleague.data.entity.entities.dashboard;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

/**
 * Created by alexeyverbitskiy on 3/28/17.
 */

public class LatestScoreEntity {
  @SerializedName("season_average") @Getter private float seasonAverage;

  @SerializedName("has_last") @Getter private boolean hasLast;

  @SerializedName("last_bet") @Getter private LastBetEntity lastBet;
}
