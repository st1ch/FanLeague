package com.fanleagueent.fanleague.data.net.requests.user;

import com.google.gson.annotations.SerializedName;

public class ChangeEmailRequest {

    @SerializedName("email")
    private String email;

    @SerializedName("password")
    private String password;

    public ChangeEmailRequest(String email, String password) {
        this.email = email;
        this.password = password;
    }
}
