package com.fanleagueent.fanleague.domain.repository;

import com.fanleagueent.fanleague.domain.models.recruiting.InviteLink;
import io.reactivex.Flowable;
import io.reactivex.Observable;

/**
 * Created by alexeyverbitskiy on 02/02/17.
 */

public interface DashboardRepository {
  Flowable<Dashboard> getDashboard();
  Flowable<Dashboard> getLocalDashboard();
  Flowable<InviteLink> getInviteLink(boolean refresh);
  Flowable<Update> getUpdateDetail(String slug);
}
