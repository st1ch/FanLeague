package com.fanleagueent.fanleague.data.entity.mappers.games;

import com.fanleagueent.fanleague.data.entity.entities.games.GameweekEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.games.Gameweek;

/**
 * Created by Artem Getman on 14.03.17.
 * a.e.getman@gmail.com
 */

public class GameweekMapper implements Mapper<GameweekEntity, Gameweek> {

  private GamesMapperFactory gamesMapperFactory;

  public GameweekMapper(GamesMapperFactory gamesMapperFactory) {
    this.gamesMapperFactory = gamesMapperFactory;
  }

  @Override public Gameweek transform(GameweekEntity obj) {
    Gameweek gameweek = new Gameweek();

    gameweek.setId(obj.getId());
    gameweek.setBetClosingTime(obj.getBetClosingTime());
    gameweek.setMatchEntities(
        gamesMapperFactory.getMatchListMapper().transform(obj.getMatchEntities()));
    gameweek.setPrizePot(gamesMapperFactory.getPrizePotMapper().transform(obj.getPrizePotEntity()));
    gameweek.setWeek(obj.getWeek());
    gameweek.setMatchday(obj.isMatchday());
    gameweek.setClosed(obj.isClosed());
    gameweek.setUserCanManipulateBet(obj.isUserCanManipulateBet());

    return gameweek;
  }
}
