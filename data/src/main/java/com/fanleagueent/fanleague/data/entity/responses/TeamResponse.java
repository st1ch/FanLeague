package com.fanleagueent.fanleague.data.entity.responses;

import com.fanleagueent.fanleague.domain.models.teams.TeamData;

/**
 * Created by st1ch on 23.11.16.
 */

public class TeamResponse extends BaseResponse<TeamData> {

    public TeamData getTeamData() {
        return data;
    }
}
