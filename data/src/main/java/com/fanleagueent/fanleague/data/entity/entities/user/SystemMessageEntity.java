package com.fanleagueent.fanleague.data.entity.entities.user;

import com.google.gson.annotations.SerializedName;

/**
 * Created by alexeyverbitskiy on 3/21/17.
 */

public class SystemMessageEntity {
  @SerializedName("_id") private String id;

  @SerializedName("text") private String text;

  @SerializedName("updated_at") private String updatedAt;

  public String getId() {
    return id;
  }

  public String getText() {
    return text;
  }

  public String getUpdatedAt() {
    return updatedAt;
  }
}
