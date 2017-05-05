package com.fanleagueent.fanleague.data.repository.dashboard.datasource;

import com.fanleagueent.fanleague.data.constants.CacheTitle;
import com.fanleagueent.fanleague.data.entity.entities.dashboard.DashboardEntity;
import com.fanleagueent.fanleague.data.entity.entities.dashboard.UpdateEntity;
import com.fanleagueent.fanleague.data.entity.entities.recruiting.InviteLinkEntity;
import com.fanleagueent.fanleague.data.exception.UnsupportedDataSourceOperationException;
import io.reactivecache2.Provider;
import io.reactivecache2.ReactiveCache;
import io.reactivex.Maybe;
import io.reactivex.MaybeTransformer;

/**
 * Created by Artem Getman on 05.05.17.
 * a.e.getman@gmail.com
 */

public class DashboardLocalDataSource implements DashboardDataSource {

  private final Provider<DashboardEntity> dashboardEntityProvider;
  private final Provider<InviteLinkEntity> inviteLinkEntityProvider;

  public DashboardLocalDataSource(final ReactiveCache reactiveCache) {
    this.dashboardEntityProvider =
        reactiveCache.<DashboardEntity>provider().withKey(CacheTitle.Dashboard.DASHBOARD);
    this.inviteLinkEntityProvider =
        reactiveCache.<InviteLinkEntity>provider().withKey(CacheTitle.Dashboard.INVITE_LINK);
  }

  @Override public Maybe<DashboardEntity> getDashboard() {
    return dashboardEntityProvider.read().toMaybe();
  }

  @Override public MaybeTransformer<DashboardEntity, DashboardEntity> saveDashboard() {
    return upstream -> upstream.toSingle().compose(dashboardEntityProvider.replace()).toMaybe();
  }

  @Override public Maybe<InviteLinkEntity> getInviteLink() {
    return inviteLinkEntityProvider.read().toMaybe();
  }

  @Override public MaybeTransformer<InviteLinkEntity, InviteLinkEntity> saveInviteLink() {
    return upstream -> upstream.toSingle().compose(inviteLinkEntityProvider.replace()).toMaybe();
  }

  @Override public Maybe<UpdateEntity> getUpdate(String slug) {
    throw new UnsupportedDataSourceOperationException();
  }
}
