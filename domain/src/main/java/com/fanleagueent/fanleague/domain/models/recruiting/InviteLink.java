package com.fanleagueent.fanleague.domain.models.recruiting;

/**
 * Created by Artem Getman on 21.02.17.
 * a.e.getman@gmail.com
 */

public class InviteLink {
  private String inviteCode;

  public String getInviteCode() {
    return inviteCode;
  }

  @Override public String toString() {
    return "InviteLinkEntity{" + "inviteCode='" + inviteCode + '\'' + '}';
  }
}
