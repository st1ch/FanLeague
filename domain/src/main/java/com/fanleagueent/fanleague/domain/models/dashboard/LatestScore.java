package com.fanleagueent.fanleague.domain.models.dashboard;

import lombok.Getter;
import lombok.ToString;
import lombok.experimental.Builder;

/**
 * Created by alexeyverbitskiy on 3/28/17.
 */
@Builder @ToString public class LatestScore {
  @Getter private float seasonAverage;
  @Getter private boolean hasLast;
  @Getter private LastBet lastBet;
}
