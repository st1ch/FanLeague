package com.fanleagueent.fanleague.data.entity.mappers.locker_room;

import com.fanleagueent.fanleague.data.entity.entities.locker_room.TrophyEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.locker_room.Trophy;

/**
 * Created by Artem Getman on 15.03.17.
 * a.e.getman@gmail.com
 */

public class TrophyMapper implements Mapper<TrophyEntity, Trophy> {

  @Override public Trophy transform(TrophyEntity obj) {
    Trophy trophy = new Trophy();

    trophy.setDescription(obj.getDescription());
    trophy.setLevel(obj.getLevel());
    trophy.setNextLevel(obj.getNextLevel());
    trophy.setNextLevelPoints(obj.getNextLevelPoints());
    trophy.setNextValue(obj.getNextValue());
    trophy.setValue(obj.getValue());

    return trophy;
  }
}
