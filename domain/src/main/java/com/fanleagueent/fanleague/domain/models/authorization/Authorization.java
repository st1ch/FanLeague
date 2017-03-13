package com.fanleagueent.fanleague.domain.models.authorization;

import com.fanleagueent.fanleague.domain.models.user.User;

/**
 * Created by alexey on 21.10.16.
 */

public class Authorization {
    private String accessToken;
    private User user;

    public String getAccessToken() {
        return accessToken;
    }

    public User getUser() {
        return user;
    }
}
