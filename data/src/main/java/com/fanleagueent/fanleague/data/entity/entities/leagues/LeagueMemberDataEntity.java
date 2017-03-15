package com.fanleagueent.fanleague.data.entity.entities.leagues;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * Created by alexeyverbitskiy on 12/8/16.
 */

public class LeagueMemberDataEntity {

  @SerializedName("users") private List<LeagueMemberEntity> leagueMemberEntities;

  @SerializedName("total") private int count;

  public List<LeagueMemberEntity> getTeamMembersList() {
    return leagueMemberEntities;
  }

  public int getCount() {
    return count;
  }
}
