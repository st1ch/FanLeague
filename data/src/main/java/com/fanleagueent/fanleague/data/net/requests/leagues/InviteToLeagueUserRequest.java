package com.fanleagueent.fanleague.data.net.requests.leagues;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * Created by alexeyverbitskiy on 12/8/16.
 */

public class InviteToLeagueUserRequest {

    @SerializedName("users")
    private List<UserId> userIdsList;

    @SerializedName("league")
    private String leagueId;

    public InviteToLeagueUserRequest(List<UserId> userIdsList, String leagueId) {
        this.userIdsList = userIdsList;
        this.leagueId = leagueId;
    }

    public List<UserId> getUserIdsList() {
        return userIdsList;
    }

    public String getLeagueId() {
        return leagueId;
    }
}
