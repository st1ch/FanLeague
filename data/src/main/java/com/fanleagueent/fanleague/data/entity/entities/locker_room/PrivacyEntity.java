package com.fanleagueent.fanleague.data.entity.entities.locker_room;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.experimental.Builder;

/**
 * Created by st1ch on 23.01.17.
 */

@Builder public class PrivacyEntity {
  @SerializedName("member_since") @Getter private boolean memberSince;
  @SerializedName("favourite_club") @Getter private boolean favouriteClub;
  @SerializedName("favourite_youth_club") @Getter private boolean favouriteYouthClub;
  @SerializedName("profession") @Getter private boolean profession;
  @SerializedName("average_winning_bets") @Getter private boolean averageWinningBets;
  @SerializedName("best_score") @Getter private boolean bestScore;
  @SerializedName("age") @Getter private boolean age;
  @SerializedName("sex") @Getter private boolean sex;
  @SerializedName("nationality") @Getter private boolean nationality;
  @SerializedName("recruit_tree_size") @Getter private boolean recruitTreeSize;
}
