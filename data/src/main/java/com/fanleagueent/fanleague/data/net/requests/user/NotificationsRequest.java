package com.fanleagueent.fanleague.data.net.requests.user;

import com.google.gson.annotations.SerializedName;
import lombok.experimental.Builder;

@Builder public class NotificationsRequest {
  @SerializedName("type") private String type;

  @SerializedName("inbox") private boolean inbox;

  @SerializedName("upcoming_matchday") private boolean upcomingMatchday;

  @SerializedName("winnings") private boolean winnings;

  @SerializedName("game_results") private boolean gameResults;

  @SerializedName("league_invitations") private boolean leagueInvitations;

  @SerializedName("teams_invitations") private boolean teamsInvitations;

  @SerializedName("friends_signup") private boolean friendsSignup;
}
