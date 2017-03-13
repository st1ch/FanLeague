package com.fanleagueent.fanleague.data.net.requests.auth;

import com.google.gson.annotations.SerializedName;

/**
 * Created by st1ch on 23.11.16.
 */

public class TokenRequest {
    @SerializedName("token")
    private String token;

    public TokenRequest(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }
}
