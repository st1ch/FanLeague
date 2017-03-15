package com.fanleagueent.fanleague.data.entity.mappers.locker_room;

import com.fanleagueent.fanleague.data.entity.entities.locker_room.ProgressItemEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.locker_room.ProgressItem;

/**
 * Created by Artem Getman on 15.03.17.
 * a.e.getman@gmail.com
 */

public class ProgressItemMapper implements Mapper<ProgressItemEntity, ProgressItem> {

  @Override public ProgressItem transform(ProgressItemEntity obj) {
    ProgressItem progressItem = new ProgressItem();

    progressItem.setCurrentLevel(obj.getCurrentLevel());
    progressItem.setCurrentValue(obj.getCurrentValue());
    progressItem.setNextLevel(obj.getNextLevel());
    progressItem.setNextValue(obj.getNextLevelValue());
    progressItem.setNextLevelBonus(obj.getNextLevelBonus());

    return progressItem;
  }
}
