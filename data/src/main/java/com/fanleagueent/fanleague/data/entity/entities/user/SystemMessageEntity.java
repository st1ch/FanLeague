package com.fanleagueent.fanleague.data.entity.entities.user;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

/**
 * Created by alexeyverbitskiy on 3/21/17.
 */

public class SystemMessageEntity {
  @SerializedName("_id") @Getter private String id;
  @SerializedName("text") @Getter private String text;
  @SerializedName("updated_at") @Getter private String updatedAt;
}
