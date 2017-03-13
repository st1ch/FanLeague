package com.fanleagueent.fanleague.domain.models.recruiting;

/**
 * Created by Artem Getman on 21.02.17.
 * a.e.getman@gmail.com
 */

public class RecruitAgeGroups {
  private RecruitGroup group18to25;
  private RecruitGroup group26to35;
  private RecruitGroup group36to45;
  private RecruitGroup group46to55;
  private RecruitGroup group56plus;

  public RecruitGroup getGroup18to25() {
    return group18to25;
  }

  public RecruitGroup getGroup26to35() {
    return group26to35;
  }

  public RecruitGroup getGroup36to45() {
    return group36to45;
  }

  public RecruitGroup getGroup46to55() {
    return group46to55;
  }

  public RecruitGroup getGroup56plus() {
    return group56plus;
  }

  @Override public String toString() {
    return "RecruitAgeGroupsEntity{"
        + "group18to25="
        + group18to25
        + ", group26to35="
        + group26to35
        + ", group36to45="
        + group36to45
        + ", group46to55="
        + group46to55
        + ", group56plus="
        + group56plus
        + '}';
  }
}
