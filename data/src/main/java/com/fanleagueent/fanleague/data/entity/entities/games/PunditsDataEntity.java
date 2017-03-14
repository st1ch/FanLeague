package com.fanleagueent.fanleague.data.entity.entities.games;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * Created by st1ch on 10.01.17.
 */

public class PunditsDataEntity {

  @SerializedName("posts") private List<PunditEntity> punditEntityList;

  public List<PunditEntity> getPunditEntityList() {
    return punditEntityList;
  }
}
