package com.fanleagueent.fanleague.data.entity.entities.locker_room;

import com.fanleagueent.fanleague.data.entity.entities.friends.FriendshipEntity;
import com.fanleagueent.fanleague.data.entity.entities.user.AvatarEntity;
import com.google.gson.annotations.SerializedName;

/**
 * Created by st1ch on 24.01.17.
 */

public class LockerUserEntity {

  @SerializedName("_id") private String id;
  @SerializedName("display_name") private String displayName;
  @SerializedName("avatar_sizes") private AvatarEntity avatarEntity;
  @SerializedName("average_winning_bets") private float averageWinningBets;
  @SerializedName("total_played_weeks") private int totalPlayedWeeks;
  @SerializedName("average_winning_bets_difference") private float averageWinningBetsDifference;
  @SerializedName("common_rating_position") private int commonRatingPosition;
  @SerializedName("difference_common_rating_position") private int differenceRatingPosition;
  @SerializedName("current_level_exp") private int currentLevelExp;
  @SerializedName("exp_percentage") private int expPercentage;
  @SerializedName("next_level") private int nextLevel;
  @SerializedName("next_level_exp") private int nextLevelExp;
  @SerializedName("has_bet_medal") private boolean hasBetMedal;
  @SerializedName("nationality") private String nationality;
  @SerializedName("level") private int level;
  @SerializedName("locker_room_privacy") private PrivacyEntity privacyEntity;
  @SerializedName("friendship") private FriendshipEntity friendship;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public AvatarEntity getAvatarEntity() {
    return avatarEntity;
  }

  public void setAvatarEntity(AvatarEntity avatarEntity) {
    this.avatarEntity = avatarEntity;
  }

  public float getAverageWinningBets() {
    return averageWinningBets;
  }

  public void setAverageWinningBets(float averageWinningBets) {
    this.averageWinningBets = averageWinningBets;
  }

  public int getTotalPlayedWeeks() {
    return totalPlayedWeeks;
  }

  public void setTotalPlayedWeeks(int totalPlayedWeeks) {
    this.totalPlayedWeeks = totalPlayedWeeks;
  }

  public float getAverageWinningBetsDifference() {
    return averageWinningBetsDifference;
  }

  public void setAverageWinningBetsDifference(float averageWinningBetsDifference) {
    this.averageWinningBetsDifference = averageWinningBetsDifference;
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

  public int getCurrentLevelExp() {
    return currentLevelExp;
  }

  public void setCurrentLevelExp(int currentLevelExp) {
    this.currentLevelExp = currentLevelExp;
  }

  public int getExpPercentage() {
    return expPercentage;
  }

  public void setExpPercentage(int expPercentage) {
    this.expPercentage = expPercentage;
  }

  public int getNextLevel() {
    return nextLevel;
  }

  public void setNextLevel(int nextLevel) {
    this.nextLevel = nextLevel;
  }

  public int getNextLevelExp() {
    return nextLevelExp;
  }

  public void setNextLevelExp(int nextLevelExp) {
    this.nextLevelExp = nextLevelExp;
  }

  public boolean hasBetMedal() {
    return hasBetMedal;
  }

  public void setHasBetMedal(boolean hasBetMedal) {
    this.hasBetMedal = hasBetMedal;
  }

  public String getNationality() {
    return nationality;
  }

  public void setNationality(String nationality) {
    this.nationality = nationality;
  }

  public int getLevel() {
    return level;
  }

  public void setLevel(int level) {
    this.level = level;
  }

  public PrivacyEntity getPrivacyEntity() {
    return privacyEntity;
  }

  public void setPrivacyEntity(PrivacyEntity privacyEntity) {
    this.privacyEntity = privacyEntity;
  }

  public FriendshipEntity getFriendship() {
    return friendship;
  }

  public void setFriendship(FriendshipEntity friendship) {
    this.friendship = friendship;
  }

  @Override public String toString() {
    return "LockerUserEntity{" +
        "id='" + id + '\'' +
        ", displayName='" + displayName + '\'' +
        ", avatarEntity=" + avatarEntity +
        ", averageWinningBets=" + averageWinningBets +
        ", totalPlayedWeeks=" + totalPlayedWeeks +
        ", averageWinningBetsDifference=" + averageWinningBetsDifference +
        ", commonRatingPosition=" + commonRatingPosition +
        ", differenceRatingPosition=" + differenceRatingPosition +
        ", currentLevelExp=" + currentLevelExp +
        ", expPercentage=" + expPercentage +
        ", nextLevel=" + nextLevel +
        ", nextLevelExp=" + nextLevelExp +
        ", hasBetMedal=" + hasBetMedal +
        ", nationality='" + nationality + '\'' +
        ", level=" + level +
        ", privacyEntity=" + privacyEntity +
        ", friendship=" + friendship +
        '}';
  }
}
