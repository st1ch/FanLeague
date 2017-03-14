package com.fanleagueent.fanleague.data.entity.mappers.games;

import com.fanleagueent.fanleague.data.entity.entities.games.MatchEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.games.Match;

/**
 * Created by Artem Getman on 14.03.17.
 * a.e.getman@gmail.com
 */

public class MatchMapper implements Mapper<MatchEntity, Match> {

  private GamesMapperFactory gamesMapperFactory;

  public MatchMapper(GamesMapperFactory gamesMapperFactory) {
    this.gamesMapperFactory = gamesMapperFactory;
  }

  @Override public Match transform(MatchEntity obj) {
    Match match = new Match();

    match.setId(obj.getId());
    match.setDatetime(obj.getDatetime());
    match.setUpdatedAt(obj.getUpdatedAt());
    match.setVenue(obj.getVenue());
    match.setWeek(obj.getWeek());
    match.setResult(gamesMapperFactory.getResultMapper().transform(obj.getResultEntity()));
    match.setBetRates(
        gamesMapperFactory.getBetRateListMapper().transform(obj.getBetRateEntities()));
    match.setHomeTeam(gamesMapperFactory.getGameTeamMapper().transform(obj.getHomeTeam()));
    match.setAwayTeam(gamesMapperFactory.getGameTeamMapper().transform(obj.getAwayTeam()));
    match.setTournament(
        gamesMapperFactory.getTournamentMapper().transform(obj.getTournamentEntity()));

    return match;
  }
}
