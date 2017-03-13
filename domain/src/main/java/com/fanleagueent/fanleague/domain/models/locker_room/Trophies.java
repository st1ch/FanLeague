package com.fanleagueent.fanleague.domain.models.locker_room;

/**
 * Created by st1ch on 23.01.17.
 */

public class Trophies {

  private Trophy score;
  private Trophy recruiting;
  private Trophy tree;
  private Trophy loyalty;
  private Trophy consistency;

  public Trophy getScore() {
    return score;
  }

  public void setScore(Trophy score) {
    this.score = score;
  }

  public Trophy getRecruiting() {
    return recruiting;
  }

  public void setRecruiting(Trophy recruiting) {
    this.recruiting = recruiting;
  }

  public Trophy getTree() {
    return tree;
  }

  public void setTree(Trophy tree) {
    this.tree = tree;
  }

  public Trophy getLoyalty() {
    return loyalty;
  }

  public void setLoyalty(Trophy loyalty) {
    this.loyalty = loyalty;
  }

  public Trophy getConsistency() {
    return consistency;
  }

  public void setConsistency(Trophy consistency) {
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
