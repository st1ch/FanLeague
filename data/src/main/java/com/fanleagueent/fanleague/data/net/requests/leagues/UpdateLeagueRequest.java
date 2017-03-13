package com.fanleagueent.fanleague.data.net.requests.leagues;

import com.google.gson.annotations.SerializedName;

/**
 * Created by alexeyverbitskiy on 12/8/16.
 */

public class UpdateLeagueRequest {
    @SerializedName("name")
    String name;

    public UpdateLeagueRequest(String name){
        this.name = name;
    }
}
