package com.fanleagueent.fanleague.data.repository.user.datasource;

import android.support.annotation.NonNull;
import com.fanleagueent.fanleague.data.constants.CacheTitle;
import com.fanleagueent.fanleague.data.entity.entities.locker_room.MyWallDataEntity;
import com.fanleagueent.fanleague.data.entity.entities.user.ConnectCountsEntity;
import com.fanleagueent.fanleague.data.entity.entities.user.DataTitleEntity;
import com.fanleagueent.fanleague.data.entity.entities.user.FavoriteClubEntity;
import com.fanleagueent.fanleague.data.entity.entities.user.SystemMessageEntity;
import com.fanleagueent.fanleague.data.entity.entities.user.UserEntity;
import com.fanleagueent.fanleague.data.exception.UnsupportedDataSourceOperationException;
import com.fanleagueent.fanleague.domain.models.user.DisplayNameIdent;
import com.fanleagueent.fanleague.domain.models.user.NotificationValues;
import com.fanleagueent.fanleague.domain.models.user.ProfileViewPermission;
import io.reactivecache2.Provider;
import io.reactivecache2.ReactiveCache;
import io.reactivex.Maybe;
import io.reactivex.MaybeTransformer;
import java.io.File;
import java.util.List;

/**
 * Created by Artem Getman on 31.03.17.
 * a.e.getman@gmail.com
 */

public class UserLocalDataSource implements UserDataSource {

  private final Provider<UserEntity> userCacheProvider;
  private final Provider<List<DataTitleEntity>> professionsCacheProvider;
  private final Provider<List<DataTitleEntity>> nationalitiesCacheProvider;
  private final Provider<List<DataTitleEntity>> countriesCacheProvider;
  private final Provider<List<FavoriteClubEntity>> favouriteClubCacheProvider;
  private final Provider<ConnectCountsEntity> connectCountsProvider;
  private final Provider<List<SystemMessageEntity>> systemMessageCacheProvider;
  private final Provider<List<String>> unreadThreadsCacheProvider;

  public UserLocalDataSource(final ReactiveCache reactiveCache) {
    this.userCacheProvider = reactiveCache.<UserEntity>provider().withKey(CacheTitle.User.USER);
    this.professionsCacheProvider =
        reactiveCache.<List<DataTitleEntity>>provider().withKey(CacheTitle.User.PROFESSIONS);
    this.nationalitiesCacheProvider =
        reactiveCache.<List<DataTitleEntity>>provider().withKey(CacheTitle.User.NATIONALITIES);
    this.countriesCacheProvider =
        reactiveCache.<List<DataTitleEntity>>provider().withKey(CacheTitle.User.COUNTRIES);
    this.favouriteClubCacheProvider =
        reactiveCache.<List<FavoriteClubEntity>>provider().withKey(CacheTitle.User.FAVOURITE_CLUB);
    this.connectCountsProvider =
        reactiveCache.<ConnectCountsEntity>provider().withKey(CacheTitle.User.CONNECT_COUNTS);
    this.systemMessageCacheProvider = reactiveCache.<List<SystemMessageEntity>>provider().withKey(
        CacheTitle.User.SYSTEM_MESSAGES);
    this.unreadThreadsCacheProvider =
        reactiveCache.<List<String>>provider().withKey(CacheTitle.User.UNREAD_MESSAGES);
  }

  @Override public Maybe<UserEntity> getUser() {
    return userCacheProvider.read().toMaybe();
  }

  @Override public Maybe<UserEntity> updateUser(String firstName, String lastName, String username,
      String profession, String birthday, String sex, String nationality,
      String favouriteFootballClubId, String favouriteYouthClub, String streetAddress,
      String country, String postalCode, String city, String phoneNumber) {
    throw new UnsupportedDataSourceOperationException();
  }

  @Override public MaybeTransformer<UserEntity, UserEntity> saveUser() {
    return upstream -> upstream.toSingle().compose(userCacheProvider.replace()).toMaybe();
  }

  @Override public Maybe<UserEntity> changeDepositLimit(int depositLimit) {
    throw new UnsupportedDataSourceOperationException();
  }

  @Override public Maybe<UserEntity> changeWagerLimit(float wagerLimit) {
    throw new UnsupportedDataSourceOperationException();
  }

  @Override public Maybe<List<DataTitleEntity>> getProfession() {
    return professionsCacheProvider.read().toMaybe();
  }

  @Override public MaybeTransformer<List<DataTitleEntity>, List<DataTitleEntity>> saveProfession() {
    return upstream -> upstream.toSingle().compose(professionsCacheProvider.replace()).toMaybe();
  }

