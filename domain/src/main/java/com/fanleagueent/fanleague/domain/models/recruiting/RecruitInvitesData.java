package com.fanleagueent.fanleague.domain.models.recruiting;

import java.util.List;

/**
 * Created by Artem Getman on 21.02.17.
 * a.e.getman@gmail.com
 */

public class RecruitInvitesData {
  private List<RecruitUser> users;
  private int totalCount;

  public List<RecruitUser> getUsers() {
    return users;
  }

  public int getTotalCount() {
    return totalCount;
  }

  public void setUsers(List<RecruitUser> users) {
    this.users = users;
  }

  public void setTotalCount(int totalCount) {
    this.totalCount = totalCount;
  }

  @Override public String toString() {
    return "RecruitInvitesDataEntity{" + "users=" + users + ", totalCount=" + totalCount + '}';
  }
}
