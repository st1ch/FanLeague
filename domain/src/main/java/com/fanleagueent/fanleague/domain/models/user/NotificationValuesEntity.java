package com.fanleagueent.fanleague.domain.models.user;

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

    public void setInbox(boolean inbox) {
        this.inbox = inbox;
    }

    public boolean isUpcomingMatchday() {
        return upcomingMatchday;
    }

    public void setUpcomingMatchday(boolean upcomingMatchday) {
        this.upcomingMatchday = upcomingMatchday;
    }

    public boolean isWinnings() {
        return winnings;
    }

    public void setWinnings(boolean winnings) {
        this.winnings = winnings;
    }

    public boolean isGameResults() {
        return gameResults;
    }

    public void setGameResults(boolean gameResults) {
        this.gameResults = gameResults;
    }

    public boolean isLeagueInvitations() {
        return leagueInvitations;
    }

    public void setLeagueInvitations(boolean leagueInvitations) {
        this.leagueInvitations = leagueInvitations;
    }

    public boolean isTeamsInvitations() {
        return teamsInvitations;
    }

    public void setTeamsInvitations(boolean teamsInvitations) {
        this.teamsInvitations = teamsInvitations;
    }

    public boolean isFriendsSignup() {
        return friendsSignup;
    }

    public void setFriendsSignup(boolean friendsSignup) {
        this.friendsSignup = friendsSignup;
    }
}
