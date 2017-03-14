package com.fanleagueent.fanleague.domain.models.games;

import java.util.List;

/**
 * Created by st1ch on 10.01.17.
 */

public class PunditsData {

  private List<Pundit> punditList;

  public List<Pundit> getPunditList() {
    return punditList;
  }

  public void setPunditList(List<Pundit> punditList) {
    this.punditList = punditList;
  }

  @Override public String toString() {
    return "PunditsData{" + "punditList=" + punditList + '}';
  }
}
