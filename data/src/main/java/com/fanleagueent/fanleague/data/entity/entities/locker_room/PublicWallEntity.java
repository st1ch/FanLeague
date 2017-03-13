package com.fanleagueent.fanleague.data.entity.entities.locker_room;

import com.google.gson.annotations.SerializedName;
import java.util.Date;

/**
 * Created by st1ch on 24.01.17.
 */

public class PublicWallEntity {

  @SerializedName("member_since") private Date memberSince;
  @SerializedName("favourite_club") private String favouriteClub;
  @SerializedName("favourite_club_current_position") private int favouriteClubCurrentPosition;
  @SerializedName("favourite_club_difference_position") private int favouriteClubDifferencePosition;
  @SerializedName("favourite_youth_club") private String favouriteYouthClub;
  @SerializedName("profession") private String profession;
  @SerializedName("profession_current_position") private int professionCurrentPosition;
  @SerializedName("profession_difference_position") private int professionDifferencePosition;
  @SerializedName("average_winning_bets") private String averageWinningBets;
  @SerializedName("best_score") private String bestScore;
  @SerializedName("age") private String age;
  @SerializedName("age_current_position") private int ageCurrentPosition;
  @SerializedName("age_difference_position") private int ageDifferencePosition;
  @SerializedName("sex") private String sex;
  @SerializedName("sex_current_position") private int sexCurrentPosition;
  @SerializedName("sex_difference_position") private int sexDifferencePosition;
  @SerializedName("nationality") private String nationality;
  @SerializedName("nationality_ident") private String nationalityIdent;
  @SerializedName("nationality_current_position") private int nationalityCurrentPosition;
  @SerializedName("nationality_difference_position") private int nationalityDifferencePosition;
  @SerializedName("recruit_tree_size") private String recruitTreeSize;

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
