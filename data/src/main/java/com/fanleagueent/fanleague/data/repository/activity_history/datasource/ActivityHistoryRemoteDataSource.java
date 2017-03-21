package com.fanleagueent.fanleague.data.repository.activity_history.datasource;

import com.fanleagueent.fanleague.data.entity.BaseResponse;
import com.fanleagueent.fanleague.data.entity.entities.activity_history.ActivityHistoryAllDataEntity;
import com.fanleagueent.fanleague.data.entity.entities.activity_history.ActivityHistoryBetEntity;
import com.fanleagueent.fanleague.data.entity.entities.activity_history.ActivityHistoryGroupEntity;
import com.fanleagueent.fanleague.data.entity.entities.activity_history.ActivityHistoryUserEntity;
import com.fanleagueent.fanleague.data.net.api.ActivityHistoryAPI;
import com.fanleagueent.fanleague.data.observables.BaseResponseObservable;
import io.reactivecache2.ProviderGroup;
import io.reactivecache2.ReactiveCache;
import io.reactivex.Maybe;
import java.util.List;

/**
 * Created by Artem Getman on 16.03.17.
 * a.e.getman@gmail.com
 */

class ActivityHistoryRemoteDataSource implements ActivityHistoryDataSource {

  private ActivityHistoryAPI activityHistoryAPI;
  private final ProviderGroup<List<ActivityHistoryAllDataEntity>> allHistoryCache;
  private final ProviderGroup<List<ActivityHistoryUserEntity>> friendsHistoryCache;
  private final ProviderGroup<List<ActivityHistoryGroupEntity>> teamsHistoryCache;
  private final ProviderGroup<List<ActivityHistoryGroupEntity>> leaguesHistoryCache;
  private final ProviderGroup<List<ActivityHistoryBetEntity>> betsHistoryCache;

  ActivityHistoryRemoteDataSource(ActivityHistoryAPI activityHistoryAPI,
      ReactiveCache reactiveCache) {
    this.activityHistoryAPI = activityHistoryAPI;
    this.allHistoryCache =
        reactiveCache.<List<ActivityHistoryAllDataEntity>>providerGroup().withKey(
            "allHistoryCache");
    this.friendsHistoryCache =
        reactiveCache.<List<ActivityHistoryUserEntity>>providerGroup().withKey(
            "friendsHistoryCache");
    this.teamsHistoryCache =
        reactiveCache.<List<ActivityHistoryGroupEntity>>providerGroup().withKey(
            "teamsHistoryCache");
    this.leaguesHistoryCache =
        reactiveCache.<List<ActivityHistoryGroupEntity>>providerGroup().withKey(
            "leaguesHistoryCache");
    this.betsHistoryCache =
        reactiveCache.<List<ActivityHistoryBetEntity>>providerGroup().withKey("betsHistoryCache");
  }

  @Override public Maybe<List<ActivityHistoryAllDataEntity>> getHistoryAll(int offset) {
    return activityHistoryAPI.getHistoryAll(offset)
        .flatMap(BaseResponseObservable::new)
        .map(BaseResponse::getData)
        .toSingle()
        .compose(allHistoryCache.replace(offset))
        .toMaybe();
  }

  @Override public Maybe<List<ActivityHistoryUserEntity>> getHistoryFriends(int offset) {
    return activityHistoryAPI.getHistoryFriends(offset)
        .flatMap(BaseResponseObservable::new)
        .map(BaseResponse::getData)
        .toSingle()
        .compose(friendsHistoryCache.replace(offset))
        .toMaybe();
  }

  @Override public Maybe<List<ActivityHistoryGroupEntity>> getHistoryTeams(int offset) {
    return activityHistoryAPI.getHistoryTeams(offset)
        .flatMap(BaseResponseObservable::new)
        .map(BaseResponse::getData)
        .toSingle()
        .compose(teamsHistoryCache.replace(offset))
        .toMaybe();
  }

  @Override public Maybe<List<ActivityHistoryGroupEntity>> getHistoryLeagues(int offset) {
    return activityHistoryAPI.getHistoryLeagues(offset)
        .flatMap(BaseResponseObservable::new)
        .map(BaseResponse::getData)
        .toSingle()
        .compose(leaguesHistoryCache.replace(offset))
        .toMaybe();
  }

  @Override public Maybe<List<ActivityHistoryBetEntity>> getHistoryBets(int offset) {
    return activityHistoryAPI.getHistoryBets(offset)
        .flatMap(BaseResponseObservable::new)
        .map(BaseResponse::getData)
        .toSingle()
        .compose(betsHistoryCache.replace(offset))
        .toMaybe();
  }
}
