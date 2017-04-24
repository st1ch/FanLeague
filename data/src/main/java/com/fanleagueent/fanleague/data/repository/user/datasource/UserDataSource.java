package com.fanleagueent.fanleague.data.repository.user.datasource;

import android.support.annotation.NonNull;
import com.fanleagueent.fanleague.data.net.requests.user.NotificationsRequest;
import com.fanleagueent.fanleague.domain.models.user.ConnectCounts;
import com.fanleagueent.fanleague.domain.models.user.DataTitle;
import com.fanleagueent.fanleague.domain.models.user.DisplayNameIdent;
import com.fanleagueent.fanleague.domain.models.user.FavoriteClub;
import com.fanleagueent.fanleague.domain.models.user.ProfileViewPermission;
import com.fanleagueent.fanleague.domain.models.user.SystemMessage;
import com.fanleagueent.fanleague.domain.models.user.User;
import io.reactivex.Maybe;
import java.io.File;
import java.util.List;

/**
 * Created by Artem Getman on 31.03.17.
 * a.e.getman@gmail.com
 */

public interface UserDataSource {

  Maybe<User> getUser();

  Maybe<User> updateUser(String firstName, String lastName, String username, String profession,
      String birthday, String sex, String nationality, int yearlyEarnings,
      String favouriteFootballClubId, String favouriteYouthClub, int weeklyDepositLimit,
      String streetAddress, String country, String postalCode, String city, String phoneNumber);

  Maybe<User> changeDepositLimit(int depositLimit);

  Maybe<User> changeWagerLimit(float wagerLimit);

  Maybe<List<DataTitle>> getProfession();

  Maybe<List<DataTitle>> getNationality();

  Maybe<List<DataTitle>> getCountries();

  Maybe<List<FavoriteClub>> getFavoriteClubs();

  Maybe<User> changePhoto(@NonNull File photoFile);

  Maybe<User> deletePhoto();

  Maybe<Boolean> changeEmail(@NonNull String email, @NonNull String password);

  Maybe<Boolean> changePassword(@NonNull String password, @NonNull String confirmPassword,
      @NonNull String currentPassword);

  Maybe<User> connectFacebook(@NonNull String token);

  Maybe<User> disconnectFacebook();

  Maybe<User> connectGoogle(@NonNull String token);

  Maybe<User> disconnectGoogle();

  Maybe<User> changeDisplayName(DisplayNameIdent displayNameIdent);

  Maybe<User> changePrivacy(ProfileViewPermission profileViewPermission);

  Maybe<User> changeNotifications(NotificationsRequest notificationsRequest);

  Maybe<ConnectCounts> getConnectCounts();

  Maybe<List<SystemMessage>> getSystemMessagesThreads();

  Maybe<Boolean> acknowledgeSystemMessage(String systemMessageId);

  Maybe<List<String>> getUnreadThreads();
}
