package com.fanleagueent.fanleague.domain.models.recruiting;

import com.fanleagueent.fanleague.domain.models.friends.Friendship;
import com.fanleagueent.fanleague.domain.models.user.Avatar;

/**
 * Created by Artem Getman on 21.02.17.
 * a.e.getman@gmail.com
 */

public class RecruitUser implements Comparable<RecruitUser>{

  private String id;
  private String email;
  private String username;
  private String displayName;
  private String fullName;
  private Avatar avatarEntity;
  private Friendship friendship;
  private boolean isFacebookConnected;
  private boolean isGoogleConnected;
  private int level;
  private int expPercentage;
  private String nationality;
  private float averageWinningBets;
  private boolean hasBetMedal;
  private int treeSize;
  private String status;

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

  public Avatar getAvatarEntity() {
    return avatarEntity;
  }

  public Friendship getFriendship() {
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

  public void setAvatarEntity(Avatar avatarEntity) {
    this.avatarEntity = avatarEntity;
  }

  public void setFriendship(Friendship friendship) {
    this.friendship = friendship;
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

  public void setAverageWinningBets(float averageWinningBets) {
    this.averageWinningBets = averageWinningBets;
  }

  public void setHasBetMedal(boolean hasBetMedal) {
    this.hasBetMedal = hasBetMedal;
  }

  public void setTreeSize(int treeSize) {
    this.treeSize = treeSize;
  }

  public void setStatus(String status) {
    this.status = status;
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

    RecruitUser that = (RecruitUser) o;

    return id.equals(that.id);
  }

  @Override public int hashCode() {
    return id.hashCode();
  }

  @Override public int compareTo(RecruitUser o) {
    return id.compareTo(o.getId());
  }
}
