package com.fanleagueent.fanleague.domain.models.chat;

import com.fanleagueent.fanleague.domain.models.friends.Friendship;
import com.fanleagueent.fanleague.domain.models.user.Avatar;

/**
 * Created by alexeyverbitskiy on 2/2/17.
 */

public class ChatUser {

  private String id;
  private String email;
  private String username;
  private String displayName;
  private String fullName;
  private Friendship friendship;
  private Avatar avatarEntity;
  private boolean isFacebookConnected;
  private boolean isGoogleConnected;
  private int level;
  private int expPercentage;
  private String nationality;
  private double averageWinningBets;
  private boolean hasBetMedal;

  public String getId() {
    return id;
  }

  public String getEmail() {
    return email;
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

  public Friendship getFriendship() {
    return friendship;
  }

  public Avatar getAvatar() {
    return avatarEntity;
  }

  public boolean isFacebookConnected() {
    return isFacebookConnected;
  }

  public boolean isGoogleConnected() {
    return isGoogleConnected;
  }

  public int getLevel() {
    return level;
  }

  public int getExpPercentage() {
    return expPercentage;
  }

  public String getNationality() {
    return nationality;
  }

  public double getAverageWinningBets() {
    return averageWinningBets;
  }

  public boolean isHasBetMedal() {
    return hasBetMedal;
  }

  public void setId(String id) {
    this.id = id;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public void setFriendship(Friendship friendship) {
    this.friendship = friendship;
  }

  public void setAvatar(Avatar avatarEntity) {
    this.avatarEntity = avatarEntity;
  }

  public void setFacebookConnected(boolean facebookConnected) {
    isFacebookConnected = facebookConnected;
  }

  public void setGoogleConnected(boolean googleConnected) {
    isGoogleConnected = googleConnected;
  }

  public void setLevel(int level) {
    this.level = level;
  }

  public void setExpPercentage(int expPercentage) {
    this.expPercentage = expPercentage;
  }

  public void setNationality(String nationality) {
    this.nationality = nationality;
  }

  public void setAverageWinningBets(double averageWinningBets) {
    this.averageWinningBets = averageWinningBets;
  }

  public void setHasBetMedal(boolean hasBetMedal) {
    this.hasBetMedal = hasBetMedal;
  }

  @Override public String toString() {
    return "ChatUserEntity{" +
        "id='" + id + '\'' +
        ", email='" + email + '\'' +
        ", username='" + username + '\'' +
        ", displayName='" + displayName + '\'' +
        ", fullName='" + fullName + '\'' +
        ", friendshipEntity=" + friendship +
        ", avatarEntity=" + avatarEntity +
        ", isFacebookConnected=" + isFacebookConnected +
        ", isGoogleConnected=" + isGoogleConnected +
        ", level=" + level +
        ", expPercentage=" + expPercentage +
        ", nationality='" + nationality + '\'' +
        ", averageWinningBets=" + averageWinningBets +
        ", hasBetMedal=" + hasBetMedal +
        '}';
  }
}
