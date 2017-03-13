package com.fanleagueent.fanleague.domain.models.recruiting;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Artem Getman on 21.02.17.
 * a.e.getman@gmail.com
 */

public class RecruitAgeGroupsEntity {
  @SerializedName("18-25") private RecruitGroupEntity group18to25;
  @SerializedName("26-35") private RecruitGroupEntity group26to35;
  @SerializedName("36-45") private RecruitGroupEntity group36to45;
  @SerializedName("46-55") private RecruitGroupEntity group46to55;
  @SerializedName("56+") private RecruitGroupEntity group56plus;

  public RecruitGroupEntity getGroup18to25() {
    return group18to25;
  }

  public RecruitGroupEntity getGroup26to35() {
    return group26to35;
  }

  public RecruitGroupEntity getGroup36to45() {
    return group36to45;
  }

  public RecruitGroupEntity getGroup46to55() {
    return group46to55;
  }

  public RecruitGroupEntity getGroup56plus() {
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
