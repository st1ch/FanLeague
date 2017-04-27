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
import com.fanleagueent.fanleague.data.entity.entities.user.SystemMessageEntity;
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
import com.fanleagueent.fanleague.domain.models.user.SystemMessage;
import com.fanleagueent.fanleague.domain.models.user.User;
import com.fanleagueent.fanleague.domain.models.user.UserData;
import com.fanleagueent.fanleague.domain.models.user.Wallet;
import com.fanleagueent.fanleague.domain.models.user.WeeklyDepositLimit;
import java.util.List;

/**
 * Created by alexeyverbitskiy on 3/14/17.
 */

public class UserMapperFactoryImpl implements UserMapperFactory {

  private MapperFactory mapperFactory;

  public UserMapperFactoryImpl(MapperFactory mapperFactory) {
    this.mapperFactory = mapperFactory;
  }

  @Override public Mapper<UserEntity, User> getUserMapper() {
    return new UserMapper(this);
  }

  @Override public Mapper<AvatarEntity, Avatar> getAvatarMapper() {
    return new AvatarMapper();
  }

  @Override public Mapper<FriendshipEntity, Friendship> getFriendshipMapper() {
    return new FriendshipMapper();
  }

  @Override public Mapper<ConnectCountsEntity, ConnectCounts> getConnectCountsMapper() {
    return new ConnectCountsMapper();
  }

  @Override public Mapper<DataTitleEntity, DataTitle> getDataTitleMapper() {
    return new DataTitleMapper();
  }

  @Override public Mapper<List<DataTitleEntity>, List<DataTitle>> getListDataTitleMapper() {
    return new DataTitleListMapper(this);
  }

  @Override public Mapper<DisplayNameIdentEntity, DisplayNameIdent> getDisplayNameIdentMapper() {
    return new DisplayNameIdentMapper();
  }

  @Override public Mapper<FavoriteClubDataEntity, FavoriteClubData> getFavoriteClubDataMapper() {
    return new FavoriteClubDataMapper(this);
  }

  @Override public Mapper<FavoriteClubEntity, FavoriteClub> getFavoriteClubMapper() {
    return new FavoriteClubMapper();
  }

  @Override
  public Mapper<List<FavoriteClubEntity>, List<FavoriteClub>> getFavoriteClubListMapper() {
    return new FavoriteClubListMapper(this);
  }

  @Override public Mapper<NationalitiesEntity, List<DataTitle>> getNationalitiesMapper() {
    return new NationalityMapper(this);
  }

  @Override public Mapper<NotificationListEntity, NotificationList> getNotificationListMapper() {
    return new NotificationListMapper(this);
  }

  @Override
  public Mapper<NotificationValuesEntity, NotificationValues> getNotificationValuesMapper() {
    return new NotificationValueMapper();
  }

  @Override public Mapper<ProfessionsEntity, List<DataTitle>> getProfessionsMapper() {
    return new ProfessionMapper(this);
  }

  @Override
  public Mapper<ProfileViewPermissionEntity, ProfileViewPermission> getProfileViewPermissionMapper() {
    return new ProfileViewPermissionMapper();
  }

  @Override public Mapper<UserDataEntity, UserData> getUserDataMapper() {
    return new UserDataMapper(this);
  }

  @Override public Mapper<WalletEntity, Wallet> getWalletMapper() {
    return new WalletMapper(this);
  }

  @Override
  public Mapper<WeeklyDepositLimitEntity, WeeklyDepositLimit> getWeeklyDepositLimitMapper() {
    return new WeeklyDepositLimitMapper();
  }

  @Override
  public Mapper<SystemMessageEntity, SystemMessage> getSystemMessage() {
    return new SystemMessageMapper();
  }

  @Override
  public Mapper<List<SystemMessageEntity>, List<SystemMessage>> geSystemMessagesList() {
    return new SystemMessageListMapper(this);
  }
}
