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

  public ProgressItemEntity getRecruiting() {
    return recruiting;
  }

  public ProgressItemEntity getTree() {
    return tree;
  }

  public ProgressItemEntity getLoyalty() {
    return loyalty;
  }

  public ProgressItemEntity getConsistency() {
    return consistency;
  }
}
