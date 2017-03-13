package com.fanleagueent.fanleague.domain.models.locker_room;

import com.google.gson.annotations.SerializedName;

/**
 * Created by st1ch on 23.01.17.
 */

public class TrophiesEntity {

  @SerializedName("score") private TrophyEntity score;
  @SerializedName("recruiting") private TrophyEntity recruiting;
  @SerializedName("tree") private TrophyEntity tree;
  @SerializedName("loyalty") private TrophyEntity loyalty;
  @SerializedName("consistency") private TrophyEntity consistency;

  public TrophyEntity getScore() {
    return score;
  }

  public void setScore(TrophyEntity score) {
    this.score = score;
  }

  public TrophyEntity getRecruiting() {
    return recruiting;
  }

  public void setRecruiting(TrophyEntity recruiting) {
    this.recruiting = recruiting;
  }

  public TrophyEntity getTree() {
    return tree;
  }

  public void setTree(TrophyEntity tree) {
    this.tree = tree;
  }

  public TrophyEntity getLoyalty() {
    return loyalty;
  }

  public void setLoyalty(TrophyEntity loyalty) {
    this.loyalty = loyalty;
  }

  public TrophyEntity getConsistency() {
    return consistency;
  }

  public void setConsistency(TrophyEntity consistency) {
    this.consistency = consistency;
  }

  @Override public String toString() {
    return "TrophiesEntity{" +
        "score=" + score +
        ", recruiting=" + recruiting +
        ", tree=" + tree +
        ", loyalty=" + loyalty +
        ", consistency=" + consistency +
        '}';
  }
}
