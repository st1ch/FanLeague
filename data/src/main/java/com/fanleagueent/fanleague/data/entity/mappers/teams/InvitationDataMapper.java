package com.fanleagueent.fanleague.data.entity.mappers.teams;

import com.fanleagueent.fanleague.data.entity.entities.teams.InvitationDataEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.teams.InvitationData;

/**
 * Created by Artem Getman on 15.03.17.
 * a.e.getman@gmail.com
 */

public class InvitationDataMapper implements Mapper<InvitationDataEntity, InvitationData> {

  private TeamsMapperFactory teamsMapperFactory;

  public InvitationDataMapper(TeamsMapperFactory teamsMapperFactory) {
    this.teamsMapperFactory = teamsMapperFactory;
  }

  @Override public InvitationData transform(InvitationDataEntity obj) {
    InvitationData invitationData = new InvitationData();

    invitationData.setCount(obj.getCount());
    invitationData.setInvitationList(
        teamsMapperFactory.getInvitationListMapper().transform(obj.getInvitationEntityList()));

    return invitationData;
  }
}
