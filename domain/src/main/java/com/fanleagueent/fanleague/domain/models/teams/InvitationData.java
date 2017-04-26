package com.fanleagueent.fanleague.domain.models.teams;

import java.util.List;

/**
 * Created by st1ch on 01.12.16.
 */

public class InvitationData {
  private List<Invitation> invitationList;
  private int count;

  public List<Invitation> getInvitationList() {
    return invitationList;
  }

  public int getCount() {
    return count;
  }

  public void setInvitationList(List<Invitation> invitationList) {
    this.invitationList = invitationList;
  }

  public void setCount(int count) {
    this.count = count;
  }

  @Override public String toString() {
    return "InvitationData{" + "invitationList=" + invitationList + ", count=" + count + '}';
  }
}
