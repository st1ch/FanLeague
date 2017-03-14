package com.fanleagueent.fanleague.data.entity.mappers.games;

import com.fanleagueent.fanleague.data.entity.entities.games.BetEntity;
import com.fanleagueent.fanleague.data.entity.entities.games.BetRateEntity;
import com.fanleagueent.fanleague.data.entity.entities.games.CreateBetDataEntity;
import com.fanleagueent.fanleague.data.entity.entities.games.CurrentBetDataEntity;
import com.fanleagueent.fanleague.data.entity.entities.games.ExpertEntity;
import com.fanleagueent.fanleague.data.entity.entities.games.GameTeamEntity;
import com.fanleagueent.fanleague.data.entity.entities.games.GameweekEntity;
import com.fanleagueent.fanleague.data.entity.entities.games.GetTeamsDataEntity;
import com.fanleagueent.fanleague.data.entity.entities.games.HistoryBetEntity;
import com.fanleagueent.fanleague.data.entity.entities.games.LuckyDipBetEntity;
import com.fanleagueent.fanleague.data.entity.entities.games.MatchEntity;
import com.fanleagueent.fanleague.data.entity.entities.games.MatchHistoryEntity;
import com.fanleagueent.fanleague.data.entity.entities.games.PlayHistoryTypeDataEntity;
import com.fanleagueent.fanleague.data.entity.entities.games.PlayTeamEntity;
import com.fanleagueent.fanleague.data.entity.entities.games.PrizePotEntity;
import com.fanleagueent.fanleague.data.entity.entities.games.PrizesEntity;
import com.fanleagueent.fanleague.data.entity.entities.games.PunditEntity;
import com.fanleagueent.fanleague.data.entity.entities.games.PunditRecommendationEntity;
import com.fanleagueent.fanleague.data.entity.entities.games.PunditSimpleEntity;
import com.fanleagueent.fanleague.data.entity.entities.games.PunditsDataEntity;
import com.fanleagueent.fanleague.data.entity.entities.games.ResultEntity;
import com.fanleagueent.fanleague.data.entity.entities.games.ScoreEntity;
import com.fanleagueent.fanleague.data.entity.entities.games.StandingsDataEntity;
import com.fanleagueent.fanleague.data.entity.entities.games.StandingsTeamEntity;
import com.fanleagueent.fanleague.data.entity.entities.games.TournamentEntity;
import com.fanleagueent.fanleague.data.entity.entities.games.WinnersEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.games.Bet;
import com.fanleagueent.fanleague.domain.models.games.BetRate;
import com.fanleagueent.fanleague.domain.models.games.CreateBetData;
import com.fanleagueent.fanleague.domain.models.games.CurrentBetData;
import com.fanleagueent.fanleague.domain.models.games.Expert;
import com.fanleagueent.fanleague.domain.models.games.GameTeam;
import com.fanleagueent.fanleague.domain.models.games.Gameweek;
import com.fanleagueent.fanleague.domain.models.games.GetTeamsData;
import com.fanleagueent.fanleague.domain.models.games.HistoryBet;
import com.fanleagueent.fanleague.domain.models.games.LuckyDipBet;
import com.fanleagueent.fanleague.domain.models.games.Match;
import com.fanleagueent.fanleague.domain.models.games.MatchHistory;
import com.fanleagueent.fanleague.domain.models.games.PlayHistoryTypeData;
import com.fanleagueent.fanleague.domain.models.games.PlayTeam;
import com.fanleagueent.fanleague.domain.models.games.PrizePot;
import com.fanleagueent.fanleague.domain.models.games.Prizes;
import com.fanleagueent.fanleague.domain.models.games.Pundit;
import com.fanleagueent.fanleague.domain.models.games.PunditRecommendation;
import com.fanleagueent.fanleague.domain.models.games.PunditSimple;
import com.fanleagueent.fanleague.domain.models.games.PunditsData;
import com.fanleagueent.fanleague.domain.models.games.Result;
import com.fanleagueent.fanleague.domain.models.games.Score;
import com.fanleagueent.fanleague.domain.models.games.StandingsData;
import com.fanleagueent.fanleague.domain.models.games.StandingsTeam;
import com.fanleagueent.fanleague.domain.models.games.Tournament;
import com.fanleagueent.fanleague.domain.models.games.Winners;
import java.util.List;

/**
 * Created by Artem Getman on 14.03.17.
 * a.e.getman@gmail.com
 */

public interface GamesMapperFactory {
  Mapper<BetEntity, Bet> getBetMapper();

  Mapper<BetRateEntity, BetRate> getBetRateMapper();

  Mapper<List<BetRateEntity>, List<BetRate>> getBetRateListMapper();

  Mapper<CreateBetDataEntity, CreateBetData> getCreateBetDataMapper();

  Mapper<CurrentBetDataEntity, CurrentBetData> getCurrentBetDataMapper();

  Mapper<ExpertEntity, Expert> getExpertMapper();

  Mapper<GameTeamEntity, GameTeam> getGameTeamMapper();

  Mapper<GameweekEntity, Gameweek> getGameweekMapper();

  Mapper<GetTeamsDataEntity, GetTeamsData> getGetTeamsDataMapper();

  Mapper<HistoryBetEntity, HistoryBet> getHistoryBetMapper();

  Mapper<LuckyDipBetEntity, LuckyDipBet> getLuckyDipBetMapper();

  Mapper<MatchEntity, Match> getMatchMapper();

  Mapper<List<MatchEntity>, List<Match>> getMatchListMapper();

  Mapper<MatchHistoryEntity, MatchHistory> getMatchHistoryMapper();

  Mapper<List<MatchHistoryEntity>, List<MatchHistory>> getMatchHistoryListMapper();

  Mapper<PlayHistoryTypeDataEntity, PlayHistoryTypeData> getPlayHistoryTypeDataMapper();

  Mapper<PlayTeamEntity, PlayTeam> getPlayTeamMapper();

  Mapper<List<PlayTeamEntity>, List<PlayTeam>> getPlayTeamListMapper();

  Mapper<PrizePotEntity, PrizePot> getPrizePotMapper();

  Mapper<PrizesEntity, Prizes> getPrizesMapper();

  Mapper<PunditEntity, Pundit> getPunditMapper();

  Mapper<List<PunditEntity>, List<Pundit>> getPunditListMapper();

  Mapper<PunditRecommendationEntity, PunditRecommendation> getPunditRecommendationMapper();

  Mapper<List<PunditRecommendationEntity>, List<PunditRecommendation>> getPunditRecommendationListMapper();

  Mapper<PunditsDataEntity, PunditsData> getPunditsDataMapper();

  Mapper<PunditSimpleEntity, PunditSimple> getPunditsSimpleMapper();

  Mapper<ResultEntity, Result> getResultMapper();

  Mapper<ScoreEntity, Score> getScoreMapper();

  Mapper<StandingsDataEntity, StandingsData> getStandingsDataMapper();

  Mapper<StandingsTeamEntity, StandingsTeam> getStandingsTeamMapper();

  Mapper<List<StandingsTeamEntity>, List<StandingsTeam>> getStandingsTeamListMapper();

  Mapper<TournamentEntity, Tournament> getTournamentMapper();

  Mapper<WinnersEntity, Winners> getWinnersMapper();
}
