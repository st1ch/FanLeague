package com.fanleagueent.fanleague.data.entity.mappers.games;

import com.fanleagueent.fanleague.data.entity.entities.games.ScoreEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.games.Score;

/**
 * Created by Artem Getman on 14.03.17.
 * a.e.getman@gmail.com
 */

public class ScoreMapper implements Mapper<ScoreEntity, Score> {
  @Override public Score transform(ScoreEntity obj) {
    return new Score(obj.getHomeTeam(), obj.getAwayTeam());
  }
}
