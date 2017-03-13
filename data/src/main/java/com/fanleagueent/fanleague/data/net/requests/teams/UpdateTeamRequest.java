package com.fanleagueent.fanleague.data.net.requests.teams;

import com.google.gson.annotations.SerializedName;

/**
 * Created by st1ch on 23.11.16.
 */

public class UpdateTeamRequest {
    @SerializedName("name")
    private String name;

    @SerializedName("is_only_admin_can_change_bet")
    private boolean isOnlyAdminCanChangeBet;

    @SerializedName("amount")
    private int weeklyBettingAmount;

    public UpdateTeamRequest(String name, boolean isOnlyAdminCanChangeBet, int weeklyBettingAmount) {
        this.name = name;
        this.isOnlyAdminCanChangeBet = isOnlyAdminCanChangeBet;
        this.weeklyBettingAmount = weeklyBettingAmount;
    }

    public String getName() {
        return name;
    }

    public boolean isOnlyAdminCanChangeBet() {
        return isOnlyAdminCanChangeBet;
    }

    public int getWeeklyBettingAmount() {
        return weeklyBettingAmount;
    }
}
