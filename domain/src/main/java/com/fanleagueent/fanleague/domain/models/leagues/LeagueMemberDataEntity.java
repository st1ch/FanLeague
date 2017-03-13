package com.fanleagueent.fanleague.domain.models.leagues;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * Created by alexeyverbitskiy on 12/8/16.
 */

public class LeagueMemberDataEntity {

    @SerializedName("users")
    private List<LeagueMemberEntityEntity> leagueMemberEntities;

    @SerializedName("total")
    private int count;

    public List<LeagueMemberEntityEntity> getTeamMembersList() {
        return leagueMemberEntities;
    }

    public int getCount() {
        return count;
    }
}
