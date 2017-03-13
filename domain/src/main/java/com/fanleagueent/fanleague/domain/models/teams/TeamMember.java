package com.fanleagueent.fanleague.domain.models.teams;

import com.fanleagueent.fanleague.domain.models.Member;

/**
 * Created by st1ch on 01.12.16.
 */

public class TeamMember extends Member
    implements Comparable<TeamMember> {

    @Override
    public int compareTo(TeamMember teamMember) {
        return id.compareTo(teamMember.getId());
    }
}
