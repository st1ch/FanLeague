package com.fanleagueent.fanleague.data.net.api;

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

  //@GET(ApiConfig.API_VERSION + RECRUIT + TREE) Observable<BaseResponse<RecruitTreeDataEntity>> getTree();
  //
  //@GET(ApiConfig.API_VERSION + RECRUIT + OVERVIEW)
  //Observable<BaseResponse<RecruitOverviewDataEntity>> getOverview();
  //
  //@GET(ApiConfig.API_VERSION + RECRUIT + INVITES)
  //Observable<BaseResponse<RecruitInvitesDataEntity>> getInvites(@Query(OFFSET) int offset);
  //
  //@GET(ApiConfig.API_VERSION + RECRUIT + INVITE_LINK)
  //Observable<BaseResponse<InviteLinkEntity>> getInviteLink();
}
