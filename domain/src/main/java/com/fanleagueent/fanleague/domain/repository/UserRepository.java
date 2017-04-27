package com.fanleagueent.fanleague.domain.repository;

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
import io.reactivex.Flowable;
import io.reactivex.annotations.NonNull;
import java.io.File;
import java.util.List;

/**
 * Created by st1ch on 09.12.16.
 */

public interface UserRepository {

  Flowable<UserGeneralData> getUserData(boolean refresh);

  Flowable<User> getUser(boolean refresh);

  Flowable<User> updateUser(String firstName, String lastName, String username, String profession,
      String birthday, String sex, String nationality, int yearlyEarnings,
      String favouriteFootballClubId, String favouriteYouthClub, int weeklyDepositLimit,
      String streetAddress, String country, String postalCode, String city, String phoneNumber);

  Flowable<User> changeDepositLimit(int depositLimit);

  Flowable<User> changeWagerLimit(float wagerLimit);

  Flowable<List<DataTitle>> getProfession();

  Flowable<List<DataTitle>> getNationality();

  Flowable<List<DataTitle>> getCountries();

  Flowable<List<FavoriteClub>> getFavoriteClubs();

  Flowable<User> changePhoto(@NonNull File photoFile);

  Flowable<User> deletePhoto();

  Flowable<Boolean> changeEmail(@NonNull String email, @NonNull String password);

  Flowable<Boolean> changePassword(@NonNull String password, @NonNull String confirmPassword,
      @NonNull String currentPassword);

  Flowable<User> connectFacebook(@NonNull String token);

  Flowable<User> disconnectFacebook();

  Flowable<User> connectGoogle(@NonNull String token);

  Flowable<User> disconnectGoogle();

  Flowable<PrivacyStatus> changeDisplayName(DisplayNameIdent displayNameIdent);

  Flowable<PrivacyStatus> changePrivacy(ProfileViewPermission profileViewPermission);

  Flowable<User> changeNotifications(NotificationValues notificationValues);

  Flowable<ConnectCounts> getConnectCounts(boolean refresh);

  Flowable<List<SystemMessage>> getSystemMessagesThreads();

  Flowable<Boolean> acknowledgeSystemMessage(String systemMessageId);

  Flowable<Boolean> syncSystemMessagesOnServer();

  Flowable<Integer> getUnreadThreadsCount();

  Flowable<Integer> addUnreadThread(String newThreadId);

  Flowable<Integer> removeUnreadThread(String threadId);

  Flowable<MyWallData> getMyWallData(boolean refresh);

  Flowable<MyWallData> updateMyWallPrivacy(boolean memberSince, boolean favouriteClub,
      boolean favouriteYouthClub, boolean profession, boolean averageWinningBets, boolean bestScore,
      boolean age, boolean sex, boolean nationality, boolean recruitTreeSize);
}
