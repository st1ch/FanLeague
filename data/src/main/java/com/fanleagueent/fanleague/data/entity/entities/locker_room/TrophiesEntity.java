package com.fanleagueent.fanleague.data.entity.entities.locker_room;

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

  public TrophyEntity getRecruiting() {
    return recruiting;
  }

  public TrophyEntity getTree() {
    return tree;
  }

  public TrophyEntity getLoyalty() {
    return loyalty;
  }

  public TrophyEntity getConsistency() {
    return consistency;
  }
}
