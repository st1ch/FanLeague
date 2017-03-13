package com.fanleagueent.fanleague.presentation.exception;

/**
 * Created by st1ch on 16.12.16.
 */

public class WeeklyDepositIncreasedException extends Throwable{

    private int increaseValue;

    public WeeklyDepositIncreasedException(int increaseValue) {
        this.increaseValue = increaseValue;
    }

    public int getIncreaseValue() {
        return increaseValue;
    }

    @Override
    public String getMessage() {
        return "Weekly deposit limit increased. Need confirm.";
    }
}
