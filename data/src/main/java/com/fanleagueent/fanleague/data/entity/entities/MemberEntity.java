package com.fanleagueent.fanleague.data.entity.entities;

import com.fanleagueent.fanleague.data.entity.entities.user.FriendshipEntity;
import com.fanleagueent.fanleague.data.entity.entities.user.AvatarEntity;
import com.google.gson.annotations.SerializedName;

/**
 * Created by alexeyverbitskiy on 12/8/16.
 */

public abstract class MemberEntity {
    @SerializedName("_id")
    protected String id;

    @SerializedName("username")
    protected String username;

    @SerializedName("email")
    protected String email;

    @SerializedName("avatar_sizes")
    protected AvatarEntity avatarEntity;

    @SerializedName("display_name")
    protected String displayName;

    @SerializedName("full_name")
    protected String fullName;

    @SerializedName("is_google_connected")
    protected boolean isGoogleConnected;

    @SerializedName("is_facebook_connected")
    protected boolean isFacebookConnected;

    @SerializedName("level")
    protected int level;

    @SerializedName("exp_percentage")
    protected int percentAge;

    @SerializedName("friendship")
    protected FriendshipEntity friendship;

    @SerializedName("nationality")
    protected String nationality;

    @SerializedName("average_winning_bets")
    protected float averageWinningBets;

    @SerializedName("is_admin")
    protected boolean isAdmin;

    @SerializedName("is_owner")
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

    public AvatarEntity getAvatarEntity() {
        return avatarEntity;
    }

    public void setAvatarEntity(AvatarEntity avatarEntity) {
        this.avatarEntity = avatarEntity;
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

    public FriendshipEntity getFriendship() {
        return friendship;
    }

    public void setFriendship(FriendshipEntity friendship) {
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

}
