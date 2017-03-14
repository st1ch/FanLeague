package com.fanleagueent.fanleague.data.entity.entities.games;

import com.google.gson.annotations.SerializedName;

/**
 * Created by st1ch on 22.12.16.
 */

public class PrizesEntity {

  @SerializedName("10") private String prize10;

  @SerializedName("11") private String prize11;

  @SerializedName("12") private String prize12;

  @SerializedName("13") private String prize13;

  @SerializedName("tree") private String tree;

  public String getPrize10() {
    return prize10;
  }

  public String getPrize11() {
    return prize11;
  }

  public String getPrize12() {
    return prize12;
  }

  public String getPrize13() {
    return prize13;
  }

  public String getTree() {
    return tree;
  }

  @Override public String toString() {
    return "PrizesEntity{"
        + "prize10="
        + prize10
        + ", prize11="
        + prize11
        + ", prize12="
        + prize12
        + ", prize13="
        + prize13
        + ", tree="
        + tree
        + '}';
  }
}
