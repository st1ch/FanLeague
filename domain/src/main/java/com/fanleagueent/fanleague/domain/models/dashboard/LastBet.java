package com.fanleagueent.fanleague.domain.models.dashboard;

import lombok.Getter;
import lombok.ToString;
import lombok.experimental.Builder;

/**
 * Created by alexeyverbitskiy on 3/28/17.
 */
@Builder @ToString public class LastBet {
  @Getter private String betsPlayed;
  @Getter private String gw;
  @Getter private String weekLabel;
}
