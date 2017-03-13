package com.fanleagueent.fanleague.data.entity.entities.pundits;

import com.fanleagueent.fanleague.data.entity.entities.games.GameweekEntity;
import com.google.gson.annotations.SerializedName;

/**
 * Created by st1ch on 08.02.17.
 */

public class PunditPostDataEntity {
  @SerializedName("post") private PunditPostEntity post;
  @SerializedName("gameweek") private GameweekEntity gameweek;

  public PunditPostEntity getPost() {
    return post;
  }

  public void setPost(PunditPostEntity post) {
    this.post = post;
  }

  public GameweekEntity getGameweek() {
    return gameweek;
  }

  public void setGameweek(GameweekEntity gameweek) {
    this.gameweek = gameweek;
  }

  @Override public String toString() {
    return "PunditPostDataEntity{" + "post=" + post + ", gameweek=" + gameweek + '}';
  }
}
