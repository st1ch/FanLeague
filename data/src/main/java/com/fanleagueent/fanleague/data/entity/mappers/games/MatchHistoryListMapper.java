package com.fanleagueent.fanleague.data.entity.mappers.games;

import com.fanleagueent.fanleague.data.entity.entities.games.MatchHistoryEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.games.MatchHistory;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Artem Getman on 14.03.17.
 * a.e.getman@gmail.com
 */

public class MatchHistoryListMapper
    implements Mapper<List<MatchHistoryEntity>, List<MatchHistory>> {

  private GamesMapperFactory gamesMapperFactory;

  public MatchHistoryListMapper(GamesMapperFactory gamesMapperFactory) {
    this.gamesMapperFactory = gamesMapperFactory;
  }

  @Override public List<MatchHistory> transform(List<MatchHistoryEntity> obj) {
    List<MatchHistory> matchHistories = new ArrayList<>();

    for (MatchHistoryEntity matchEntity : obj) {
      matchHistories.add(gamesMapperFactory.getMatchHistoryMapper().transform(matchEntity));
    }

    return matchHistories;
  }
}
