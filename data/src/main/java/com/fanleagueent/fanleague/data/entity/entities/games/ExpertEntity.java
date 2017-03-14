package com.fanleagueent.fanleague.data.entity.entities.games;

import com.fanleagueent.fanleague.data.entity.entities.user.AvatarEntity;
import com.google.gson.annotations.SerializedName;

/**
 * Created by st1ch on 10.01.17.
 */

public class ExpertEntity {

  @SerializedName("_id") private String id;

  @SerializedName("name") private String name;

  @SerializedName("detail") private String detail;

  @SerializedName("image_sizes") private AvatarEntity avatarEntity;

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getDetail() {
    return detail;
  }

  public AvatarEntity getAvatarEntity() {
    return avatarEntity;
  }

  @Override public String toString() {
    return "ExpertEntity{"
        + "id='"
        + id
        + '\''
        + ", name='"
        + name
        + '\''
        + ", detail='"
        + detail
        + '\''
        + ", avatarEntity="
        + avatarEntity
        + '}';
  }
}
