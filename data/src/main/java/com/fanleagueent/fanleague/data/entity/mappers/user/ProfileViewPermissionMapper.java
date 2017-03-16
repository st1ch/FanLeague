package com.fanleagueent.fanleague.data.entity.mappers.user;

import com.fanleagueent.fanleague.data.entity.entities.user.ProfileViewPermissionEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.user.ProfileViewPermission;

/**
 * Created by alexeyverbitskiy on 3/14/17.
 */

public class ProfileViewPermissionMapper implements Mapper<ProfileViewPermissionEntity, ProfileViewPermission> {

  public ProfileViewPermissionMapper() {
  }

  @Override public ProfileViewPermission transform(ProfileViewPermissionEntity obj) {
    return ProfileViewPermission.fromValue(obj.getValue());
  }
}
