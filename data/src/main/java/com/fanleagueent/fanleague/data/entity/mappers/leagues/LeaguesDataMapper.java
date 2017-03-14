package com.fanleagueent.fanleague.data.entity.mappers.leagues;

import com.fanleagueent.fanleague.data.entity.entities.leagues.LeaguesDataEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.leagues.LeaguesData;

/**
 * Created by Artem Getman on 14.03.17.
 * a.e.getman@gmail.com
 */

public class LeaguesDataMapper implements Mapper<LeaguesDataEntity, LeaguesData> {

  private LeaguesMapperFactory leaguesMapperFactory;

  public LeaguesDataMapper(LeaguesMapperFactory leaguesMapperFactory) {
    this.leaguesMapperFactory = leaguesMapperFactory;
  }

  @Override public LeaguesData transform(LeaguesDataEntity obj) {
    LeaguesData leaguesData = new LeaguesData();

    leaguesData.setTotalCount(obj.getTotalCount());
    leaguesData.setLeaguesList(
        leaguesMapperFactory.getLeagueListMapper().transform(obj.getLeagueList()));

    return leaguesData;
  }
}
