package com.fanleagueent.fanleague.data.entity.mappers.games;

import com.fanleagueent.fanleague.data.entity.entities.games.GameTeamEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.games.GameTeam;

/**
 * Created by Artem Getman on 14.03.17.
 * a.e.getman@gmail.com
 */

public class GameTeamMapper implements Mapper<GameTeamEntity, GameTeam> {

  @Override public GameTeam transform(GameTeamEntity obj) {
    GameTeam gameTeam = new GameTeam();

    gameTeam.setId(obj.getId());
    gameTeam.setName(obj.getName());
    gameTeam.setUpdatedAt(obj.getUpdatedAt());

    return gameTeam;
  }
}
