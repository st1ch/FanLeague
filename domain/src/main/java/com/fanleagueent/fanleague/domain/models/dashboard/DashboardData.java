package com.fanleagueent.fanleague.domain.models.dashboard;

import lombok.Getter;
import lombok.ToString;
import lombok.experimental.Builder;

/**
 * Created by alexeyverbitskiy on 3/28/17.
 */

@Builder @ToString public class DashboardData {
  @Getter private Dashboard dashboard;
}
