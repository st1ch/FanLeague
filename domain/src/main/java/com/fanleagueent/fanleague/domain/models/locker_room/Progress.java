package com.fanleagueent.fanleague.domain.models.locker_room;

/**
 * Created by st1ch on 23.01.17.
 */

public class Progress {

  private ProgressItem score;
  private ProgressItem recruiting;
  private ProgressItem tree;
  private ProgressItem loyalty;
  private ProgressItem consistency;

  public ProgressItem getScore() {
    return score;
  }

  public void setScore(ProgressItem score) {
    this.score = score;
  }

  public ProgressItem getRecruiting() {
    return recruiting;
  }

  public void setRecruiting(ProgressItem recruiting) {
    this.recruiting = recruiting;
  }

  public ProgressItem getTree() {
    return tree;
  }

  public void setTree(ProgressItem tree) {
    this.tree = tree;
  }

  public ProgressItem getLoyalty() {
    return loyalty;
  }

  public void setLoyalty(ProgressItem loyalty) {
    this.loyalty = loyalty;
  }

  public ProgressItem getConsistency() {
    return consistency;
  }

  public void setConsistency(ProgressItem consistency) {
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
