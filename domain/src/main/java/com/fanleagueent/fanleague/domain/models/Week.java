package com.fanleagueent.fanleague.domain.models;


/**
 * Created by st1ch on 30.11.16.
 */

public class Week {

    private String name;

    private Avatar avatar;

    private String time;

    private double rating;

    private int money;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Avatar getAvatar() {
        return avatar;
    }

    public void setAvatar(Avatar avatar) {
        this.avatar = avatar;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double  rating) {
        this.rating = rating;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
