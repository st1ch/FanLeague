package com.fanleagueent.fanleague.data.entity.entities.user;

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

    public String getValue() {
        return value;
    }
}
