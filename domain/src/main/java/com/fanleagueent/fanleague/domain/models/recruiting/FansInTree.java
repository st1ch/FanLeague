package com.fanleagueent.fanleague.domain.models.recruiting;

/**
 * Created by Artem Getman on 21.02.17.
 * a.e.getman@gmail.com
 */

public class FansInTree {
  private Club club;
  private int count;

  public Club getClub() {
    return club;
  }

  public int getCount() {
    return count;
  }

  public void setClub(Club club) {
    this.club = club;
  }

  public void setCount(int count) {
    this.count = count;
  }

  @Override public String toString() {
    return "FansInTreeEntity{" + "club=" + club + ", count=" + count + '}';
  }
}
