package com.fanleagueent.fanleague.data.entity.mappers.locker_room;

import com.fanleagueent.fanleague.data.entity.entities.locker_room.CommunityItemEntity;
import com.fanleagueent.fanleague.data.entity.entities.locker_room.LockerUserEntity;
import com.fanleagueent.fanleague.data.entity.entities.locker_room.MyWallDataEntity;
import com.fanleagueent.fanleague.data.entity.entities.locker_room.PrivacyEntity;
import com.fanleagueent.fanleague.data.entity.entities.locker_room.ProgressDataEntity;
import com.fanleagueent.fanleague.data.entity.entities.locker_room.ProgressEntity;
import com.fanleagueent.fanleague.data.entity.entities.locker_room.ProgressItemEntity;
import com.fanleagueent.fanleague.data.entity.entities.locker_room.PublicWallDataEntity;
import com.fanleagueent.fanleague.data.entity.entities.locker_room.PublicWallEntity;
import com.fanleagueent.fanleague.data.entity.entities.locker_room.TeamsLeaguesListDataEntity;
import com.fanleagueent.fanleague.data.entity.entities.locker_room.TrophiesDataEntity;
import com.fanleagueent.fanleague.data.entity.entities.locker_room.TrophiesEntity;
import com.fanleagueent.fanleague.data.entity.entities.locker_room.TrophyEntity;
import com.fanleagueent.fanleague.data.entity.entities.locker_room.WallEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.data.entity.mappers.MapperFactory;
import com.fanleagueent.fanleague.domain.models.locker_room.CommunityItem;
import com.fanleagueent.fanleague.domain.models.locker_room.LockerUser;
import com.fanleagueent.fanleague.domain.models.locker_room.MyWallData;
import com.fanleagueent.fanleague.domain.models.locker_room.Privacy;
import com.fanleagueent.fanleague.domain.models.locker_room.Progress;
import com.fanleagueent.fanleague.domain.models.locker_room.ProgressData;
import com.fanleagueent.fanleague.domain.models.locker_room.ProgressItem;
import com.fanleagueent.fanleague.domain.models.locker_room.PublicWall;
import com.fanleagueent.fanleague.domain.models.locker_room.PublicWallData;
import com.fanleagueent.fanleague.domain.models.locker_room.TeamsLeaguesListData;
import com.fanleagueent.fanleague.domain.models.locker_room.Trophies;
import com.fanleagueent.fanleague.domain.models.locker_room.TrophiesData;
import com.fanleagueent.fanleague.domain.models.locker_room.Trophy;
import com.fanleagueent.fanleague.domain.models.locker_room.Wall;
import java.util.List;

/**
 * Created by Artem Getman on 15.03.17.
 * a.e.getman@gmail.com
 */

public class LockerRoomMapperFactoryImpl implements LockerRoomMapperFactory {

  private MapperFactory mapperFactory;

  public LockerRoomMapperFactoryImpl(MapperFactory mapperFactory) {
    this.mapperFactory = mapperFactory;
  }

  @Override public Mapper<CommunityItemEntity, CommunityItem> getCommunityItemMapper() {
    return new CommunityItemMapper(mapperFactory);
  }

  @Override
  public Mapper<List<CommunityItemEntity>, List<CommunityItem>> getCommunityItemListMapper() {
    return new CommunityItemListMapper(this);
  }

  @Override public Mapper<LockerUserEntity, LockerUser> getLockerUserMapper() {
    return new LockerUserMapper(mapperFactory);
  }

  @Override public Mapper<MyWallDataEntity, MyWallData> getMyWallDataMapper() {
    return new MyWallDataMapper(this);
  }

  @Override public Mapper<PrivacyEntity, Privacy> getPrivacyMapper() {
    return new PrivacyMapper();
  }

  @Override public Mapper<ProgressDataEntity, ProgressData> getProgressDataMapper() {
    return new ProgressDataMapper(mapperFactory);
  }

  @Override public Mapper<ProgressEntity, Progress> getProgressMapper() {
    return new ProgressMapper(this);
  }

  @Override public Mapper<ProgressItemEntity, ProgressItem> getProgressItemMapper() {
    return new ProgressItemMapper();
  }

  @Override public Mapper<PublicWallDataEntity, PublicWallData> getPublicWallDataMapper() {
    return new PublicWallDataMapper(this);
  }

  @Override public Mapper<PublicWallEntity, PublicWall> getPublicWallMapper() {
    return new PublicWallMapper();
  }

  @Override
  public Mapper<TeamsLeaguesListDataEntity, TeamsLeaguesListData> getTeamsLeaguesListDataMapper() {
    return new TeamsLeaguesListDataMapper(this);
  }

  @Override public Mapper<TrophiesDataEntity, TrophiesData> getTrophiesDataMapper() {
    return new TrophiesDataMapper(mapperFactory);
  }

  @Override public Mapper<TrophiesEntity, Trophies> getTrophiesMapper() {
    return new TrophiesMapper(this);
  }

  @Override public Mapper<TrophyEntity, Trophy> getTrophyMapper() {
    return new TrophyMapper();
  }

  @Override public Mapper<WallEntity, Wall> getWallMapper() {
    return new WallMapper();
  }
}
