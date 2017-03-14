package com.fanleagueent.fanleague.data.entity.entities.games;

import com.fanleagueent.fanleague.data.entity.entities.user.AvatarEntity;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * Created by st1ch on 05.01.17.
 */

public class PunditSimpleEntity {

  @SerializedName("_id") private String id;

  @SerializedName("image_sizes") private AvatarEntity avatarEntity;

  @SerializedName("name") private String name;

  @SerializedName("bets") private List<PunditRecommendationEntity> recommendations;

  public String getId() {
    return id;
  }

  public AvatarEntity getAvatarEntity() {
    return avatarEntity;
  }

  public String getName() {
    return name;
  }

  public List<PunditRecommendationEntity> getRecommendations() {
    return recommendations;
  }

  @Override public String toString() {
    return "PunditSimpleEntity{"
        + "id='"
        + id
        + '\''
        + ", avatarEntity="
        + avatarEntity
        + ", name='"
        + name
        + '\''
        + ", recommendations="
        + recommendations
        + '}';
  }
}
