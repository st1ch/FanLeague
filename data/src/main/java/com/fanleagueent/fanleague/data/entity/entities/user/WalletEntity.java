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

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getCreditBalance() {
        return creditBalance;
    }

    public void setCreditBalance(int creditBalance) {
        this.creditBalance = creditBalance;
    }

    public double getMoneyBalance() {
        return moneyBalance;
    }

    public void setMoneyBalance(double moneyBalance) {
        this.moneyBalance = moneyBalance;
    }

    public float getCreditInMoneyEquivalent() {
        return creditInMoneyEquivalent;
    }

    public void setCreditInMoneyEquivalent(int creditInMoneyEquivalent) {
        this.creditInMoneyEquivalent = creditInMoneyEquivalent;
    }

    @Override
    public String toString() {
        return "WalletEntity{" +
                "id='" + id + '\'' +
                ", userId='" + userId + '\'' +
                ", creditBalance=" + creditBalance +
                ", moneyBalance=" + moneyBalance +
                ", creditInMoneyEquivalent=" + creditInMoneyEquivalent +
                '}';
    }
}
