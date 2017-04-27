package com.fanleagueent.fanleague.data.entity.entities.user;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.experimental.Builder;

/**
 * Created by alexey on 12.11.16.
 */
@Builder
public class NotificationValuesEntity {
  @SerializedName("type") @Getter private String type;

  @SerializedName("inbox") @Getter private boolean inbox;

  @SerializedName("upcoming_matchday") @Getter private boolean upcomingMatchday;

  @SerializedName("winnings") @Getter private boolean winnings;

  @SerializedName("game_results") @Getter private boolean gameResults;

  @SerializedName("league_invitations") @Getter private boolean leagueInvitations;

  @SerializedName("teams_invitations") @Getter private boolean teamsInvitations;

  @SerializedName("friends_signup") @Getter private boolean friendsSignup;
}
