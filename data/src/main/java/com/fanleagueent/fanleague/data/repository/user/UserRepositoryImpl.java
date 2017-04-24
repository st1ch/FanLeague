package com.fanleagueent.fanleague.data.repository.user;

import com.fanleagueent.fanleague.domain.models.user.ConnectCounts;
import com.fanleagueent.fanleague.domain.models.user.DataTitle;
import com.fanleagueent.fanleague.domain.models.user.DisplayNameIdent;
import com.fanleagueent.fanleague.domain.models.user.FavoriteClub;
import com.fanleagueent.fanleague.domain.models.user.NotificationValues;
import com.fanleagueent.fanleague.domain.models.user.PrivacyStatus;
import com.fanleagueent.fanleague.domain.models.user.ProfileViewPermission;
import com.fanleagueent.fanleague.domain.models.user.SystemMessage;
import com.fanleagueent.fanleague.domain.models.user.User;
import com.fanleagueent.fanleague.domain.models.user.UserGeneralData;
import com.fanleagueent.fanleague.domain.repository.UserRepository;
import io.reactivex.Flowable;
import io.reactivex.annotations.NonNull;
import java.io.File;
import java.util.List;

/**
 * Created by Artem Getman on 31.03.17.
 * a.e.getman@gmail.com
 */

public class UserRepositoryImpl implements UserRepository {
  @Override public Flowable<UserGeneralData> getUserData() {
    return null;
  }

  @Override public Flowable<UserGeneralData> getLocalUserData() {
    return null;
  }

  @Override public Flowable<User> getUser() {
    return null;
  }

  @Override public Flowable<User> getCachedUser() {
    return null;
  }

  @Override public Flowable<User> updateUser(String firstName, String lastName, String username,
      String profession, String birthday, String sex, String nationality, int yearlyEarnings,
      String favouriteFootballClubId, String favouriteYouthClub, int weeklyDepositLimit,
      String streetAddress, String country, String postalCode, String city, String phoneNumber) {
    return null;
  }

  @Override public Flowable<User> saveUser(@NonNull User user) {
    return null;
  }

  @Override public Flowable<User> changeDepositLimit(int depositLimit) {
    return null;
  }

  @Override public Flowable<User> changeWagerLimit(float wagerLimit) {
    return null;
  }

  @Override public Flowable<Void> deleteUser() {
    return null;
  }

  @Override public Flowable<List<DataTitle>> getProfession() {
    return null;
  }

  @Override public Flowable<List<DataTitle>> getNationality() {
    return null;
  }

  @Override public Flowable<List<DataTitle>> getCountries() {
    return null;
  }

  @Override public Flowable<List<FavoriteClub>> getFavoriteClubs() {
    return null;
  }

  @Override public Flowable<User> changePhoto(@NonNull File photoFile) {
    return null;
  }

  @Override public Flowable<User> deletePhoto() {
    return null;
  }

  @Override public Flowable<Boolean> changeEmail(@NonNull String email, @NonNull String password) {
    return null;
  }

  @Override
  public Flowable<Boolean> changePassword(@NonNull String password, @NonNull String confirmPassword,
      @NonNull String currentPassword) {
    return null;
  }

  @Override public Flowable<User> connectFacebook(@NonNull String token) {
    return null;
  }

  @Override public Flowable<User> disconnectFacebook() {
    return null;
  }

  @Override public Flowable<User> connectGoogle(@NonNull String token) {
    return null;
  }

  @Override public Flowable<User> disconnectGoogle() {
    return null;
  }

  @Override public Flowable<PrivacyStatus> changeDisplayName(DisplayNameIdent displayNameIdent) {
    return null;
  }

  @Override
  public Flowable<PrivacyStatus> changePrivacy(ProfileViewPermission profileViewPermission) {
    return null;
  }

  @Override public Flowable<User> changeNotifications(NotificationValues notificationValues) {
    return null;
  }

  @Override public Flowable<ConnectCounts> getConnectCounts(boolean refresh) {
    return null;
  }

  @Override public Flowable<List<SystemMessage>> getSystemMessagesThreads() {
    return null;
  }

  @Override public Flowable<Boolean> acknowledgeSystemMessage(String systemMessageId) {
    return null;
  }

  @Override public Flowable<Boolean> syncSystemMessagesOnServer() {
    return null;
  }

  @Override public Flowable<Integer> getUnreadThreadsCount() {
    return null;
  }

  @Override public Flowable<Integer> addUnreadThread(String newThreadId) {
    return null;
  }

  @Override public Flowable<Integer> removeUnreadThread(String threadId) {
    return null;
  }
}
