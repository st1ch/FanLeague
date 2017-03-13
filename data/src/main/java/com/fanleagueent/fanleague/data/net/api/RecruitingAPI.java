package com.fanleagueent.fanleague.data.net.api;

import com.fanleagueent.fanleague.data.constants.ApiConfig;
import com.fanleagueent.fanleague.data.entity.BaseResponse;
import com.fanleagueent.fanleague.data.entity.entities.recruiting.InviteLinkEntity;
import com.fanleagueent.fanleague.data.entity.entities.recruiting.RecruitInvitesDataEntity;
import com.fanleagueent.fanleague.data.entity.entities.recruiting.RecruitOverviewDataEntity;
import com.fanleagueent.fanleague.data.entity.entities.recruiting.RecruitTreeDataEntity;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Artem Getman on 21.02.17.
 * a.e.getman@gmail.com
 */

public interface RecruitingAPI {

  String RECRUIT = "/recruit";

  String TREE = "/tree";
  String OVERVIEW = "/overview";
  String INVITES = "/invites";
  String INVITE_LINK = "/invite-link";

  String OFFSET = "offset";

  @GET(ApiConfig.API_VERSION + RECRUIT + TREE) Observable<BaseResponse<RecruitTreeDataEntity>> getTree();

  @GET(ApiConfig.API_VERSION + RECRUIT + OVERVIEW)
  Observable<BaseResponse<RecruitOverviewDataEntity>> getOverview();

  @GET(ApiConfig.API_VERSION + RECRUIT + INVITES)
  Observable<BaseResponse<RecruitInvitesDataEntity>> getInvites(@Query(OFFSET) int offset);

  @GET(ApiConfig.API_VERSION + RECRUIT + INVITE_LINK)
  Observable<BaseResponse<InviteLinkEntity>> getInviteLink();
}
