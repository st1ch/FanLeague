package com.fanleagueent.fanleague.data.entity.entities.dashboard;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

/**
 * Created by alexeyverbitskiy on 3/28/17.
 */

public class DashboardDataEntity {
  @SerializedName("dashboard") @Getter private DashboardEntity dashboard;
}
