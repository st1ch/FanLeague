package com.fanleagueent.fanleague.domain.models.friends;

import com.fanleagueent.fanleague.domain.models.Member;
import io.reactivex.annotations.NonNull;

/**
 * Created by alexeyverbitskiy on 11/15/16.
 */

public class Friend extends Member implements Comparable<Friend> {

  private boolean isTeamInvited;
  private boolean isLeagueInvited;

  public boolean isLeagueInvited() {
    return isLeagueInvited;
  }

  public boolean isTeamInvited() {
    return isTeamInvited;
  }

  public void setTeamInvited(boolean teamInvited) {
    isTeamInvited = teamInvited;
  }

  public void setLeagueInvited(boolean leagueInvited) {
    isLeagueInvited = leagueInvited;
  }

  @Override public int compareTo(@NonNull Friend friend) {
    return id.compareTo(friend.getId());
  }
}
