package com.fanleagueent.fanleague.presentation.exception;

/**
 * Created by st1ch on 16.12.16.
 */

public class TooLargeWeeklyDepositLimitException extends Throwable{
    @Override
    public String getMessage() {
        return "Too large weekly deposit limit";
    }
}
