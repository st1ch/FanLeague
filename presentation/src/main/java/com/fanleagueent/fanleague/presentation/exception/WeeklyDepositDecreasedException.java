package com.fanleagueent.fanleague.presentation.exception;

/**
 * Created by st1ch on 16.12.16.
 */

public class WeeklyDepositDecreasedException extends Throwable{

    private int decreaseValue;

    public WeeklyDepositDecreasedException(int decreaseValue) {
        this.decreaseValue = decreaseValue;
    }

    public int getDecreaseValue() {
        return decreaseValue;
    }

    @Override
    public String getMessage() {
        return "Weekly deposit limit decreased. Need confirm.";
    }
}
