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
import com.fanleagueent.fanleague.data.entity.mappers.MapperFactory;
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

public class GamesMapperFactoryImpl implements GamesMapperFactory {

  private MapperFactory mapperFactory;

  public GamesMapperFactoryImpl(MapperFactory mapperFactory) {
    this.mapperFactory = mapperFactory;
  }

  @Override public Mapper<BetEntity, Bet> getBetMapper() {
    return new BetMapper();
  }

  @Override public Mapper<BetRateEntity, BetRate> getBetRateMapper() {
    return new BetRateMapper();
  }

  @Override public Mapper<List<BetRateEntity>, List<BetRate>> getBetRateListMapper() {
    return new BetRateListMapper(this);
  }

  @Override public Mapper<CreateBetDataEntity, CreateBetData> getCreateBetDataMapper() {
    return new CreateBetDataMapper(mapperFactory);
  }

  @Override public Mapper<CurrentBetDataEntity, CurrentBetData> getCurrentBetDataMapper() {
    return new CurrentBetDataMapper(this);
  }

  @Override public Mapper<ExpertEntity, Expert> getExpertMapper() {
    return new ExpertMapper(mapperFactory);
  }

  @Override public Mapper<GameTeamEntity, GameTeam> getGameTeamMapper() {
    return new GameTeamMapper();
  }

  @Override public Mapper<GameweekEntity, Gameweek> getGameweekMapper() {
    return new GameweekMapper(this);
  }

  @Override public Mapper<GetTeamsDataEntity, GetTeamsData> getGetTeamsDataMapper() {
    return new GetTeamsDataMapper(this);
  }

  @Override public Mapper<HistoryBetEntity, HistoryBet> getHistoryBetMapper() {
    return new HistoryBetMapper(this);
  }

  @Override public Mapper<LuckyDipBetEntity, LuckyDipBet> getLuckyDipBetMapper() {
    return new LuckyDipBetMapper();
  }

  @Override public Mapper<MatchEntity, Match> getMatchMapper() {
    return new MatchMapper(this);
  }

  @Override public Mapper<List<MatchEntity>, List<Match>> getMatchListMapper() {
    return new MatchListMapper(this);
  }

  @Override public Mapper<MatchHistoryEntity, MatchHistory> getMatchHistoryMapper() {
    return new MatchHistoryMapper();
  }

  @Override
  public Mapper<List<MatchHistoryEntity>, List<MatchHistory>> getMatchHistoryListMapper() {
    return new MatchHistoryListMapper(this);
  }

  @Override
  public Mapper<PlayHistoryTypeDataEntity, PlayHistoryTypeData> getPlayHistoryTypeDataMapper() {
    return new PlayHistoryTypeDataMapper(mapperFactory);
  }

  @Override public Mapper<PlayTeamEntity, PlayTeam> getPlayTeamMapper() {
    return new PlayTeamMapper(mapperFactory);
  }

  @Override public Mapper<List<PlayTeamEntity>, List<PlayTeam>> getPlayTeamListMapper() {
    return new PlayTeamListMapper(this);
  }

  @Override public Mapper<PrizePotEntity, PrizePot> getPrizePotMapper() {
    return new PrizePotMapper(this);
  }

  @Override public Mapper<PrizesEntity, Prizes> getPrizesMapper() {
    return new PrizesMapper();
  }

  @Override public Mapper<PunditEntity, Pundit> getPunditMapper() {
    return new PunditMapper(mapperFactory);
  }

  @Override public Mapper<List<PunditEntity>, List<Pundit>> getPunditListMapper() {
    return new PunditListMapper(this);
  }

  @Override
  public Mapper<PunditRecommendationEntity, PunditRecommendation> getPunditRecommendationMapper() {
    return new PunditRecommendationMapper();
  }

  @Override
  public Mapper<List<PunditRecommendationEntity>, List<PunditRecommendation>> getPunditRecommendationListMapper() {
    return new PunditRecommendationListMapper(this);
  }

  @Override public Mapper<PunditsDataEntity, PunditsData> getPunditsDataMapper() {
    return new PunditsDataMapper(this);
  }

  @Override public Mapper<PunditSimpleEntity, PunditSimple> getPunditsSimpleMapper() {
    return new PunditSimpleMapper(mapperFactory);
  }

  @Override public Mapper<ResultEntity, Result> getResultMapper() {
    return new ResultMapper(this);
  }

  @Override public Mapper<ScoreEntity, Score> getScoreMapper() {
    return new ScoreMapper();
  }

  @Override public Mapper<StandingsDataEntity, StandingsData> getStandingsDataMapper() {
    return new StandingsDataMapper(this);
  }

  @Override public Mapper<StandingsTeamEntity, StandingsTeam> getStandingsTeamMapper() {
    return new StandingsTeamMapper();
  }

  @Override
  public Mapper<List<StandingsTeamEntity>, List<StandingsTeam>> getStandingsTeamListMapper() {
    return new StandingsTeamListMapper(this);
  }

  @Override public Mapper<TournamentEntity, Tournament> getTournamentMapper() {
    return new TournamentMapper();
  }

  @Override public Mapper<WinnersEntity, Winners> getWinnersMapper() {
    return new WinnersMapper();
  }
}
