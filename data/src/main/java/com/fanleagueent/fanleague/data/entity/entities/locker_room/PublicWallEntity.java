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

  public int getFavouriteClubCurrentPosition() {
    return favouriteClubCurrentPosition;
  }

  public int getFavouriteClubDifferencePosition() {
    return favouriteClubDifferencePosition;
  }

  public String getFavouriteYouthClub() {
    return favouriteYouthClub;
  }

  public String getProfession() {
    return profession;
  }

  public int getProfessionCurrentPosition() {
    return professionCurrentPosition;
  }

  public int getProfessionDifferencePosition() {
    return professionDifferencePosition;
  }

  public String getAverageWinningBets() {
    return averageWinningBets;
  }

  public String getBestScore() {
    return bestScore;
  }

  public String getAge() {
    return age;
  }

  public int getAgeCurrentPosition() {
    return ageCurrentPosition;
  }

  public int getAgeDifferencePosition() {
    return ageDifferencePosition;
  }

  public String getSex() {
    return sex;
  }

  public int getSexCurrentPosition() {
    return sexCurrentPosition;
  }

  public int getSexDifferencePosition() {
    return sexDifferencePosition;
  }

  public String getNationality() {
    return nationality;
  }

  public int getNationalityCurrentPosition() {
    return nationalityCurrentPosition;
  }

  public int getNationalityDifferencePosition() {
    return nationalityDifferencePosition;
  }

  public String getRecruitTreeSize() {
    return recruitTreeSize;
  }

  public String getNationalityIdent() {
    return nationalityIdent;
  }
}
