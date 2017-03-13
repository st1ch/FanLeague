package com.fanleagueent.fanleague.data.entity.entities.friends;

import com.fanleagueent.fanleague.data.entity.entities.MemberEntity;
import com.google.gson.annotations.SerializedName;

/**
 * Created by alexeyverbitskiy on 11/15/16.
 */

public class FriendEntity extends MemberEntity {

    @SerializedName("is_team_invited")
    private boolean isTeamInvited;

    @SerializedName("is_league_invited")
    private boolean isLeagueInvited;

    public boolean isLeagueInvited() {
        return isLeagueInvited;
    }

    public boolean isTeamInvited() {
        return isTeamInvited;
    }
}
