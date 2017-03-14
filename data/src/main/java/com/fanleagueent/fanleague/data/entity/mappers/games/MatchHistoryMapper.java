package com.fanleagueent.fanleague.data.entity.mappers.games;

import com.fanleagueent.fanleague.data.entity.entities.games.MatchHistoryEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.games.MatchHistory;

/**
 * Created by Artem Getman on 14.03.17.
 * a.e.getman@gmail.com
 */

public class MatchHistoryMapper implements Mapper<MatchHistoryEntity, MatchHistory> {

  @Override public MatchHistory transform(MatchHistoryEntity obj) {
    MatchHistory matchHistory = new MatchHistory();

    matchHistory.setDate(obj.getDate());
    matchHistory.setAwayTeamName(obj.getAwayTeamName());
    matchHistory.setAwayTeamScore(obj.getAwayTeamScore());
    matchHistory.setHomeTeamName(obj.getHomeTeamName());
    matchHistory.setHomeTeamScore(obj.getHomeTeamScore());

    return matchHistory;
  }
}
