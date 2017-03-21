package com.fanleagueent.fanleague.data.repository.activity_history.datasource;

import com.fanleagueent.fanleague.data.entity.entities.activity_history.ActivityHistoryAllDataEntity;
import com.fanleagueent.fanleague.data.entity.entities.activity_history.ActivityHistoryBetEntity;
import com.fanleagueent.fanleague.data.entity.entities.activity_history.ActivityHistoryGroupEntity;
import com.fanleagueent.fanleague.data.entity.entities.activity_history.ActivityHistoryUserEntity;
import io.reactivecache2.ProviderGroup;
import io.reactivecache2.ReactiveCache;
import io.reactivex.Maybe;
import java.util.List;

/**
 * Created by Artem Getman on 16.03.17.
 * a.e.getman@gmail.com
 */

class ActivityHistoryLocalDataSource implements ActivityHistoryDataSource {

  private final ProviderGroup<List<ActivityHistoryAllDataEntity>> allHistoryCache;
  private final ProviderGroup<List<ActivityHistoryUserEntity>> friendsHistoryCache;
  private final ProviderGroup<List<ActivityHistoryGroupEntity>> teamsHistoryCache;
  private final ProviderGroup<List<ActivityHistoryGroupEntity>> leaguesHistoryCache;
  private final ProviderGroup<List<ActivityHistoryBetEntity>> betsHistoryCache;

  public ActivityHistoryLocalDataSource(final ReactiveCache reactiveCache) {
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
    return allHistoryCache.read(offset).toMaybe();
  }

  @Override public Maybe<List<ActivityHistoryUserEntity>> getHistoryFriends(int offset) {
    return friendsHistoryCache.read(offset).toMaybe();
  }

  @Override public Maybe<List<ActivityHistoryGroupEntity>> getHistoryTeams(int offset) {
    return teamsHistoryCache.read(offset).toMaybe();
  }

  @Override public Maybe<List<ActivityHistoryGroupEntity>> getHistoryLeagues(int offset) {
    return leaguesHistoryCache.read(offset).toMaybe();
  }

  @Override public Maybe<List<ActivityHistoryBetEntity>> getHistoryBets(int offset) {
    return betsHistoryCache.read(offset).toMaybe();
  }
}
