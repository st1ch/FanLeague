package com.fanleagueent.fanleague.data.entity.entities.dashboard;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

/**
 * Created by alexeyverbitskiy on 3/28/17.
 */

public class CommunityEntity {
  @SerializedName("total") @Getter private int total;

  @SerializedName("total_growth") @Getter private int totalGrowth;

  @SerializedName("tree") @Getter private int tree;

  @SerializedName("tree_growth") @Getter private int treeGrowth;
}
