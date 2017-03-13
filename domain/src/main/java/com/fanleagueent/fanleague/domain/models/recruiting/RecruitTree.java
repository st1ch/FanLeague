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
