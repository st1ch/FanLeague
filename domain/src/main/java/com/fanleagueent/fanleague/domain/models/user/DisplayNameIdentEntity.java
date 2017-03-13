package com.fanleagueent.fanleague.domain.models.user;

import com.google.gson.annotations.SerializedName;

public enum DisplayNameIdentEntity {

    @SerializedName("full_name")
    FULL_NAME("full_name"),

    @SerializedName("username")
    USERNAME("username");

    private final String value;

    DisplayNameIdentEntity(String value) {
        this.value = value;
    }

    public static DisplayNameIdentEntity fromValue(String value) {
        for (DisplayNameIdentEntity s : values())
            if (s.value.equals(value))
                return s;

        return null;
    }

    @Override
    public String toString() {
        return this.value;
    }

}
