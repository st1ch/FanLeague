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

public interface LeaguesMapperFactory {
  Mapper<LeagueAdminDataEntity, LeagueAdminData> getLeagueAdminDataMapper();

  Mapper<LeagueDataEntity, LeagueData> getLeagueDataMapper();

  Mapper<LeagueEntity, League> getLeagueMapper();

  Mapper<List<LeagueEntity>, List<League>> getLeagueListMapper();

  Mapper<LeagueMemberDataEntity, LeagueMemberData> getLeagueMemberDataMapper();

  Mapper<LeagueMemberEntity, LeagueMember> getLeagueMemberMapper();

  Mapper<List<LeagueMemberEntity>, List<LeagueMember>> getLeagueMemberListMapper();

  Mapper<LeagueMessagesDataEntity, LeagueMessagesData> getLeagueMessagesDataMapper();

  Mapper<LeaguesDataEntity, LeaguesData> getLeaguesDataMapper();

  Mapper<SimpleLeagueMemberDataEntity, SimpleLeagueMemberData> getSimpleLeaguesMemberDataMapper();

  Mapper<SimpleLeagueMemberEntity, SimpleLeagueMember> getSimpleLeaguesMemberMapper();

  Mapper<List<SimpleLeagueMemberEntity>, List<SimpleLeagueMember>> getSimpleLeaguesMemberListMapper();
}
