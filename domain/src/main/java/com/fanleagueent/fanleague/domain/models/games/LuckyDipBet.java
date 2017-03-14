package com.fanleagueent.fanleague.domain.models.games;

import java.util.Map;

/**
 * Created by st1ch on 11.01.17.
 */

public class LuckyDipBet {
  private float price;

  private String system;

  private Map<String, int[]> bets;

  public float getPrice() {
    return price;
  }

  public void setPrice(float price) {
    this.price = price;
  }

  public String getSystem() {
    return system;
  }

  public void setSystem(String system) {
    this.system = system;
  }

  public Map<String, int[]> getBets() {
    return bets;
  }

  public void setBets(Map<String, int[]> bets) {
    this.bets = bets;
  }

  @Override public String toString() {
    return "LuckyDipBetEntity{"
        + "price="
        + price
        + ", system='"
        + system
        + '\''
        + ", bets="
        + bets
        + '}';
  }
}
