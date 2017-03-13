package com.fanleagueent.fanleague.data.net.requests.teams;

import com.fanleagueent.fanleague.domain.models.teams.UserId;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * Created by st1ch on 23.11.16.
 */

public class InviteToTeamUserRequest {

    @SerializedName("users")
    private List<UserId> userIdsList;

    @SerializedName("team")
    private String teamId;

    public InviteToTeamUserRequest(List<UserId> userIdsList, String teamId) {
        this.userIdsList = userIdsList;
        this.teamId = teamId;
    }

    public List<UserId> getUserIdsList() {
        return userIdsList;
    }

    public String getTeamId() {
        return teamId;
    }
}
