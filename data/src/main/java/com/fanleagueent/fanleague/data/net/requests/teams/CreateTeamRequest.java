package com.fanleagueent.fanleague.data.net.requests.teams;

import com.google.gson.annotations.SerializedName;

/**
 * Created by st1ch on 23.11.16.
 */

public class CreateTeamRequest {

    @SerializedName("name")
    private String name;

    @SerializedName("is_only_admin_can_change_bet")
    private boolean isOnlyAdminCanChangeBet;

    @SerializedName("weekly_betting_amount_per_member")
    private String weeklyBettingAmountPerMember;

    public CreateTeamRequest(
            String name,
            boolean isOnlyAdminCanChangeBet,
            String weeklyBettingAmountPerMember
    ) {
        this.name = name;
        this.isOnlyAdminCanChangeBet = isOnlyAdminCanChangeBet;
        this.weeklyBettingAmountPerMember = weeklyBettingAmountPerMember;
    }
}
