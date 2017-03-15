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

  public String getFavouriteYouthClub() {
    return favouriteYouthClub;
  }

  public String getProfession() {
    return profession;
  }

  public float getAverageWinningBets() {
    return averageWinningBets;
  }

  public int getBestScore() {
    return bestScore;
  }

  public String getAge() {
    return age;
  }

  public String getSex() {
    return sex;
  }

  public String getNationality() {
    return nationality;
  }

  public int getRecruitTreeSize() {
    return recruitTreeSize;
  }

  public String getNationalityIdent() {
    return nationalityIdent;
  }
}
