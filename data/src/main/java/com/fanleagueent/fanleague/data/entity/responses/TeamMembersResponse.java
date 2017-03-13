package com.fanleagueent.fanleague.data.entity.responses;

import com.fanleagueent.fanleague.domain.models.teams.TeamMembersData;

/**
 * Created by st1ch on 23.11.16.
 */

public class TeamMembersResponse extends BaseResponse<TeamMembersData>{
    public TeamMembersData getTeamMembersData() {
        return data;
    }
}
