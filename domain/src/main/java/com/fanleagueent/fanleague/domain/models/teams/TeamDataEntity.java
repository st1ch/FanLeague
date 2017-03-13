package com.fanleagueent.fanleague.domain.models.teams;

import com.google.gson.annotations.SerializedName;

/**
 * Created by st1ch on 23.11.16.
 */

public class TeamDataEntity {

    @SerializedName("teamEntity")
    private TeamEntity teamEntity;

    @SerializedName("thread_id")
    private String threadId;

    @SerializedName("messages")
    private TeamMessagesDataEntity teamMessagesDataEntity;

    public TeamEntity getTeamEntity() {
        return teamEntity;
    }

    public String getThreadId() {
        return threadId;
    }

    public TeamMessagesDataEntity getTeamMessagesDataEntity() {
        return teamMessagesDataEntity;
    }
}
