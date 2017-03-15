package com.fanleagueent.fanleague.data.entity.mappers.locker_room;

import com.fanleagueent.fanleague.data.entity.entities.locker_room.PublicWallDataEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.locker_room.PublicWallData;

/**
 * Created by Artem Getman on 15.03.17.
 * a.e.getman@gmail.com
 */

public class PublicWallDataMapper implements Mapper<PublicWallDataEntity, PublicWallData> {

  private LockerRoomMapperFactory lockerRoomMapperFactory;

  public PublicWallDataMapper(LockerRoomMapperFactory lockerRoomMapperFactory) {
    this.lockerRoomMapperFactory = lockerRoomMapperFactory;
  }

  @Override public PublicWallData transform(PublicWallDataEntity obj) {
    PublicWallData publicWallData = new PublicWallData();

    publicWallData.setUser(lockerRoomMapperFactory.getLockerUserMapper().transform(obj.getUser()));
    publicWallData.setProgress(
        lockerRoomMapperFactory.getProgressMapper().transform(obj.getProgressEntity()));
    publicWallData.setPublicWall(
        lockerRoomMapperFactory.getPublicWallMapper().transform(obj.getPublicWallEntity()));
    publicWallData.setTrophies(
        lockerRoomMapperFactory.getTrophiesMapper().transform(obj.getTrophiesEntity()));

    return publicWallData;
  }
}
