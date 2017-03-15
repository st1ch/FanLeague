package com.fanleagueent.fanleague.data.entity.mappers.recruiting;

import com.fanleagueent.fanleague.data.entity.entities.recruiting.ClubEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.recruiting.Club;

/**
 * Created by alexeyverbitskiy on 3/14/17.
 */

public class ClubMapper implements Mapper<ClubEntity, Club> {


  public ClubMapper() {
  }

  @Override public Club transform(ClubEntity obj) {
    Club club = new Club();
    club.setId(obj.getId());
    club.setName(obj.getName());
    club.setUpdatedAt(obj.getUpdatedAt());
    club.setAdminTeamId(obj.getAdminTeamId());

    return club;
  }
}
