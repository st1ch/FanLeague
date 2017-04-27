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
 * Created by Artem Getman on 13.03.17.
 * a.e.getman@gmail.com
 */

public interface UserMapperFactory {

  Mapper<UserEntity, User> getUserMapper();

  Mapper<AvatarEntity, Avatar> getAvatarMapper();

  Mapper<FriendshipEntity, Friendship> getFriendshipMapper();

  Mapper<ConnectCountsEntity, ConnectCounts> getConnectCountsMapper();

  Mapper<DataTitleEntity, DataTitle> getDataTitleMapper();

  Mapper<List<DataTitleEntity>, List<DataTitle>> getListDataTitleMapper();

  Mapper<DisplayNameIdentEntity, DisplayNameIdent> getDisplayNameIdentMapper();

  Mapper<FavoriteClubDataEntity, FavoriteClubData> getFavoriteClubDataMapper();

  Mapper<List<FavoriteClubEntity>, List<FavoriteClub>> getFavoriteClubListMapper();

  Mapper<FavoriteClubEntity, FavoriteClub> getFavoriteClubMapper();

  Mapper<NationalitiesEntity, List<DataTitle>> getNationalitiesMapper();

  Mapper<NotificationListEntity, NotificationList> getNotificationListMapper();

  Mapper<NotificationValuesEntity, NotificationValues> getNotificationValuesMapper();

  Mapper<ProfessionsEntity, List<DataTitle>> getProfessionsMapper();

  Mapper<ProfileViewPermissionEntity, ProfileViewPermission> getProfileViewPermissionMapper();

  Mapper<UserDataEntity, UserData> getUserDataMapper();

  Mapper<WalletEntity, Wallet> getWalletMapper();

  Mapper<WeeklyDepositLimitEntity, WeeklyDepositLimit> getWeeklyDepositLimitMapper();

  Mapper<SystemMessageEntity, SystemMessage> getSystemMessage();

  Mapper<List<SystemMessageEntity>, List<SystemMessage>> geSystemMessagesList();

}
