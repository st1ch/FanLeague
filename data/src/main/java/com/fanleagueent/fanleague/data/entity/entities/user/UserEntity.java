package com.fanleagueent.fanleague.data.entity.entities.user;

import com.google.gson.annotations.SerializedName;
import java.util.Date;
import java.util.List;

public class UserEntity {

  @SerializedName("_id") private String id;

  @SerializedName("first_name") private String firstName;

  @SerializedName("last_name") private String lastName;

  @SerializedName("username") private String username;

  @SerializedName("display_name") private String displayName;

  @SerializedName("full_name") private String fullName;

  @SerializedName("email") private String email;

  @SerializedName("created_at") private String createdAt;

  @SerializedName("updated_at") private String updatedAt;

  @SerializedName("current_team_id") private String currentTeamId;

  @SerializedName("team_id") private List<String> teamIdList;

  @SerializedName("current_league_id") private String currentLeagueId;

  @SerializedName("league_id") private List<String> leagueIdList;

  @SerializedName("friendship") private FriendshipEntity friendship;

  @SerializedName("avatar_sizes") private AvatarEntity avatarEntity;

  @SerializedName("is_google_connected") private boolean isGoogleConnected;

  @SerializedName("is_facebook_connected") private boolean isFacebookConnected;

  @SerializedName("exp_percentage") private float expPercentage;

  @SerializedName("notifications_list") private NotificationListEntity notificationListEntity;

  @SerializedName("display_name_identificator") private DisplayNameIdentEntity
      displayNameIdentEntity;

  @SerializedName("profile_view_permissions") private ProfileViewPermissionEntity
      profileViewPermissionEntity;

  @SerializedName("weekly_deposit_limit") private WeeklyDepositLimitEntity weeklyDepositLimitEntity;

  @SerializedName("average_winning_bets") private float averageWinningBets;

  @SerializedName("average_winning_bets_difference") private float averageWinningBetsDifference;

  @SerializedName("total_played_weeks") private int totalPlayedWeeks;

  @SerializedName("recruit_tree_size") private float recruitTreeSize;

  @SerializedName("has_bet_medal") private boolean hasBetMedal;

  @SerializedName("common_rating_position") private int commonRatingPosition;

  @SerializedName("difference_common_rating_position") private int differenceRatingPosition;

  @SerializedName("is_friends") private boolean isFriends;

  @SerializedName("profession") private String profession;

  @SerializedName("nationality") private String nationality;

  @SerializedName("birthday") private Date birthday;

  @SerializedName("sex") private String sex;

  @SerializedName("favourite_football_club_id") private String favouriteFootballClubId;

  @SerializedName("favourite_youth_club") private String favouriteYouthClub;

  @SerializedName("yearly_earnings") private int yearlyEarnings;

  @SerializedName("level") private int level;

  @SerializedName("wallet") private WalletEntity walletEntity;

  public String getId() {
    return id;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getUsername() {
    return username;
  }

  public String getDisplayName() {
    return displayName;
  }

  public String getFullName() {
    return fullName;
  }

  public String getEmail() {
    return email;
  }

  public String getCreatedAt() {
    return createdAt;
  }

  public String getUpdatedAt() {
    return updatedAt;
  }

  public String getCurrentTeamId() {
    return currentTeamId;
  }

  public List<String> getTeamIdList() {
    return teamIdList;
  }

  public String getCurrentLeagueId() {
    return currentLeagueId;
  }

  public List<String> getLeagueIdList() {
    return leagueIdList;
  }

  public FriendshipEntity getFriendship() {
    return friendship;
  }

  public AvatarEntity getAvatarEntity() {
    return avatarEntity;
  }

  public boolean isGoogleConnected() {
    return isGoogleConnected;
  }

  public boolean isFacebookConnected() {
    return isFacebookConnected;
  }

  public float getExpPercentage() {
    return expPercentage;
  }

  public NotificationListEntity getNotificationListEntity() {
    return notificationListEntity;
  }

  public DisplayNameIdentEntity getDisplayNameIdentEntity() {
    return displayNameIdentEntity;
  }

  public ProfileViewPermissionEntity getProfileViewPermissionEntity() {
    return profileViewPermissionEntity;
  }

  public WeeklyDepositLimitEntity getWeeklyDepositLimitEntity() {
    return weeklyDepositLimitEntity;
  }

  public float getAverageWinningBets() {
    return averageWinningBets;
  }

  public float getAverageWinningBetsDifference() {
    return averageWinningBetsDifference;
  }

  public int getTotalPlayedWeeks() {
    return totalPlayedWeeks;
  }

  public float getRecruitTreeSize() {
    return recruitTreeSize;
  }

  public boolean isHasBetMedal() {
    return hasBetMedal;
  }

  public int getCommonRatingPosition() {
    return commonRatingPosition;
  }

  public int getDifferenceRatingPosition() {
    return differenceRatingPosition;
  }

  public boolean isFriends() {
    return isFriends;
  }

  public String getProfession() {
    return profession;
  }

  public String getNationality() {
    return nationality;
  }

  public Date getBirthday() {
    return birthday;
  }

  public String getSex() {
    return sex;
  }

  public String getFavouriteFootballClubId() {
    return favouriteFootballClubId;
  }

  public String getFavouriteYouthClub() {
    return favouriteYouthClub;
  }

  public int getYearlyEarnings() {
    return yearlyEarnings;
  }

  public int getLevel() {
    return level;
  }

  public WalletEntity getWalletEntity() {
    return walletEntity;
  }
}
