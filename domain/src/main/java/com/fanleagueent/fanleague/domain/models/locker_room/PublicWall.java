package com.fanleagueent.fanleague.domain.models.locker_room;

import java.util.Date;

/**
 * Created by st1ch on 24.01.17.
 */

public class PublicWall {

  private Date memberSince;
  private String favouriteClub;
  private int favouriteClubCurrentPosition;
  private int favouriteClubDifferencePosition;
  private String favouriteYouthClub;
  private String profession;
  private int professionCurrentPosition;
  private int professionDifferencePosition;
  private String averageWinningBets;
  private String bestScore;
  private String age;
  private int ageCurrentPosition;
  private int ageDifferencePosition;
  private String sex;
  private int sexCurrentPosition;
  private int sexDifferencePosition;
  private String nationality;
  private String nationalityIdent;
  private int nationalityCurrentPosition;
  private int nationalityDifferencePosition;
  private String recruitTreeSize;

  public Date getMemberSince() {
    return memberSince;
  }

  public String getFavouriteClub() {
    return favouriteClub;
  }

  public void setFavouriteClub(String favouriteClub) {
    this.favouriteClub = favouriteClub;
  }

  public int getFavouriteClubCurrentPosition() {
    return favouriteClubCurrentPosition;
  }

  public void setFavouriteClubCurrentPosition(int favouriteClubCurrentPosition) {
    this.favouriteClubCurrentPosition = favouriteClubCurrentPosition;
  }

  public int getFavouriteClubDifferencePosition() {
    return favouriteClubDifferencePosition;
  }

  public void setFavouriteClubDifferencePosition(int favouriteClubDifferencePosition) {
    this.favouriteClubDifferencePosition = favouriteClubDifferencePosition;
  }

  public String getFavouriteYouthClub() {
    return favouriteYouthClub;
  }

  public void setFavouriteYouthClub(String favouriteYouthClub) {
    this.favouriteYouthClub = favouriteYouthClub;
  }

  public String getProfession() {
    return profession;
  }

  public void setProfession(String profession) {
    this.profession = profession;
  }

  public int getProfessionCurrentPosition() {
    return professionCurrentPosition;
  }

  public void setProfessionCurrentPosition(int professionCurrentPosition) {
    this.professionCurrentPosition = professionCurrentPosition;
  }

  public int getProfessionDifferencePosition() {
    return professionDifferencePosition;
  }

  public void setProfessionDifferencePosition(int professionDifferencePosition) {
    this.professionDifferencePosition = professionDifferencePosition;
  }

  public String getAverageWinningBets() {
    return averageWinningBets;
  }

  public void setAverageWinningBets(String averageWinningBets) {
    this.averageWinningBets = averageWinningBets;
  }

  public String getBestScore() {
    return bestScore;
  }

  public void setBestScore(String bestScore) {
    this.bestScore = bestScore;
  }

  public String getAge() {
    return age;
  }

  public void setAge(String age) {
    this.age = age;
  }

  public int getAgeCurrentPosition() {
    return ageCurrentPosition;
  }

  public void setAgeCurrentPosition(int ageCurrentPosition) {
    this.ageCurrentPosition = ageCurrentPosition;
  }

  public int getAgeDifferencePosition() {
    return ageDifferencePosition;
  }

  public void setAgeDifferencePosition(int ageDifferencePosition) {
    this.ageDifferencePosition = ageDifferencePosition;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public int getSexCurrentPosition() {
    return sexCurrentPosition;
  }

  public void setSexCurrentPosition(int sexCurrentPosition) {
    this.sexCurrentPosition = sexCurrentPosition;
  }

  public int getSexDifferencePosition() {
    return sexDifferencePosition;
  }

  public void setSexDifferencePosition(int sexDifferencePosition) {
    this.sexDifferencePosition = sexDifferencePosition;
  }

  public String getNationality() {
    return nationality;
  }

  public void setNationality(String nationality) {
    this.nationality = nationality;
  }

  public int getNationalityCurrentPosition() {
    return nationalityCurrentPosition;
  }

  public void setNationalityCurrentPosition(int nationalityCurrentPosition) {
    this.nationalityCurrentPosition = nationalityCurrentPosition;
  }

  public int getNationalityDifferencePosition() {
    return nationalityDifferencePosition;
  }

  public void setNationalityDifferencePosition(int nationalityDifferencePosition) {
    this.nationalityDifferencePosition = nationalityDifferencePosition;
  }

  public String getRecruitTreeSize() {
    return recruitTreeSize;
  }

  public void setRecruitTreeSize(String recruitTreeSize) {
    this.recruitTreeSize = recruitTreeSize;
  }

  public String getNationalityIdent() {
    return nationalityIdent;
  }

  public void setNationalityIdent(String nationalityIdent) {
    this.nationalityIdent = nationalityIdent;
  }

  @Override public String toString() {
    return "PublicWallEntity{" +
        "memberSince='" + memberSince + '\'' +
        ", favouriteClub='" + favouriteClub + '\'' +
        ", favouriteClubCurrentPosition=" + favouriteClubCurrentPosition +
        ", favouriteClubDifferencePosition=" + favouriteClubDifferencePosition +
        ", favouriteYouthClub='" + favouriteYouthClub + '\'' +
        ", profession='" + profession + '\'' +
        ", professionCurrentPosition=" + professionCurrentPosition +
        ", professionDifferencePosition=" + professionDifferencePosition +
        ", averageWinningBets='" + averageWinningBets + '\'' +
        ", bestScore='" + bestScore + '\'' +
        ", age='" + age + '\'' +
        ", ageCurrentPosition=" + ageCurrentPosition +
        ", ageDifferencePosition=" + ageDifferencePosition +
        ", sex='" + sex + '\'' +
        ", sexCurrentPosition=" + sexCurrentPosition +
        ", sexDifferencePosition=" + sexDifferencePosition +
        ", nationality='" + nationality + '\'' +
        ", nationalityIdent='" + nationalityIdent + '\'' +
        ", nationalityCurrentPosition=" + nationalityCurrentPosition +
        ", nationalityDifferencePosition=" + nationalityDifferencePosition +
        ", recruitTreeSize='" + recruitTreeSize + '\'' +
        '}';
  }
}
