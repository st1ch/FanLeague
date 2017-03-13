package com.fanleagueent.fanleague.data.entity.entities.locker_room;

import com.google.gson.annotations.SerializedName;
import java.util.Date;

/**
 * Created by st1ch on 23.01.17.
 */

public class WallEntity {

  @SerializedName("member_since") private Date memberSince;
  @SerializedName("favourite_club") private String favouriteClub;
  @SerializedName("favourite_youth_club") private String favouriteYouthClub;
  @SerializedName("profession") private String profession;
  @SerializedName("average_winning_bets") private float averageWinningBets;
  @SerializedName("best_score") private int bestScore;
  @SerializedName("age") private String age;
  @SerializedName("sex") private String sex;
  @SerializedName("nationality") private String nationality;
  @SerializedName("nationality_ident") private String nationalityIdent;
  @SerializedName("recruit_tree_size") private int recruitTreeSize;

  public Date getMemberSince() {
    return memberSince;
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
    return "WallEntity{" +
        "memberSince='" + memberSince + '\'' +
        ", favouriteClub='" + favouriteClub + '\'' +
        ", favouriteYouthClub='" + favouriteYouthClub + '\'' +
        ", profession='" + profession + '\'' +
        ", averageWinningBets=" + averageWinningBets +
        ", bestScore=" + bestScore +
        ", age='" + age + '\'' +
        ", sex='" + sex + '\'' +
        ", nationality='" + nationality + '\'' +
        ", nationalityIdent='" + nationalityIdent + '\'' +
        ", recruitTreeSize=" + recruitTreeSize +
        '}';
  }
}
