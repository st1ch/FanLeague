package com.fanleagueent.fanleague.data.entity.entities.authorization;

import com.fanleagueent.fanleague.data.entity.entities.user.UserEntity;
import com.google.gson.annotations.SerializedName;

/**
 * Created by alexey on 21.10.16.
 */

public class AuthorizationEntity {
    @SerializedName("token")
    private String accessToken;

    @SerializedName("user")
    private UserEntity userEntity;

    public String getAccessToken() {
        return accessToken;
    }

    public UserEntity getUserEntity() {
        return userEntity;
    }
}
