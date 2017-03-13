package com.fanleagueent.fanleague.domain.models.games;

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

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

  public AvatarEntity getAvatarEntity() {
    return avatarEntity;
  }

  public void setAvatarEntity(AvatarEntity avatarEntity) {
    this.avatarEntity = avatarEntity;
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
