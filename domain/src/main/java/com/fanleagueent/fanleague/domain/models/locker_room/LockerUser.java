package com.fanleagueent.fanleague.domain.models.locker_room;

import com.fanleagueent.fanleague.domain.models.friends.Friendship;
import com.fanleagueent.fanleague.domain.models.user.Avatar;

/**
 * Created by st1ch on 24.01.17.
 */

public class LockerUser {

  private String id;
  private String displayName;
  private Avatar avatarEntity;
  private float averageWinningBets;
  private int totalPlayedWeeks;
  private float averageWinningBetsDifference;
  private int commonRatingPosition;
  private int differenceRatingPosition;
  private int currentLevelExp;
  private int expPercentage;
  private int nextLevel;
  private int nextLevelExp;
  private boolean hasBetMedal;
  private String nationality;
  private int level;
  private Privacy privacy;
  private Friendship friendship;

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

  public Avatar getAvatarEntity() {
    return avatarEntity;
  }

  public void setAvatarEntity(Avatar avatarEntity) {
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

  public Privacy getPrivacy() {
    return privacy;
  }

  public void setPrivacy(Privacy privacy) {
    this.privacy = privacy;
  }

  public Friendship getFriendship() {
    return friendship;
  }

  public void setFriendship(Friendship friendship) {
    this.friendship = friendship;
  }

  @Override public String toString() {
    return "LockerUserEntity{"
        + "id='"
        + id
        + '\''
        + ", displayName='"
        + displayName
        + '\''
        + ", avatarEntity="
        + avatarEntity
        + ", averageWinningBets="
        + averageWinningBets
        + ", totalPlayedWeeks="
        + totalPlayedWeeks
        + ", averageWinningBetsDifference="
        + averageWinningBetsDifference
        + ", commonRatingPosition="
        + commonRatingPosition
        + ", differenceRatingPosition="
        + differenceRatingPosition
        + ", currentLevelExp="
        + currentLevelExp
        + ", expPercentage="
        + expPercentage
        + ", nextLevel="
        + nextLevel
        + ", nextLevelExp="
        + nextLevelExp
        + ", hasBetMedal="
        + hasBetMedal
        + ", nationality='"
        + nationality
        + '\''
        + ", level="
        + level
        + ", privacyEntity="
        + privacy
        + ", friendship="
        + friendship
        + '}';
  }
}
