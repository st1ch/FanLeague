package com.fanleagueent.fanleague.data.entity.entities.teams;

import com.google.gson.annotations.SerializedName;
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
