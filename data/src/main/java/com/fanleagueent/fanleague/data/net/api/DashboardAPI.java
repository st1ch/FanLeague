package com.fanleagueent.fanleague.data.net.api;

import com.fanleagueent.fanleague.data.constants.ApiConfig;
import com.fanleagueent.fanleague.data.entity.BaseResponse;
import com.fanleagueent.fanleague.data.entity.entities.dashboard.DashboardDataEntity;
import com.fanleagueent.fanleague.data.entity.entities.dashboard.UpdateDataEntity;
import com.fanleagueent.fanleague.data.entity.entities.recruiting.InviteLinkEntity;
import io.reactivex.Maybe;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by alexeyverbitskiy on 3/7/17.
 */

public interface DashboardAPI {

  String DASHBOARD = "/dashboard";
  //String GAMEWEEK_TURNOVER = "/gameweek_turnover";
  //String COMMUNITY_MEMBERS = "/community_members";
  String UPDATES = "/updates";
  String RECRUIT = "/recruit";
  String INVITE_LINK = "/invite-link";
  String SLUG = "slug";
  String GET_UPDATE_SLUG = "/{" + SLUG + "}";

  @GET(ApiConfig.API_VERSION + DASHBOARD) Maybe<BaseResponse<DashboardDataEntity>> getDashboard();

  @GET(ApiConfig.API_VERSION + RECRUIT + INVITE_LINK)
  Maybe<BaseResponse<InviteLinkEntity>> getInviteLink();

  @GET(ApiConfig.API_VERSION + DASHBOARD + UPDATES + GET_UPDATE_SLUG)
  Maybe<BaseResponse<UpdateDataEntity>> getUpdateDetail(@Path(SLUG) String slug);
}