  @Override public Maybe<List<DataTitleEntity>> getNationality() {
    return nationalitiesCacheProvider.read().toMaybe();
  }

  @Override
  public MaybeTransformer<List<DataTitleEntity>, List<DataTitleEntity>> saveNationality() {
    return upstream -> upstream.toSingle().compose(nationalitiesCacheProvider.replace()).toMaybe();
  }

  @Override public Maybe<List<DataTitleEntity>> getCountries() {
    return countriesCacheProvider.read().toMaybe();
  }

  @Override public MaybeTransformer<List<DataTitleEntity>, List<DataTitleEntity>> saveCountries() {
    return upstream -> upstream.toSingle().compose(countriesCacheProvider.replace()).toMaybe();
  }

  @Override public Maybe<List<FavoriteClubEntity>> getFavoriteClubs() {
    return favouriteClubCacheProvider.read().toMaybe();
  }

  @Override
  public MaybeTransformer<List<FavoriteClubEntity>, List<FavoriteClubEntity>> saveFavoriteClubs() {
    return upstream -> upstream.toSingle().compose(favouriteClubCacheProvider.replace()).toMaybe();
  }

  @Override public Maybe<UserEntity> changePhoto(@NonNull File photoFile) {
    throw new UnsupportedDataSourceOperationException();
  }

  @Override public Maybe<UserEntity> deletePhoto() {
    throw new UnsupportedDataSourceOperationException();
  }

  @Override public Maybe<Boolean> changeEmail(@NonNull String email, @NonNull String password) {
    throw new UnsupportedDataSourceOperationException();
  }

  @Override
  public Maybe<Boolean> changePassword(@NonNull String password, @NonNull String confirmPassword,
      @NonNull String currentPassword) {
    throw new UnsupportedDataSourceOperationException();
  }

  @Override public Maybe<UserEntity> connectFacebook(@NonNull String token) {
    throw new UnsupportedDataSourceOperationException();
  }

  @Override public Maybe<UserEntity> disconnectFacebook() {
    throw new UnsupportedDataSourceOperationException();
  }

  @Override public Maybe<UserEntity> connectGoogle(@NonNull String token) {
    throw new UnsupportedDataSourceOperationException();
  }

  @Override public Maybe<UserEntity> disconnectGoogle() {
    throw new UnsupportedDataSourceOperationException();
  }

  @Override public Maybe<UserEntity> changeDisplayName(DisplayNameIdent displayNameIdent) {
    throw new UnsupportedDataSourceOperationException();
  }

  @Override public Maybe<UserEntity> changePrivacy(ProfileViewPermission profileViewPermission) {
    throw new UnsupportedDataSourceOperationException();
  }

  @Override
  public Maybe<UserEntity> changeNotifications(NotificationValues notificationValues) {
    throw new UnsupportedDataSourceOperationException();
  }

  @Override public Maybe<ConnectCountsEntity> getConnectCounts() {
    return connectCountsProvider.read().toMaybe();
  }

  @Override public MaybeTransformer<ConnectCountsEntity, ConnectCountsEntity> saveConnectCounts() {
    return upstream -> upstream.toSingle().compose(connectCountsProvider.replace()).toMaybe();
  }

  @Override public Maybe<List<SystemMessageEntity>> getSystemMessagesThreads() {
    return systemMessageCacheProvider.read().toMaybe();
  }

  @Override
  public MaybeTransformer<List<SystemMessageEntity>, List<SystemMessageEntity>> saveSystemMessagesThreads() {
    return upstream -> upstream.toSingle().compose(systemMessageCacheProvider.replace()).toMaybe();
  }

  @Override public Maybe<Boolean> acknowledgeSystemMessage(String systemMessageId) {
    throw new UnsupportedDataSourceOperationException();
  }

  @Override public Maybe<List<String>> getUnreadThreads() {
    return unreadThreadsCacheProvider.read().toMaybe();
  }

  @Override public MaybeTransformer<List<String>, List<String>> saveUnreadThreads() {
    return upstream -> upstream.toSingle().compose(unreadThreadsCacheProvider.replace()).toMaybe();
  }

  @Override public Maybe<MyWallDataEntity> getMyWallData() {
    throw new UnsupportedDataSourceOperationException();
  }

  @Override
  public Maybe<MyWallDataEntity> updateMyWallPrivacy(boolean memberSince, boolean favouriteClub,
      boolean favouriteYouthClub, boolean profession, boolean averageWinningBets, boolean bestScore,
      boolean age, boolean sex, boolean nationality, boolean recruitTreeSize) {
    throw new UnsupportedDataSourceOperationException();
  }
}
