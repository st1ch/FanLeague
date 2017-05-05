package com.fanleagueent.fanleague.domain.models.dashboard;

import lombok.Getter;
import lombok.ToString;
import lombok.experimental.Builder;

/**
 * Created by alexeyverbitskiy on 3/28/17.
 */
@Builder @ToString public class Community {
  @Getter private int total;
  @Getter private int totalGrowth;
  @Getter private int tree;
  @Getter private int treeGrowth;
}
