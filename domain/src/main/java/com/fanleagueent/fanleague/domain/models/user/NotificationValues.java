package com.fanleagueent.fanleague.domain.models.user;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by alexey on 12.11.16.
 */
@ToString public class NotificationValues {
  @Getter @Setter private boolean inbox;
  @Getter @Setter private boolean upcomingMatchday;
  @Getter @Setter private boolean winnings;
  @Getter @Setter private boolean gameResults;
  @Getter @Setter private boolean leagueInvitations;
  @Getter @Setter private boolean teamsInvitations;
  @Getter @Setter private boolean friendsSignup;
}
