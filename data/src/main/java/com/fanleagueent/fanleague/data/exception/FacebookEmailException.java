package com.fanleagueent.fanleague.data.exception;

/**
 * Created by st1ch on 09.11.2016.
 */

public class FacebookEmailException extends Throwable {

    @Override
    public String getMessage() {
        return "Need new email for registration";
    }

}
