package com.fanleagueent.fanleague.domain.models.locker_room;

import com.fanleagueent.fanleague.domain.models.user.Avatar;

/**
 * Created by st1ch on 23.01.17.
 */

public class CommunityItem {

  private String id;
  private String name;
  private String slug;
  private Avatar avatarEntity;

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

  public Avatar getAvatarEntity() {
    return avatarEntity;
  }

  public void setAvatarEntity(Avatar avatarEntity) {
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
