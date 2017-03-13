package com.fanleagueent.fanleague.domain.models.games;

/**
 * Created by st1ch on 28.12.16.
 */

public class GameCombination {

    private int fullGuard;

    private int halfGuard;

    private int simpleBet;

    public GameCombination(int fullGuard, int halfGuard, int simpleBet) {
        this.fullGuard = fullGuard;
        this.halfGuard = halfGuard;
        this.simpleBet = simpleBet;
    }

    public int getFullGuard() {
        return fullGuard;
    }

    public int getHalfGuard() {
        return halfGuard;
    }

    public int getSimpleBet() {
        return simpleBet;
    }

    @Override
    public String toString() {
        return "GameCombination{" +
                "fullGuard=" + fullGuard +
                ", halfGuard=" + halfGuard +
                ", simpleBet=" + simpleBet +
                '}';
    }
}
