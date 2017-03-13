package com.fanleagueent.fanleague.data.entity.entities.recruiting;

import com.google.gson.annotations.SerializedName;
import java.util.Map;

/**
 * Created by Artem Getman on 21.02.17.
 * a.e.getman@gmail.com
 */

public class RecruitOverviewDataEntity {
  @SerializedName("age_groups") private Map<String, RecruitGroupEntity> ageGroups;
  @SerializedName("nationality_groups") private Map<String, RecruitGroupEntity> nationalityGroups;
  @SerializedName("profession_groups") private Map<String, RecruitGroupEntity> professionGroups;
  @SerializedName("favourite_club_groups") private Map<String, RecruitGroupEntity> favouriteClubGroups;
  @SerializedName("fans_in_tree") private FansInTreeEntity fansInTreeEntity;
  @SerializedName("total_players_in_tree") private int totalPlayersInTree;
  @SerializedName("total_players_in_tree_diff") private String totalPlayersInTreeDifference;
  @SerializedName("total_earned_credits") private int totalEarnedCredits;

  public Map<String, RecruitGroupEntity> getAgeGroups() {
    return ageGroups;
  }

  public Map<String, RecruitGroupEntity> getNationalityGroups() {
    return nationalityGroups;
  }

  public Map<String, RecruitGroupEntity> getProfessionGroups() {
    return professionGroups;
  }

  public Map<String, RecruitGroupEntity> getFavouriteClubGroups() {
    return favouriteClubGroups;
  }

  public FansInTreeEntity getFansInTreeEntity() {
    return fansInTreeEntity;
  }

  public int getTotalPlayersInTree() {
    return totalPlayersInTree;
  }

  public String getTotalPlayersInTreeDifference() {
    return totalPlayersInTreeDifference;
  }

  public int getTotalEarnedCredits() {
    return totalEarnedCredits;
  }

  @Override public String toString() {
    return "RecruitOverviewDataEntity{"
        + "ageGroups="
        + ageGroups
        + ", nationalityGroups="
        + nationalityGroups
        + ", professionGroups="
        + professionGroups
        + ", favouriteClubGroups="
        + favouriteClubGroups
        + ", fansInTreeEntity="
        + fansInTreeEntity
        + ", totalPlayersInTree="
        + totalPlayersInTree
        + ", totalPlayersInTreeDifference='"
        + totalPlayersInTreeDifference
        + '\''
        + ", totalEarnedCredits="
        + totalEarnedCredits
        + '}';
  }
}
