package com.fanleagueent.fanleague.data.entity.mappers.games;

import com.fanleagueent.fanleague.data.entity.entities.games.GetTeamsDataEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.games.GetTeamsData;

/**
 * Created by Artem Getman on 14.03.17.
 * a.e.getman@gmail.com
 */

public class GetTeamsDataMapper implements Mapper<GetTeamsDataEntity, GetTeamsData> {

  private GamesMapperFactory gamesMapperFactory;

  public GetTeamsDataMapper(GamesMapperFactory gamesMapperFactory) {
    this.gamesMapperFactory = gamesMapperFactory;
  }

  @Override public GetTeamsData transform(GetTeamsDataEntity obj) {
    GetTeamsData getTeamsData = new GetTeamsData();

    getTeamsData.setTotalCount(obj.getTotalCount());
    getTeamsData.setTeamsList(
        gamesMapperFactory.getPlayTeamListMapper().transform(obj.getTeamsList()));

    return getTeamsData;
  }
}
