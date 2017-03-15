package com.fanleagueent.fanleague.domain.models.recruiting;

import java.util.List;

/**
 * Created by Artem Getman on 21.02.17.
 * a.e.getman@gmail.com
 */

public class RecruitTree {

  private List<RecruitUser> level5Items;
  private List<RecruitUser> level4Items;
  private List<RecruitUser> level3Items;
  private List<RecruitUser> level2Items;
  private List<RecruitUser> level1Items;

  public List<RecruitUser> getLevel5Items() {
    return level5Items;
  }

  public List<RecruitUser> getLevel4Items() {
    return level4Items;
  }

  public List<RecruitUser> getLevel3Items() {
    return level3Items;
  }

  public List<RecruitUser> getLevel2Items() {
    return level2Items;
  }

  public List<RecruitUser> getLevel1Items() {
    return level1Items;
  }

  public void setLevel5Items(List<RecruitUser> level5Items) {
    this.level5Items = level5Items;
  }

  public void setLevel4Items(List<RecruitUser> level4Items) {
    this.level4Items = level4Items;
  }

  public void setLevel3Items(List<RecruitUser> level3Items) {
    this.level3Items = level3Items;
  }

  public void setLevel2Items(List<RecruitUser> level2Items) {
    this.level2Items = level2Items;
  }

  public void setLevel1Items(List<RecruitUser> level1Items) {
    this.level1Items = level1Items;
  }

  @Override public String toString() {
    return "RecruitTreeEntity{"
        + "level5Items="
        + level5Items
        + ", level4Items="
        + level4Items
        + ", level3Items="
        + level3Items
        + ", level2Items="
        + level2Items
        + ", level1Items="
        + level1Items
        + '}';
  }
}
