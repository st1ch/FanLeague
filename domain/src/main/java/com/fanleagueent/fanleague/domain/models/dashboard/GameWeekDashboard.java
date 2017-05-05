package com.fanleagueent.fanleague.domain.models.dashboard;

import com.fanleagueent.fanleague.domain.models.games.PrizePot;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.Builder;

/**
 * Created by alexeyverbitskiy on 3/28/17.
 */

@Builder @ToString public class GameWeekDashboard {
  @Getter private int week;
  @Getter private String pot;
  @Getter private String maxUserPrize;
  @Getter private String aggregatedPrizepot;
  @Getter private PrizePot prizePot;
}
