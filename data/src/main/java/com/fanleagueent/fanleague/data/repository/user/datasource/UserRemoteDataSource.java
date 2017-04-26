package com.fanleagueent.fanleague.data.repository.user.datasource;

import android.support.annotation.NonNull;
import android.util.Log;
import com.fanleagueent.fanleague.data.net.api.UserAPI;
import com.fanleagueent.fanleague.data.net.requests.user.NotificationsRequest;
import com.fanleagueent.fanleague.data.observables.BaseResponseObservable;
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

import static android.content.ContentValues.TAG;

/**
 * Created by Artem Getman on 31.03.17.
 * a.e.getman@gmail.com
 */

public class UserRemoteDataSource implements UserDataSource {

  private UserAPI api;

  private final Provider<User> userCacheProvider;
  private final Provider<List<DataTitle>> professionsCacheProvider;
  private final Provider<List<DataTitle>> nationalitiesCacheProvider;
  private final Provider<List<DataTitle>> countriesCacheProvider;
  private final Provider<List<FavoriteClub>> favouriteClubCacheProvider;
  private final Provider<ConnectCounts> connectCountsProvider;
  private final Provider<List<SystemMessage>> systemMessageCacheProvider;
  private final Provider<List<String>> unreadThreadsCacheProvider;


  public UserRemoteDataSource(UserAPI api, ReactiveCache reactiveCache) {
    this.api = api;
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



    return api.getUser().flatMap(BaseResponseObservable::new).map(userResponse -> {
      Log.wtf(TAG, userResponse.getUserData().toString());
      return userResponse.getUserData().getUser();
    });
  }

  @Override public Maybe<User> updateUser(String firstName, String lastName, String username,
      String profession, String birthday, String sex, String nationality, int yearlyEarnings,
      String favouriteFootballClubId, String favouriteYouthClub, int weeklyDepositLimit,
      String streetAddress, String country, String postalCode, String city, String phoneNumber) {
    return null;
  }

  @Override public Maybe<User> changeDepositLimit(int depositLimit) {
    return null;
  }

  @Override public Maybe<User> changeWagerLimit(float wagerLimit) {
    return null;
  }

  @Override public Maybe<List<DataTitle>> getProfession() {
    return null;
  }

  @Override public Maybe<List<DataTitle>> getNationality() {
    return null;
  }

  @Override public Maybe<List<DataTitle>> getCountries() {
    return null;
  }

  @Override public Maybe<List<FavoriteClub>> getFavoriteClubs() {
    return null;
  }

  @Override public Maybe<User> changePhoto(@NonNull File photoFile) {
    return null;
  }

  @Override public Maybe<User> deletePhoto() {
    return null;
  }

  @Override public Maybe<Boolean> changeEmail(@NonNull String email, @NonNull String password) {
    return null;
  }

  @Override
  public Maybe<Boolean> changePassword(@NonNull String password, @NonNull String confirmPassword,
      @NonNull String currentPassword) {
    return null;
  }

  @Override public Maybe<User> connectFacebook(@NonNull String token) {
    return null;
  }

  @Override public Maybe<User> disconnectFacebook() {
    return null;
  }

  @Override public Maybe<User> connectGoogle(@NonNull String token) {
    return null;
  }

  @Override public Maybe<User> disconnectGoogle() {
    return null;
  }

  @Override public Maybe<User> changeDisplayName(DisplayNameIdent displayNameIdent) {
    return null;
  }

  @Override public Maybe<User> changePrivacy(ProfileViewPermission profileViewPermission) {
    return null;
  }

  @Override public Maybe<User> changeNotifications(NotificationsRequest notificationsRequest) {
    return null;
  }

  @Override public Maybe<ConnectCounts> getConnectCounts() {
    return null;
  }

  @Override public Maybe<List<SystemMessage>> getSystemMessagesThreads() {
    return null;
  }

  @Override public Maybe<Boolean> acknowledgeSystemMessage(String systemMessageId) {
    return null;
  }

  @Override public Maybe<List<String>> getUnreadThreads() {
    return null;
  }
}
