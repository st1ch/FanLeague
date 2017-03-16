package com.fanleagueent.fanleague.domain.models.user;

/**
 * Created by alexeyverbitskiy on 11/7/16.
 */

public class UserData {

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "UserDataEntity{" +
                "userEntity=" + user +
                '}';
    }
}
