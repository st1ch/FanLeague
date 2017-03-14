package com.fanleagueent.fanleague.data.entity.mappers.leagues;

import com.fanleagueent.fanleague.data.entity.entities.leagues.LeagueMessagesDataEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.data.entity.mappers.MapperFactory;
import com.fanleagueent.fanleague.domain.models.leagues.LeagueMessagesData;

/**
 * Created by Artem Getman on 14.03.17.
 * a.e.getman@gmail.com
 */

public class LeagueMessagesDataMapper
    implements Mapper<LeagueMessagesDataEntity, LeagueMessagesData> {

  private MapperFactory mapperFactory;

  public LeagueMessagesDataMapper(MapperFactory mapperFactory) {
    this.mapperFactory = mapperFactory;
  }

  @Override public LeagueMessagesData transform(LeagueMessagesDataEntity obj) {
    LeagueMessagesData leagueMessagesData = new LeagueMessagesData();

    leagueMessagesData.setUnreadCount(obj.getUnreadCount());
    leagueMessagesData.setMessageList(mapperFactory.chatMapperFactory()
        .getMessageListMapper()
        .transform(obj.getMessageEntityList()));

    return leagueMessagesData;
  }
}
