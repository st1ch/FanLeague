package com.fanleagueent.fanleague.data.entity.mappers.locker_room;

import com.fanleagueent.fanleague.data.entity.entities.locker_room.CommunityItemEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.data.entity.mappers.MapperFactory;
import com.fanleagueent.fanleague.domain.models.locker_room.CommunityItem;

/**
 * Created by Artem Getman on 15.03.17.
 * a.e.getman@gmail.com
 */

public class CommunityItemMapper implements Mapper<CommunityItemEntity, CommunityItem> {

  private MapperFactory mapperFactory;

  public CommunityItemMapper(MapperFactory mapperFactory) {
    this.mapperFactory = mapperFactory;
  }

  @Override public CommunityItem transform(CommunityItemEntity obj) {
    CommunityItem communityItem = new CommunityItem();

    communityItem.setId(obj.getId());
    communityItem.setName(obj.getName());
    communityItem.setSlug(obj.getSlug());
    communityItem.setAvatar(
        mapperFactory.userMapperFactory().getAvatarMapper().transform(obj.getAvatarEntity()));

    return communityItem;
  }
}
