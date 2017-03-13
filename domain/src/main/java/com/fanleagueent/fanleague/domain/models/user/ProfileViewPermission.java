package com.fanleagueent.fanleague.domain.models.user;

public enum ProfileViewPermission {

    ANYONE("anyone"),
    FRIENDS("friends"),
    NOBODY("nobody");

    private final String value;

    ProfileViewPermission(String value) {
        this.value = value;
    }

    public static ProfileViewPermission fromValue(String value) {
        for (ProfileViewPermission s : values())
            if (s.value.equals(value))
                return s;

        return null;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
