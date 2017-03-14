package com.fanleagueent.fanleague.data.entity.mappers.leagues;

import com.fanleagueent.fanleague.data.entity.entities.leagues.SimpleLeagueMemberDataEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.leagues.SimpleLeagueMemberData;

/**
 * Created by Artem Getman on 14.03.17.
 * a.e.getman@gmail.com
 */

public class SimpleLeaguesMemberDataMapper
    implements Mapper<SimpleLeagueMemberDataEntity, SimpleLeagueMemberData> {

  private LeaguesMapperFactory leaguesMapperFactory;

  public SimpleLeaguesMemberDataMapper(LeaguesMapperFactory leaguesMapperFactory) {
    this.leaguesMapperFactory = leaguesMapperFactory;
  }

  @Override public SimpleLeagueMemberData transform(SimpleLeagueMemberDataEntity obj) {
    SimpleLeagueMemberData simpleLeagueMemberData = new SimpleLeagueMemberData();

    simpleLeagueMemberData.setCount(obj.getCount());
    simpleLeagueMemberData.setSimpleLeagueMemberEntities(
        leaguesMapperFactory.getSimpleLeaguesMemberListMapper()
            .transform(obj.getLeagueMembersList()));

    return simpleLeagueMemberData;
  }
}
