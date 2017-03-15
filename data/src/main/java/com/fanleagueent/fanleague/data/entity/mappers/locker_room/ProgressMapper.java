package com.fanleagueent.fanleague.data.entity.mappers.locker_room;

import com.fanleagueent.fanleague.data.entity.entities.locker_room.ProgressEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.locker_room.Progress;

/**
 * Created by Artem Getman on 15.03.17.
 * a.e.getman@gmail.com
 */

public class ProgressMapper implements Mapper<ProgressEntity, Progress> {

  private LockerRoomMapperFactory lockerRoomMapperFactory;

  public ProgressMapper(LockerRoomMapperFactory lockerRoomMapperFactory) {
    this.lockerRoomMapperFactory = lockerRoomMapperFactory;
  }

  @Override public Progress transform(ProgressEntity obj) {
    Progress progress = new Progress();

    progress.setScore(lockerRoomMapperFactory.getProgressItemMapper().transform(obj.getScore()));
    progress.setRecruiting(lockerRoomMapperFactory.getProgressItemMapper().transform(obj.getRecruiting()));
    progress.setTree(lockerRoomMapperFactory.getProgressItemMapper().transform(obj.getTree()));
    progress.setLoyalty(lockerRoomMapperFactory.getProgressItemMapper().transform(obj.getLoyalty()));
    progress.setConsistency(lockerRoomMapperFactory.getProgressItemMapper().transform(obj.getConsistency()));

    return progress;
  }
}
