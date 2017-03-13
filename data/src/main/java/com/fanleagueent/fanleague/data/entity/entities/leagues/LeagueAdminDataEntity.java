package com.fanleagueent.fanleague.data.entity.entities.leagues;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * Created by alexeyverbitskiy on 12/8/16.
 */

public class LeagueAdminDataEntity {

  @SerializedName("admins") private List<LeagueMemberEntityEntity> leagueMemberEntities;

  public List<LeagueMemberEntityEntity> getAdminsList() {
    return leagueMemberEntities;
  }
}
