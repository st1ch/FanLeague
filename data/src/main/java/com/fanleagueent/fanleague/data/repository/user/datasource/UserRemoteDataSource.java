package com.fanleagueent.fanleague.data.repository.user.datasource;

import android.support.annotation.NonNull;

import com.fanleagueent.fanleague.data.entity.BaseResponse;
import com.fanleagueent.fanleague.data.entity.entities.locker_room.MyWallDataEntity;
import com.fanleagueent.fanleague.data.entity.entities.locker_room.PrivacyEntity;
import com.fanleagueent.fanleague.data.entity.entities.user.ConnectCountsEntity;
import com.fanleagueent.fanleague.data.entity.entities.user.DataTitleEntity;
import com.fanleagueent.fanleague.data.entity.entities.user.FavoriteClubEntity;
import com.fanleagueent.fanleague.data.entity.entities.user.SystemMessageEntity;
import com.fanleagueent.fanleague.data.entity.entities.user.UserEntity;
import com.fanleagueent.fanleague.data.exception.NetworkConnectionException;
import com.fanleagueent.fanleague.data.exception.UnsupportedDataSourceOperationException;
import com.fanleagueent.fanleague.data.net.api.UserAPI;
import com.fanleagueent.fanleague.data.net.requests.auth.TokenCredentials;
import com.fanleagueent.fanleague.data.net.requests.user.ChangeDepositRequest;
import com.fanleagueent.fanleague.data.net.requests.user.ChangeDisplayNameRequest;
import com.fanleagueent.fanleague.data.net.requests.user.ChangeEmailRequest;
import com.fanleagueent.fanleague.data.net.requests.user.ChangePasswordRequest;
import com.fanleagueent.fanleague.data.net.requests.user.ChangePrivacyRequest;
import com.fanleagueent.fanleague.data.net.requests.user.ChangeWagerRequest;
import com.fanleagueent.fanleague.data.net.requests.user.NotificationsRequest;
import com.fanleagueent.fanleague.data.net.requests.user.UpdateUserRequest;
import com.fanleagueent.fanleague.data.observables.BaseResponseObservable;
import com.fanleagueent.fanleague.data.repository.BaseRemoteDataSource;
import com.fanleagueent.fanleague.data.utils.ConnectionUtil;
import com.fanleagueent.fanleague.domain.models.user.DisplayNameIdent;
import com.fanleagueent.fanleague.domain.models.user.NotificationValues;
import com.fanleagueent.fanleague.domain.models.user.ProfileViewPermission;

import java.io.File;
import java.util.List;

import io.reactivex.Maybe;
import io.reactivex.MaybeTransformer;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/**
 * Created by Artem Getman on 31.03.17.
 * a.e.getman@gmail.com
 */

public class UserRemoteDataSource extends BaseRemoteDataSource implements UserDataSource {

  private UserAPI api;

  public UserRemoteDataSource(ConnectionUtil connectionUtil, UserAPI api) {
    super(connectionUtil);
    this.api = api;
  }

  @Override public Maybe<UserEntity> getUser() {
    try {
      checkConnection();

      return api.getUser()
          .flatMap(BaseResponseObservable::new)
          .map(userDataEntityBaseResponse -> userDataEntityBaseResponse.getData().getUserEntity());
    } catch (NetworkConnectionException e) {
      return Maybe.error(e);
    }
  }

  @Override public Maybe<UserEntity> updateUser(String firstName, String lastName, String username,
      String profession, String birthday, String sex, String nationality,
      String favouriteFootballClubId, String favouriteYouthClub, String streetAddress,
      String country, String postalCode, String city, String phoneNumber) {

    try {
      checkConnection();

      UpdateUserRequest updateUserRequest = UpdateUserRequest.builder()
          .firstName(firstName)
          .lastName(lastName)
          .username(username)
          .profession(profession)
          .birthday(birthday)
          .sex(sex)
          .nationality(nationality)
          .favouriteFootballClubId(favouriteFootballClubId)
          .favouriteYouthClub(favouriteYouthClub)
          .address(streetAddress)
          .country(country)
          .zip(postalCode)
          .city(city)
          .phone(phoneNumber)
          .build();

      return api.updateUser(updateUserRequest)
          .flatMap(BaseResponseObservable::new)
          .map(userDataEntityBaseResponse -> userDataEntityBaseResponse.getData().getUserEntity());
    } catch (NetworkConnectionException e) {
      return Maybe.error(e);
    }
  }

