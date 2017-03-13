package com.fanleagueent.fanleague.domain.models.games;

/**
 * Created by st1ch on 28.12.16.
 */

public class GameBetAmount {

  private float betAmount;

  private boolean activePlay;

  public GameBetAmount(float betAmount, boolean activePlay) {
    this.betAmount = betAmount;
    this.activePlay = activePlay;
  }

  public float getBetAmount() {
    return betAmount;
  }

  public boolean isActivePlay() {
    return activePlay;
  }

  @Override public String toString() {
    return "GameBetAmount{" +
        "betAmount=" + betAmount +
        ", activePlay=" + activePlay +
        '}';
  }
}
