package com.fanleagueent.fanleague.data.entity.entities.teams;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * Created by st1ch on 01.12.16.
 */

public class InvitationDataEntity {
  @SerializedName("invitations") private List<InvitationEntity> invitationEntityList;

  @SerializedName("count") private int count;

  public List<InvitationEntity> getInvitationEntityList() {
    return invitationEntityList;
  }

  public int getCount() {
    return count;
  }
}
