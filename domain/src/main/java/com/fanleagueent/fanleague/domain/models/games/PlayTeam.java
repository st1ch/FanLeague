package com.fanleagueent.fanleague.domain.models.games;

import com.fanleagueent.fanleague.domain.models.user.Avatar;
import java.util.List;

/**
 * Created by st1ch on 12.01.17.
 */

public class PlayTeam implements Comparable<PlayTeam> {
  private String id;
  private String name;
  private String slug;
  private String ownerId;
  private int weeklyBettingAmountPerMember;
  private List<String> adminsList;
  private int membersCount;
  private Avatar avatarEntity;
  private List<String> statusList;
  private float averageWinningBets;
  private float averageWinningMoneyAmount;
  private boolean isCurrentUserAdmin;
  private boolean isCurrentUserOwner;
  private int tmpWeeklyBettingAmount;
  private float weeklyBudget;

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

  public Avatar getAvatarEntity() {
    return avatarEntity;
  }

  public void setAvatarEntity(Avatar avatarEntity) {
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
        return true;
      }
    }
    return false;
  }

  public boolean isStatusTopUp() {
    if (statusList != null && !statusList.isEmpty()) {
      if (statusList.contains(TOP_UP)) {
        return true;
      }
    }
    return false;
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

  @Override public int compareTo(PlayTeam team) {
    return id.compareTo(team.getId());
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
        + ", BID_CHANGED='"
        + BID_CHANGED
        + '\''
        + ", TOP_UP='"
        + TOP_UP
        + '\''
        + '}';
  }
}
