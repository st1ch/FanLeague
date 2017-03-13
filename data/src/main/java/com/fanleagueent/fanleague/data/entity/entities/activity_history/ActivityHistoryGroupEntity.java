package com.fanleagueent.fanleague.data.entity.entities.activity_history;

import com.fanleagueent.fanleague.data.entity.entities.user.AvatarEntity;
import com.google.gson.annotations.SerializedName;

/**
 * Created by alexeyverbitskiy on 3/3/17.
 */

public class ActivityHistoryGroupEntity {
  @SerializedName("_id")
  private String id;

  @SerializedName("slug")
  private String slug;

  @SerializedName("name")
  private String name;

  @SerializedName("image_sizes")
  private AvatarEntity avatarEntity;

  public String getId() {
    return id;
  }

  public String getSlug() {
    return slug;
  }

  public AvatarEntity getAvatarEntity() {
    return avatarEntity;
  }

  public String getName() {
    return name;
  }
}
