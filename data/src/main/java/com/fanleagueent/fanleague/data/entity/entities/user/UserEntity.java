package com.fanleagueent.fanleague.data.entity.entities.user;

import com.fanleagueent.fanleague.data.entity.entities.friends.FriendshipEntity;
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

  private UserEntity(Builder builder) {
    id = builder.id;
    firstName = builder.firstName;
    lastName = builder.lastName;
    username = builder.username;
    isFriends = builder.isFriends;
    avatarEntity = builder.avatarEntity;
    email = builder.email;
    createdAt = builder.createdAt;
    updatedAt = builder.updatedAt;
    profession = builder.profession;
    nationality = builder.nationality;
    birthday = builder.birthday;
    sex = builder.sex;
    favouriteFootballClubId = builder.favouriteFootballClubId;
    favouriteYouthClub = builder.favouriteYouthClub;
    yearlyEarnings = builder.yearlyEarnings;
    weeklyDepositLimitEntity = builder.weeklyDepositLimitEntity;
    isGoogleConnected = builder.isGoogleConnected;
    isFacebookConnected = builder.isFacebookConnected;
    level = builder.level;
    displayNameIdentEntity = builder.displayNameIdentEntity;
    profileViewPermissionEntity = builder.profileViewPermissionEntity;
    walletEntity = builder.walletEntity;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public String getCurrentTeamId() {
    return currentTeamId;
  }

  public void setCurrentTeamId(String currentTeamId) {
    this.currentTeamId = currentTeamId;
  }

  public List<String> getTeamIdList() {
    return teamIdList;
  }

  public void setTeamIdList(List<String> teamIdList) {
    this.teamIdList = teamIdList;
  }

  public String getCurrentLeagueId() {
    return currentLeagueId;
  }

  public void setCurrentLeagueId(String currentLeagueId) {
    this.currentLeagueId = currentLeagueId;
  }

  public List<String> getLeagueIdList() {
    return leagueIdList;
  }

  public void setLeagueIdList(List<String> leagueIdList) {
    this.leagueIdList = leagueIdList;
  }

  public FriendshipEntity getFriendship() {
    return friendship;
  }

  public void setFriendship(FriendshipEntity friendship) {
    this.friendship = friendship;
  }

  public AvatarEntity getAvatarEntity() {
    return avatarEntity;
  }

  public void setAvatarEntity(AvatarEntity avatarEntity) {
    this.avatarEntity = avatarEntity;
  }

  public boolean isGoogleConnected() {
    return isGoogleConnected;
  }

  public void setGoogleConnected(boolean googleConnected) {
    isGoogleConnected = googleConnected;
  }

  public boolean isFacebookConnected() {
    return isFacebookConnected;
  }

  public void setFacebookConnected(boolean facebookConnected) {
    isFacebookConnected = facebookConnected;
  }

  public float getExpPercentage() {
    return expPercentage;
  }

  public void setExpPercentage(float expPercentage) {
    this.expPercentage = expPercentage;
  }

  public NotificationListEntity getNotificationListEntity() {
    return notificationListEntity;
  }

  public void setNotificationListEntity(NotificationListEntity notificationListEntity) {
    this.notificationListEntity = notificationListEntity;
  }

  public DisplayNameIdentEntity getDisplayNameIdentEntity() {
    return displayNameIdentEntity;
  }

  public void setDisplayNameIdentEntity(DisplayNameIdentEntity displayNameIdentEntity) {
    this.displayNameIdentEntity = displayNameIdentEntity;
  }

  public ProfileViewPermissionEntity getProfileViewPermissionEntity() {
    return profileViewPermissionEntity;
  }

  public void setProfileViewPermissionEntity(ProfileViewPermissionEntity profileViewPermissionEntity) {
    this.profileViewPermissionEntity = profileViewPermissionEntity;
  }

  public WeeklyDepositLimitEntity getWeeklyDepositLimitEntity() {
    return weeklyDepositLimitEntity;
  }

  public void setWeeklyDepositLimitEntity(WeeklyDepositLimitEntity weeklyDepositLimitEntity) {
    this.weeklyDepositLimitEntity = weeklyDepositLimitEntity;
  }

  public float getAverageWinningBets() {
    return averageWinningBets;
  }

  public void setAverageWinningBets(float averageWinningBets) {
    this.averageWinningBets = averageWinningBets;
  }

  public float getAverageWinningBetsDifference() {
    return averageWinningBetsDifference;
  }

  public void setAverageWinningBetsDifference(float averageWinningBetsDifference) {
    this.averageWinningBetsDifference = averageWinningBetsDifference;
  }

  public int getTotalPlayedWeeks() {
    return totalPlayedWeeks;
  }

  public void setTotalPlayedWeeks(int totalPlayedWeeks) {
    this.totalPlayedWeeks = totalPlayedWeeks;
  }

  public float getRecruitTreeSize() {
    return recruitTreeSize;
  }

  public void setRecruitTreeSize(float recruitTreeSize) {
    this.recruitTreeSize = recruitTreeSize;
  }

  public boolean isHasBetMedal() {
    return hasBetMedal;
  }

  public void setHasBetMedal(boolean hasBetMedal) {
    this.hasBetMedal = hasBetMedal;
  }

  public int getCommonRatingPosition() {
    return commonRatingPosition;
  }

  public void setCommonRatingPosition(int commonRatingPosition) {
    this.commonRatingPosition = commonRatingPosition;
  }

  public int getDifferenceRatingPosition() {
    return differenceRatingPosition;
  }

  public void setDifferenceRatingPosition(int differenceRatingPosition) {
    this.differenceRatingPosition = differenceRatingPosition;
  }

  public boolean isFriends() {
    return isFriends;
  }

  public void setFriends(boolean friends) {
    isFriends = friends;
  }

  public String getProfession() {
    return profession;
  }

  public void setProfession(String profession) {
    this.profession = profession;
  }

  public String getNationality() {
    return nationality;
  }

  public void setNationality(String nationality) {
    this.nationality = nationality;
  }

  public Date getBirthday() {
    return birthday;
  }

  public void setBirthday(Date birthday) {
    this.birthday = birthday;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public String getFavouriteFootballClubId() {
    return favouriteFootballClubId;
  }

  public void setFavouriteFootballClubId(String favouriteFootballClubId) {
    this.favouriteFootballClubId = favouriteFootballClubId;
  }

  public String getFavouriteYouthClub() {
    return favouriteYouthClub;
  }

  public void setFavouriteYouthClub(String favouriteYouthClub) {
    this.favouriteYouthClub = favouriteYouthClub;
  }

  public int getYearlyEarnings() {
    return yearlyEarnings;
  }

  public void setYearlyEarnings(int yearlyEarnings) {
    this.yearlyEarnings = yearlyEarnings;
  }

  public int getLevel() {
    return level;
  }

  public void setLevel(int level) {
    this.level = level;
  }

  public WalletEntity getWalletEntity() {
    return walletEntity;
  }

  public void setWalletEntity(WalletEntity walletEntity) {
    this.walletEntity = walletEntity;
  }

  public static class Builder {
    private String id;
    private String firstName;
    private String lastName;
    private String username;
    private boolean isFriends;
    private AvatarEntity avatarEntity;
    private String email;
    private String createdAt;
    private String updatedAt;
    private String profession;
    private String nationality;
    private Date birthday;
    private String sex;
    private String favouriteFootballClubId;
    private String favouriteYouthClub;
    private int yearlyEarnings;
    private WeeklyDepositLimitEntity weeklyDepositLimitEntity;
    private boolean isGoogleConnected;
    private boolean isFacebookConnected;
    private int level;
    private int percentAge;
    private DisplayNameIdentEntity displayNameIdentEntity = DisplayNameIdentEntity.USERNAME;
    private ProfileViewPermissionEntity profileViewPermissionEntity = ProfileViewPermissionEntity.ANYONE;
    private WalletEntity walletEntity;

    public Builder id(String id) {
      this.id = id;
      return this;
    }

    public Builder firstName(String firstName) {
      this.firstName = firstName;
      return this;
    }

    public Builder lastName(String lastName) {
      this.lastName = lastName;
      return this;
    }

    public Builder username(String nickname) {
      this.username = nickname;
      return this;
    }

    public Builder isFriends(boolean isFriends) {
      this.isFriends = isFriends;
      return this;
    }

    public Builder avatar(AvatarEntity avatarEntity) {
      this.avatarEntity = avatarEntity;
      return this;
    }

    public Builder email(String email) {
      this.email = email;
      return this;
    }

    public Builder createdAt(String createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    public Builder updatedAt(String updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }

    public Builder profession(String profession) {
      this.profession = profession;
      return this;
    }

    public Builder nationality(String nationality) {
      this.nationality = nationality;
      return this;
    }

    public Builder birthday(Date birthday) {
      this.birthday = birthday;
      return this;
    }

    public Builder sex(String sex) {
      this.sex = sex;
      return this;
    }

    public Builder favouriteFootballClubId(String favouriteFootballClubId) {
      this.favouriteFootballClubId = favouriteFootballClubId;
      return this;
    }

    public Builder favouriteYouthClubId(String favouriteYouthClub) {
      this.favouriteYouthClub = favouriteYouthClub;
      return this;
    }

    public Builder yearlyEarnings(int yearlyEarnings) {
      this.yearlyEarnings = yearlyEarnings;
      return this;
    }

    public Builder weaklyDepositLimit(WeeklyDepositLimitEntity weeklyDepositLimitEntity) {
      this.weeklyDepositLimitEntity = weeklyDepositLimitEntity;
      return this;
    }

    public Builder isGoogleConnected(boolean isGoogleConnected) {
      this.isGoogleConnected = isGoogleConnected;
      return this;
    }

    public Builder isFaceBookConnected(boolean isFacebookConnected) {
      this.isFacebookConnected = isFacebookConnected;
      return this;
    }

    public Builder level(int level) {
      this.level = level;
      return this;
    }

    public Builder percentAge(int percentAge) {
      this.percentAge = percentAge;
      return this;
    }

    public Builder displayNameIdent(DisplayNameIdentEntity displayNameIdentEntity) {
      this.displayNameIdentEntity = displayNameIdentEntity;
      return this;
    }

    public Builder profileViewPermission(ProfileViewPermissionEntity profileViewPermissionEntity) {
      this.profileViewPermissionEntity = profileViewPermissionEntity;
      return this;
    }

    public Builder wallet(WalletEntity walletEntity) {
      this.walletEntity = walletEntity;
      return this;
    }

    public UserEntity build() {
      return new UserEntity(this);
    }
  }

  @Override public String toString() {
    return "UserEntity{" +
        "id='" + id + '\'' +
        ", firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", username='" + username + '\'' +
        ", displayName='" + displayName + '\'' +
        ", fullName='" + fullName + '\'' +
        ", email='" + email + '\'' +
        ", createdAt='" + createdAt + '\'' +
        ", updatedAt='" + updatedAt + '\'' +
        ", currentTeamId='" + currentTeamId + '\'' +
        ", teamIdList=" + teamIdList +
        ", currentLeagueId='" + currentLeagueId + '\'' +
        ", leagueIdList=" + leagueIdList +
        ", friendship=" + friendship +
        ", avatarEntity=" + avatarEntity +
        ", isGoogleConnected=" + isGoogleConnected +
        ", isFacebookConnected=" + isFacebookConnected +
        ", expPercentage=" + expPercentage +
        ", notificationListEntity=" + notificationListEntity +
        ", displayNameIdentEntity=" + displayNameIdentEntity +
        ", profileViewPermissionEntity=" + profileViewPermissionEntity +
        ", weeklyDepositLimitEntity=" + weeklyDepositLimitEntity +
        ", averageWinningBets=" + averageWinningBets +
        ", averageWinningBetsDifference=" + averageWinningBetsDifference +
        ", totalPlayedWeeks=" + totalPlayedWeeks +
        ", recruitTreeSize=" + recruitTreeSize +
        ", hasBetMedal=" + hasBetMedal +
        ", commonRatingPosition=" + commonRatingPosition +
        ", differenceRatingPosition=" + differenceRatingPosition +
        ", isFriends=" + isFriends +
        ", profession='" + profession + '\'' +
        ", nationality='" + nationality + '\'' +
        ", birthday='" + birthday + '\'' +
        ", sex='" + sex + '\'' +
        ", favouriteFootballClubId='" + favouriteFootballClubId + '\'' +
        ", favouriteYouthClub='" + favouriteYouthClub + '\'' +
        ", yearlyEarnings=" + yearlyEarnings +
        ", level=" + level +
        ", walletEntity=" + walletEntity +
        '}';
  }
}
