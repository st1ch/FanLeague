package com.fanleagueent.fanleague.domain.models.activity_history;

import com.fanleagueent.fanleague.domain.models.user.Avatar;

/**
 * Created by alexeyverbitskiy on 3/3/17.
 */

public class ActivityHistoryGroup {
  private String id;
  private String slug;
  private String name;
  private Avatar avatar;

  public String getId() {
    return id;
  }

  public String getSlug() {
    return slug;
  }

  public Avatar getAvatar() {
    return avatar;
  }

  public String getName() {
    return name;
  }

  public void setId(String id) {
    this.id = id;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAvatar(Avatar avatarEntity) {
    this.avatar = avatarEntity;
  }

  @Override public String toString() {
    return "ActivityHistoryGroup{"
        + "id='"
        + id
        + '\''
        + ", slug='"
        + slug
        + '\''
        + ", name='"
        + name
        + '\''
        + ", avatarEntity="
        + avatar
        + '}';
  }
}
