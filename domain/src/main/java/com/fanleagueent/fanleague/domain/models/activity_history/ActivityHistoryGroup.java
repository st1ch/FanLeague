package com.fanleagueent.fanleague.domain.models.activity_history;

import com.fanleagueent.fanleague.domain.models.user.Avatar;

/**
 * Created by alexeyverbitskiy on 3/3/17.
 */

public class ActivityHistoryGroup {
  private String id;
  private String slug;
  private String name;
  private Avatar avatarEntity;

  public String getId() {
    return id;
  }

  public String getSlug() {
    return slug;
  }

  public Avatar getAvatarEntity() {
    return avatarEntity;
  }

  public String getName() {
    return name;
  }
}
