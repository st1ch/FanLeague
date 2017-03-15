package com.fanleagueent.fanleague.data.entity.entities.recruiting;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * Created by Artem Getman on 21.02.17.
 * a.e.getman@gmail.com
 */

public class RecruitTreeEntity {

  @SerializedName("5") private List<RecruitUserEntity> level5Items;
  @SerializedName("4") private List<RecruitUserEntity> level4Items;
  @SerializedName("3") private List<RecruitUserEntity> level3Items;
  @SerializedName("2") private List<RecruitUserEntity> level2Items;
  @SerializedName("1") private List<RecruitUserEntity> level1Items;

  public List<RecruitUserEntity> getLevel5Items() {
    return level5Items;
  }

  public List<RecruitUserEntity> getLevel4Items() {
    return level4Items;
  }

  public List<RecruitUserEntity> getLevel3Items() {
    return level3Items;
  }

  public List<RecruitUserEntity> getLevel2Items() {
    return level2Items;
  }

  public List<RecruitUserEntity> getLevel1Items() {
    return level1Items;
  }
}
