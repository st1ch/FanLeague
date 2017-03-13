package com.fanleagueent.fanleague.data.net.requests.auth;

import com.google.gson.annotations.SerializedName;

public class EmailStandardRequest {

    @SerializedName("email")
    private String email;

    public EmailStandardRequest(String email){
        this.email = email;
    }
}
