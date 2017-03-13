package com.fanleagueent.fanleague.data.entity.responses;

import com.fanleagueent.fanleague.domain.models.leagues.LeagueAdminData;

/**
 * Created by alexeyverbitskiy on 12/8/16.
 */

public class LeagueAdminsResponse extends BaseResponse<LeagueAdminData>{
    public LeagueAdminData getLeagueAdmins() {
        return data;
    }
}
