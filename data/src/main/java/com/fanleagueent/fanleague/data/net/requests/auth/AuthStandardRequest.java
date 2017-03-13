package com.fanleagueent.fanleague.data.net.requests.auth;

import com.google.gson.annotations.SerializedName;

public class AuthStandardRequest {

    @SerializedName("login")
    private String login;

    @SerializedName("password")
    private String password;

    public AuthStandardRequest(String login, String password) {
        this.login = login;
        this.password = password;
    }
}
