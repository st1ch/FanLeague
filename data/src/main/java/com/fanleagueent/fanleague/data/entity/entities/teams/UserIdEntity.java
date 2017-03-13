package com.fanleagueent.fanleague.data.entity.entities.teams;

import com.google.gson.annotations.SerializedName;

/**
 * Created by st1ch on 24.11.16.
 */

public class UserIdEntity {
    @SerializedName("id")
    private String id;

    public UserIdEntity(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserIdEntity userIdEntity = (UserIdEntity) o;

        return id != null ? id.equals(userIdEntity.id) : userIdEntity.id == null;

    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
