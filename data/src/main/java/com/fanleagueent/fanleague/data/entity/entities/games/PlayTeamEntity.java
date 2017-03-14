package com.fanleagueent.fanleague.data.entity.entities.games;

import com.fanleagueent.fanleague.data.entity.entities.user.AvatarEntity;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * Created by st1ch on 12.01.17.
 */

public class PlayTeamEntity {
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

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getSlug() {
    return slug;
  }

  public String getOwnerId() {
    return ownerId;
  }

  public int getWeeklyBettingAmountPerMember() {
    return weeklyBettingAmountPerMember;
  }

  public List<String> getAdminsList() {
    return adminsList;
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

  public float getAverageWinningBets() {
    return averageWinningBets;
  }

  public float getAverageWinningMoneyAmount() {
    return averageWinningMoneyAmount;
  }

  public boolean isCurrentUserAdmin() {
    return isCurrentUserAdmin;
  }

  public boolean isCurrentUserOwner() {
    return isCurrentUserOwner;
  }

  public int getTmpWeeklyBettingAmount() {
    return tmpWeeklyBettingAmount;
  }

  public float getWeeklyBudget() {
    return weeklyBudget;
  }

  @Override public String toString() {
    return "PlayTeamEntity{"
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
        + ", weeklyBettingAmountPerMember="
        + weeklyBettingAmountPerMember
        + ", adminsList="
        + adminsList
        + ", membersCount="
        + membersCount
        + ", avatarEntity="
        + avatarEntity
        + ", statusList="
        + statusList
        + ", averageWinningBets="
        + averageWinningBets
        + ", averageWinningMoneyAmount="
        + averageWinningMoneyAmount
        + ", isCurrentUserAdmin="
        + isCurrentUserAdmin
        + ", isCurrentUserOwner="
        + isCurrentUserOwner
        + ", tmpWeeklyBettingAmount="
        + tmpWeeklyBettingAmount
        + ", weeklyBudget="
        + weeklyBudget
        + '\''
        + '}';
  }
}
