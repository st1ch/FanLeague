package com.fanleagueent.fanleague.data.entity.entities.recruiting;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * Created by Artem Getman on 21.02.17.
 * a.e.getman@gmail.com
 */

public class RecruitInvitesDataEntity {
  @SerializedName("users") private List<RecruitUserEntity> users;
  @SerializedName("total") private int totalCount;

  public List<RecruitUserEntity> getUsers() {
    return users;
  }

  public int getTotalCount() {
    return totalCount;
  }
}
