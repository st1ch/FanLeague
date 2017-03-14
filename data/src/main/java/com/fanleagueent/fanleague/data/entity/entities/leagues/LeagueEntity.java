package com.fanleagueent.fanleague.data.entity.entities.leagues;

import com.fanleagueent.fanleague.data.entity.entities.user.AvatarEntity;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * Created by alexeyverbitskiy on 12/8/16.
 */

public class LeagueEntity {
  @SerializedName("_id") private String id;
  @SerializedName("name") private String name;
  @SerializedName("slug") private String slug;
  @SerializedName("owner_id") private String ownerId;
  @SerializedName("created_at") private String createdAt;
  @SerializedName("updated_at") private String updatedAt;
  @SerializedName("admins") private List<String> adminsList;
  @SerializedName("members_count") private int membersCount;
  @SerializedName("image_sizes") private AvatarEntity avatarEntity;
  @SerializedName("is_current_user_admin") private boolean isCurrentUserAdmin;
  @SerializedName("is_current_user_owner") private boolean isCurrentUserOwner;
  @SerializedName("average_winning_bets") private float averageWinningBets;
  @SerializedName("average_winning_money_amount") private float averageWinningMoneyAmount;
  @SerializedName("accept_token") private String acceptToken;
  @SerializedName("deny_token") private String denyToken;
  @SerializedName("invited_by") private String invitedBy;

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

  public String getCreatedAt() {
    return createdAt;
  }

  public String getUpdatedAt() {
    return updatedAt;
  }

  public int getMembersCount() {
    return membersCount;
  }

  public List<String> getAdminsList() {
    return adminsList;
  }

  public AvatarEntity getAvatarEntity() {
    return avatarEntity;
  }

  public float getAverageWinningBets() {
    return averageWinningBets;
  }

  public float getAverageWinningMoneyAmount() {
    return averageWinningMoneyAmount;
  }

  public String getAcceptToken() {
    return acceptToken;
  }

  public boolean isCurrentUserAdmin() {
    return isCurrentUserAdmin;
  }

  public String getDenyToken() {
    return denyToken;
  }

  public String getInvitedBy() {
    return invitedBy;
  }

  public boolean isCurrentUserOwner() {
    return isCurrentUserOwner;
  }

}
