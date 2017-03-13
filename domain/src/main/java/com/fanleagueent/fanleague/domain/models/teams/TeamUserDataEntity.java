package com.fanleagueent.fanleague.domain.models.teams;

import com.fanleagueent.fanleague.data.entity.entities.user.UserEntity;
import com.google.gson.annotations.SerializedName;

/**
 * Created by st1ch on 23.11.16.
 */

public class TeamUserDataEntity {
    @SerializedName("userEntity")
    private UserEntity userEntity;

    @SerializedName("team")
    private TeamEntity teamEntity;

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public TeamEntity getTeamEntity() {
        return teamEntity;
    }
}
