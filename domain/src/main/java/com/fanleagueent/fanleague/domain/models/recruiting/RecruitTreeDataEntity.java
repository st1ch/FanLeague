package com.fanleagueent.fanleague.domain.models.recruiting;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Artem Getman on 21.02.17.
 * a.e.getman@gmail.com
 */

public class RecruitTreeDataEntity {

  @SerializedName("tree") private RecruitTreeEntity tree;
  @SerializedName("total_players_in_tree") private int totalPlayersInTree;

  public RecruitTreeEntity getTree() {
    return tree;
  }

  public int getTotalPlayersInTree() {
    return totalPlayersInTree;
  }

  @Override public String toString() {
    return "RecruitTreeDataEntity{" + "tree=" + tree + ", totalPlayersInTree=" + totalPlayersInTree + '}';
  }
}
