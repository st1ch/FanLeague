package com.fanleagueent.fanleague.domain.models.locker_room;

import java.util.Date;

/**
 * Created by st1ch on 23.01.17.
 */

public class Wall {

  private Date memberSince;
  private String favouriteClub;
  private String favouriteYouthClub;
  private String profession;
  private float averageWinningBets;
  private int bestScore;
  private String age;
  private String sex;
  private String nationality;
  private String nationalityIdent;
  private int recruitTreeSize;

  public Date getMemberSince() {
    return memberSince;
  }

  public void setMemberSince(Date memberSince) {
    this.memberSince = memberSince;
  }

  public void setNationalityIdent(String nationalityIdent) {
    this.nationalityIdent = nationalityIdent;
  }

  public String getFavouriteClub() {
    return favouriteClub;
  }

  public void setFavouriteClub(String favouriteClub) {
    this.favouriteClub = favouriteClub;
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

  public float getAverageWinningBets() {
    return averageWinningBets;
  }

  public void setAverageWinningBets(float averageWinningBets) {
    this.averageWinningBets = averageWinningBets;
  }

  public int getBestScore() {
    return bestScore;
  }

  public void setBestScore(int bestScore) {
    this.bestScore = bestScore;
  }

  public String getAge() {
    return age;
  }

  public void setAge(String age) {
    this.age = age;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public String getNationality() {
    return nationality;
  }

  public void setNationality(String nationality) {
    this.nationality = nationality;
  }

  public int getRecruitTreeSize() {
    return recruitTreeSize;
  }

  public void setRecruitTreeSize(int recruitTreeSize) {
    this.recruitTreeSize = recruitTreeSize;
  }

  public String getNationalityIdent() {
    return nationalityIdent;
  }

  @Override public String toString() {
    return "WallEntity{"
        + "memberSince='"
        + memberSince
        + '\''
        + ", favouriteClub='"
        + favouriteClub
        + '\''
        + ", favouriteYouthClub='"
        + favouriteYouthClub
        + '\''
        + ", profession='"
        + profession
        + '\''
        + ", averageWinningBets="
        + averageWinningBets
        + ", bestScore="
        + bestScore
        + ", age='"
        + age
        + '\''
        + ", sex='"
        + sex
        + '\''
        + ", nationality='"
        + nationality
        + '\''
        + ", nationalityIdent='"
        + nationalityIdent
        + '\''
        + ", recruitTreeSize="
        + recruitTreeSize
        + '}';
  }
}
