package com.fanleagueent.fanleague.data.entity.responses;

import com.fanleagueent.fanleague.domain.models.teams.TeamsData;

/**
 * Created by st1ch on 23.11.16.
 */

public class TeamsResponse extends BaseResponse<TeamsData> {
    public TeamsData getTeamsData() {
        return data;
    }
}
