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
import com.fanleagueent.fanleague.data.utils.ConnectionUtil;
import com.fanleagueent.fanleague.domain.models.user.DisplayNameIdent;
import com.fanleagueent.fanleague.domain.models.user.NotificationValues;
import com.fanleagueent.fanleague.domain.models.user.ProfileViewPermission;
import io.reactivex.Maybe;
import io.reactivex.MaybeTransformer;
import java.io.File;
import java.util.List;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/**
 * Created by Artem Getman on 31.03.17.
 * a.e.getman@gmail.com
 */

public class UserRemoteDataSource implements UserDataSource {

  private ConnectionUtil connectionUtil;
  private UserAPI api;

  public UserRemoteDataSource(ConnectionUtil connectionUtil, UserAPI api) {
    this.connectionUtil = connectionUtil;
    this.api = api;
  }

  @Override public Maybe<UserEntity> getUser() {
    if (!connectionUtil.isThereInternetConnection()) {
      return Maybe.error(new NetworkConnectionException());
    }

    return api.getUser()
        .flatMap(BaseResponseObservable::new)
        .map(userDataEntityBaseResponse -> userDataEntityBaseResponse.getData().getUserEntity());
  }

  @Override public Maybe<UserEntity> updateUser(String firstName, String lastName, String username,
      String profession, String birthday, String sex, String nationality,
      String favouriteFootballClubId, String favouriteYouthClub, String streetAddress,
      String country, String postalCode, String city, String phoneNumber) {
    if (!connectionUtil.isThereInternetConnection()) {
      return Maybe.error(new NetworkConnectionException());
    }

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
  }

  @Override public MaybeTransformer<UserEntity, UserEntity> saveUser() {
    throw new UnsupportedDataSourceOperationException();
  }

  @Override public Maybe<UserEntity> changeDepositLimit(int depositLimit) {
    if (!connectionUtil.isThereInternetConnection()) {
      return Maybe.error(new NetworkConnectionException());
    }

    return api.changeDepositLimit(new ChangeDepositRequest(depositLimit))
        .flatMap(BaseResponseObservable::new)
        .map(userDataEntityBaseResponse -> userDataEntityBaseResponse.getData().getUserEntity());
  }

  @Override public Maybe<UserEntity> changeWagerLimit(float wagerLimit) {
    if (!connectionUtil.isThereInternetConnection()) {
      return Maybe.error(new NetworkConnectionException());
    }

    return api.changeWagerLimit(new ChangeWagerRequest(wagerLimit))
        .flatMap(BaseResponseObservable::new)
        .map(userDataEntityBaseResponse -> userDataEntityBaseResponse.getData().getUserEntity());
  }

  @Override public Maybe<List<DataTitleEntity>> getProfession() {
    if (!connectionUtil.isThereInternetConnection()) {
      return Maybe.error(new NetworkConnectionException());
    }

    return api.getProfessionList()
        .flatMap(BaseResponseObservable::new)
        .map(professionsEntityBaseResponse -> professionsEntityBaseResponse.getData()
            .getDataTitles());
  }

  @Override public MaybeTransformer<List<DataTitleEntity>, List<DataTitleEntity>> saveProfession() {
    throw new UnsupportedDataSourceOperationException();
  }

  @Override public Maybe<List<DataTitleEntity>> getNationality() {
    if (!connectionUtil.isThereInternetConnection()) {
      return Maybe.error(new NetworkConnectionException());
    }

    return api.getNationalityList()
        .flatMap(BaseResponseObservable::new)
        .map(professionsEntityBaseResponse -> professionsEntityBaseResponse.getData()
            .getDataTitles());
  }

  @Override
  public MaybeTransformer<List<DataTitleEntity>, List<DataTitleEntity>> saveNationality() {
    throw new UnsupportedDataSourceOperationException();
  }

  @Override public Maybe<List<DataTitleEntity>> getCountries() {
    if (!connectionUtil.isThereInternetConnection()) {
      return Maybe.error(new NetworkConnectionException());
    }

    return api.getCountryList()
        .flatMap(BaseResponseObservable::new)
        .map(countriesEntityBaseResponse -> countriesEntityBaseResponse.getData().getDataTitles());
  }

