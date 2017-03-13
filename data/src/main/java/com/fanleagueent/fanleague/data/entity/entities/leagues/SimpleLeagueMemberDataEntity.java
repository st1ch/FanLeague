package com.fanleagueent.fanleague.data.entity.entities.leagues;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * Created by alexeyverbitskiy on 12/8/16.
 */

public class SimpleLeagueMemberDataEntity {

  @SerializedName("users") private List<SimpleLeagueMemberEntity> simpleLeagueMemberEntities;

  @SerializedName("total") private int count;

  public List<SimpleLeagueMemberEntity> getLeagueMembersList() {
    return simpleLeagueMemberEntities;
  }

  public int getCount() {
    return count;
  }
}
