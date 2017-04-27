package com.fanleagueent.fanleague.data.repository.user;

import com.fanleagueent.fanleague.data.entity.entities.user.SystemMessageEntity;
import com.fanleagueent.fanleague.data.entity.mappers.user.UserMapperFactory;
import com.fanleagueent.fanleague.data.repository.user.datasource.UserDataSource;
import com.fanleagueent.fanleague.domain.models.locker_room.MyWallData;
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

import java.io.File;
import java.util.List;

import io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.reactivex.annotations.NonNull;

/**
 * Created by Artem Getman on 31.03.17.
 * a.e.getman@gmail.com
 */

public class UserRepositoryImpl implements UserRepository {

  private UserDataSource remote;
  private UserDataSource local;
  private UserMapperFactory userMapperFactory;

  public UserRepositoryImpl(UserDataSource remote, UserDataSource local,
      UserMapperFactory userMapperFactory) {
    this.remote = remote;
    this.local = local;
    this.userMapperFactory = userMapperFactory;
  }

  @Override public Flowable<UserGeneralData> getUserData(boolean refresh) {

    return Flowable.concatArrayDelayError(
        Maybe.zip(local.getUser(), local.getProfession(), local.getNationality(),
            local.getFavoriteClubs(),
            (user, profession, nationality, favouriteClubs) -> UserGeneralData.builder()
                .user(userMapperFactory.getUserMapper().transform(user))
                .professionList(userMapperFactory.getListDataTitleMapper().transform(profession))
                .nationalityList(userMapperFactory.getListDataTitleMapper().transform(nationality))
                .favoriteClubList(
                    userMapperFactory.getFavoriteClubListMapper().transform(favouriteClubs))
                .build()).toFlowable(), Maybe.zip(remote.getUser().compose(local.saveUser()),
            remote.getProfession().compose(local.saveProfession()),
            remote.getNationality().compose(local.saveNationality()),
            remote.getFavoriteClubs().compose(local.saveFavoriteClubs()),
            (userEntity, profession, nationality, favouriteClubs) -> UserGeneralData.builder()
                .user(userMapperFactory.getUserMapper().transform(userEntity))
                .professionList(userMapperFactory.getListDataTitleMapper().transform(profession))
                .nationalityList(userMapperFactory.getListDataTitleMapper().transform(nationality))
                .favoriteClubList(
                    userMapperFactory.getFavoriteClubListMapper().transform(favouriteClubs))
                .build()).toFlowable()

    ).filter(userEntity -> userEntity != null);
  }

  @Override public Flowable<User> getUser(boolean refresh) {
    return Flowable.concatArrayDelayError(local.getUser().toFlowable(),
        remote.getUser().compose(local.saveUser()).toFlowable())
        .filter(userEntity -> userEntity != null)
        .map(userEntity -> userMapperFactory.getUserMapper().transform(userEntity));
  }

  @Override public Flowable<User> updateUser(String firstName, String lastName, String username,
      String profession, String birthday, String sex, String nationality, int yearlyEarnings,
      String favouriteFootballClubId, String favouriteYouthClub, int weeklyDepositLimit,
      String streetAddress, String country, String postalCode, String city, String phoneNumber) {
    return remote.updateUser(firstName, lastName, username, profession, birthday, sex, nationality,
        favouriteFootballClubId, favouriteYouthClub, streetAddress, country, postalCode, city,
        phoneNumber)
        .compose(local.saveUser())
        .toFlowable()
        .filter(userEntity -> userEntity != null)
        .map(userEntity -> userMapperFactory.getUserMapper().transform(userEntity));
  }

  @Override public Flowable<User> changeDepositLimit(int depositLimit) {
    return remote.changeDepositLimit(depositLimit)
        .compose(local.saveUser())
        .toFlowable()
        .filter(userEntity -> userEntity != null)
        .map(userEntity -> userMapperFactory.getUserMapper().transform(userEntity));
  }

  @Override public Flowable<User> changeWagerLimit(float wagerLimit) {
    return remote.changeWagerLimit(wagerLimit)
        .compose(local.saveUser())
        .toFlowable()
        .filter(userEntity -> userEntity != null)
        .map(userEntity -> userMapperFactory.getUserMapper().transform(userEntity));
  }

