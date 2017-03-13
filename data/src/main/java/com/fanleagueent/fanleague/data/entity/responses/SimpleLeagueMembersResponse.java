package com.fanleagueent.fanleague.data.entity.responses;

import com.fanleagueent.fanleague.domain.models.leagues.SimpleLeagueMemberData;

/**
 * Created by alexeyverbitskiy on 12/8/16.
 */

public class SimpleLeagueMembersResponse extends BaseResponse<SimpleLeagueMemberData>{
    public SimpleLeagueMemberData getLeagueMembersData() {
        return data;
    }
}
