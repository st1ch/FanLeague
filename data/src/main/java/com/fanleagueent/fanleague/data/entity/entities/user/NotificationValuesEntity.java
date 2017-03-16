package com.fanleagueent.fanleague.data.entity.entities.user;

import com.google.gson.annotations.SerializedName;

/**
 * Created by alexey on 12.11.16.
 */

public class NotificationValuesEntity {

    @SerializedName("inbox")
    private boolean inbox;

    @SerializedName("upcoming_matchday")
    private boolean upcomingMatchday;

    @SerializedName("winnings")
    private boolean winnings;

    @SerializedName("game_results")
    private boolean gameResults;

    @SerializedName("league_invitations")
    private boolean leagueInvitations;

    @SerializedName("teams_invitations")
    private boolean teamsInvitations;

    @SerializedName("friends_signup")
    private boolean friendsSignup;

    public boolean isInbox() {
        return inbox;
    }

    public boolean isUpcomingMatchday() {
        return upcomingMatchday;
    }

    public boolean isWinnings() {
        return winnings;
    }

    public boolean isGameResults() {
        return gameResults;
    }

    public boolean isLeagueInvitations() {
        return leagueInvitations;
    }

    public boolean isTeamsInvitations() {
        return teamsInvitations;
    }

    public boolean isFriendsSignup() {
        return friendsSignup;
    }
}
