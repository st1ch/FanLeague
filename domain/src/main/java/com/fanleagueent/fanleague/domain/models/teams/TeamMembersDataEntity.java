package com.fanleagueent.fanleague.domain.models.teams;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * Created by st1ch on 23.11.16.
 */

public class TeamMembersDataEntity {

    @SerializedName("users")
    private List<TeamMemberEntityEntity> teamMemberEntities;

    public List<TeamMemberEntityEntity> getTeamMembersList() {
        return teamMemberEntities;
    }

}
