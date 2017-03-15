package com.fanleagueent.fanleague.data.entity.mappers.recruiting;

import com.fanleagueent.fanleague.data.entity.entities.recruiting.RecruitInvitesDataEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.recruiting.RecruitInvitesData;

/**
 * Created by alexeyverbitskiy on 3/14/17.
 */

public class RecruitInvitesDataMapper implements Mapper<RecruitInvitesDataEntity, RecruitInvitesData> {

  private RecruitingMapperFactory recruitingMapperFactory;

  public RecruitInvitesDataMapper(RecruitingMapperFactory recruitingMapperFactory) {
    this.recruitingMapperFactory = recruitingMapperFactory;
  }

  @Override public RecruitInvitesData transform(RecruitInvitesDataEntity obj) {
    RecruitInvitesData recruitInvitesData = new RecruitInvitesData();
    recruitInvitesData.setTotalCount(obj.getTotalCount());
    recruitInvitesData.setUsers(recruitingMapperFactory.getRecruitUserListMapper().transform(obj.getUsers()));

    return recruitInvitesData;
  }
}
