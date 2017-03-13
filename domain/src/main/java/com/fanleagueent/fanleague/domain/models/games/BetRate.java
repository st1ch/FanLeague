package com.fanleagueent.fanleague.domain.models.games;

/**
 * Created by st1ch on 22.12.16.
 */

public class BetRate {

    private int communityRate;
    private int expertsRate;

    public int getCommunityRate() {
        return communityRate;
    }

    public void setCommunityRate(int communityRate) {
        this.communityRate = communityRate;
    }

    public int getExpertsRate() {
        return expertsRate;
    }

    public void setExpertsRate(int expertsRate) {
        this.expertsRate = expertsRate;
    }

    @Override
    public String toString() {
        return "BetRateEntity{" +
                "communityRate=" + communityRate +
                ", expertsRate=" + expertsRate +
                '}';
    }
}
