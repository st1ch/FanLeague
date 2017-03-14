package com.fanleagueent.fanleague.data.entity.entities.games;

import com.google.gson.annotations.SerializedName;

/**
 * Created by st1ch on 22.12.16.
 */

public class BetRateEntity {

    @SerializedName("community_rate")
    private int communityRate;

    @SerializedName("experts_rate")
    private int expertsRate;

    public int getCommunityRate() {
        return communityRate;
    }

    public int getExpertsRate() {
        return expertsRate;
    }

    @Override
    public String toString() {
        return "BetRateEntity{" +
                "communityRate=" + communityRate +
                ", expertsRate=" + expertsRate +
                '}';
    }
}
