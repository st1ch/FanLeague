package com.fanleagueent.fanleague.data.net.requests.teams;

import com.google.gson.annotations.SerializedName;

/**
 * Created by st1ch on 23.11.16.
 */

public class AmountRequest {
    @SerializedName("amount")
    private int amount;

    public AmountRequest(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}
