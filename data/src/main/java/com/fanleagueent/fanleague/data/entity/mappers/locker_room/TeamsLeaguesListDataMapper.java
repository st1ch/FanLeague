package com.fanleagueent.fanleague.data.entity.mappers.locker_room;

import com.fanleagueent.fanleague.data.entity.entities.locker_room.TeamsLeaguesListDataEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.locker_room.TeamsLeaguesListData;

/**
 * Created by Artem Getman on 15.03.17.
 * a.e.getman@gmail.com
 */

public class TeamsLeaguesListDataMapper
    implements Mapper<TeamsLeaguesListDataEntity, TeamsLeaguesListData> {

  private LockerRoomMapperFactory lockerRoomMapperFactory;

  public TeamsLeaguesListDataMapper(LockerRoomMapperFactory lockerRoomMapperFactory) {
    this.lockerRoomMapperFactory = lockerRoomMapperFactory;
  }

  @Override public TeamsLeaguesListData transform(TeamsLeaguesListDataEntity obj) {
    TeamsLeaguesListData teamsLeaguesListData = new TeamsLeaguesListData();

    teamsLeaguesListData.setTeamsList(
        lockerRoomMapperFactory.getCommunityItemListMapper().transform(obj.getTeamsList()));
    teamsLeaguesListData.setLeaguesList(
        lockerRoomMapperFactory.getCommunityItemListMapper().transform(obj.getLeaguesList()));

    return teamsLeaguesListData;
  }
}
