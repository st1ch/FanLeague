package com.fanleagueent.fanleague.data.entity.entities.user;

import com.google.gson.annotations.SerializedName;

/**
 * Created by st1ch on 05.12.16.
 */

public class WeeklyDepositLimitEntity {
    private int current;
    private int pending;

    @SerializedName("pending_message")
    private String pendingMessage;

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public int getPending() {
        return pending;
    }

    public String getPendingMessage() {
        return pendingMessage;
    }

}
