package com.fanleagueent.fanleague.domain.models.leagues;

import com.fanleagueent.fanleague.domain.models.user.Avatar;
import java.util.List;

/**
 * Created by alexeyverbitskiy on 12/8/16.
 */

public class League implements Comparable<League> {
    private String id;
    private String name;
    private String slug;
    private String ownerId;
    private String createdAt;
    private String updatedAt;
    private List<String> adminsList;
    private int membersCount;
    private Avatar avatarEntity;
    private boolean isCurrentUserAdmin;
    private boolean isCurrentUserOwner;
    private float averageWinningBets;
    private float averageWinningMoneyAmount;
    private String acceptToken;
    private String denyToken;
    private String invitedBy;

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

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public int getMembersCount() {
        return membersCount;
    }

    public void setMembersCount(int membersCount) {
        this.membersCount = membersCount;
    }

    public List<String> getAdminsList() {
        return adminsList;
    }

    public void setAdminsList(List<String> adminsList) {
        this.adminsList = adminsList;
    }

    public Avatar getAvatarEntity() {
        return avatarEntity;
    }

    public void setAvatarEntity(Avatar avatarEntity) {
        this.avatarEntity = avatarEntity;
    }

    public float getAverageWinningBets() {
        return averageWinningBets;
    }

    public void setAverageWinningBets(float averageWinningBets) {
        this.averageWinningBets = averageWinningBets;
    }

    public float getAverageWinningMoneyAmount() {
        return averageWinningMoneyAmount;
    }

    public void setAverageWinningMoneyAmount(float averageWinningMoneyAmount) {
        this.averageWinningMoneyAmount = averageWinningMoneyAmount;
    }

    public String getAcceptToken() {
        return acceptToken;
    }

    public boolean isCurrentUserAdmin() {
        return isCurrentUserAdmin;
    }

    public String getDenyToken() {
        return denyToken;
    }

    public String getInvitedBy() {
        return invitedBy;
    }

    public boolean hasInvitation() {
        if(acceptToken != null && denyToken != null){
            return true;
        }
        return false;
    }

    public boolean isCurrentUserOwner() {
        return isCurrentUserOwner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        League league = (League) o;

        return id != null ? id.equals(league.id) : league.id == null;

    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "LeagueEntity{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", slug='" + slug + '\'' +
                ", ownerId='" + ownerId + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                ", adminsList=" + adminsList +
                ", membersCount=" + membersCount +
                ", avatarEntity=" + avatarEntity +
                ", averageWinningBets=" + averageWinningBets +
                ", averageWinningMoneyAmount=" + averageWinningMoneyAmount +
                '}';
    }

    @Override
    public int compareTo(League league) {
        return id.compareTo(league.getId());
    }
}
