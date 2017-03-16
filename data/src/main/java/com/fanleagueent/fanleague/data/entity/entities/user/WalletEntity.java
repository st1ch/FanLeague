package com.fanleagueent.fanleague.data.entity.entities.user;

import com.google.gson.annotations.SerializedName;

/**
 * Created by alexeyverbitskiy on 11/10/16.
 */

public class WalletEntity {
    @SerializedName("_id")
    private String id;

    @SerializedName("user_id")
    private String userId;

    @SerializedName("credit_balance")
    private int creditBalance;

    @SerializedName("money_balance")
    private double moneyBalance;

    @SerializedName("credit_in_money_equivalent")
    private float creditInMoneyEquivalent;

    public String getId() {
        return id;
    }

    public String getUserId() {
        return userId;
    }

    public int getCreditBalance() {
        return creditBalance;
    }

    public double getMoneyBalance() {
        return moneyBalance;
    }

    public float getCreditInMoneyEquivalent() {
        return creditInMoneyEquivalent;
    }
}