  @Override public MaybeTransformer<UserEntity, UserEntity> saveUser() {
    throw new UnsupportedDataSourceOperationException();
  }

  @Override public Maybe<UserEntity> changeDepositLimit(int depositLimit) {

    try {
      checkConnection();

      return api.changeDepositLimit(new ChangeDepositRequest(depositLimit))
          .flatMap(BaseResponseObservable::new)
          .map(userDataEntityBaseResponse -> userDataEntityBaseResponse.getData().getUserEntity());
    } catch (NetworkConnectionException e) {
      return Maybe.error(e);
    }
  }

  @Override public Maybe<UserEntity> changeWagerLimit(float wagerLimit) {
    try {
      checkConnection();

      return api.changeWagerLimit(new ChangeWagerRequest(wagerLimit))
          .flatMap(BaseResponseObservable::new)
          .map(userDataEntityBaseResponse -> userDataEntityBaseResponse.getData().getUserEntity());
    } catch (NetworkConnectionException e) {
      return Maybe.error(e);
    }
  }

  @Override public Maybe<List<DataTitleEntity>> getProfession() {
    try {
      checkConnection();

      return api.getProfessionList()
          .flatMap(BaseResponseObservable::new)
          .map(professionsEntityBaseResponse -> professionsEntityBaseResponse.getData()
              .getDataTitles());
    } catch (NetworkConnectionException e) {
      return Maybe.error(e);
    }
  }

  @Override public MaybeTransformer<List<DataTitleEntity>, List<DataTitleEntity>> saveProfession() {
    throw new UnsupportedDataSourceOperationException();
  }

  @Override public Maybe<List<DataTitleEntity>> getNationality() {
    try {
      checkConnection();

      return api.getNationalityList()
          .flatMap(BaseResponseObservable::new)
          .map(professionsEntityBaseResponse -> professionsEntityBaseResponse.getData()
              .getDataTitles());
    } catch (NetworkConnectionException e) {
      return Maybe.error(e);
    }
  }

  @Override
  public MaybeTransformer<List<DataTitleEntity>, List<DataTitleEntity>> saveNationality() {
    throw new UnsupportedDataSourceOperationException();
  }

  @Override public Maybe<List<DataTitleEntity>> getCountries() {
    try {
      checkConnection();

      return api.getCountryList()
          .flatMap(BaseResponseObservable::new)
          .map(
              countriesEntityBaseResponse -> countriesEntityBaseResponse.getData().getDataTitles());
    } catch (NetworkConnectionException e) {
      return Maybe.error(e);
    }
  }

  @Override public MaybeTransformer<List<DataTitleEntity>, List<DataTitleEntity>> saveCountries() {
    throw new UnsupportedDataSourceOperationException();
  }

  @Override public Maybe<List<FavoriteClubEntity>> getFavoriteClubs() {
    try {
      checkConnection();

      return api.getFavoriteClubsList()
          .flatMap(BaseResponseObservable::new)
          .map(favoriteClubDataEntityBaseResponse -> favoriteClubDataEntityBaseResponse.getData()
              .getFavoriteClubEntityList());
    } catch (NetworkConnectionException e) {
      return Maybe.error(e);
    }
  }

  @Override
  public MaybeTransformer<List<FavoriteClubEntity>, List<FavoriteClubEntity>> saveFavoriteClubs() {
    throw new UnsupportedDataSourceOperationException();
  }

