package com.fanleagueent.fanleague.data.entity.entities.locker_room;

import com.fanleagueent.fanleague.data.entity.entities.user.AvatarEntity;
import com.google.gson.annotations.SerializedName;

/**
 * Created by st1ch on 23.01.17.
 */

public class CommunityItemEntity {

  @SerializedName("_id") private String id;
  @SerializedName("name") private String name;
  @SerializedName("slug") private String slug;
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

  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }

  public AvatarEntity getAvatarEntity() {
    return avatarEntity;
  }

  public void setAvatarEntity(AvatarEntity avatarEntity) {
    this.avatarEntity = avatarEntity;
  }

  @Override public String toString() {
    return "CommunityItemEntity{" +
        "avatarEntity=" + avatarEntity +
        ", slug='" + slug + '\'' +
        ", name='" + name + '\'' +
        ", id='" + id + '\'' +
        '}';
  }
}
