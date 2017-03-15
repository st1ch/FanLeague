package com.fanleagueent.fanleague.data.entity.entities.recruiting;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Artem Getman on 21.02.17.
 * a.e.getman@gmail.com
 */

public class FansInTreeEntity {
  @SerializedName("club") private ClubEntity club;
  @SerializedName("count") private int count;

  public ClubEntity getClub() {
    return club;
  }

  public int getCount() {
    return count;
  }
}
