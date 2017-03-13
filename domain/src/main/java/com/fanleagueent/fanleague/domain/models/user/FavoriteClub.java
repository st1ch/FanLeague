package com.fanleagueent.fanleague.domain.models.user;

/**
 * Created by alexeyverbitskiy on 11/25/16.
 */

public class FavoriteClub {

    private String id;
    private String name;
    private String updatedAt;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FavoriteClub that = (FavoriteClub) o;

        return id != null ? id.equals(that.id) : that.id == null;

    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "FavoriteClubEntity{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                '}';
    }
}
