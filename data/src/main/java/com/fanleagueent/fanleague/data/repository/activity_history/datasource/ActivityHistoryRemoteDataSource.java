package com.fanleagueent.fanleague.data.repository.activity_history.datasource;

import com.fanleagueent.fanleague.data.entity.BaseResponse;
import com.fanleagueent.fanleague.data.entity.entities.activity_history.ActivityHistoryAllDataEntity;
import com.fanleagueent.fanleague.data.exception.NetworkConnectionException;
import com.fanleagueent.fanleague.data.exception.UnsupportedDataSourceOperationException;
import com.fanleagueent.fanleague.data.net.api.ActivityHistoryAPI;
import com.fanleagueent.fanleague.data.observables.BaseResponseObservable;
import com.fanleagueent.fanleague.data.utils.ConnectionUtil;
import io.reactivex.Maybe;
import io.reactivex.MaybeTransformer;
import java.util.List;

/**
 * Created by Artem Getman on 16.03.17.
 * a.e.getman@gmail.com
 */

public class ActivityHistoryRemoteDataSource implements ActivityHistoryDataSource {

  private ConnectionUtil connectionUtil;
  private ActivityHistoryAPI activityHistoryAPI;

  public ActivityHistoryRemoteDataSource(ConnectionUtil connectionUtil,
      ActivityHistoryAPI activityHistoryAPI) {
    this.connectionUtil = connectionUtil;
    this.activityHistoryAPI = activityHistoryAPI;
  }

  @Override public Maybe<List<ActivityHistoryAllDataEntity>> getHistoryAll(int offset) {
    if (!connectionUtil.isThereInternetConnection()) return Maybe.error(new NetworkConnectionException());

    return activityHistoryAPI.getHistoryAll(offset)
        .flatMap(BaseResponseObservable::new)
        .map(BaseResponse::getData);
  }

  @Override
  public MaybeTransformer<List<ActivityHistoryAllDataEntity>, List<ActivityHistoryAllDataEntity>> saveHistoryAll(
      int offset) {
    throw new UnsupportedDataSourceOperationException();
  }

  @Override public Maybe<List<ActivityHistoryAllDataEntity>> getHistoryFriends(int offset) {
    if (!connectionUtil.isThereInternetConnection()) return Maybe.error(new NetworkConnectionException());

    return activityHistoryAPI.getHistoryFriends(offset)
        .flatMap(BaseResponseObservable::new)
        .map(BaseResponse::getData);
  }

  @Override
  public MaybeTransformer<List<ActivityHistoryAllDataEntity>, List<ActivityHistoryAllDataEntity>> saveHistoryFriends(
      int offset) {
    throw new UnsupportedDataSourceOperationException();
  }

  @Override public Maybe<List<ActivityHistoryAllDataEntity>> getHistoryTeams(int offset) {
    if (!connectionUtil.isThereInternetConnection()) return Maybe.error(new NetworkConnectionException());

    return activityHistoryAPI.getHistoryTeams(offset)
        .flatMap(BaseResponseObservable::new)
        .map(BaseResponse::getData);
  }

  @Override
  public MaybeTransformer<List<ActivityHistoryAllDataEntity>, List<ActivityHistoryAllDataEntity>> saveHistoryTeams(
      int offset) {
    throw new UnsupportedDataSourceOperationException();
  }

  @Override public Maybe<List<ActivityHistoryAllDataEntity>> getHistoryLeagues(int offset) {
    if (!connectionUtil.isThereInternetConnection()) return Maybe.error(new NetworkConnectionException());

    return activityHistoryAPI.getHistoryLeagues(offset)
        .flatMap(BaseResponseObservable::new)
        .map(BaseResponse::getData);
  }

  @Override
  public MaybeTransformer<List<ActivityHistoryAllDataEntity>, List<ActivityHistoryAllDataEntity>> saveHistoryLeagues(
      int offset) {
    throw new UnsupportedDataSourceOperationException();
  }

  @Override public Maybe<List<ActivityHistoryAllDataEntity>> getHistoryBets(int offset) {
    if (!connectionUtil.isThereInternetConnection()) return Maybe.error(new NetworkConnectionException());

    return activityHistoryAPI.getHistoryBets(offset)
        .flatMap(BaseResponseObservable::new)
        .map(BaseResponse::getData);
  }

  @Override
  public MaybeTransformer<List<ActivityHistoryAllDataEntity>, List<ActivityHistoryAllDataEntity>> saveHistoryBets(
      int offset) {
    throw new UnsupportedDataSourceOperationException();
  }
}
