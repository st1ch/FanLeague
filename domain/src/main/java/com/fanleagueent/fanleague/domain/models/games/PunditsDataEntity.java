package com.fanleagueent.fanleague.domain.models.games;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * Created by st1ch on 10.01.17.
 */

public class PunditsDataEntity {

  @SerializedName("posts")
  List<PunditEntity> punditEntityList;

  public List<PunditEntity> getPunditEntityList() {
    return punditEntityList;
  }

  public void setPunditEntityList(List<PunditEntity> punditEntityList) {
    this.punditEntityList = punditEntityList;
  }

}
