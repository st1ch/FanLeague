package com.fanleagueent.fanleague.domain.models.user;

/**
 * Created by alexeyverbitskiy on 11/10/16.
 */

public class Wallet {
    private String id;
    private String userId;
    private int creditBalance;
    private double moneyBalance;
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
