package com.fanleagueent.fanleague.data.entity.mappers.locker_room;

import com.fanleagueent.fanleague.data.entity.entities.locker_room.TrophiesDataEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.data.entity.mappers.MapperFactory;
import com.fanleagueent.fanleague.domain.models.locker_room.TrophiesData;

/**
 * Created by Artem Getman on 15.03.17.
 * a.e.getman@gmail.com
 */

public class TrophiesDataMapper implements Mapper<TrophiesDataEntity, TrophiesData> {

  private MapperFactory mapperFactory;

  public TrophiesDataMapper(MapperFactory mapperFactory) {
    this.mapperFactory = mapperFactory;
  }

  @Override public TrophiesData transform(TrophiesDataEntity obj) {
    TrophiesData trophiesData = new TrophiesData();

    trophiesData.setUserEntity(
        mapperFactory.userMapperFactory().getUserMapper().transform(obj.getUserEntity()));
    trophiesData.setTrophies(mapperFactory.lockerRoomMapperFactory()
        .getTrophiesMapper()
        .transform(obj.getTrophiesEntity()));

    return trophiesData;
  }
}
