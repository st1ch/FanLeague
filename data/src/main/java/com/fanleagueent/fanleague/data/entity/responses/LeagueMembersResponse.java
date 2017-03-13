package com.fanleagueent.fanleague.data.entity.responses;

import com.fanleagueent.fanleague.domain.models.leagues.LeagueMemberData;

/**
 * Created by alexeyverbitskiy on 12/8/16.
 */

public class LeagueMembersResponse extends BaseResponse<LeagueMemberData>{
    public LeagueMemberData getLeagueMembersData() {
        return data;
    }
}
