package com.fanleagueent.fanleague.domain.models.leagues;

import com.google.gson.annotations.SerializedName;

/**
 * Created by alexeyverbitskiy on 12/8/16.
 */

public class LeagueDataEntity {

    @SerializedName("leagueEntity")
    private LeagueEntity leagueEntity;

    @SerializedName("thread_id")
    private String threadId;

    @SerializedName("messages")
    private LeagueMessagesDataEntity leagueMessagesDataEntity;

    public LeagueEntity getLeagueEntity() {
        return leagueEntity;
    }

    public String getThreadId() {
        return threadId;
    }

    public LeagueMessagesDataEntity getLeagueMessagesDataEntity() {
        return leagueMessagesDataEntity;
    }
}
