package com.fanleagueent.fanleague.data.entity.entities.games;

import com.google.gson.annotations.SerializedName;

/**
 * Created by st1ch on 22.12.16.
 */

public class PrizesEntity {

    @SerializedName("10")
    private String prize10;

    @SerializedName("11")
    private String prize11;

    @SerializedName("12")
    private String prize12;

    @SerializedName("13")
    private String prize13;

    @SerializedName("tree")
    private String tree;

    public String getPrize10() {
        return prize10;
    }

    public void setPrize10(String prize10) {
        this.prize10 = prize10;
    }

    public String getPrize11() {
        return prize11;
    }

    public void setPrize11(String prize11) {
        this.prize11 = prize11;
    }

    public String getPrize12() {
        return prize12;
    }

    public void setPrize12(String prize12) {
        this.prize12 = prize12;
    }

    public String getPrize13() {
        return prize13;
    }

    public void setPrize13(String prize13) {
        this.prize13 = prize13;
    }

    public String getTree() {
        return tree;
    }

    public void setTree(String tree) {
        this.tree = tree;
    }

    @Override
    public String toString() {
        return "PrizesEntity{" +
                "prize10=" + prize10 +
                ", prize11=" + prize11 +
                ", prize12=" + prize12 +
                ", prize13=" + prize13 +
                ", tree=" + tree +
                '}';
    }
}
