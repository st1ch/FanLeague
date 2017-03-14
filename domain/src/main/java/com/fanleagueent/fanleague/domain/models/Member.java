package com.fanleagueent.fanleague.domain.models;

import com.fanleagueent.fanleague.domain.models.friends.Friendship;
import com.fanleagueent.fanleague.domain.models.user.Avatar;

/**
 * Created by alexeyverbitskiy on 12/8/16.
 */

public abstract class Member {
    protected String id;
    protected String username;
    protected String email;
    protected Avatar avatar;
    protected String displayName;
    protected String fullName;
    protected boolean isGoogleConnected;
    protected boolean isFacebookConnected;
    protected int level;
    protected int percentAge;
    protected Friendship friendship;
    protected String nationality;
    protected float averageWinningBets;
    protected boolean isAdmin;
    protected boolean isOwner;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Avatar getAvatar() {
        return avatar;
    }

    public void setAvatar(Avatar avatarEntity) {
        this.avatar = avatarEntity;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public boolean isGoogleConnected() {
        return isGoogleConnected;
    }

    public void setGoogleConnected(boolean googleConnected) {
        isGoogleConnected = googleConnected;
    }

    public boolean isFacebookConnected() {
        return isFacebookConnected;
    }

    public void setFacebookConnected(boolean facebookConnected) {
        isFacebookConnected = facebookConnected;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getPercentAge() {
        return percentAge;
    }

    public void setPercentAge(int percentAge) {
        this.percentAge = percentAge;
    }

    public Friendship getFriendship() {
        return friendship;
    }

    public void setFriendship(Friendship friendship) {
        this.friendship = friendship;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public float getAverageWinningBets() {
        return averageWinningBets;
    }

    public void setAverageWinningBets(float averageWinningBets) {
        this.averageWinningBets = averageWinningBets;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public boolean isOwner() {
        return isOwner;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public void setOwner(boolean owner) {
        isOwner = owner;
    }

    @Override
    public String toString() {
        return "MemberEntity{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", avatarEntity=" + avatar +
                ", displayName='" + displayName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", isGoogleConnected=" + isGoogleConnected +
                ", isFacebookConnected=" + isFacebookConnected +
                ", level=" + level +
                ", percentAge=" + percentAge +
                ", friendship=" + friendship +
                ", nationality='" + nationality + '\'' +
                ", averageWinningBets=" + averageWinningBets +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Member member = (Member) o;

        return id != null ? id.equals(member.id) : member.id == null;

    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
