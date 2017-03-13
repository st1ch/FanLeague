package com.fanleagueent.fanleague.data.net.requests.auth;

import com.google.gson.annotations.SerializedName;

public class FBCredentials {

    @SerializedName("code")
    private String code;

    @SerializedName("email")
    private String email;


    public FBCredentials (String code, String email) {
        this.code = code;
        this.email = email;
    }
}
