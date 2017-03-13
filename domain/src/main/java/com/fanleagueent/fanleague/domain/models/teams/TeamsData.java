package com.fanleagueent.fanleague.domain.models.teams;

import java.util.List;

/**
 * Created by st1ch on 23.11.16.
 */

public class TeamsData {

    private List<Team> teamsList;
    private int totalCount;

    public List<Team> getTeamList() {
        return teamsList;
    }

    public int getTotalCount() {
        return totalCount;
    }
}
