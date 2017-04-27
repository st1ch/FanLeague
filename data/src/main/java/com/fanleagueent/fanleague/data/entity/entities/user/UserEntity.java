package com.fanleagueent.fanleague.data.entity.entities.user;

import com.google.gson.annotations.SerializedName;
import java.util.Date;
import java.util.List;
import lombok.Getter;

public class UserEntity {

  @SerializedName("_id") @Getter private String id;

  @SerializedName("first_name") @Getter private String firstName;

  @SerializedName("last_name") @Getter private String lastName;

  @SerializedName("username") @Getter private String username;

  @SerializedName("display_name") @Getter private String displayName;

  @SerializedName("full_name") @Getter private String fullName;

  @SerializedName("email") @Getter private String email;

  @SerializedName("created_at") @Getter private String createdAt;

  @SerializedName("updated_at") @Getter private String updatedAt;

  @SerializedName("current_team_id") @Getter private String currentTeamId;

  @SerializedName("team_id") @Getter private List<String> teamIdList;

  @SerializedName("current_league_id") @Getter private String currentLeagueId;

  @SerializedName("league_id") @Getter private List<String> leagueIdList;

  @SerializedName("friendship") @Getter private FriendshipEntity friendship;

  @SerializedName("avatar_sizes") @Getter private AvatarEntity avatarEntity;

  @SerializedName("is_google_connected") @Getter private boolean isGoogleConnected;

  @SerializedName("is_facebook_connected") @Getter private boolean isFacebookConnected;

  @SerializedName("exp_percentage") @Getter private float expPercentage;

  @SerializedName("notifications_list") @Getter private NotificationListEntity
      notificationListEntity;

  @SerializedName("display_name_identificator") @Getter private DisplayNameIdentEntity
      displayNameIdentEntity;

  @SerializedName("profile_view_permissions") @Getter private ProfileViewPermissionEntity
      profileViewPermissionEntity;

  @SerializedName("weekly_deposit_limit") @Getter private WeeklyDepositLimitEntity
      weeklyDepositLimitEntity;

  @SerializedName("average_winning_bets") @Getter private float averageWinningBets;

  @SerializedName("average_winning_bets_difference") @Getter private float
      averageWinningBetsDifference;

  @SerializedName("total_played_weeks") @Getter private int totalPlayedWeeks;

  @SerializedName("recruit_tree_size") @Getter private float recruitTreeSize;

  @SerializedName("has_bet_medal") @Getter private boolean hasBetMedal;

  @SerializedName("common_rating_position") @Getter private int commonRatingPosition;

  @SerializedName("difference_common_rating_position") @Getter private int differenceRatingPosition;

  @SerializedName("is_friends") @Getter private boolean isFriends;

  @SerializedName("profession") @Getter private String profession;

  @SerializedName("nationality") @Getter private String nationality;

  @SerializedName("birthday") @Getter private Date birthday;

  @SerializedName("sex") @Getter private String sex;

  @SerializedName("favourite_football_club_id") @Getter private String favouriteFootballClubId;

  @SerializedName("favourite_youth_club") @Getter private String favouriteYouthClub;

  @SerializedName("yearly_earnings") @Getter private int yearlyEarnings;

  @SerializedName("level") @Getter private int level;

  @SerializedName("wallet") @Getter private WalletEntity walletEntity;
}
