package com.fanleagueent.fanleague.domain.models.games;

import com.google.gson.annotations.SerializedName;

/**
 * Created by st1ch on 22.12.16.
 */

public class PrizePotEntity {

  @SerializedName("turnover") private String turnover;

  @SerializedName("pot") private String pot;

  @SerializedName("prizesEntity") private PrizesEntity prizesEntity;

  @SerializedName("winnersEntity") private WinnersEntity winnersEntity;

  public String getTurnover() {
    return turnover;
  }

  public void setTurnover(String turnover) {
    this.turnover = turnover;
  }

  public String getPot() {
    return pot;
  }

  public void setPot(String pot) {
    this.pot = pot;
  }

  public PrizesEntity getPrizesEntity() {
    return prizesEntity;
  }

  public void setPrizesEntity(PrizesEntity prizesEntity) {
    this.prizesEntity = prizesEntity;
  }

  public WinnersEntity getWinnersEntity() {
    return winnersEntity;
  }

  public void setWinnersEntity(WinnersEntity winnersEntity) {
    this.winnersEntity = winnersEntity;
  }

  @Override public String toString() {
    return "PrizePotEntity{" +
        "turnover='" + turnover + '\'' +
        ", pot='" + pot + '\'' +
        ", prizesEntity=" + prizesEntity +
        ", winnersEntity=" + winnersEntity +
        '}';
  }
}
