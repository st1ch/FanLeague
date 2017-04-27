package com.fanleagueent.fanleague.domain.models.user;

import com.fanleagueent.fanleague.domain.models.friends.Friendship;
import java.util.Date;
import java.util.List;

import lombok.Getter;
import lombok.ToString;
import lombok.experimental.Builder;

@Builder @ToString
public class User {
  @Getter private String id;
  @Getter private String firstName;
  @Getter private String lastName;
  @Getter private String username;
  @Getter private String displayName;
  @Getter private String fullName;
  @Getter private String email;
  @Getter private String createdAt;
  @Getter private String updatedAt;
  @Getter private String currentTeamId;
  @Getter private List<String> teamIdList;
  @Getter private String currentLeagueId;
  @Getter private List<String> leagueIdList;
  @Getter private Friendship friendship;
  @Getter private Avatar avatar;
  @Getter private boolean isGoogleConnected;
  @Getter private boolean isFacebookConnected;
  @Getter private float expPercentage;
  @Getter private NotificationList notificationList;
  @Getter private DisplayNameIdent displayNameIdent;
  @Getter private ProfileViewPermission profileViewPermission;
  @Getter private WeeklyDepositLimit weeklyDepositLimit;
  @Getter private float averageWinningBets;
  @Getter private float averageWinningBetsDifference;
  @Getter private int totalPlayedWeeks;
  @Getter private float recruitTreeSize;
  @Getter private boolean hasBetMedal;
  @Getter private int commonRatingPosition;
  @Getter private int differenceRatingPosition;
  @Getter private boolean isFriends;
  @Getter private String profession;
  @Getter private String nationality;
  @Getter private Date birthday;
  @Getter private String sex;
  @Getter private String favouriteFootballClubId;
  @Getter private String favouriteYouthClub;
  @Getter private int yearlyEarnings;
  @Getter private int level;
  @Getter private Wallet wallet;
}
