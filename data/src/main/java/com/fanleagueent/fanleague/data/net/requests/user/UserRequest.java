package com.fanleagueent.fanleague.data.net.requests.user;

import com.google.gson.annotations.SerializedName;

/**
 * Created by st1ch on 23.11.16.
 */

public class UserRequest {
    @SerializedName("user")
    private String userId;

    public UserRequest(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }
}
