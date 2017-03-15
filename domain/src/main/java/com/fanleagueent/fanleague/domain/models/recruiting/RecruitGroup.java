package com.fanleagueent.fanleague.domain.models.recruiting;

/**
 * Created by Artem Getman on 21.02.17.
 * a.e.getman@gmail.com
 */

public class RecruitGroup {
  private int count;
  private float percent;
  private String title;
  private String ident;

  public int getCount() {
    return count;
  }

  public float getPercent() {
    return percent;
  }

  public String getTitle() {
    return title;
  }

  public String getIdent() {
    return ident;
  }

  public void setCount(int count) {
    this.count = count;
  }

  public void setPercent(float percent) {
    this.percent = percent;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setIdent(String ident) {
    this.ident = ident;
  }

  @Override public String toString() {
    return "RecruitGroupEntity{"
        + "count="
        + count
        + ", percent="
        + percent
        + ", title='"
        + title
        + '\''
        + ", ident='"
        + ident
        + '\''
        + '}';
  }
}
