package com.fanleagueent.fanleague.data.entity.mappers.games;

import com.fanleagueent.fanleague.data.entity.entities.games.CreateBetDataEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.data.entity.mappers.MapperFactory;
import com.fanleagueent.fanleague.domain.models.games.CreateBetData;

/**
 * Created by Artem Getman on 14.03.17.
 * a.e.getman@gmail.com
 */

public class CreateBetDataMapper implements Mapper<CreateBetDataEntity, CreateBetData> {

  private MapperFactory mapperFactory;

  public CreateBetDataMapper(MapperFactory mapperFactory) {
    this.mapperFactory = mapperFactory;
  }

  @Override public CreateBetData transform(CreateBetDataEntity obj) {
    CreateBetData createBetData = new CreateBetData();

    createBetData.setBet(
        mapperFactory.gamesMapperFactory().getBetMapper().transform(obj.getBetEntity()));
    createBetData.setUserEntity(
        mapperFactory.userMapperFactory().getUserMapper().transform(obj.getUserEntity()));
    createBetData.setGameweek(
        mapperFactory.gamesMapperFactory().getGameweekMapper().transform(obj.getGameweekEntity()));

    return createBetData;
  }
}