  @Override public Flowable<List<DataTitle>> getProfession() {
    return Flowable.concatArrayDelayError(local.getProfession().toFlowable(),
        remote.getProfession().compose(local.saveProfession()).toFlowable())
        .filter(data -> data != null)
        .map(data -> userMapperFactory.getListDataTitleMapper().transform(data));
  }

  @Override public Flowable<List<DataTitle>> getNationality() {
    return Flowable.concatArrayDelayError(local.getNationality().toFlowable(),
        remote.getNationality().compose(local.saveNationality()).toFlowable())
        .filter(data -> data != null)
        .map(data -> userMapperFactory.getListDataTitleMapper().transform(data));
  }

  @Override public Flowable<List<DataTitle>> getCountries() {
    return Flowable.concatArrayDelayError(local.getCountries().toFlowable(),
        remote.getCountries().compose(local.saveCountries()).toFlowable())
        .filter(data -> data != null)
        .map(data -> userMapperFactory.getListDataTitleMapper().transform(data));
  }

  @Override public Flowable<List<FavoriteClub>> getFavoriteClubs() {
    return Flowable.concatArrayDelayError(local.getFavoriteClubs().toFlowable(),
        remote.getFavoriteClubs().compose(local.saveFavoriteClubs()).toFlowable())
        .filter(data -> data != null)
        .map(data -> userMapperFactory.getFavoriteClubListMapper().transform(data));
  }

  @Override public Flowable<User> changePhoto(@NonNull File photoFile) {
    return remote.changePhoto(photoFile)
        .compose(local.saveUser())
        .toFlowable()
        .filter(userEntity -> userEntity != null)
        .map(userEntity -> userMapperFactory.getUserMapper().transform(userEntity));
  }

  @Override public Flowable<User> deletePhoto() {
    return remote.deletePhoto()
        .compose(local.saveUser())
        .toFlowable()
        .filter(userEntity -> userEntity != null)
        .map(userEntity -> userMapperFactory.getUserMapper().transform(userEntity));
  }

  @Override public Flowable<Boolean> changeEmail(@NonNull String email, @NonNull String password) {
    return remote.changeEmail(email, password).toFlowable();
  }

  @Override
  public Flowable<Boolean> changePassword(@NonNull String password, @NonNull String confirmPassword,
      @NonNull String currentPassword) {
    return remote.changePassword(password, confirmPassword, currentPassword).toFlowable();
  }

  @Override public Flowable<User> connectFacebook(@NonNull String token) {
    return remote.connectFacebook(token)
        .compose(local.saveUser())
        .toFlowable()
        .filter(userEntity -> userEntity != null)
        .map(userEntity -> userMapperFactory.getUserMapper().transform(userEntity));
  }

  @Override public Flowable<User> disconnectFacebook() {
    return remote.disconnectFacebook()
        .compose(local.saveUser())
        .toFlowable()
        .filter(userEntity -> userEntity != null)
        .map(userEntity -> userMapperFactory.getUserMapper().transform(userEntity));
  }

  @Override public Flowable<User> connectGoogle(@NonNull String token) {
    return remote.connectGoogle(token)
        .compose(local.saveUser())
        .toFlowable()
        .filter(userEntity -> userEntity != null)
        .map(userEntity -> userMapperFactory.getUserMapper().transform(userEntity));
  }

  @Override public Flowable<User> disconnectGoogle() {
    return remote.disconnectGoogle()
        .compose(local.saveUser())
        .toFlowable()
        .filter(userEntity -> userEntity != null)
        .map(userEntity -> userMapperFactory.getUserMapper().transform(userEntity));
  }

  @Override public Flowable<PrivacyStatus> changeDisplayName(DisplayNameIdent displayNameIdent) {
    return remote.changeDisplayName(displayNameIdent)
        .compose(local.saveUser())
        .toFlowable()
        .filter(userEntity -> userEntity != null)
        .map(userEntity -> userMapperFactory.getUserMapper().transform(userEntity))
        .map(
            user -> new PrivacyStatus(user.getProfileViewPermission(), user.getDisplayNameIdent()));
  }

