package com.fanleagueent.fanleague.data.entity.mappers.games;

import com.fanleagueent.fanleague.data.entity.entities.games.ExpertEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.data.entity.mappers.MapperFactory;
import com.fanleagueent.fanleague.domain.models.games.Expert;

/**
 * Created by Artem Getman on 14.03.17.
 * a.e.getman@gmail.com
 */

public class ExpertMapper implements Mapper<ExpertEntity, Expert> {

  private MapperFactory mapperFactory;

  public ExpertMapper(MapperFactory mapperFactory) {
    this.mapperFactory = mapperFactory;
  }

  @Override public Expert transform(ExpertEntity obj) {
    Expert expert = new Expert();

    expert.setId(obj.getId());
    expert.setDetail(obj.getDetail());
    expert.setName(obj.getName());
    expert.setAvatarEntity(
        mapperFactory.userMapperFactory().getAvatarMapper().transform(obj.getAvatarEntity()));

    return expert;
  }
}
