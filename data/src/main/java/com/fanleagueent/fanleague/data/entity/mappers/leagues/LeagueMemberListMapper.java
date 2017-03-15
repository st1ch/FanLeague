package com.fanleagueent.fanleague.data.entity.mappers.leagues;

import com.fanleagueent.fanleague.data.entity.entities.leagues.LeagueMemberEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.leagues.LeagueMember;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Artem Getman on 14.03.17.
 * a.e.getman@gmail.com
 */

public class LeagueMemberListMapper
    implements Mapper<List<LeagueMemberEntity>, List<LeagueMember>> {

  private LeaguesMapperFactory leaguesMapperFactory;

  public LeagueMemberListMapper(LeaguesMapperFactory leaguesMapperFactory) {
    this.leaguesMapperFactory = leaguesMapperFactory;
  }

  @Override public List<LeagueMember> transform(List<LeagueMemberEntity> obj) {
    List<LeagueMember> leagueMembers = new ArrayList<>();

    for (LeagueMemberEntity entity : obj) {
      leagueMembers.add(leaguesMapperFactory.getLeagueMemberMapper().transform(entity));
    }

    return leagueMembers;
  }
}
