package com.fanleagueent.fanleague.domain.models.friends;

import android.support.annotation.NonNull;
import com.fanleagueent.fanleague.data.entity.entities.MemberEntity;
import com.google.gson.annotations.SerializedName;

/**
 * Created by alexeyverbitskiy on 11/15/16.
 */

public class FriendEntity extends MemberEntity implements Comparable<FriendEntity> {

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

    @Override
    public int compareTo(@NonNull FriendEntity friendEntity) {
        return id.compareTo(friendEntity.getId());
    }
}
