package com.fanleagueent.fanleague.data.entity.entities.dashboard;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

/**
 * Created by alexeyverbitskiy on 3/28/17.
 */

public class LastBetEntity {
  @SerializedName("bets_played") @Getter private String betsPlayed;

  @SerializedName("gw") @Getter private String gw;

  @SerializedName("week_label") @Getter private String weekLabel;
}
