package com.fanleagueent.fanleague.domain.models.games;

import com.fanleagueent.fanleague.data.entity.entities.user.AvatarEntity;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * Created by st1ch on 12.01.17.
 */

public class PlayTeamEntity implements Comparable<PlayTeamEntity> {
  @SerializedName("_id") private String id;

  @SerializedName("name") private String name;

  @SerializedName("slug") private String slug;

  @SerializedName("owner_id") private String ownerId;

  @SerializedName("weekly_betting_amount_per_member") private int weeklyBettingAmountPerMember;

  @SerializedName("admins") private List<String> adminsList;

  @SerializedName("members_count") private int membersCount;

  @SerializedName("image_sizes") private AvatarEntity avatarEntity;

  @SerializedName("status") private List<String> statusList;

  @SerializedName("average_winning_bets") private float averageWinningBets;

  @SerializedName("average_winning_money_amount") private float averageWinningMoneyAmount;

  @SerializedName("is_current_user_admin") private boolean isCurrentUserAdmin;

  @SerializedName("is_current_user_owner") private boolean isCurrentUserOwner;

  @SerializedName("temporary_weekly_betting_amount") private int tmpWeeklyBettingAmount;

  @SerializedName("weekly_budget") private float weeklyBudget;

  private boolean statusBidChanged;
  private boolean statusTopUp;
  private String BID_CHANGED = "bid_changed";
  private String TOP_UP = "low_cash";

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }

  public String getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }

  public int getWeeklyBettingAmountPerMember() {
    return weeklyBettingAmountPerMember;
  }

  public void setWeeklyBettingAmountPerMember(int weeklyBettingAmountPerMember) {
    this.weeklyBettingAmountPerMember = weeklyBettingAmountPerMember;
  }

  public List<String> getAdminsList() {
    return adminsList;
  }

  public void setAdminsList(List<String> adminsList) {
    this.adminsList = adminsList;
  }

  public int getMembersCount() {
    return membersCount;
  }

  public void setMembersCount(int membersCount) {
    this.membersCount = membersCount;
  }

  public AvatarEntity getAvatarEntity() {
    return avatarEntity;
  }

  public void setAvatarEntity(AvatarEntity avatarEntity) {
    this.avatarEntity = avatarEntity;
  }

  public List<String> getStatusList() {
    return statusList;
  }

  public void setStatusList(List<String> statusList) {
    this.statusList = statusList;
  }

  public boolean isStatusBidChanged() {
    if(statusList != null && !statusList.isEmpty()){
      if(statusList.contains(BID_CHANGED)){
        statusBidChanged = true;
      }
    }
    return statusBidChanged;
  }

  public boolean isStatusTopUp() {
    if(statusList != null && !statusList.isEmpty()){
      if(statusList.contains(TOP_UP)){
        statusTopUp = true;
      }
    }
    return statusTopUp;
  }

  public float getAverageWinningBets() {
    return averageWinningBets;
  }

  public void setAverageWinningBets(float averageWinningBets) {
    this.averageWinningBets = averageWinningBets;
  }

  public float getAverageWinningMoneyAmount() {
    return averageWinningMoneyAmount;
  }

  public void setAverageWinningMoneyAmount(float averageWinningMoneyAmount) {
    this.averageWinningMoneyAmount = averageWinningMoneyAmount;
  }

  public boolean isCurrentUserAdmin() {
    return isCurrentUserAdmin;
  }

  public void setCurrentUserAdmin(boolean currentUserAdmin) {
    isCurrentUserAdmin = currentUserAdmin;
  }

  public boolean isCurrentUserOwner() {
    return isCurrentUserOwner;
  }

  public void setCurrentUserOwner(boolean currentUserOwner) {
    isCurrentUserOwner = currentUserOwner;
  }

  public int getTmpWeeklyBettingAmount() {
    return tmpWeeklyBettingAmount;
  }

  public void setTmpWeeklyBettingAmount(int tmpWeeklyBettingAmount) {
    this.tmpWeeklyBettingAmount = tmpWeeklyBettingAmount;
  }

  public float getWeeklyBudget() {
    return weeklyBudget;
  }

  public void setWeeklyBudget(float weeklyBudget) {
    this.weeklyBudget = weeklyBudget;
  }

  @Override public int compareTo(PlayTeamEntity team) {
    return id.compareTo(team.getId());
  }

  @Override public String toString() {
    return "PlayTeamEntity{" +
        "id='" + id + '\'' +
        ", name='" + name + '\'' +
        ", slug='" + slug + '\'' +
        ", ownerId='" + ownerId + '\'' +
        ", weeklyBettingAmountPerMember=" + weeklyBettingAmountPerMember +
        ", adminsList=" + adminsList +
        ", membersCount=" + membersCount +
        ", avatarEntity=" + avatarEntity +
        ", statusList=" + statusList +
        ", averageWinningBets=" + averageWinningBets +
        ", averageWinningMoneyAmount=" + averageWinningMoneyAmount +
        ", isCurrentUserAdmin=" + isCurrentUserAdmin +
        ", isCurrentUserOwner=" + isCurrentUserOwner +
        ", tmpWeeklyBettingAmount=" + tmpWeeklyBettingAmount +
        ", weeklyBudget=" + weeklyBudget +
        ", statusBidChanged=" + statusBidChanged +
        ", statusTopUp=" + statusTopUp +
        ", BID_CHANGED='" + BID_CHANGED + '\'' +
        ", TOP_UP='" + TOP_UP + '\'' +
        '}';
  }
}
