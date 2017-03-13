package com.fanleagueent.fanleague.data.entity.entities.recruiting;

import com.fanleagueent.fanleague.data.entity.entities.friends.FriendshipEntity;
import com.fanleagueent.fanleague.data.entity.entities.user.AvatarEntity;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Artem Getman on 21.02.17.
 * a.e.getman@gmail.com
 */

public class RecruitUserEntity {

  @SerializedName("_id") private String id;
  @SerializedName("email") private String email;
  @SerializedName("username") private String username;
  @SerializedName("display_name") private String displayName;
  @SerializedName("full_name") private String fullName;
  @SerializedName("avatar_sizes") private AvatarEntity avatarEntity;
  @SerializedName("friendship") private FriendshipEntity friendship;
  @SerializedName("is_facebook_connected") private boolean isFacebookConnected;
  @SerializedName("is_google_connected") private boolean isGoogleConnected;
  @SerializedName("level") private int level;
  @SerializedName("exp_percentage") private int expPercentage;
  @SerializedName("nationality") private String nationality;
  @SerializedName("average_winning_bets") private float averageWinningBets;
  @SerializedName("has_bet_medal") private boolean hasBetMedal;
  @SerializedName("tree_size") private int treeSize;
  @SerializedName("status") private String status;

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

  public AvatarEntity getAvatarEntity() {
    return avatarEntity;
  }

  public FriendshipEntity getFriendship() {
    return friendship;
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

  public float getAverageWinningBets() {
    return averageWinningBets;
  }

  public boolean isHasBetMedal() {
    return hasBetMedal;
  }

  public int getTreeSize() {
    return treeSize;
  }

  public String getStatus() {
    return status;
  }

  public boolean isConfirmed(){
    return status.equals("confirmed");
  }

  @Override public String toString() {
    return "RecruitUserEntity{"
        + "id='"
        + id
        + '\''
        + ", email='"
        + email
        + '\''
        + ", username='"
        + username
        + '\''
        + ", displayName='"
        + displayName
        + '\''
        + ", fullName='"
        + fullName
        + '\''
        + ", avatarEntity="
        + avatarEntity
        + ", friendship="
        + friendship
        + ", isFacebookConnected="
        + isFacebookConnected
        + ", isGoogleConnected="
        + isGoogleConnected
        + ", level="
        + level
        + ", expPercentage="
        + expPercentage
        + ", nationality='"
        + nationality
        + '\''
        + ", averageWinningBets="
        + averageWinningBets
        + ", hasBetMedal="
        + hasBetMedal
        + ", treeSize="
        + treeSize
        + ", status='"
        + status
        + '\''
        + '}';
  }

  @Override public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    RecruitUserEntity that = (RecruitUserEntity) o;

    return id.equals(that.id);
  }

  @Override public int hashCode() {
    return id.hashCode();
  }

}
