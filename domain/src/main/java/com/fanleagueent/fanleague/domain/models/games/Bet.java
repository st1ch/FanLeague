package com.fanleagueent.fanleague.domain.models.games;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by st1ch on 23.12.16.
 */

public class Bet {

    private String id;
    private String userId;
    private int week;
    private Map<String, int[]> bets;
    private float price;
    private String betsPlayed;
    private float prize;
    private String updatedAt;
    private String createdAt;
    private String weekLabel;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getPrize() {
        return prize;
    }

    public void setPrize(float prize) {
        this.prize = prize;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getWeekLabel() {
        return weekLabel;
    }

    public void setWeekLabel(String weekLabel) {
        this.weekLabel = weekLabel;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Map<String, MatchBet> getBets() {
        Map<String, MatchBet> matchBets = new HashMap<>();
        for(String matchId : bets.keySet()){
            matchBets.put(matchId, new MatchBet(bets.get(matchId)));
        }
        return matchBets;
    }

    public void setBets(Map<String, int[]> bets) {
        this.bets = bets;
    }

    public String getBetsPlayed() {
        return betsPlayed;
    }

    public void setBetsPlayed(String betsPlayed) {
        this.betsPlayed = betsPlayed;
    }

    @Override
    public String toString() {
        return "BetEntity{" +
                "id='" + id + '\'' +
                ", prize=" + prize +
                ", price=" + price +
                ", week=" + week +
                ", createdAt='" + createdAt + '\'' +
                ", weekLabel='" + weekLabel + '\'' +
                ", userId='" + userId + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                ", bets=" + bets +
                ", betsPlayed='" + betsPlayed + '\'' +
                '}';
    }
}
