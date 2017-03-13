package com.fanleagueent.fanleague.domain.models.recruiting;

/**
 * Created by Artem Getman on 21.02.17.
 * a.e.getman@gmail.com
 */

public class RecruitTreeData {

  private RecruitTree tree;
  private int totalPlayersInTree;

  public RecruitTree getTree() {
    return tree;
  }

  public int getTotalPlayersInTree() {
    return totalPlayersInTree;
  }

  @Override public String toString() {
    return "RecruitTreeDataEntity{" + "tree=" + tree + ", totalPlayersInTree=" + totalPlayersInTree + '}';
  }
}
