package com.fanleagueent.fanleague.data.entity.entities.teams;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * Created by st1ch on 23.11.16.
 */

public class TeamsDataEntity {

    @SerializedName("teams")
    private List<TeamEntity> teamsList;

    @SerializedName("total")
    private int totalCount;

    public List<TeamEntity> getTeamList() {
        return teamsList;
    }

    public int getTotalCount() {
        return totalCount;
    }
}
