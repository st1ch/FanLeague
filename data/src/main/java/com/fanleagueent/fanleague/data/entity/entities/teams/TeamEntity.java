package com.fanleagueent.fanleague.data.entity.entities.teams;

import com.fanleagueent.fanleague.data.entity.entities.user.AvatarEntity;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * Created by st1ch on 23.11.16.
 */

public class TeamEntity {
  @SerializedName("_id") private String id;

  @SerializedName("name") private String name;

  @SerializedName("slug") private String slug;

  @SerializedName("owner_id") private String ownerId;

  @SerializedName("is_only_admin_can_change_bet") private boolean isOnlyAdminCanChangeBet;

  @SerializedName("weekly_betting_amount_per_member") private int weeklyBettingAmountPerMember;

  @SerializedName("admins") private List<String> adminsList;

  @SerializedName("created_at") private String createdAt;

  @SerializedName("updated_at") private String updatedAt;

  @SerializedName("user_id") private List<String> userIds;

  @SerializedName("members_count") private int membersCount;

  @SerializedName("image_sizes") private AvatarEntity avatarEntity;

  @SerializedName("status") private List<String> statusList;

  @SerializedName("accept_token") private String acceptToken;

  @SerializedName("deny_token") private String denyToken;

  @SerializedName("average_winning_bets") private float averageWinningBets;

  @SerializedName("average_winning_money_amount") private float averageWinningMoneyAmount;

  @SerializedName("is_current_user_admin") private boolean isCurrentUserAdmin;

  @SerializedName("is_current_user_owner") private boolean isCurrentUserOwner;

  @SerializedName("invited_by") private String invitedBy;

  @SerializedName("temporary_weekly_betting_amount") private int tmpWeeklyBettingAmount;

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

  public String getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }

  public boolean isOnlyAdminCanChangeBet() {
    return isOnlyAdminCanChangeBet;
  }

  public void setOnlyAdminCanChangeBet(boolean onlyAdminCanChangeBet) {
    isOnlyAdminCanChangeBet = onlyAdminCanChangeBet;
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

  public List<String> getUserIds() {
    return userIds;
  }

  public void setUserIds(List<String> userIds) {
    this.userIds = userIds;
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
    if (statusList != null && !statusList.isEmpty()) {
      if (statusList.contains(BID_CHANGED)) {
        statusBidChanged = true;
      }
    }
    return statusBidChanged;
  }

  public boolean isStatusTopUp() {
    if (statusList != null && !statusList.isEmpty()) {
      if (statusList.contains(TOP_UP)) {
        statusTopUp = true;
      }
    }
    return statusTopUp;
  }

  public boolean hasInvitation() {
    if (acceptToken != null && denyToken != null) {
      return true;
    }
    return false;
  }

  public String getAcceptToken() {
    return acceptToken;
  }

  public void setAcceptToken(String acceptToken) {
    this.acceptToken = acceptToken;
  }

  public String getDenyToken() {
    return denyToken;
  }

  public void setDenyToken(String denyToken) {
    this.denyToken = denyToken;
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

  public String getInvitedBy() {
    return invitedBy;
  }

  public void setInvitedBy(String invitedBy) {
    this.invitedBy = invitedBy;
  }

  public int getTmpWeeklyBettingAmount() {
    return tmpWeeklyBettingAmount;
  }

  public void setTmpWeeklyBettingAmount(int tmpWeeklyBettingAmount) {
    this.tmpWeeklyBettingAmount = tmpWeeklyBettingAmount;
  }

  public boolean isCurrentUserOwner() {
    return isCurrentUserOwner;
  }

  public String getSlug() {
    return slug;
  }

  @Override public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    TeamEntity teamEntity = (TeamEntity) o;

    return id.equals(teamEntity.id);
  }

  @Override public int hashCode() {
    return id.hashCode();
  }

  @Override public String toString() {
    return "TeamEntity{"
        + "id='"
        + id
        + '\''
        + ", name='"
        + name
        + '\''
        + ", slug='"
        + slug
        + '\''
        + ", ownerId='"
        + ownerId
        + '\''
        + ", isOnlyAdminCanChangeBet="
        + isOnlyAdminCanChangeBet
        + ", weeklyBettingAmountPerMember="
        + weeklyBettingAmountPerMember
        + ", adminsList="
        + adminsList
        + ", createdAt='"
        + createdAt
        + '\''
        + ", updatedAt='"
        + updatedAt
        + '\''
        + ", userIds="
        + userIds
        + ", membersCount="
        + membersCount
        + ", avatarEntity="
        + avatarEntity
        + ", statusList="
        + statusList
        + ", acceptToken='"
        + acceptToken
        + '\''
        + ", denyToken='"
        + denyToken
        + '\''
        + ", averageWinningBets="
        + averageWinningBets
        + ", averageWinningMoneyAmount="
        + averageWinningMoneyAmount
        + ", isCurrentUserAdmin="
        + isCurrentUserAdmin
        + ", isCurrentUserOwner="
        + isCurrentUserOwner
        + ", invitedBy='"
        + invitedBy
        + '\''
        + ", tmpWeeklyBettingAmount="
        + tmpWeeklyBettingAmount
        + ", statusBidChanged="
        + statusBidChanged
        + ", statusTopUp="
        + statusTopUp
        + '}';
  }
}