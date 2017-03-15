package com.fanleagueent.fanleague.data.entity.mappers.leagues;

import com.fanleagueent.fanleague.data.entity.entities.leagues.LeagueMemberDataEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.leagues.LeagueMemberData;

/**
 * Created by Artem Getman on 14.03.17.
 * a.e.getman@gmail.com
 */

public class LeagueMemberDataMapper implements Mapper<LeagueMemberDataEntity, LeagueMemberData> {

  private LeaguesMapperFactory leaguesMapperFactory;

  public LeagueMemberDataMapper(LeaguesMapperFactory leaguesMapperFactory) {
    this.leaguesMapperFactory = leaguesMapperFactory;
  }

  @Override public LeagueMemberData transform(LeagueMemberDataEntity obj) {
    LeagueMemberData leagueMemberData = new LeagueMemberData();

    leagueMemberData.setCount(obj.getCount());
    leagueMemberData.setLeagueMemberEntities(
        leaguesMapperFactory.getLeagueMemberListMapper().transform(obj.getTeamMembersList()));

    return leagueMemberData;
  }
}
