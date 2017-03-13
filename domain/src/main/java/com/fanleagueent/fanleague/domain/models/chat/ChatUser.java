package com.fanleagueent.fanleague.domain.models.chat;

import com.fanleagueent.fanleague.domain.models.friends.FriendshipEntity;
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
  private FriendshipEntity friendshipEntity;
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

  public FriendshipEntity getFriendshipEntity() {
    return friendshipEntity;
  }

  public Avatar getAvatarEntity() {
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

  @Override public String toString() {
    return "ChatUserEntity{" +
        "id='" + id + '\'' +
        ", email='" + email + '\'' +
        ", username='" + username + '\'' +
        ", displayName='" + displayName + '\'' +
        ", fullName='" + fullName + '\'' +
        ", friendshipEntity=" + friendshipEntity +
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
