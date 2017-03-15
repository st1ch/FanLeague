package com.fanleagueent.fanleague.data.entity.mappers;

import com.fanleagueent.fanleague.data.entity.mappers.activity_history.ActivityHistoryMapperFactory;
import com.fanleagueent.fanleague.data.entity.mappers.authorization.AuthorizationDataMapper;
import com.fanleagueent.fanleague.data.entity.mappers.chat.ChatMapperFactory;
import com.fanleagueent.fanleague.data.entity.mappers.friends.FriendMapperFactory;
import com.fanleagueent.fanleague.data.entity.mappers.games.GamesMapperFactory;
import com.fanleagueent.fanleague.data.entity.mappers.user.UserMapperFactory;

public interface MapperFactory {

  UserMapperFactory userMapperFactory();

  AuthorizationDataMapper authorizationMapper();

  ActivityHistoryMapperFactory activityHistoryMapperFactory();

  ChatMapperFactory chatMapperFactory();

  FriendMapperFactory friendMapperFactory();

  GamesMapperFactory gamesMapperFactory();

  RecruitingMapperFactory recruitingMapperFactory();

}
