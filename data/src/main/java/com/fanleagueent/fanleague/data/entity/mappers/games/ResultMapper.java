package com.fanleagueent.fanleague.data.entity.mappers.games;

import com.fanleagueent.fanleague.data.entity.entities.games.ResultEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.games.Result;

/**
 * Created by Artem Getman on 14.03.17.
 * a.e.getman@gmail.com
 */

public class ResultMapper implements Mapper<ResultEntity, Result> {

  private GamesMapperFactory gamesMapperFactory;

  public ResultMapper(GamesMapperFactory gamesMapperFactory) {
    this.gamesMapperFactory = gamesMapperFactory;
  }

  @Override public Result transform(ResultEntity obj) {
    Result result = new Result();

    result.setScore(gamesMapperFactory.getScoreMapper().transform(obj.getScoreEntity()));
    result.setAwayWins(obj.isAwayWins());
    result.setHomeWins(obj.isHomeWins());
    result.setDraw(obj.isDraw());

    return result;
  }
}
