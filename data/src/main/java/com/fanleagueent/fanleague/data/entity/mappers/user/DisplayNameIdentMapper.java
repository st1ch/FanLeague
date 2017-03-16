package com.fanleagueent.fanleague.data.entity.mappers.user;

import com.fanleagueent.fanleague.data.entity.entities.user.DisplayNameIdentEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.user.DisplayNameIdent;

/**
 * Created by alexeyverbitskiy on 3/14/17.
 */

public class DisplayNameIdentMapper implements Mapper<DisplayNameIdentEntity, DisplayNameIdent> {

  public DisplayNameIdentMapper() {
  }

  @Override public DisplayNameIdent transform(DisplayNameIdentEntity obj) {
    return DisplayNameIdent.fromValue(obj.getValue());
  }
}
