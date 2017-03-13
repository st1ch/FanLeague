package com.fanleagueent.fanleague.presentation.exception;

/**
 * Created by st1ch on 12.12.16.
 */

public class WeeklyDepositChangedException extends Throwable{
    @Override
    public String getMessage() {
        return "Weekly deposit changed. Confirm it!";
    }
}
