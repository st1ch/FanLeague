package com.fanleagueent.fanleague.domain.models.user;

public enum DisplayNameIdent {

    FULL_NAME("full_name"),
    USERNAME("username");

    private final String value;

    DisplayNameIdent(String value) {
        this.value = value;
    }

    public static DisplayNameIdent fromValue(String value) {
        for (DisplayNameIdent s : values())
            if (s.value.equals(value))
                return s;

        return null;
    }

    @Override
    public String toString() {
        return this.value;
    }

}
