package com.fanleagueent.fanleague.data.entity.entities.locker_room;

import com.google.gson.annotations.SerializedName;

/**
 * Created by st1ch on 23.01.17.
 */

public class PrivacyEntity {

  @SerializedName("member_since") private boolean memberSince;
  @SerializedName("favourite_club") private boolean favouriteClub;
  @SerializedName("favourite_youth_club") private boolean favouriteYouthClub;
  @SerializedName("profession") private boolean profession;
  @SerializedName("average_winning_bets") private boolean averageWinningBets;
  @SerializedName("best_score") private boolean bestScore;
  @SerializedName("age") private boolean age;
  @SerializedName("sex") private boolean sex;
  @SerializedName("nationality") private boolean nationality;
  @SerializedName("recruit_tree_size") private boolean recruitTreeSize;

  public boolean isMemberSinceVisible() {
    return memberSince;
  }

  public boolean isFavouriteClubVisible() {
    return favouriteClub;
  }

  public boolean isFavouriteYouthClubVisible() {
    return favouriteYouthClub;
  }

  public boolean isProfessionVisible() {
    return profession;
  }

  public boolean isAverageWinningBetsVisible() {
    return averageWinningBets;
  }

  public boolean isBestScoreVisible() {
    return bestScore;
  }

  public boolean isAgeVisible() {
    return age;
  }

  public boolean isSexVisible() {
    return sex;
  }

  public boolean isNationalityVisible() {
    return nationality;
  }

  public boolean isRecruitTreeSizeVisible() {
    return recruitTreeSize;
  }
}
