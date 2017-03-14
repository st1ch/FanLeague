package com.fanleagueent.fanleague.data.entity.mappers.leagues;

import com.fanleagueent.fanleague.data.entity.entities.leagues.SimpleLeagueMemberEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.leagues.SimpleLeagueMember;

/**
 * Created by Artem Getman on 14.03.17.
 * a.e.getman@gmail.com
 */

public class SimpleLeaguesMemberMapper
    implements Mapper<SimpleLeagueMemberEntity, SimpleLeagueMember> {

  @Override public SimpleLeagueMember transform(SimpleLeagueMemberEntity obj) {
    SimpleLeagueMember simpleLeagueMember = new SimpleLeagueMember();

    simpleLeagueMember.setId(obj.getId());
    simpleLeagueMember.setAdmin(obj.isAdmin());
    simpleLeagueMember.setOwner(obj.isOwner());
    simpleLeagueMember.setDisplayName(obj.getDisplayName());

    return simpleLeagueMember;
  }
}
