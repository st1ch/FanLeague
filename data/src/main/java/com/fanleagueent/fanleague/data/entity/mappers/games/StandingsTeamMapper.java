package com.fanleagueent.fanleague.data.entity.mappers.games;

import com.fanleagueent.fanleague.data.entity.entities.games.StandingsTeamEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.games.StandingsTeam;

/**
 * Created by Artem Getman on 14.03.17.
 * a.e.getman@gmail.com
 */

public class StandingsTeamMapper implements Mapper<StandingsTeamEntity, StandingsTeam> {

  @Override public StandingsTeam transform(StandingsTeamEntity obj) {
    StandingsTeam standingsTeam = new StandingsTeam();

    standingsTeam.setTeamId(obj.getTeamId());
    standingsTeam.setTeamName(obj.getTeamName());
    standingsTeam.setRank(obj.getRank());
    standingsTeam.setPoints(obj.getPoints());
    standingsTeam.setMatchesPlayed(obj.getMatchesPlayed());
    standingsTeam.setMatchesWon(obj.getMatchesWon());
    standingsTeam.setMatchesDrawn(obj.getMatchesDrawn());
    standingsTeam.setMatchesLost(obj.getMatchesLost());
    standingsTeam.setGoalDifference(obj.getGoalDifference());

    return standingsTeam;
  }
}
