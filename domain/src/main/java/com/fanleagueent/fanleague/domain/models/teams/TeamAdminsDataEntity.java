package com.fanleagueent.fanleague.domain.models.teams;

import java.util.List;

/**
 * Created by st1ch on 23.11.16.
 */

public class TeamAdminsDataEntity {

    @SerializedName("admins")
    private List<TeamMemberEntityEntity> teamMemberEntities;

    public List<TeamMemberEntityEntity> getTeamMembersList() {
        return teamMemberEntities;
    }

}
