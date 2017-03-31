package com.fanleagueent.fanleague.data.entity.mappers.user;

import com.fanleagueent.fanleague.data.entity.entities.user.AvatarEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.user.Avatar;

/**
 * Created by alexeyverbitskiy on 3/14/17.
 */

public class AvatarMapper implements Mapper<AvatarEntity, Avatar> {

  public AvatarMapper() {
  }

  @Override public Avatar transform(AvatarEntity obj) {
    Avatar avatar = new Avatar();

    if (obj != null) {
      avatar.setMediumImage(obj.getMediumImage());
      avatar.setOriginalImage(obj.getOriginalImage());
    }

    return avatar;
  }
}
