package com.fanleagueent.fanleague.data.entity.entities.locker_room;

import com.google.gson.annotations.SerializedName;

/**
 * Created by st1ch on 23.01.17.
 */

public class ProgressEntity {

  @SerializedName("score") private ProgressItemEntity score;
  @SerializedName("recruiting") private ProgressItemEntity recruiting;
  @SerializedName("tree") private ProgressItemEntity tree;
  @SerializedName("loyalty") private ProgressItemEntity loyalty;
  @SerializedName("consistency") private ProgressItemEntity consistency;

  public ProgressItemEntity getScore() {
    return score;
  }

  public void setScore(ProgressItemEntity score) {
    this.score = score;
  }

  public ProgressItemEntity getRecruiting() {
    return recruiting;
  }

  public void setRecruiting(ProgressItemEntity recruiting) {
    this.recruiting = recruiting;
  }

  public ProgressItemEntity getTree() {
    return tree;
  }

  public void setTree(ProgressItemEntity tree) {
    this.tree = tree;
  }

  public ProgressItemEntity getLoyalty() {
    return loyalty;
  }

  public void setLoyalty(ProgressItemEntity loyalty) {
    this.loyalty = loyalty;
  }

  public ProgressItemEntity getConsistency() {
    return consistency;
  }

  public void setConsistency(ProgressItemEntity consistency) {
    this.consistency = consistency;
  }

  @Override public String toString() {
    return "ProgressEntity{" +
        "score=" + score +
        ", recruiting=" + recruiting +
        ", tree=" + tree +
        ", loyalty=" + loyalty +
        ", consistency=" + consistency +
        '}';
  }
}
