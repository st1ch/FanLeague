package com.fanleagueent.fanleague.data.entity.mappers.teams;

import com.fanleagueent.fanleague.data.entity.entities.teams.InvitationEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.teams.Invitation;

/**
 * Created by Artem Getman on 15.03.17.
 * a.e.getman@gmail.com
 */

public class InvitationMapper implements Mapper<InvitationEntity, Invitation> {

  @Override public Invitation transform(InvitationEntity obj) {
    Invitation invitation = new Invitation();

    invitation.setId(obj.getId());
    invitation.setUserId(obj.getUserId());
    invitation.setInvitedUserId(obj.getInvitedUserId());
    invitation.setTeamId(obj.getTeamId());
    invitation.setType(obj.getType());
    invitation.setEmail(obj.getEmail());
    invitation.setAcceptToken(obj.getAcceptToken());
    invitation.setDenyToken(obj.getDenyToken());
    invitation.setUpdatedAt(obj.getUpdatedAt());
    invitation.setCreatedAt(obj.getCreatedAt());

    return invitation;
  }
}
