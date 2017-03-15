package com.fanleagueent.fanleague.domain.models.leagues;

import java.util.List;

/**
 * Created by alexeyverbitskiy on 12/8/16.
 */

public class SimpleLeagueMemberData {

  private List<SimpleLeagueMember> simpleLeagueMemberEntities;
  private int count;

  public List<SimpleLeagueMember> getLeagueMembersList() {
    return simpleLeagueMemberEntities;
  }

  public int getCount() {
    return count;
  }

  public void setSimpleLeagueMemberEntities(List<SimpleLeagueMember> simpleLeagueMemberEntities) {
    this.simpleLeagueMemberEntities = simpleLeagueMemberEntities;
  }

  public void setCount(int count) {
    this.count = count;
  }

  @Override public String toString() {
    return "SimpleLeagueMemberData{"
        + "simpleLeagueMemberEntities="
        + simpleLeagueMemberEntities
        + ", count="
        + count
        + '}';
  }
}
