package com.fanleagueent.fanleague.domain.models.leagues;

import java.util.List;

/**
 * Created by alexeyverbitskiy on 12/8/16.
 */

public class LeagueMemberData {

    private List<LeagueMember> leagueMemberEntities;
    private int count;

    public List<LeagueMember> getTeamMembersList() {
        return leagueMemberEntities;
    }

    public int getCount() {
        return count;
    }
}
