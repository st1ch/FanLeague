package com.fanleagueent.fanleague.data.entity.entities.teams;

import com.google.gson.annotations.SerializedName;

/**
 * Created by st1ch on 01.12.16.
 */

public class InvitationEntity {

    @SerializedName("_id")
    private String id;

    @SerializedName("user_id")
    private String userId;

    @SerializedName("invited_user_id")
    private String invitedUserId;

    @SerializedName("team_id")
    private String teamId;

    @SerializedName("type")
    private String type;

    @SerializedName("email")
    private String email;

    @SerializedName("accept_token")
    private String acceptToken;

    @SerializedName("deny_token")
    private String denyToken;

    @SerializedName("updated_at")
    private String updatedAt;

    @SerializedName("created_at")
    private String createdAt;

    public String getId() {
        return id;
    }

    public String getUserId() {
        return userId;
    }

    public String getInvitedUserId() {
        return invitedUserId;
    }

    public String getTeamId() {
        return teamId;
    }

    public String getType() {
        return type;
    }

    public String getEmail() {
        return email;
    }

    public String getAcceptToken() {
        return acceptToken;
    }

    public String getDenyToken() {
        return denyToken;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }
}
