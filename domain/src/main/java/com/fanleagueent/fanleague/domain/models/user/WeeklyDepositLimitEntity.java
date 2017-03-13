package com.fanleagueent.fanleague.domain.models.user;

import com.google.gson.annotations.SerializedName;

/**
 * Created by st1ch on 05.12.16.
 */

public class WeeklyDepositLimitEntity {
    private int current;
    private int pending;
    @SerializedName("pending_message")
    private String pendingMessage;

    public WeeklyDepositLimitEntity(int current, int pending, String pendingMessage) {
        this.current = current;
        this.pending = pending;
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public int getPending() {
        return pending;
    }

    public void setPending(int pending) {
        this.pending = pending;
    }

    public String getPendingMessage() {
        return pendingMessage;
    }

    public void setPendingMessage(String pendingMessage) {
        this.pendingMessage = pendingMessage;
    }
}
