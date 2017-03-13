package com.fanleagueent.fanleague.domain.models.games;

/**
 * Created by st1ch on 22.12.16.
 */

public class Prizes {

    private String prize10;
    private String prize11;
    private String prize12;
    private String prize13;
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
