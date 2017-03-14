package com.fanleagueent.fanleague.data.entity.entities.games;

import com.google.gson.annotations.SerializedName;

/**
 * Created by st1ch on 22.12.16.
 */

public class PrizePotEntity {

  @SerializedName("turnover") private String turnover;

  @SerializedName("pot") private String pot;

  @SerializedName("prizes") private PrizesEntity prizesEntity;

  @SerializedName("winners") private WinnersEntity winnersEntity;

  public String getTurnover() {
    return turnover;
  }

  public String getPot() {
    return pot;
  }

  public PrizesEntity getPrizesEntity() {
    return prizesEntity;
  }

  public WinnersEntity getWinnersEntity() {
    return winnersEntity;
  }

  @Override public String toString() {
    return "PrizePotEntity{"
        + "turnover='"
        + turnover
        + '\''
        + ", pot='"
        + pot
        + '\''
        + ", prizesEntity="
        + prizesEntity
        + ", winnersEntity="
        + winnersEntity
        + '}';
  }
}