  @Override
  public Flowable<PrivacyStatus> changePrivacy(ProfileViewPermission profileViewPermission) {
    return remote.changePrivacy(profileViewPermission)
        .compose(local.saveUser())
        .toFlowable()
        .filter(userEntity -> userEntity != null)
        .map(userEntity -> userMapperFactory.getUserMapper().transform(userEntity))
        .map(
            user -> new PrivacyStatus(user.getProfileViewPermission(), user.getDisplayNameIdent()));
  }

  @Override public Flowable<User> changeNotifications(NotificationValues notificationValues) {
    return remote.changeNotifications(notificationValues)
        .compose(local.saveUser())
        .toFlowable()
        .filter(userEntity -> userEntity != null)
        .map(userEntity -> userMapperFactory.getUserMapper().transform(userEntity));
  }

  @Override public Flowable<ConnectCounts> getConnectCounts(boolean refresh) {
    return Flowable.concatArrayDelayError(local.getConnectCounts().toFlowable(),
        remote.getConnectCounts().compose(local.saveConnectCounts()).toFlowable())
        .filter(data -> data != null)
        .map(counts -> userMapperFactory.getConnectCountsMapper().transform(counts));
  }

  @Override public Flowable<List<SystemMessage>> getSystemMessagesThreads() {
    return Flowable.concatArrayDelayError(local.getSystemMessagesThreads().toFlowable(),
        remote.getSystemMessagesThreads().compose(local.saveSystemMessagesThreads()).toFlowable())
        .filter(data -> data != null)
        .map(threads -> userMapperFactory.geSystemMessagesList().transform(threads));
  }

  @Override public Flowable<Boolean> acknowledgeSystemMessage(String systemMessageId) {
    return remote.acknowledgeSystemMessage(systemMessageId).toFlowable();
  }

  @Override public Flowable<Boolean> syncSystemMessagesOnServer() {
    return local.getSystemMessagesThreads().map(systemMessageEntities -> {
      for (SystemMessageEntity systemMessage : systemMessageEntities) {
        acknowledgeSystemMessage(systemMessage.getId());
      }
      return true;
    }).toFlowable();
  }

  @Override public Flowable<Integer> getUnreadThreadsCount() {
    return Flowable.concatArrayDelayError(local.getUnreadThreads().toFlowable(),
        remote.getUnreadThreads().compose(local.saveUnreadThreads()).toFlowable())
        .filter(strings -> strings != null)
        .map(List::size);
  }

  @Override public Flowable<Integer> addUnreadThread(String newThreadId) {
    return Flowable.concatArrayDelayError(local.getUnreadThreads().toFlowable(),
        remote.getUnreadThreads().compose(local.saveUnreadThreads()).toFlowable())
        .filter(strings -> strings != null)
        .map(threads -> {
          if (!threads.contains(newThreadId)) {
            threads.add(newThreadId);
          }
          return threads;
        })
        .map(List::size);
  }

  @Override public Flowable<Integer> removeUnreadThread(String threadId) {
    return Maybe.concatArrayDelayError(local.getUnreadThreads(),
        remote.getUnreadThreads().compose(local.saveUnreadThreads()))
        .filter(strings -> strings != null)
        .flatMap(Flowable::fromIterable)
        .filter(thread -> !thread.equals(threadId))
        .toList()
        .map(List::size)
        .toFlowable();
  }

  @Override public Flowable<MyWallData> getMyWallData(boolean refresh) {
    return null;
    //return remote.getMyWallData().toFlowable().map(myWallDataEntity -> userMapperFactory.getMyWa);
  }

  @Override
  public Flowable<MyWallData> updateMyWallPrivacy(boolean memberSince, boolean favouriteClub,
      boolean favouriteYouthClub, boolean profession, boolean averageWinningBets, boolean bestScore,
      boolean age, boolean sex, boolean nationality, boolean recruitTreeSize) {
    return null;
  }
}
