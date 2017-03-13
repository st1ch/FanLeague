package com.fanleagueent.fanleague.data.net.requests.auth;

import com.google.gson.annotations.SerializedName;

/**
 * Created by st1ch on 09.11.2016.
 */

public class TokenCredentials {

    @SerializedName("code")
    String token;

    public TokenCredentials(String token) {
        this.token = token;
    }
}
