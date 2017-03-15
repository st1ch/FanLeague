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

  public void setGroup18to25(RecruitGroup group18to25) {
    this.group18to25 = group18to25;
  }

  public void setGroup26to35(RecruitGroup group26to35) {
    this.group26to35 = group26to35;
  }

  public void setGroup36to45(RecruitGroup group36to45) {
    this.group36to45 = group36to45;
  }

  public void setGroup46to55(RecruitGroup group46to55) {
    this.group46to55 = group46to55;
  }

  public void setGroup56plus(RecruitGroup group56plus) {
    this.group56plus = group56plus;
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
