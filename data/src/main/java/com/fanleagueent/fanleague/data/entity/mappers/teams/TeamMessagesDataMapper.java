package com.fanleagueent.fanleague.data.entity.mappers.teams;

import com.fanleagueent.fanleague.data.entity.entities.teams.TeamMessagesDataEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.data.entity.mappers.MapperFactory;
import com.fanleagueent.fanleague.domain.models.teams.TeamMessagesData;

/**
 * Created by Artem Getman on 16.03.17.
 * a.e.getman@gmail.com
 */

public class TeamMessagesDataMapper implements Mapper<TeamMessagesDataEntity, TeamMessagesData> {

  private MapperFactory mapperFactory;

  public TeamMessagesDataMapper(MapperFactory mapperFactory) {
    this.mapperFactory = mapperFactory;
  }

  @Override public TeamMessagesData transform(TeamMessagesDataEntity obj) {
    TeamMessagesData teamMessagesData = new TeamMessagesData();

    teamMessagesData.setUnreadCount(obj.getUnreadCount());
    teamMessagesData.setMessageList(mapperFactory.chatMapperFactory()
        .getMessageListMapper()
        .transform(obj.getMessageEntityList()));

    return teamMessagesData;
  }
}
