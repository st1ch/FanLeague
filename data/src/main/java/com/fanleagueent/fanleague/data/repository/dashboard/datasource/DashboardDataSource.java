package com.fanleagueent.fanleague.data.repository.dashboard.datasource;

import com.fanleagueent.fanleague.data.entity.entities.dashboard.DashboardEntity;
import com.fanleagueent.fanleague.data.entity.entities.dashboard.UpdateEntity;
import com.fanleagueent.fanleague.data.entity.entities.recruiting.InviteLinkEntity;
import io.reactivex.Maybe;
import io.reactivex.MaybeTransformer;

/**
 * Created by Artem Getman on 05.05.17.
 * a.e.getman@gmail.com
 */

public interface DashboardDataSource {
  Maybe<DashboardEntity> getDashboard();

  MaybeTransformer<DashboardEntity, DashboardEntity> saveDashboard();

  Maybe<InviteLinkEntity> getInviteLink();

  MaybeTransformer<InviteLinkEntity, InviteLinkEntity> saveInviteLink();

  Maybe<UpdateEntity> getUpdate(String slug);
}
