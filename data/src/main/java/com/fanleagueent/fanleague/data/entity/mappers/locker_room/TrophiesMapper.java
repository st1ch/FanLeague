package com.fanleagueent.fanleague.data.entity.mappers.locker_room;

import com.fanleagueent.fanleague.data.entity.entities.locker_room.TrophiesEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.locker_room.Trophies;

/**
 * Created by Artem Getman on 15.03.17.
 * a.e.getman@gmail.com
 */

public class TrophiesMapper implements Mapper<TrophiesEntity, Trophies> {

  private LockerRoomMapperFactory lockerRoomMapperFactory;

  public TrophiesMapper(LockerRoomMapperFactory lockerRoomMapperFactory) {
    this.lockerRoomMapperFactory = lockerRoomMapperFactory;
  }

  @Override public Trophies transform(TrophiesEntity obj) {
    Trophies trophies = new Trophies();

    trophies.setConsistency(
        lockerRoomMapperFactory.getTrophyMapper().transform(obj.getConsistency()));
    trophies.setLoyalty(lockerRoomMapperFactory.getTrophyMapper().transform(obj.getLoyalty()));
    trophies.setRecruiting(
        lockerRoomMapperFactory.getTrophyMapper().transform(obj.getRecruiting()));
    trophies.setScore(lockerRoomMapperFactory.getTrophyMapper().transform(obj.getScore()));
    trophies.setTree(lockerRoomMapperFactory.getTrophyMapper().transform(obj.getTree()));

    return trophies;
  }
}
