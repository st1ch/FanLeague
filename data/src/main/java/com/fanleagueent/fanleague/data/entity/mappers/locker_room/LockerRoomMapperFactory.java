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

public interface LockerRoomMapperFactory {
  Mapper<CommunityItemEntity, CommunityItem> getCommunityItemMapper();

  Mapper<List<CommunityItemEntity>, List<CommunityItem>> getCommunityItemListMapper();

  Mapper<LockerUserEntity, LockerUser> getLockerUserMapper();

  Mapper<MyWallDataEntity, MyWallData> getMyWallDataMapper();

  Mapper<PrivacyEntity, Privacy> getPrivacyMapper();

  Mapper<ProgressDataEntity, ProgressData> getProgressDataMapper();

  Mapper<ProgressEntity, Progress> getProgressMapper();

  Mapper<ProgressItemEntity, ProgressItem> getProgressItemMapper();

  Mapper<PublicWallDataEntity, PublicWallData> getPublicWallDataMapper();

  Mapper<PublicWallEntity, PublicWall> getPublicWallMapper();

  Mapper<TeamsLeaguesListDataEntity, TeamsLeaguesListData> getTeamsLeaguesListDataMapper();

  Mapper<TrophiesDataEntity, TrophiesData> getTrophiesDataMapper();

  Mapper<TrophiesEntity, Trophies> getTrophiesMapper();

  Mapper<TrophyEntity, Trophy> getTrophyMapper();

  Mapper<WallEntity, Wall> getWallMapper();
}
