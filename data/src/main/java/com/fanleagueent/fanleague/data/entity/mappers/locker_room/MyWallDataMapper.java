package com.fanleagueent.fanleague.data.entity.mappers.locker_room;

import com.fanleagueent.fanleague.data.entity.entities.locker_room.MyWallDataEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.locker_room.MyWallData;

/**
 * Created by Artem Getman on 15.03.17.
 * a.e.getman@gmail.com
 */

public class MyWallDataMapper implements Mapper<MyWallDataEntity, MyWallData> {

  private LockerRoomMapperFactory lockerRoomMapperFactory;

  public MyWallDataMapper(LockerRoomMapperFactory lockerRoomMapperFactory) {
    this.lockerRoomMapperFactory = lockerRoomMapperFactory;
  }

  @Override public MyWallData transform(MyWallDataEntity obj) {
    MyWallData myWallData = new MyWallData();

    myWallData.setUser(lockerRoomMapperFactory.getLockerUserMapper().transform(obj.getUser()));
    myWallData.setPrivacy(
        lockerRoomMapperFactory.getPrivacyMapper().transform(obj.getPrivacyEntity()));
    myWallData.setWall(lockerRoomMapperFactory.getWallMapper().transform(obj.getWallEntity()));

    return myWallData;
  }
}
