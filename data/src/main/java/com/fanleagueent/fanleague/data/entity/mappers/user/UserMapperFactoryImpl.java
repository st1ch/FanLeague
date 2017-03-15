package com.fanleagueent.fanleague.data.entity.mappers.user;

import com.fanleagueent.fanleague.data.entity.entities.user.AvatarEntity;
import com.fanleagueent.fanleague.data.entity.entities.user.ConnectCountsEntity;
import com.fanleagueent.fanleague.data.entity.entities.user.DataTitleEntity;
import com.fanleagueent.fanleague.data.entity.entities.user.DisplayNameIdentEntity;
import com.fanleagueent.fanleague.data.entity.entities.user.FavoriteClubDataEntity;
import com.fanleagueent.fanleague.data.entity.entities.user.FavoriteClubEntity;
import com.fanleagueent.fanleague.data.entity.entities.user.FriendshipEntity;
import com.fanleagueent.fanleague.data.entity.entities.user.NationalitiesEntity;
import com.fanleagueent.fanleague.data.entity.entities.user.NotificationListEntity;
import com.fanleagueent.fanleague.data.entity.entities.user.NotificationValuesEntity;
import com.fanleagueent.fanleague.data.entity.entities.user.ProfessionsEntity;
import com.fanleagueent.fanleague.data.entity.entities.user.ProfileViewPermissionEntity;
import com.fanleagueent.fanleague.data.entity.entities.user.UserDataEntity;
import com.fanleagueent.fanleague.data.entity.entities.user.UserEntity;
import com.fanleagueent.fanleague.data.entity.entities.user.WalletEntity;
import com.fanleagueent.fanleague.data.entity.entities.user.WeeklyDepositLimitEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.data.entity.mappers.MapperFactory;
import com.fanleagueent.fanleague.domain.models.friends.Friendship;
import com.fanleagueent.fanleague.domain.models.user.Avatar;
import com.fanleagueent.fanleague.domain.models.user.ConnectCounts;
import com.fanleagueent.fanleague.domain.models.user.DataTitle;
import com.fanleagueent.fanleague.domain.models.user.DisplayNameIdent;
import com.fanleagueent.fanleague.domain.models.user.FavoriteClub;
import com.fanleagueent.fanleague.domain.models.user.FavoriteClubData;
import com.fanleagueent.fanleague.domain.models.user.NotificationList;
import com.fanleagueent.fanleague.domain.models.user.NotificationValues;
import com.fanleagueent.fanleague.domain.models.user.ProfileViewPermission;
import com.fanleagueent.fanleague.domain.models.user.User;
import com.fanleagueent.fanleague.domain.models.user.UserData;
import com.fanleagueent.fanleague.domain.models.user.Wallet;
import com.fanleagueent.fanleague.domain.models.user.WeeklyDepositLimit;

/**
 * Created by alexeyverbitskiy on 3/14/17.
 */

public class UserMapperFactoryImpl implements UserMapperFactory {

  private MapperFactory mapperFactory;

  public UserMapperFactoryImpl(MapperFactory mapperFactory) {
    this.mapperFactory = mapperFactory;
  }

  @Override public Mapper<UserEntity, User> getUserMapper() {
    return null;
  }

  @Override public Mapper<AvatarEntity, Avatar> getAvatarMapper() {
    return null;
  }

  @Override public Mapper<FriendshipEntity, Friendship> getFriendshipMapper() {
    return null;
  }

  @Override public Mapper<ConnectCountsEntity, ConnectCounts> getConnectCountsMapper() {
    return null;
  }

  @Override public Mapper<DataTitleEntity, DataTitle> getDataTitleMapper() {
    return null;
  }

  @Override public Mapper<DisplayNameIdentEntity, DisplayNameIdent> getDisplayNameIdentMapper() {
    return null;
  }

  @Override public Mapper<FavoriteClubDataEntity, FavoriteClubData> getFavoriteClubDataMapper() {
    return null;
  }

  @Override public Mapper<FavoriteClubEntity, FavoriteClub> getFavoriteClubMapper() {
    return null;
  }

  @Override public Mapper<NationalitiesEntity, DataTitle> getNationalitiesMapper() {
    return null;
  }

  @Override public Mapper<NotificationListEntity, NotificationList> getNotificationListMapper() {
    return null;
  }

  @Override
  public Mapper<NotificationValuesEntity, NotificationValues> getNotificationValuesMapper() {
    return null;
  }

  @Override public Mapper<ProfessionsEntity, DataTitle> getProfessionsMapper() {
    return null;
  }

  @Override
  public Mapper<ProfileViewPermissionEntity, ProfileViewPermission> getProfileViewPermissionMapper() {
    return null;
  }

  @Override public Mapper<UserDataEntity, UserData> getUserDataMapper() {
    return null;
  }

  @Override public Mapper<WalletEntity, Wallet> getWalletMapper() {
    return null;
  }

  @Override
  public Mapper<WeeklyDepositLimitEntity, WeeklyDepositLimit> getWeeklyDepositLimitMapper() {
    return null;
  }
}
