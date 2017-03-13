package com.fanleagueent.fanleague.domain.models.user;

import com.google.gson.annotations.SerializedName;

/**
 * Created by alexeyverbitskiy on 11/7/16.
 */

public class UserDataEntity {

    @SerializedName("user")
    private User user;

    public User getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "UserDataEntity{" +
                "userEntity=" + user +
                '}';
    }
}
