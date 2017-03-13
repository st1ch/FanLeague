package com.fanleagueent.fanleague.domain.models.leagues;

import com.fanleagueent.fanleague.domain.models.Member;

/**
 * Created by alexeyverbitskiy on 12/8/16.
 */

public class LeagueMember extends Member
    implements Comparable<LeagueMember>{
    @Override
    public int compareTo(LeagueMember leagueMember) {
        return id.compareTo(leagueMember.getId());
    }
}