  @Override public Maybe<UserEntity> changePhoto(@NonNull File photoFile) {
    try {
      checkConnection();

      // create RequestBody instance from file
      RequestBody requestFile =
          RequestBody.create(MediaType.parse("multipart/form-data"), photoFile);

      // MultipartBody.Part is used to send also the actual file name
      MultipartBody.Part body =
          MultipartBody.Part.createFormData("avatar", photoFile.getName(), requestFile);

      return api.changeAvatar(body)
          .flatMap(BaseResponseObservable::new)
          .map(userResponse -> userResponse.getData().getUserEntity());
    } catch (NetworkConnectionException e) {
      return Maybe.error(e);
    }
  }

  @Override public Maybe<UserEntity> deletePhoto() {
    try {
      checkConnection();

      return api.deleteAvatar()
          .flatMap(BaseResponseObservable::new)
          .map(userResponse -> userResponse.getData().getUserEntity());
    } catch (NetworkConnectionException e) {
      return Maybe.error(e);
    }
  }

  @Override public Maybe<Boolean> changeEmail(@NonNull String email, @NonNull String password) {
    try {
      checkConnection();

      return api.changeEmail(new ChangeEmailRequest(email, password))
          .flatMap(BaseResponseObservable::new)
          .map(response -> true);
    } catch (NetworkConnectionException e) {
      return Maybe.error(e);
    }
  }

  @Override
  public Maybe<Boolean> changePassword(@NonNull String password, @NonNull String confirmPassword,
      @NonNull String currentPassword) {
    try {
      checkConnection();

      return api.changePassword(
          new ChangePasswordRequest(password, confirmPassword, currentPassword))
          .flatMap(BaseResponseObservable::new)
          .map(baseResponse -> true);
    } catch (NetworkConnectionException e) {
      return Maybe.error(e);
    }
  }

  @Override public Maybe<UserEntity> connectFacebook(@NonNull String token) {
    try {
      checkConnection();

      return api.connectFacebook(new TokenCredentials(token))
          .flatMap(BaseResponseObservable::new)
          .map(userResponse -> userResponse.getData().getUserEntity());
    } catch (NetworkConnectionException e) {
      return Maybe.error(e);
    }
  }

  @Override public Maybe<UserEntity> disconnectFacebook() {
    try {
      checkConnection();

      return api.disconnectFacebook()
          .flatMap(BaseResponseObservable::new)
          .map(userResponse -> userResponse.getData().getUserEntity());
    } catch (NetworkConnectionException e) {
      return Maybe.error(e);
    }
  }

  @Override public Maybe<UserEntity> connectGoogle(@NonNull String token) {
    try {
      checkConnection();

      return api.connectGoogle(new TokenCredentials(token))
          .flatMap(BaseResponseObservable::new)
          .map(userResponse -> userResponse.getData().getUserEntity());
    } catch (NetworkConnectionException e) {
      return Maybe.error(e);
    }
  }

  @Override public Maybe<UserEntity> disconnectGoogle() {
    try {
      checkConnection();

      return api.disconnectGoogle()
          .flatMap(BaseResponseObservable::new)
          .map(userResponse -> userResponse.getData().getUserEntity());
    } catch (NetworkConnectionException e) {
      return Maybe.error(e);
    }
  }

  @Override public Maybe<UserEntity> changeDisplayName(DisplayNameIdent displayNameIdent) {
    try {
      checkConnection();

      return api.changeDisplayName(new ChangeDisplayNameRequest(displayNameIdent))
          .flatMap(BaseResponseObservable::new)
          .map(userResponse -> userResponse.getData().getUserEntity());
    } catch (NetworkConnectionException e) {
      return Maybe.error(e);
    }
  }

  @Override public Maybe<UserEntity> changePrivacy(ProfileViewPermission profileViewPermission) {
    try {
      checkConnection();

      return api.changePrivacy(new ChangePrivacyRequest(profileViewPermission))
          .flatMap(BaseResponseObservable::new)
          .map(userResponse -> userResponse.getData().getUserEntity());
    } catch (NetworkConnectionException e) {
      return Maybe.error(e);
    }
  }

