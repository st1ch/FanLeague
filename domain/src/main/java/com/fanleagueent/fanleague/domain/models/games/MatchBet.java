package com.fanleagueent.fanleague.domain.models.games;

import java.util.Arrays;

/**
 * Created by st1ch on 23.12.16.
 */

public class MatchBet {

    private int[] betValues = new int[3];

    public MatchBet() {
    }

    public MatchBet(int[] betValues) {
        this.betValues = betValues;
    }

    public int[] getBetValues() {
        return betValues;
    }

    public void setBetValues(int[] betValues) {
        this.betValues = betValues;
    }

    public void setRateOne(boolean value){
        if (value) betValues[0] = 1;
        else betValues[0] = 0;
    }

    public boolean getRateOne(){
        return betValues[0] == 1;
    }

    public void setDraw(boolean value){
        if (value) betValues[1] = 1;
        else betValues[1] = 0;
    }

    public boolean getDraw(){
        return betValues[1] == 1;
    }

    public void setRateTwo(boolean value){
        if (value) betValues[2] = 1;
        else betValues[2] = 0;
    }

    public boolean getRateTwo(){
        return betValues[2] == 1;
    }

    @Override
    public String toString() {
        return "BetEntity{" +
                "betValues=" + Arrays.toString(betValues) +
                '}';
    }
}
