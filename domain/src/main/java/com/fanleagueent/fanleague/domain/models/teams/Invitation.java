package com.fanleagueent.fanleague.domain.models.teams;

/**
 * Created by st1ch on 01.12.16.
 */

public class Invitation {

    private String id;
    private String userId;
    private String invitedUserId;
    private String teamId;
    private String type;
    private String email;
    private String acceptToken;
    private String denyToken;
    private String updatedAt;
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
