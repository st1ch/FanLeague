package com.fanleagueent.fanleague.data.entity.mappers.games;

import com.fanleagueent.fanleague.data.entity.entities.games.PlayHistoryTypeDataEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.data.entity.mappers.MapperFactory;
import com.fanleagueent.fanleague.domain.models.games.PlayHistoryTypeData;

/**
 * Created by Artem Getman on 14.03.17.
 * a.e.getman@gmail.com
 */

public class PlayHistoryTypeDataMapper
    implements Mapper<PlayHistoryTypeDataEntity, PlayHistoryTypeData> {

  private MapperFactory mapperFactory;

  public PlayHistoryTypeDataMapper(MapperFactory mapperFactory) {
    this.mapperFactory = mapperFactory;
  }

  @Override public PlayHistoryTypeData transform(PlayHistoryTypeDataEntity obj) {
    PlayHistoryTypeData playHistoryTypeData = new PlayHistoryTypeData();

    playHistoryTypeData.setId(obj.getId());
    playHistoryTypeData.setSlug(obj.getSlug());
    playHistoryTypeData.setName(obj.getName());
    playHistoryTypeData.setCurrentLevel(obj.getCurrentLevel());
    playHistoryTypeData.setHasBetMedal(obj.isHasBetMedal());
    playHistoryTypeData.setAvatarEntity(
        mapperFactory.userMapperFactory().getAvatarMapper().transform(obj.getAvatarEntity()));

    return playHistoryTypeData;
  }
}
