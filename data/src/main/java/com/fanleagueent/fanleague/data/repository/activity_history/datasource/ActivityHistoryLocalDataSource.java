package com.fanleagueent.fanleague.data.repository.activity_history.datasource;

import com.fanleagueent.fanleague.data.constants.CacheTitle;
import com.fanleagueent.fanleague.data.entity.entities.activity_history.ActivityHistoryAllDataEntity;
import io.reactivecache2.ProviderGroup;
import io.reactivecache2.ReactiveCache;
import io.reactivex.Maybe;
import io.reactivex.MaybeTransformer;
import java.util.List;

/**
 * Created by Artem Getman on 16.03.17.
 * a.e.getman@gmail.com
 */

public class ActivityHistoryLocalDataSource implements ActivityHistoryDataSource {

  private final ProviderGroup<List<ActivityHistoryAllDataEntity>> allHistoryCache;
  private final ProviderGroup<List<ActivityHistoryAllDataEntity>> friendsHistoryCache;
  private final ProviderGroup<List<ActivityHistoryAllDataEntity>> teamsHistoryCache;
  private final ProviderGroup<List<ActivityHistoryAllDataEntity>> leaguesHistoryCache;
  private final ProviderGroup<List<ActivityHistoryAllDataEntity>> betsHistoryCache;

  public ActivityHistoryLocalDataSource(final ReactiveCache reactiveCache) {
    this.allHistoryCache =
        reactiveCache.<List<ActivityHistoryAllDataEntity>>providerGroup().withKey(
            CacheTitle.ActivityHistory.ALL_HISTORY);
    this.friendsHistoryCache =
        reactiveCache.<List<ActivityHistoryAllDataEntity>>providerGroup().withKey(
            CacheTitle.ActivityHistory.FRIENDS_HISTORY);
    this.teamsHistoryCache =
        reactiveCache.<List<ActivityHistoryAllDataEntity>>providerGroup().withKey(
            CacheTitle.ActivityHistory.TEAMS_HISTORY);
    this.leaguesHistoryCache =
        reactiveCache.<List<ActivityHistoryAllDataEntity>>providerGroup().withKey(
            CacheTitle.ActivityHistory.LEAGUES_HISTORY);
    this.betsHistoryCache =
        reactiveCache.<List<ActivityHistoryAllDataEntity>>providerGroup().withKey(
            CacheTitle.ActivityHistory.BETS_HISTORY);
  }

  @Override public Maybe<List<ActivityHistoryAllDataEntity>> getHistoryAll(int offset) {
    return allHistoryCache.read(offset).toMaybe();
  }

  @Override
  public MaybeTransformer<List<ActivityHistoryAllDataEntity>, List<ActivityHistoryAllDataEntity>> saveHistoryAll(
      int offset) {
    return upstream -> upstream.toSingle().compose(allHistoryCache.replace(offset)).toMaybe();
  }

  @Override public Maybe<List<ActivityHistoryAllDataEntity>> getHistoryFriends(int offset) {
    return friendsHistoryCache.read(offset).toMaybe();
  }

  @Override
  public MaybeTransformer<List<ActivityHistoryAllDataEntity>, List<ActivityHistoryAllDataEntity>> saveHistoryFriends(
      int offset) {
    return upstream -> upstream.toSingle().compose(friendsHistoryCache.replace(offset)).toMaybe();
  }

  @Override public Maybe<List<ActivityHistoryAllDataEntity>> getHistoryTeams(int offset) {
    return teamsHistoryCache.read(offset).toMaybe();
  }

  @Override
  public MaybeTransformer<List<ActivityHistoryAllDataEntity>, List<ActivityHistoryAllDataEntity>> saveHistoryTeams(
      int offset) {
    return upstream -> upstream.toSingle().compose(teamsHistoryCache.replace(offset)).toMaybe();
  }

  @Override public Maybe<List<ActivityHistoryAllDataEntity>> getHistoryLeagues(int offset) {
    return leaguesHistoryCache.read(offset).toMaybe();
  }

  @Override
  public MaybeTransformer<List<ActivityHistoryAllDataEntity>, List<ActivityHistoryAllDataEntity>> saveHistoryLeagues(
      int offset) {
    return upstream -> upstream.toSingle().compose(leaguesHistoryCache.replace(offset)).toMaybe();
  }

  @Override public Maybe<List<ActivityHistoryAllDataEntity>> getHistoryBets(int offset) {
    return betsHistoryCache.read(offset).toMaybe();
  }

  @Override
  public MaybeTransformer<List<ActivityHistoryAllDataEntity>, List<ActivityHistoryAllDataEntity>> saveHistoryBets(
      int offset) {
    return upstream -> upstream.toSingle().compose(betsHistoryCache.replace(offset)).toMaybe();
  }
}
