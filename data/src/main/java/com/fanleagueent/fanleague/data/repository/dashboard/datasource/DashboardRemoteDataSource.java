package com.fanleagueent.fanleague.data.repository.dashboard.datasource;

import com.fanleagueent.fanleague.data.entity.BaseResponse;
import com.fanleagueent.fanleague.data.entity.entities.dashboard.DashboardEntity;
import com.fanleagueent.fanleague.data.entity.entities.dashboard.UpdateEntity;
import com.fanleagueent.fanleague.data.entity.entities.recruiting.InviteLinkEntity;
import com.fanleagueent.fanleague.data.exception.NetworkConnectionException;
import com.fanleagueent.fanleague.data.exception.UnsupportedDataSourceOperationException;
import com.fanleagueent.fanleague.data.net.api.DashboardAPI;
import com.fanleagueent.fanleague.data.observables.BaseResponseObservable;
import com.fanleagueent.fanleague.data.repository.BaseRemoteDataSource;
import com.fanleagueent.fanleague.data.utils.ConnectionUtil;
import io.reactivex.Maybe;
import io.reactivex.MaybeTransformer;

/**
 * Created by Artem Getman on 05.05.17.
 * a.e.getman@gmail.com
 */

public class DashboardRemoteDataSource extends BaseRemoteDataSource implements DashboardDataSource {

  private DashboardAPI dashboardAPI;

  protected DashboardRemoteDataSource(ConnectionUtil connectionUtil, DashboardAPI dashboardAPI) {
    super(connectionUtil);
    this.dashboardAPI = dashboardAPI;
  }

  @Override public Maybe<DashboardEntity> getDashboard() {
    try {
      checkConnection();

      return dashboardAPI.getDashboard()
          .flatMap(BaseResponseObservable::new)
          .map(dashboardDataEntityBaseResponse -> dashboardDataEntityBaseResponse.getData()
              .getDashboard());
    } catch (NetworkConnectionException e) {
      return Maybe.error(e);
    }
  }

  @Override public MaybeTransformer<DashboardEntity, DashboardEntity> saveDashboard() {
    throw new UnsupportedDataSourceOperationException();
  }

  @Override public Maybe<InviteLinkEntity> getInviteLink() {
    try {
      checkConnection();

      return dashboardAPI.getInviteLink()
          .flatMap(BaseResponseObservable::new)
          .map(BaseResponse::getData);
    } catch (NetworkConnectionException e) {
      return Maybe.error(e);
    }
  }

  @Override public MaybeTransformer<InviteLinkEntity, InviteLinkEntity> saveInviteLink() {
    throw new UnsupportedDataSourceOperationException();
  }

  @Override public Maybe<UpdateEntity> getUpdate(String slug) {
    try {
      checkConnection();

      return dashboardAPI.getUpdateDetail(slug)
          .flatMap(BaseResponseObservable::new)
          .map(updateDataEntityBaseResponse -> updateDataEntityBaseResponse.getData().getUpdate());
    } catch (NetworkConnectionException e) {
      return Maybe.error(e);
    }
  }
}
