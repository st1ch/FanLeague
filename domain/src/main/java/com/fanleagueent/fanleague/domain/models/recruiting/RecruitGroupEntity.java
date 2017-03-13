package com.fanleagueent.fanleague.domain.models.recruiting;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Artem Getman on 21.02.17.
 * a.e.getman@gmail.com
 */

public class RecruitGroupEntity {
  @SerializedName("count") private int count;
  @SerializedName("percent") private float percent;
  @SerializedName("title") private String title;
  @SerializedName("ident") private String ident;

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
