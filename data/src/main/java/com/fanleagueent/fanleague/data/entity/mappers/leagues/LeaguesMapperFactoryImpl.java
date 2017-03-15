package com.fanleagueent.fanleague.data.entity.mappers.leagues;

import com.fanleagueent.fanleague.data.entity.entities.leagues.LeagueAdminDataEntity;
import com.fanleagueent.fanleague.data.entity.entities.leagues.LeagueDataEntity;
import com.fanleagueent.fanleague.data.entity.entities.leagues.LeagueEntity;
import com.fanleagueent.fanleague.data.entity.entities.leagues.LeagueMemberDataEntity;
import com.fanleagueent.fanleague.data.entity.entities.leagues.LeagueMemberEntity;
import com.fanleagueent.fanleague.data.entity.entities.leagues.LeagueMessagesDataEntity;
import com.fanleagueent.fanleague.data.entity.entities.leagues.LeaguesDataEntity;
import com.fanleagueent.fanleague.data.entity.entities.leagues.SimpleLeagueMemberDataEntity;
import com.fanleagueent.fanleague.data.entity.entities.leagues.SimpleLeagueMemberEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.data.entity.mappers.MapperFactory;
import com.fanleagueent.fanleague.domain.models.leagues.League;
import com.fanleagueent.fanleague.domain.models.leagues.LeagueAdminData;
import com.fanleagueent.fanleague.domain.models.leagues.LeagueData;
import com.fanleagueent.fanleague.domain.models.leagues.LeagueMember;
import com.fanleagueent.fanleague.domain.models.leagues.LeagueMemberData;
import com.fanleagueent.fanleague.domain.models.leagues.LeagueMessagesData;
import com.fanleagueent.fanleague.domain.models.leagues.LeaguesData;
import com.fanleagueent.fanleague.domain.models.leagues.SimpleLeagueMember;
import com.fanleagueent.fanleague.domain.models.leagues.SimpleLeagueMemberData;
import java.util.List;

/**
 * Created by Artem Getman on 14.03.17.
 * a.e.getman@gmail.com
 */

public class LeaguesMapperFactoryImpl implements LeaguesMapperFactory {

  private MapperFactory mapperFactory;

  public LeaguesMapperFactoryImpl(MapperFactory mapperFactory) {
    this.mapperFactory = mapperFactory;
  }

  @Override public Mapper<LeagueAdminDataEntity, LeagueAdminData> getLeagueAdminDataMapper() {
    return new LeagueAdminDataMapper(this);
  }

  @Override public Mapper<LeagueDataEntity, LeagueData> getLeagueDataMapper() {
    return new LeagueDataMapper(this);
  }

  @Override public Mapper<LeagueEntity, League> getLeagueMapper() {
    return new LeagueMapper(mapperFactory);
  }

  @Override public Mapper<List<LeagueEntity>, List<League>> getLeagueListMapper() {
    return new LeagueListMapper(this);
  }

  @Override public Mapper<LeagueMemberDataEntity, LeagueMemberData> getLeagueMemberDataMapper() {
    return new LeagueMemberDataMapper(this);
  }

  @Override public Mapper<LeagueMemberEntity, LeagueMember> getLeagueMemberMapper() {
    return new LeagueMemberMapper(mapperFactory);
  }

  @Override
  public Mapper<List<LeagueMemberEntity>, List<LeagueMember>> getLeagueMemberListMapper() {
    return new LeagueMemberListMapper(this);
  }

  @Override
  public Mapper<LeagueMessagesDataEntity, LeagueMessagesData> getLeagueMessagesDataMapper() {
    return new LeagueMessagesDataMapper(mapperFactory);
  }

  @Override public Mapper<LeaguesDataEntity, LeaguesData> getLeaguesDataMapper() {
    return new LeaguesDataMapper(this);
  }

  @Override
  public Mapper<SimpleLeagueMemberDataEntity, SimpleLeagueMemberData> getSimpleLeaguesMemberDataMapper() {
    return new SimpleLeaguesMemberDataMapper(this);
  }

  @Override
  public Mapper<SimpleLeagueMemberEntity, SimpleLeagueMember> getSimpleLeaguesMemberMapper() {
    return new SimpleLeaguesMemberMapper();
  }

  @Override
  public Mapper<List<SimpleLeagueMemberEntity>, List<SimpleLeagueMember>> getSimpleLeaguesMemberListMapper() {
    return new SimpleLeaguesMemberListMapper(this);
  }
}
