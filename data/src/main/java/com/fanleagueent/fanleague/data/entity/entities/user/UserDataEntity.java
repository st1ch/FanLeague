package com.fanleagueent.fanleague.data.entity.entities.user;

import com.google.gson.annotations.SerializedName;

/**
 * Created by alexeyverbitskiy on 11/7/16.
 */

public class UserDataEntity {

    @SerializedName("user")
    private UserEntity userEntity;

    public UserEntity getUserEntity() {
        return userEntity;
    }

    @Override
    public String toString() {
        return "UserDataEntity{" +
                "userEntity=" + userEntity +
                '}';
    }
}
