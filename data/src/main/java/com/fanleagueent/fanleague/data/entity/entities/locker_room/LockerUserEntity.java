package com.fanleagueent.fanleague.data.entity.entities.locker_room;

import com.fanleagueent.fanleague.data.entity.entities.user.FriendshipEntity;
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

  public String getDisplayName() {
    return displayName;
  }

  public AvatarEntity getAvatarEntity() {
    return avatarEntity;
  }

  public float getAverageWinningBets() {
    return averageWinningBets;
  }

  public int getTotalPlayedWeeks() {
    return totalPlayedWeeks;
  }

  public float getAverageWinningBetsDifference() {
    return averageWinningBetsDifference;
  }

  public int getCommonRatingPosition() {
    return commonRatingPosition;
  }

  public int getDifferenceRatingPosition() {
    return differenceRatingPosition;
  }

  public int getCurrentLevelExp() {
    return currentLevelExp;
  }

  public int getExpPercentage() {
    return expPercentage;
  }

  public int getNextLevel() {
    return nextLevel;
  }

  public int getNextLevelExp() {
    return nextLevelExp;
  }

  public boolean hasBetMedal() {
    return hasBetMedal;
  }

  public String getNationality() {
    return nationality;
  }

  public int getLevel() {
    return level;
  }

  public PrivacyEntity getPrivacyEntity() {
    return privacyEntity;
  }

  public FriendshipEntity getFriendship() {
    return friendship;
  }
}