  @Override public MaybeTransformer<List<DataTitleEntity>, List<DataTitleEntity>> saveCountries() {
    throw new UnsupportedDataSourceOperationException();
  }

  @Override public Maybe<List<FavoriteClubEntity>> getFavoriteClubs() {
    if (!connectionUtil.isThereInternetConnection()) {
      return Maybe.error(new NetworkConnectionException());
    }

    return api.getFavoriteClubsList()
        .flatMap(BaseResponseObservable::new)
        .map(favoriteClubDataEntityBaseResponse -> favoriteClubDataEntityBaseResponse.getData()
            .getFavoriteClubEntityList());
  }

  @Override
  public MaybeTransformer<List<FavoriteClubEntity>, List<FavoriteClubEntity>> saveFavoriteClubs() {
    throw new UnsupportedDataSourceOperationException();
  }

  @Override public Maybe<UserEntity> changePhoto(@NonNull File photoFile) {
    if (!connectionUtil.isThereInternetConnection()) {
      return Maybe.error(new NetworkConnectionException());
    }

    // create RequestBody instance from file
    RequestBody requestFile = RequestBody.create(MediaType.parse("multipart/form-data"), photoFile);

    // MultipartBody.Part is used to send also the actual file name
    MultipartBody.Part body =
        MultipartBody.Part.createFormData("avatar", photoFile.getName(), requestFile);

    return api.changeAvatar(body)
        .flatMap(BaseResponseObservable::new)
        .map(userResponse -> userResponse.getData().getUserEntity());
  }

  @Override public Maybe<UserEntity> deletePhoto() {
    if (!connectionUtil.isThereInternetConnection()) {
      return Maybe.error(new NetworkConnectionException());
    }

    return api.deleteAvatar()
        .flatMap(BaseResponseObservable::new)
        .map(userResponse -> userResponse.getData().getUserEntity());
  }

  @Override public Maybe<Boolean> changeEmail(@NonNull String email, @NonNull String password) {
    if (!connectionUtil.isThereInternetConnection()) {
      return Maybe.error(new NetworkConnectionException());
    }

    return api.changeEmail(new ChangeEmailRequest(email, password))
        .flatMap(BaseResponseObservable::new)
        .map(response -> true);
  }

  @Override
  public Maybe<Boolean> changePassword(@NonNull String password, @NonNull String confirmPassword,
      @NonNull String currentPassword) {
    if (!connectionUtil.isThereInternetConnection()) {
      return Maybe.error(new NetworkConnectionException());
    }

    return api.changePassword(new ChangePasswordRequest(password, confirmPassword, currentPassword))
        .flatMap(BaseResponseObservable::new)
        .map(baseResponse -> true);
  }

  @Override public Maybe<UserEntity> connectFacebook(@NonNull String token) {
    if (!connectionUtil.isThereInternetConnection()) {
      return Maybe.error(new NetworkConnectionException());
    }

    return api.connectFacebook(new TokenCredentials(token))
        .flatMap(BaseResponseObservable::new)
        .map(userResponse -> userResponse.getData().getUserEntity());
  }

  @Override public Maybe<UserEntity> disconnectFacebook() {
    if (!connectionUtil.isThereInternetConnection()) {
      return Maybe.error(new NetworkConnectionException());
    }

    return api.disconnectFacebook()
        .flatMap(BaseResponseObservable::new)
        .map(userResponse -> userResponse.getData().getUserEntity());
  }

  @Override public Maybe<UserEntity> connectGoogle(@NonNull String token) {
    if (!connectionUtil.isThereInternetConnection()) {
      return Maybe.error(new NetworkConnectionException());
    }

    return api.connectGoogle(new TokenCredentials(token))
        .flatMap(BaseResponseObservable::new)
        .map(userResponse -> userResponse.getData().getUserEntity());
  }

