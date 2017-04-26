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

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getOwnerId() {
    return ownerId;
  }

  public boolean isOnlyAdminCanChangeBet() {
    return isOnlyAdminCanChangeBet;
  }

  public int getWeeklyBettingAmountPerMember() {
    return weeklyBettingAmountPerMember;
  }

  public List<String> getAdminsList() {
    return adminsList;
  }

  public String getCreatedAt() {
    return createdAt;
  }

  public String getUpdatedAt() {
    return updatedAt;
  }

  public List<String> getUserIds() {
    return userIds;
  }

  public int getMembersCount() {
    return membersCount;
  }

  public AvatarEntity getAvatarEntity() {
    return avatarEntity;
  }

  public List<String> getStatusList() {
    return statusList;
  }

  public String getAcceptToken() {
    return acceptToken;
  }

  public String getDenyToken() {
    return denyToken;
  }

  public float getAverageWinningBets() {
    return averageWinningBets;
  }

  public float getAverageWinningMoneyAmount() {
    return averageWinningMoneyAmount;
  }

  public boolean isCurrentUserAdmin() {
    return isCurrentUserAdmin;
  }

  public String getInvitedBy() {
    return invitedBy;
  }

  public int getTmpWeeklyBettingAmount() {
    return tmpWeeklyBettingAmount;
  }

  public boolean isCurrentUserOwner() {
    return isCurrentUserOwner;
  }

  public String getSlug() {
    return slug;
  }
}