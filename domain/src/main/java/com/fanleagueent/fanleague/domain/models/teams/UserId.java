package com.fanleagueent.fanleague.domain.models.teams;

/**
 * Created by st1ch on 24.11.16.
 */

public class UserId {
    private String id;

    public UserId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserId userId = (UserId) o;

        return id != null ? id.equals(userId.id) : userId.id == null;

    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
