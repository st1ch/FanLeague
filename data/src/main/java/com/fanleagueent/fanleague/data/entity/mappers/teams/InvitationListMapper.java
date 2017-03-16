package com.fanleagueent.fanleague.data.entity.mappers.teams;

import com.fanleagueent.fanleague.data.entity.entities.teams.InvitationEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.teams.Invitation;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Artem Getman on 15.03.17.
 * a.e.getman@gmail.com
 */

public class InvitationListMapper implements Mapper<List<InvitationEntity>, List<Invitation>> {

  private TeamsMapperFactory teamsMapperFactory;

  public InvitationListMapper(TeamsMapperFactory teamsMapperFactory) {
    this.teamsMapperFactory = teamsMapperFactory;
  }

  @Override public List<Invitation> transform(List<InvitationEntity> obj) {
    List<Invitation> invitations = new ArrayList<>();

    for (InvitationEntity entity : obj) {
      invitations.add(teamsMapperFactory.getInvitationMapper().transform(entity));
    }

    return invitations;
  }
}
