package com.fanleagueent.fanleague.domain.models.recruiting;

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

  @Override public String toString() {
    return "RecruitInvitesDataEntity{" + "users=" + users + ", totalCount=" + totalCount + '}';
  }
}
