package com.fanleagueent.fanleague.domain.models.user;

/**
 * Created by st1ch on 05.12.16.
 */

public class WeeklyDepositLimit {
    private int current;
    private int pending;
    private String pendingMessage;

    public WeeklyDepositLimit(int current, int pending, String pendingMessage) {
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
