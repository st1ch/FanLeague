package com.fanleagueent.fanleague.data.entity.entities.dashboard;

import com.fanleagueent.fanleague.data.entity.entities.games.PrizePotEntity;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

/**
 * Created by alexeyverbitskiy on 3/28/17.
 */

public class GameWeekDashboardEntity {
  @SerializedName("week") @Getter private int week;
  @SerializedName("pot") @Getter private String pot;
  @SerializedName("max_user_prize") @Getter private String maxUserPrize;
  @SerializedName("aggregated_prizepot") @Getter private String aggregatedPrizepot;
  @SerializedName("prize_pot") @Getter private PrizePotEntity prizePot;
}
