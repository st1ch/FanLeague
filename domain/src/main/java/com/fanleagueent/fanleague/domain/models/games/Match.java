package com.fanleagueent.fanleague.domain.models.games;

import java.util.Date;
import java.util.List;

/**
 * Created by st1ch on 22.12.16.
 */

public class Match {

  private String id;
  private Date datetime;
  private String updatedAt;
  private String venue;
  private int week;
  private Result result;
  private List<BetRate> betRates;
  private GameTeam homeTeam;
  private GameTeam awayTeam;
  private Tournament tournament;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Date getDatetime() {
    return datetime;
  }

  public void setDatetime(Date datetime) {
    this.datetime = datetime;
  }

  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public String getVenue() {
    return venue;
  }

  public void setVenue(String venue) {
    this.venue = venue;
  }

  public int getWeek() {
    return week;
  }

  public void setWeek(int week) {
    this.week = week;
  }

  public Result getResult() {
    return result;
  }

  public void setResult(Result result) {
    this.result = result;
  }

  public List<BetRate> getBetRateEntities() {
    return betRates;
  }

  public void setBetRates(List<BetRate> betRateEntities) {
    this.betRates = betRateEntities;
  }

  public GameTeam getHomeTeam() {
    return homeTeam;
  }

  public void setHomeTeam(GameTeam homeTeam) {
    this.homeTeam = homeTeam;
  }

  public GameTeam getAwayTeam() {
    return awayTeam;
  }

  public void setAwayTeam(GameTeam awayTeam) {
    this.awayTeam = awayTeam;
  }

  public Tournament getTournament() {
    return tournament;
  }

  public void setTournament(Tournament tournament) {
    this.tournament = tournament;
  }

  @Override public String toString() {
    return "MatchEntity{"
        + "id='"
        + id
        + '\''
        + ", datetime="
        + datetime
        + ", updatedAt='"
        + updatedAt
        + '\''
        + ", venue='"
        + venue
        + '\''
        + ", week="
        + week
        + ", resultEntity="
        + result
        + ", betRateEntities="
        + betRates
        + ", homeTeam="
        + homeTeam
        + ", awayTeam="
        + awayTeam
        + ", tournamentEntity="
        + tournament
        + '}';
  }
}
