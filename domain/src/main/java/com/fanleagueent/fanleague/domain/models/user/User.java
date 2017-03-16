package com.fanleagueent.fanleague.domain.models.user;

import com.fanleagueent.fanleague.domain.models.friends.Friendship;
import java.util.Date;
import java.util.List;

public class User {

  private String id;
  private String firstName;
  private String lastName;
  private String username;
  private String displayName;
  private String fullName;
  private String email;
  private String createdAt;
  private String updatedAt;
  private String currentTeamId;
  private List<String> teamIdList;
  private String currentLeagueId;
  private List<String> leagueIdList;
  private Friendship friendship;
  private Avatar avatar;
  private boolean isGoogleConnected;
  private boolean isFacebookConnected;
  private float expPercentage;
  private NotificationList notificationList;
  private DisplayNameIdent displayNameIdent;
  private ProfileViewPermission profileViewPermission;
  private WeeklyDepositLimit weeklyDepositLimit;
  private float averageWinningBets;
  private float averageWinningBetsDifference;
  private int totalPlayedWeeks;
  private float recruitTreeSize;
  private boolean hasBetMedal;
  private int commonRatingPosition;
  private int differenceRatingPosition;
  private boolean isFriends;
  private String profession;
  private String nationality;
  private Date birthday;
  private String sex;
  private String favouriteFootballClubId;
  private String favouriteYouthClub;
  private int yearlyEarnings;
  private int level;
  private Wallet wallet;

  private User(Builder builder) {
    id = builder.id;
    firstName = builder.firstName;
    lastName = builder.lastName;
    username = builder.username;
    displayName = builder.displayName;
    fullName = builder.fullName;
    isFriends = builder.isFriends;
    avatar = builder.avatar;
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
    weeklyDepositLimit = builder.weeklyDepositLimit;
    isGoogleConnected = builder.isGoogleConnected;
    isFacebookConnected = builder.isFacebookConnected;
    level = builder.level;
    displayNameIdent = builder.displayNameIdent;
    profileViewPermission = builder.profileViewPermission;
    wallet = builder.wallet;
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

  public Friendship getFriendship() {
    return friendship;
  }

  public void setFriendship(Friendship friendship) {
    this.friendship = friendship;
  }

  public Avatar getAvatar() {
    return avatar;
  }

  public void setAvatar(Avatar avatar) {
    this.avatar = avatar;
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

  public NotificationList getNotificationList() {
    return notificationList;
  }

  public void setNotificationList(NotificationList notificationList) {
    this.notificationList = notificationList;
  }

  public DisplayNameIdent getDisplayNameIdent() {
    return displayNameIdent;
  }

  public void setDisplayNameIdent(DisplayNameIdent displayNameIdent) {
    this.displayNameIdent = displayNameIdent;
  }

  public ProfileViewPermission getProfileViewPermission() {
    return profileViewPermission;
  }

  public void setProfileViewPermission(ProfileViewPermission profileViewPermission) {
    this.profileViewPermission = profileViewPermission;
  }

  public WeeklyDepositLimit getWeeklyDepositLimit() {
    return weeklyDepositLimit;
  }

  public void setWeeklyDepositLimit(WeeklyDepositLimit weeklyDepositLimit) {
    this.weeklyDepositLimit = weeklyDepositLimit;
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

  public Wallet getWallet() {
    return wallet;
  }

  public void setWallet(Wallet wallet) {
    this.wallet = wallet;
  }

  public static class Builder {
    private String id;
    private String firstName;
    private String lastName;
    private String username;
    private String displayName;
    private String fullName;
    private boolean isFriends;
    private Avatar avatar;
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
    private WeeklyDepositLimit weeklyDepositLimit;
    private boolean isGoogleConnected;
    private boolean isFacebookConnected;
    private int level;
    private int percentAge;
    private DisplayNameIdent displayNameIdent = DisplayNameIdent.USERNAME;
    private ProfileViewPermission profileViewPermission = ProfileViewPermission.ANYONE;
    private Wallet wallet;

    public Builder() {
    }

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

    public Builder displayName(String displayName) {
      this.displayName = displayName;
      return this;
    }

    public Builder fullName(String fullName) {
      this.fullName = fullName;
      return this;
    }

    public Builder isFriends(boolean isFriends) {
      this.isFriends = isFriends;
      return this;
    }

    public Builder avatar(Avatar avatar) {
      this.avatar = avatar;
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

    public Builder weaklyDepositLimit(WeeklyDepositLimit weeklyDepositLimit) {
      this.weeklyDepositLimit = weeklyDepositLimit;
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

    public Builder displayNameIdent(DisplayNameIdent displayNameIdent) {
      this.displayNameIdent = displayNameIdent;
      return this;
    }

    public Builder profileViewPermission(ProfileViewPermission profileViewPermission) {
      this.profileViewPermission = profileViewPermission;
      return this;
    }

    public Builder wallet(Wallet wallet) {
      this.wallet = wallet;
      return this;
    }

    public User build() {
      return new User(this);
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
        ", avatarEntity=" + avatar +
        ", isGoogleConnected=" + isGoogleConnected +
        ", isFacebookConnected=" + isFacebookConnected +
        ", expPercentage=" + expPercentage +
        ", notificationListEntity=" + notificationList +
        ", displayNameIdentEntity=" + displayNameIdent +
        ", profileViewPermissionEntity=" + profileViewPermission +
        ", weeklyDepositLimitEntity=" + weeklyDepositLimit +
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
        ", walletEntity=" + wallet +
        '}';
  }
}
