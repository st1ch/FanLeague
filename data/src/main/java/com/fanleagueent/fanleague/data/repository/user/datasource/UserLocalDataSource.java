package com.fanleagueent.fanleague.data.repository.user.datasource;

import android.support.annotation.NonNull;
import com.fanleagueent.fanleague.data.exception.UnsupportedDataSourceOperationException;
import com.fanleagueent.fanleague.data.net.requests.user.NotificationsRequest;
import com.fanleagueent.fanleague.domain.models.user.ConnectCounts;
import com.fanleagueent.fanleague.domain.models.user.DataTitle;
import com.fanleagueent.fanleague.domain.models.user.DisplayNameIdent;
import com.fanleagueent.fanleague.domain.models.user.FavoriteClub;
import com.fanleagueent.fanleague.domain.models.user.ProfileViewPermission;
import com.fanleagueent.fanleague.domain.models.user.SystemMessage;
import com.fanleagueent.fanleague.domain.models.user.User;
import io.reactivecache2.Provider;
import io.reactivecache2.ReactiveCache;
import io.reactivex.Maybe;
import java.io.File;
import java.util.List;

/**
 * Created by Artem Getman on 31.03.17.
 * a.e.getman@gmail.com
 */

public class UserLocalDataSource implements UserDataSource {

  private final Provider<User> userCacheProvider;
  private final Provider<List<DataTitle>> professionsCacheProvider;
  private final Provider<List<DataTitle>> nationalitiesCacheProvider;
  private final Provider<List<DataTitle>> countriesCacheProvider;
  private final Provider<List<FavoriteClub>> favouriteClubCacheProvider;
  private final Provider<ConnectCounts> connectCountsProvider;
  private final Provider<List<SystemMessage>> systemMessageCacheProvider;
  private final Provider<List<String>> unreadThreadsCacheProvider;

  public UserLocalDataSource(final ReactiveCache reactiveCache) {
    this.userCacheProvider = reactiveCache.<User>provider().withKey("userCache");
    this.professionsCacheProvider =
        reactiveCache.<List<DataTitle>>provider().withKey("professions");
    this.nationalitiesCacheProvider =
        reactiveCache.<List<DataTitle>>provider().withKey("nationalities");
    this.countriesCacheProvider = reactiveCache.<List<DataTitle>>provider().withKey("countries");
    this.favouriteClubCacheProvider =
        reactiveCache.<List<FavoriteClub>>provider().withKey("favouriteClub");
    this.connectCountsProvider =
        reactiveCache.<ConnectCounts>provider().withKey("connectCountsCache");
    this.systemMessageCacheProvider =
        reactiveCache.<List<SystemMessage>>provider().withKey("systemMessagesCache");
    this.unreadThreadsCacheProvider =
        reactiveCache.<List<String>>provider().withKey("unreadMessagesCache");
  }

  @Override public Maybe<User> getUser() {
    return userCacheProvider.read().toMaybe();
  }

  @Override public Maybe<User> updateUser(String firstName, String lastName, String username,
      String profession, String birthday, String sex, String nationality, int yearlyEarnings,
      String favouriteFootballClubId, String favouriteYouthClub, int weeklyDepositLimit,
      String streetAddress, String country, String postalCode, String city, String phoneNumber) {

    throw new UnsupportedDataSourceOperationException();
  }

  @Override public Maybe<User> changeDepositLimit(int depositLimit) {
    throw new UnsupportedDataSourceOperationException();
  }

  @Override public Maybe<User> changeWagerLimit(float wagerLimit) {
    throw new UnsupportedDataSourceOperationException();
  }

  @Override public Maybe<List<DataTitle>> getProfession() {
    return professionsCacheProvider.read().toMaybe();
  }

  @Override public Maybe<List<DataTitle>> getNationality() {
    return nationalitiesCacheProvider.read().toMaybe();
  }

  @Override public Maybe<List<DataTitle>> getCountries() {
    return countriesCacheProvider.read().toMaybe();
  }

  @Override public Maybe<List<FavoriteClub>> getFavoriteClubs() {
    return favouriteClubCacheProvider.read().toMaybe();
  }

  @Override public Maybe<User> changePhoto(@NonNull File photoFile) {
    throw new UnsupportedDataSourceOperationException();
  }

  @Override public Maybe<User> deletePhoto() {
    throw new UnsupportedDataSourceOperationException();
  }

  @Override public Maybe<Boolean> changeEmail(@NonNull String email, @NonNull String password) {
    throw new UnsupportedDataSourceOperationException();
  }

  @Override
  public Maybe<Boolean> changePassword(@NonNull String password, @NonNull String confirmPassword,
      @NonNull String currentPassword) {
    throw new UnsupportedOperationException("Operation is not available!!!");
  }

  @Override public Maybe<User> connectFacebook(@NonNull String token) {
    throw new UnsupportedOperationException("Operation is not available!!!");
  }

  @Override public Maybe<User> disconnectFacebook() {
    throw new UnsupportedOperationException("Operation is not available!!!");
  }

  @Override public Maybe<User> connectGoogle(@NonNull String token) {
    throw new UnsupportedOperationException("Operation is not available!!!");
  }

  @Override public Maybe<User> disconnectGoogle() {
    throw new UnsupportedOperationException("Operation is not available!!!");
  }

  @Override public Maybe<User> changeDisplayName(DisplayNameIdent displayNameIdent) {
    throw new UnsupportedOperationException("Operation is not available!!!");
  }

  @Override public Maybe<User> changePrivacy(ProfileViewPermission profileViewPermission) {
    throw new UnsupportedOperationException("Operation is not available!!!");
  }

  @Override public Maybe<User> changeNotifications(NotificationsRequest notificationsRequest) {
    throw new UnsupportedOperationException("Operation is not available!!!");
  }

  @Override public Maybe<ConnectCounts> getConnectCounts() {
    return connectCountsProvider.read().toMaybe();
  }

  @Override public Maybe<List<SystemMessage>> getSystemMessagesThreads() {
    return systemMessageCacheProvider.read().toMaybe();
  }

  @Override public Maybe<Boolean> acknowledgeSystemMessage(String systemMessageId) {
    throw new UnsupportedOperationException("Operation is not available!!!");
  }

  @Override public Maybe<List<String>> getUnreadThreads() {
    return unreadThreadsCacheProvider.read().toMaybe();
  }
}
