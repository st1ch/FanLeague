package com.fanleagueent.fanleague.domain.models.games;

/**
 * Created by st1ch on 26.12.16.
 */

public class PunditSystem {

    private int one;
    private int two;
    private int three;

    public PunditSystem(int one, int two, int three) {
        this.one = one;
        this.two = two;
        this.three = three;
    }

    public int getOne() {
        return one;
    }

    public int getTwo() {
        return two;
    }

    public int getThree() {
        return three;
    }
}
