package com.fanleagueent.fanleague.data.entity.responses;

import com.fanleagueent.fanleague.domain.models.teams.TeamAdminsData;

/**
 * Created by st1ch on 23.11.16.
 */

public class TeamAdminsResponse extends BaseResponse<TeamAdminsData>{
    public TeamAdminsData getTeamMembersData() {
        return data;
    }
}
