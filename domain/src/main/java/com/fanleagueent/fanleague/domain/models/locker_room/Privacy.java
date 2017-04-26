package com.fanleagueent.fanleague.domain.models.locker_room;

import lombok.experimental.Builder;

/**
 * Created by st1ch on 23.01.17.
 */

@Builder public class Privacy {
  private boolean memberSince;
  private boolean favouriteClub;
  private boolean favouriteYouthClub;
  private boolean profession;
  private boolean averageWinningBets;
  private boolean bestScore;
  private boolean age;
  private boolean sex;
  private boolean nationality;
  private boolean recruitTreeSize;
}
