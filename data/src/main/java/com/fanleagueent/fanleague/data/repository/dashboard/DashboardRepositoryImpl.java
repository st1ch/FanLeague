package com.fanleagueent.fanleague.data.repository.dashboard;

import com.fanleagueent.fanleague.data.entity.mappers.MapperFactory;
import com.fanleagueent.fanleague.data.repository.dashboard.datasource.DashboardDataSource;
import com.fanleagueent.fanleague.domain.models.dashboard.Dashboard;
import com.fanleagueent.fanleague.domain.models.dashboard.Update;
import com.fanleagueent.fanleague.domain.models.recruiting.InviteLink;
import com.fanleagueent.fanleague.domain.repository.DashboardRepository;
import io.reactivex.Flowable;

/**
 * Created by Artem Getman on 05.05.17.
 * a.e.getman@gmail.com
 */

public class DashboardRepositoryImpl implements DashboardRepository {

  private DashboardDataSource local;
  private DashboardDataSource remote;
  private MapperFactory mapperFactory;

  public DashboardRepositoryImpl(DashboardDataSource local, DashboardDataSource remote,
      MapperFactory mapperFactory) {
    this.local = local;
    this.remote = remote;
    this.mapperFactory = mapperFactory;
  }

  @Override public Flowable<Dashboard> getDashboard() {
    return Flowable.concatArrayDelayError(local.getDashboard().toFlowable(),
        remote.getDashboard().compose(local.saveDashboard()).toFlowable())
        .filter(data -> data != null)
        .map(dashboardEntity -> mapperFactory.dashboardMapperFactory()
            .getDashboardMapper()
            .transform(dashboardEntity));
  }

  @Override public Flowable<InviteLink> getInviteLink(boolean refresh) {
    return Flowable.concatArrayDelayError(local.getInviteLink().toFlowable(),
        remote.getInviteLink().compose(local.saveInviteLink()).toFlowable())
        .filter(data -> data != null)
        .map(inviteLinkEntity -> mapperFactory.recruitingMapperFactory()
            .getInviteLinkMapper()
            .transform(inviteLinkEntity));
  }

  @Override public Flowable<Update> getUpdateDetail(String slug) {
    return remote.getUpdate(slug)
        .filter(data -> data != null)
        .toFlowable()
        .map(updateEntity -> mapperFactory.dashboardMapperFactory()
            .getUpdateMapper()
            .transform(updateEntity));
  }
}
