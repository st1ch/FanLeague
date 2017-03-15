package com.fanleagueent.fanleague.data.entity.mappers.recruiting;

import com.fanleagueent.fanleague.data.entity.entities.recruiting.InviteLinkEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.recruiting.InviteLink;

/**
 * Created by alexeyverbitskiy on 3/14/17.
 */

public class InviteLinkMapper implements Mapper<InviteLinkEntity, InviteLink> {

  public InviteLinkMapper() {
  }

  @Override public InviteLink transform(InviteLinkEntity obj) {
    InviteLink inviteLink = new InviteLink();
    inviteLink.setInviteCode(obj.getInviteCode());

    return inviteLink;
  }
}
