package com.fanleagueent.fanleague.domain.models.teams;

import com.fanleagueent.fanleague.domain.models.user.User;

/**
 * Created by st1ch on 23.11.16.
 */

public class TeamUserData {
    private User userEntity;
    private Team team;

    public User getUserEntity() {
        return userEntity;
    }

    public Team getTeam() {
        return team;
    }
}
