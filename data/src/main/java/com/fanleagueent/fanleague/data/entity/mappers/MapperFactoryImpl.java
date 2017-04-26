package com.fanleagueent.fanleague.data.entity.mappers;

import com.fanleagueent.fanleague.data.entity.mappers.activity_history.ActivityHistoryMapperFactory;
import com.fanleagueent.fanleague.data.entity.mappers.activity_history.ActivityHistoryMapperFactoryImpl;
import com.fanleagueent.fanleague.data.entity.mappers.authorization.AuthorizationDataMapper;
import com.fanleagueent.fanleague.data.entity.mappers.chat.ChatMapperFactory;
import com.fanleagueent.fanleague.data.entity.mappers.chat.ChatMapperFactoryImpl;
import com.fanleagueent.fanleague.data.entity.mappers.friends.FriendMapperFactory;
import com.fanleagueent.fanleague.data.entity.mappers.friends.FriendMapperFactoryImpl;
import com.fanleagueent.fanleague.data.entity.mappers.games.GamesMapperFactory;
import com.fanleagueent.fanleague.data.entity.mappers.games.GamesMapperFactoryImpl;
import com.fanleagueent.fanleague.data.entity.mappers.pundits.PunditsMapperFactory;
import com.fanleagueent.fanleague.data.entity.mappers.pundits.PunditsMapperFactoryImpl;
import com.fanleagueent.fanleague.data.entity.mappers.recruiting.RecruitingMapperFactory;
import com.fanleagueent.fanleague.data.entity.mappers.recruiting.RecruitingMapperFactoryImpl;
import com.fanleagueent.fanleague.data.entity.mappers.leagues.LeaguesMapperFactory;
import com.fanleagueent.fanleague.data.entity.mappers.leagues.LeaguesMapperFactoryImpl;
import com.fanleagueent.fanleague.data.entity.mappers.locker_room.LockerRoomMapperFactory;
import com.fanleagueent.fanleague.data.entity.mappers.locker_room.LockerRoomMapperFactoryImpl;
import com.fanleagueent.fanleague.data.entity.mappers.teams.TeamsMapperFactory;
import com.fanleagueent.fanleague.data.entity.mappers.teams.TeamsMapperFactoryImpl;
import com.fanleagueent.fanleague.data.entity.mappers.user.UserMapperFactory;
import com.fanleagueent.fanleague.data.entity.mappers.user.UserMapperFactoryImpl;

public class MapperFactoryImpl implements MapperFactory {

  @Override public UserMapperFactory userMapperFactory() {
    return new UserMapperFactoryImpl(this);
  }

  @Override public AuthorizationDataMapper authorizationMapper() {
    return new AuthorizationDataMapper(this);
  }

  @Override public ActivityHistoryMapperFactory activityHistoryMapperFactory() {
    return new ActivityHistoryMapperFactoryImpl(this);
  }

  @Override public ChatMapperFactory chatMapperFactory() {
    return new ChatMapperFactoryImpl(this);
  }

  @Override public FriendMapperFactory friendMapperFactory() {
    return new FriendMapperFactoryImpl(this);
  }

  @Override public GamesMapperFactory gamesMapperFactory() {
    return new GamesMapperFactoryImpl(this);
  }

  @Override public RecruitingMapperFactory recruitingMapperFactory() {
    return new RecruitingMapperFactoryImpl(this);
  }

  @Override public LeaguesMapperFactory leaguesMapperFactory() {
    return new LeaguesMapperFactoryImpl(this);
  }

  @Override public LockerRoomMapperFactory lockerRoomMapperFactory() {
    return new LockerRoomMapperFactoryImpl(this);
  }

  @Override public PunditsMapperFactory punditsMapperFactory() {
    return new PunditsMapperFactoryImpl(this);
  }

  @Override public TeamsMapperFactory teamsMapperFactory() {
    return new TeamsMapperFactoryImpl(this);
  }
}
