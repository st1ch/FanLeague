package com.fanleagueent.fanleague.data.entity.mappers.recruiting;

import com.fanleagueent.fanleague.data.entity.entities.recruiting.RecruitGroupEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.recruiting.RecruitGroup;

/**
 * Created by alexeyverbitskiy on 3/14/17.
 */

public class RecruitingGroupMapper implements Mapper<RecruitGroupEntity, RecruitGroup> {

  public RecruitingGroupMapper() {
  }

  @Override public RecruitGroup transform(RecruitGroupEntity obj) {
    RecruitGroup recruitGroup = new RecruitGroup();
    recruitGroup.setIdent(obj.getIdent());
    recruitGroup.setTitle(obj.getTitle());
    recruitGroup.setCount(obj.getCount());
    recruitGroup.setPercent(obj.getPercent());

    return recruitGroup;
  }
}
