package com.fanleagueent.fanleague.data.entity.mappers.leagues;

import com.fanleagueent.fanleague.data.entity.entities.leagues.LeagueAdminDataEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.leagues.LeagueAdminData;

/**
 * Created by Artem Getman on 14.03.17.
 * a.e.getman@gmail.com
 */

public class LeagueAdminDataMapper implements Mapper<LeagueAdminDataEntity, LeagueAdminData> {

  private LeaguesMapperFactory leaguesMapperFactory;

  public LeagueAdminDataMapper(LeaguesMapperFactory leaguesMapperFactory) {
    this.leaguesMapperFactory = leaguesMapperFactory;
  }

  @Override public LeagueAdminData transform(LeagueAdminDataEntity obj) {
    LeagueAdminData leagueAdminData = new LeagueAdminData();

    leagueAdminData.setLeagueMemberEntities(
        leaguesMapperFactory.getLeagueMemberListMapper().transform(obj.getAdminsList()));

    return leagueAdminData;
  }
}
