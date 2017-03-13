package com.fanleagueent.fanleague.data.entity.responses;

import com.fanleagueent.fanleague.domain.models.leagues.LeaguesData;

/**
 * Created by alexeyverbitskiy on 12/8/16.
 */

public class LeaguesResponse extends BaseResponse<LeaguesData> {
    public LeaguesData getLeaguesData() {
        return data;
    }
}