  @Override public Maybe<UserEntity> changeNotifications(NotificationValues notificationValues) {
    try {
      checkConnection();

      return api.changeNotifications(NotificationsRequest.builder()
          .friendsSignup(notificationValues.isFriendsSignup())
          .gameResults(notificationValues.isGameResults())
          .upcomingMatchday(notificationValues.isUpcomingMatchday())
          .inbox(notificationValues.isInbox())
          .winnings(notificationValues.isWinnings())
          .leagueInvitations(notificationValues.isLeagueInvitations())
          .teamsInvitations(notificationValues.isTeamsInvitations())
          .build())
          .flatMap(BaseResponseObservable::new)
          .map(userResponse -> userResponse.getData().getUserEntity());
    } catch (NetworkConnectionException e) {
      return Maybe.error(e);
    }
  }

  @Override public Maybe<ConnectCountsEntity> getConnectCounts() {
    try {
      checkConnection();

      return api.getConnectCounts().flatMap(BaseResponseObservable::new).map(BaseResponse::getData);
    } catch (NetworkConnectionException e) {
      return Maybe.error(e);
    }
  }

  @Override public MaybeTransformer<ConnectCountsEntity, ConnectCountsEntity> saveConnectCounts() {
    throw new UnsupportedDataSourceOperationException();
  }

  @Override public Maybe<List<SystemMessageEntity>> getSystemMessagesThreads() {
    try {
      checkConnection();

      return api.getSystemMessages()
          .flatMap(BaseResponseObservable::new)
          .map(BaseResponse::getData);
    } catch (NetworkConnectionException e) {
      return Maybe.error(e);
    }
  }

  @Override
  public MaybeTransformer<List<SystemMessageEntity>, List<SystemMessageEntity>> saveSystemMessagesThreads() {
    throw new UnsupportedDataSourceOperationException();
  }

  @Override public Maybe<Boolean> acknowledgeSystemMessage(String systemMessageId) {
    try {
      checkConnection();

      return api.readMessage(systemMessageId)
          .flatMap(BaseResponseObservable::new)
          .map(response -> !response.isError());
    } catch (NetworkConnectionException e) {
      return Maybe.error(e);
    }
  }

  @Override public Maybe<List<String>> getUnreadThreads() {
    try {
      checkConnection();

      return api.getUnreadThreads().flatMap(BaseResponseObservable::new).map(BaseResponse::getData);
    } catch (NetworkConnectionException e) {
      return Maybe.error(e);
    }
  }

  @Override public MaybeTransformer<List<String>, List<String>> saveUnreadThreads() {
    throw new UnsupportedDataSourceOperationException();
  }

  @Override public Maybe<MyWallDataEntity> getMyWallData() {
    try {
      checkConnection();

      return api.getMyWall().flatMap(BaseResponseObservable::new).map(BaseResponse::getData);
    } catch (NetworkConnectionException e) {
      return Maybe.error(e);
    }
  }

  @Override
  public Maybe<MyWallDataEntity> updateMyWallPrivacy(boolean memberSince, boolean favouriteClub,
      boolean favouriteYouthClub, boolean profession, boolean averageWinningBets, boolean bestScore,
      boolean age, boolean sex, boolean nationality, boolean recruitTreeSize) {
    try {
      checkConnection();

      PrivacyEntity privacy = PrivacyEntity.builder()
          .memberSince(memberSince)
          .favouriteClub(favouriteClub)
          .favouriteYouthClub(favouriteYouthClub)
          .profession(profession)
          .averageWinningBets(averageWinningBets)
          .bestScore(bestScore)
          .age(age)
          .sex(sex)
          .nationality(nationality)
          .recruitTreeSize(recruitTreeSize)
          .build();

      return api.updateMyWallPrivacy(privacy)
          .flatMap(BaseResponseObservable::new)
          .map(BaseResponse::getData);
    } catch (NetworkConnectionException e) {
      return Maybe.error(e);
    }
  }
}
