package com.fanleagueent.fanleague.data.entity.mappers.leagues;

import com.fanleagueent.fanleague.data.entity.entities.leagues.SimpleLeagueMemberEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.leagues.SimpleLeagueMember;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Artem Getman on 14.03.17.
 * a.e.getman@gmail.com
 */

public class SimpleLeaguesMemberListMapper
    implements Mapper<List<SimpleLeagueMemberEntity>, List<SimpleLeagueMember>> {

  private LeaguesMapperFactory leaguesMapperFactory;

  public SimpleLeaguesMemberListMapper(LeaguesMapperFactory leaguesMapperFactory) {
    this.leaguesMapperFactory = leaguesMapperFactory;
  }

  @Override public List<SimpleLeagueMember> transform(List<SimpleLeagueMemberEntity> obj) {
    List<SimpleLeagueMember> simpleLeagueMembers = new ArrayList<>();

    for (SimpleLeagueMemberEntity entity : obj) {
      simpleLeagueMembers.add(
          leaguesMapperFactory.getSimpleLeaguesMemberMapper().transform(entity));
    }

    return simpleLeagueMembers;
  }
}
