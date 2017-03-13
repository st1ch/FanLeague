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

  public int getMembersCount() {
    return membersCount;
  }

  public void setMembersCount(int membersCount) {
    this.membersCount = membersCount;
  }

  public List<String> getAdminsList() {
    return adminsList;
  }

  public void setAdminsList(List<String> adminsList) {
    this.adminsList = adminsList;
  }

  public AvatarEntity getAvatarEntity() {
    return avatarEntity;
  }

  public void setAvatarEntity(AvatarEntity avatarEntity) {
    this.avatarEntity = avatarEntity;
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

  public boolean hasInvitation() {
    if (acceptToken != null && denyToken != null) {
      return true;
    }
    return false;
  }

  public boolean isCurrentUserOwner() {
    return isCurrentUserOwner;
  }

  @Override public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    LeagueEntity leagueEntity = (LeagueEntity) o;

    return id != null ? id.equals(leagueEntity.id) : leagueEntity.id == null;
  }

  @Override public int hashCode() {
    return id != null ? id.hashCode() : 0;
  }

  @Override public String toString() {
    return "LeagueEntity{"
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
        + ", createdAt='"
        + createdAt
        + '\''
        + ", updatedAt='"
        + updatedAt
        + '\''
        + ", adminsList="
        + adminsList
        + ", membersCount="
        + membersCount
        + ", avatarEntity="
        + avatarEntity
        + ", averageWinningBets="
        + averageWinningBets
        + ", averageWinningMoneyAmount="
        + averageWinningMoneyAmount
        + '}';
  }
}
