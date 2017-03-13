package com.fanleagueent.fanleague.data.entity.responses;

import com.fanleagueent.fanleague.domain.models.leagues.LeagueData;

/**
 * Created by alexeyverbitskiy on 12/8/16.
 */

public class LeagueResponse extends BaseResponse<LeagueData> {
    public LeagueData getLeagueData() {
        return data;
    }
}
