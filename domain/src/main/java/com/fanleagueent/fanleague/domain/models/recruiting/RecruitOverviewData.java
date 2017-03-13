package com.fanleagueent.fanleague.domain.models.recruiting;

import java.util.Map;

/**
 * Created by Artem Getman on 21.02.17.
 * a.e.getman@gmail.com
 */

public class RecruitOverviewData {
  private Map<String, RecruitGroup> ageGroups;
  private Map<String, RecruitGroup> nationalityGroups;
  private Map<String, RecruitGroup> professionGroups;
  private Map<String, RecruitGroup> favouriteClubGroups;
  private FansInTree fansInTree;
  private int totalPlayersInTree;
  private String totalPlayersInTreeDifference;
  private int totalEarnedCredits;

  public Map<String, RecruitGroup> getAgeGroups() {
    return ageGroups;
  }

  public Map<String, RecruitGroup> getNationalityGroups() {
    return nationalityGroups;
  }

  public Map<String, RecruitGroup> getProfessionGroups() {
    return professionGroups;
  }

  public Map<String, RecruitGroup> getFavouriteClubGroups() {
    return favouriteClubGroups;
  }

  public FansInTree getFansInTree() {
    return fansInTree;
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
        + fansInTree
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
