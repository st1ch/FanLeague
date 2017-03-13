package com.fanleagueent.fanleague.domain.models.pundits;

import com.fanleagueent.fanleague.domain.models.games.Gameweek;

/**
 * Created by st1ch on 08.02.17.
 */

public class PunditPostData {
  private PunditPost post;
  private Gameweek gameweek;

  public PunditPost getPost() {
    return post;
  }

  public void setPost(PunditPost post) {
    this.post = post;
  }

  public Gameweek getGameweek() {
    return gameweek;
  }

  public void setGameweek(Gameweek gameweek) {
    this.gameweek = gameweek;
  }

  @Override public String toString() {
    return "PunditPostDataEntity{" + "post=" + post + ", gameweek=" + gameweek + '}';
  }
}
