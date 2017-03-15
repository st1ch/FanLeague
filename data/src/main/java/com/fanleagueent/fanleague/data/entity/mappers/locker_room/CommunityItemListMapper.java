package com.fanleagueent.fanleague.data.entity.mappers.locker_room;

import com.fanleagueent.fanleague.data.entity.entities.locker_room.CommunityItemEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.locker_room.CommunityItem;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Artem Getman on 15.03.17.
 * a.e.getman@gmail.com
 */

public class CommunityItemListMapper
    implements Mapper<List<CommunityItemEntity>, List<CommunityItem>> {

  private LockerRoomMapperFactory lockerRoomMapperFactory;

  public CommunityItemListMapper(LockerRoomMapperFactory lockerRoomMapperFactory) {
    this.lockerRoomMapperFactory = lockerRoomMapperFactory;
  }

  @Override public List<CommunityItem> transform(List<CommunityItemEntity> obj) {
    List<CommunityItem> communityItems = new ArrayList<>();

    for (CommunityItemEntity entity : obj) {
      communityItems.add(lockerRoomMapperFactory.getCommunityItemMapper().transform(entity));
    }

    return communityItems;
  }
}
