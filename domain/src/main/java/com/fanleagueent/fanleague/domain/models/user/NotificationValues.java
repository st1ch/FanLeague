package com.fanleagueent.fanleague.domain.models.user;

/**
 * Created by alexey on 12.11.16.
 */

public class NotificationValues {

    private boolean inbox;
    private boolean upcomingMatchday;
    private boolean winnings;
    private boolean gameResults;
    private boolean leagueInvitations;
    private boolean teamsInvitations;
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

    @Override public String toString() {
        return "NotificationValues{"
            + "inbox="
            + inbox
            + ", upcomingMatchday="
            + upcomingMatchday
            + ", winnings="
            + winnings
            + ", gameResults="
            + gameResults
            + ", leagueInvitations="
            + leagueInvitations
            + ", teamsInvitations="
            + teamsInvitations
            + ", friendsSignup="
            + friendsSignup
            + '}';
    }
}
