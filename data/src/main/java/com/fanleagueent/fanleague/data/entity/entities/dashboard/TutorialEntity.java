package com.fanleagueent.fanleague.data.entity.entities.dashboard;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

/**
 * Created by alexeyverbitskiy on 3/28/17.
 */

public class TutorialEntity {
  @SerializedName("_id") @Getter private String id;

  @SerializedName("title") @Getter private String title;

  @SerializedName("video") @Getter private String video;

  @SerializedName("image") @Getter private String image;
}
