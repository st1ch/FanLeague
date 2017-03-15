package com.fanleagueent.fanleague.data.entity.mappers.locker_room;

import com.fanleagueent.fanleague.data.entity.entities.locker_room.ProgressDataEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.data.entity.mappers.MapperFactory;
import com.fanleagueent.fanleague.domain.models.locker_room.ProgressData;

/**
 * Created by Artem Getman on 15.03.17.
 * a.e.getman@gmail.com
 */

public class ProgressDataMapper implements Mapper<ProgressDataEntity, ProgressData> {

  private MapperFactory mapperFactory;

  public ProgressDataMapper(MapperFactory mapperFactory) {
    this.mapperFactory = mapperFactory;
  }

  @Override public ProgressData transform(ProgressDataEntity obj) {
    ProgressData progressData = new ProgressData();

    progressData.setProgress(mapperFactory.lockerRoomMapperFactory()
        .getProgressMapper()
        .transform(obj.getProgressEntity()));
    progressData.setUserEntity(
        mapperFactory.userMapperFactory().getUserMapper().transform(obj.getUserEntity()));

    return progressData;
  }
}