  @Override public Maybe<UserEntity> disconnectGoogle() {
    if (!connectionUtil.isThereInternetConnection()) {
      return Maybe.error(new NetworkConnectionException());
    }

    return api.disconnectGoogle()
        .flatMap(BaseResponseObservable::new)
        .map(userResponse -> userResponse.getData().getUserEntity());
  }

  @Override public Maybe<UserEntity> changeDisplayName(DisplayNameIdent displayNameIdent) {
    if (!connectionUtil.isThereInternetConnection()) {
      return Maybe.error(new NetworkConnectionException());
    }

    return api.changeDisplayName(new ChangeDisplayNameRequest(displayNameIdent))
        .flatMap(BaseResponseObservable::new)
        .map(userResponse -> userResponse.getData().getUserEntity());
  }

  @Override public Maybe<UserEntity> changePrivacy(ProfileViewPermission profileViewPermission) {
    if (!connectionUtil.isThereInternetConnection()) {
      return Maybe.error(new NetworkConnectionException());
    }

    return api.changePrivacy(new ChangePrivacyRequest(profileViewPermission))
        .flatMap(BaseResponseObservable::new)
        .map(userResponse -> userResponse.getData().getUserEntity());
  }

  @Override public Maybe<UserEntity> changeNotifications(NotificationValues notificationValues) {
    if (!connectionUtil.isThereInternetConnection()) {
      return Maybe.error(new NetworkConnectionException());
    }

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
  }

  @Override public Maybe<ConnectCountsEntity> getConnectCounts() {
    if (!connectionUtil.isThereInternetConnection()) {
      return Maybe.error(new NetworkConnectionException());
    }

    return api.getConnectCounts().flatMap(BaseResponseObservable::new).map(BaseResponse::getData);
  }

  @Override public MaybeTransformer<ConnectCountsEntity, ConnectCountsEntity> saveConnectCounts() {
    throw new UnsupportedDataSourceOperationException();
  }

  @Override public Maybe<List<SystemMessageEntity>> getSystemMessagesThreads() {
    if (!connectionUtil.isThereInternetConnection()) {
      return Maybe.error(new NetworkConnectionException());
    }

    return api.getSystemMessages().flatMap(BaseResponseObservable::new).map(BaseResponse::getData);
  }

  @Override
  public MaybeTransformer<List<SystemMessageEntity>, List<SystemMessageEntity>> saveSystemMessagesThreads() {
    throw new UnsupportedDataSourceOperationException();
  }

  @Override public Maybe<Boolean> acknowledgeSystemMessage(String systemMessageId) {
    if (!connectionUtil.isThereInternetConnection()) {
      return Maybe.error(new NetworkConnectionException());
    }

    return api.readMessage(systemMessageId)
        .flatMap(BaseResponseObservable::new)
        .map(response -> !response.isError());
  }

  @Override public Maybe<List<String>> getUnreadThreads() {
    if (!connectionUtil.isThereInternetConnection()) {
      return Maybe.error(new NetworkConnectionException());
    }

    return api.getUnreadThreads().flatMap(BaseResponseObservable::new).map(BaseResponse::getData);
  }

  @Override public MaybeTransformer<List<String>, List<String>> saveUnreadThreads() {
    throw new UnsupportedDataSourceOperationException();
  }

  @Override public Maybe<MyWallDataEntity> getMyWallData() {
    if (!connectionUtil.isThereInternetConnection()) {
      return Maybe.error(new NetworkConnectionException());
    }

    return api.getMyWall().flatMap(BaseResponseObservable::new).map(BaseResponse::getData);
  }

  @Override
  public Maybe<MyWallDataEntity> updateMyWallPrivacy(boolean memberSince, boolean favouriteClub,
      boolean favouriteYouthClub, boolean profession, boolean averageWinningBets, boolean bestScore,
      boolean age, boolean sex, boolean nationality, boolean recruitTreeSize) {
    if (!connectionUtil.isThereInternetConnection()) {
      return Maybe.error(new NetworkConnectionException());
    }

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
  }
}
