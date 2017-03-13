package com.fanleagueent.fanleague.domain.models.leagues;

import com.fanleagueent.fanleague.domain.models.user.Avatar;
import com.fanleagueent.fanleague.domain.models.user.FavoriteClub;

/**
 * Created by st1ch on 14.12.16.
 */

public class LeagueLeaderboardItem {
  private int position;
  private boolean star;
  private Avatar avatar;
  private String name;
  private int gw32;
  private float seasonAvg;
  private int calendar;
  private float rating;
  private String nationality;
  private FavoriteClub favoriteClub;
  private int bestScore;
  private String system;

  public int getPosition() {
    return position;
  }

  public void setPosition(int position) {
    this.position = position;
  }

  public boolean isStar() {
    return star;
  }

  public void setStar(boolean star) {
    this.star = star;
  }

  public Avatar getAvatar() {
    return avatar;
  }

  public void setAvatar(Avatar avatar) {
    this.avatar = avatar;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getGw32() {
    return gw32;
  }

  public void setGw32(int gw32) {
    this.gw32 = gw32;
  }

  public float getSeasonAvg() {
    return seasonAvg;
  }

  public void setSeasonAvg(float seasonAvg) {
    this.seasonAvg = seasonAvg;
  }

  public int getCalendar() {
    return calendar;
  }

  public void setCalendar(int calendar) {
    this.calendar = calendar;
  }

  public float getRating() {
    return rating;
  }

  public void setRating(float rating) {
    this.rating = rating;
  }

  public String getNationality() {
    return nationality;
  }

  public void setNationality(String nationality) {
    this.nationality = nationality;
  }

  public FavoriteClub getFavoriteClub() {
    return favoriteClub;
  }

  public void setFavoriteClub(FavoriteClub favoriteClub) {
    this.favoriteClub = favoriteClub;
  }

  public int getBestScore() {
    return bestScore;
  }

  public void setBestScore(int bestScore) {
    this.bestScore = bestScore;
  }

  public String getSystem() {
    return system;
  }

  public void setSystem(String system) {
    this.system = system;
  }
}
