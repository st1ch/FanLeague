package com.fanleagueent.fanleague.data.repository.user.datasource;

import android.support.annotation.NonNull;
import com.fanleagueent.fanleague.data.entity.entities.locker_room.MyWallDataEntity;
import com.fanleagueent.fanleague.data.entity.entities.user.ConnectCountsEntity;
import com.fanleagueent.fanleague.data.entity.entities.user.DataTitleEntity;
import com.fanleagueent.fanleague.data.entity.entities.user.FavoriteClubEntity;
import com.fanleagueent.fanleague.data.entity.entities.user.SystemMessageEntity;
import com.fanleagueent.fanleague.data.entity.entities.user.UserEntity;
import com.fanleagueent.fanleague.data.net.requests.user.NotificationsRequest;
import com.fanleagueent.fanleague.domain.models.user.DisplayNameIdent;
import com.fanleagueent.fanleague.domain.models.user.ProfileViewPermission;
import io.reactivex.Maybe;
import io.reactivex.MaybeTransformer;
import java.io.File;
import java.util.List;

/**
 * Created by Artem Getman on 31.03.17.
 * a.e.getman@gmail.com
 */

public interface UserDataSource {

  Maybe<UserEntity> getUser();

  Maybe<UserEntity> updateUser(String firstName, String lastName, String username, String profession,
      String birthday, String sex, String nationality,
      String favouriteFootballClubId, String favouriteYouthClub,
      String streetAddress, String country, String postalCode, String city, String phoneNumber);

  MaybeTransformer<UserEntity, UserEntity> saveUser();

  Maybe<UserEntity> changeDepositLimit(int depositLimit);

  Maybe<UserEntity> changeWagerLimit(float wagerLimit);

  Maybe<List<DataTitleEntity>> getProfession();

  MaybeTransformer<List<DataTitleEntity>, List<DataTitleEntity>> saveProfession();

  Maybe<List<DataTitleEntity>> getNationality();

  MaybeTransformer<List<DataTitleEntity>, List<DataTitleEntity>> saveNationality();

  Maybe<List<DataTitleEntity>> getCountries();

  MaybeTransformer<List<DataTitleEntity>, List<DataTitleEntity>> saveCountries();

  Maybe<List<FavoriteClubEntity>> getFavoriteClubs();

  MaybeTransformer<List<FavoriteClubEntity>, List<FavoriteClubEntity>> saveFavoriteClubs();

  Maybe<UserEntity> changePhoto(@NonNull File photoFile);

  Maybe<UserEntity> deletePhoto();

  Maybe<Boolean> changeEmail(@NonNull String email, @NonNull String password);

  Maybe<Boolean> changePassword(@NonNull String password, @NonNull String confirmPassword,
      @NonNull String currentPassword);

  Maybe<UserEntity> connectFacebook(@NonNull String token);

  Maybe<UserEntity> disconnectFacebook();

  Maybe<UserEntity> connectGoogle(@NonNull String token);

  Maybe<UserEntity> disconnectGoogle();

  Maybe<UserEntity> changeDisplayName(DisplayNameIdent displayNameIdent);

  Maybe<UserEntity> changePrivacy(ProfileViewPermission profileViewPermission);

  Maybe<UserEntity> changeNotifications(NotificationsRequest notificationsRequest);

  Maybe<ConnectCountsEntity> getConnectCounts();

  MaybeTransformer<ConnectCountsEntity, ConnectCountsEntity> saveConnectCounts();

  Maybe<List<SystemMessageEntity>> getSystemMessagesThreads();

  MaybeTransformer<List<SystemMessageEntity>, List<SystemMessageEntity>> saveSystemMessagesThreads();

  Maybe<Boolean> acknowledgeSystemMessage(String systemMessageId);

  Maybe<List<String>> getUnreadThreads();

  MaybeTransformer<List<String>, List<String>> saveUnreadThreads();

  Maybe<MyWallDataEntity> getMyWallData();

  Maybe<MyWallDataEntity> updateMyWallPrivacy(boolean memberSince, boolean favouriteClub,
      boolean favouriteYouthClub, boolean profession, boolean averageWinningBets, boolean bestScore,
      boolean age, boolean sex, boolean nationality, boolean recruitTreeSize);
}
