package com.fanleagueent.fanleague.data.entity.mappers.games;

import com.fanleagueent.fanleague.data.entity.entities.games.TournamentEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.games.Tournament;

/**
 * Created by Artem Getman on 14.03.17.
 * a.e.getman@gmail.com
 */

public class TournamentMapper implements Mapper<TournamentEntity, Tournament> {

  @Override public Tournament transform(TournamentEntity obj) {
    Tournament tournament = new Tournament();

    tournament.setId(obj.getId());
    tournament.setName(obj.getName());

    return tournament;
  }
}
