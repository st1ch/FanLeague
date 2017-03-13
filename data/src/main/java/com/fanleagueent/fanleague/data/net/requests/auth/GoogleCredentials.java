package com.fanleagueent.fanleague.data.net.requests.auth;

import com.google.gson.annotations.SerializedName;

public class GoogleCredentials {

    @SerializedName("code")
    private String code;

    public GoogleCredentials (String code) {
        this.code = code;
    }
}
