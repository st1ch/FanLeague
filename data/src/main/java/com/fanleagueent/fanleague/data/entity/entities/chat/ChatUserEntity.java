package com.fanleagueent.fanleague.data.entity.entities.chat;

import com.fanleagueent.fanleague.data.entity.entities.user.FriendshipEntity;
import com.fanleagueent.fanleague.data.entity.entities.user.AvatarEntity;
import com.google.gson.annotations.SerializedName;

/**
 * Created by alexeyverbitskiy on 2/2/17.
 */

public class ChatUserEntity {

  @SerializedName("_id")
  private String id;

  @SerializedName("email")
  private String email;

  @SerializedName("username")
  private String username;

  @SerializedName("display_name")
  private String displayName;

  @SerializedName("full_name")
  private String fullName;

  @SerializedName("friendship")
  private FriendshipEntity friendshipEntity;

  @SerializedName("avatar_sizes")
  private AvatarEntity avatarEntity;

  @SerializedName("is_facebook_connected")
  private boolean isFacebookConnected;

  @SerializedName("is_google_connected")
  private boolean isGoogleConnected;

  @SerializedName("level")
  private int level;

  @SerializedName("exp_percentage")
  private int expPercentage;

  @SerializedName("nationality")
  private String nationality;

  @SerializedName("average_winning_bets")
  private double averageWinningBets;

  @SerializedName("has_bet_medal")
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

  public AvatarEntity getAvatarEntity() {
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
