package com.fanleagueent.fanleague.data.entity.mappers.leagues;

import com.fanleagueent.fanleague.data.entity.entities.leagues.LeagueDataEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.leagues.LeagueData;

/**
 * Created by Artem Getman on 14.03.17.
 * a.e.getman@gmail.com
 */

public class LeagueDataMapper implements Mapper<LeagueDataEntity, LeagueData> {

  private LeaguesMapperFactory leaguesMapperFactory;

  public LeagueDataMapper(LeaguesMapperFactory leaguesMapperFactory) {
    this.leaguesMapperFactory = leaguesMapperFactory;
  }

  @Override public LeagueData transform(LeagueDataEntity obj) {
    LeagueData leagueData = new LeagueData();

    leagueData.setLeague(leaguesMapperFactory.getLeagueMapper().transform(obj.getLeagueEntity()));
    leagueData.setThreadId(obj.getThreadId());
    leagueData.setLeagueMessagesData(leaguesMapperFactory.getLeagueMessagesDataMapper()
        .transform(obj.getLeagueMessagesDataEntity()));

    return leagueData;
  }
}
