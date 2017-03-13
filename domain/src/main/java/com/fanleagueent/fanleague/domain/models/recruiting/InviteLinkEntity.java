package com.fanleagueent.fanleague.domain.models.recruiting;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Artem Getman on 21.02.17.
 * a.e.getman@gmail.com
 */

public class InviteLinkEntity {
  @SerializedName("code") private String inviteCode;

  public String getInviteCode() {
    return inviteCode;
  }

  @Override public String toString() {
    return "InviteLinkEntity{" + "inviteCode='" + inviteCode + '\'' + '}';
  }
}
