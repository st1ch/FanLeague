package com.fanleagueent.fanleague.data.entity.mappers.recruiting;

import com.fanleagueent.fanleague.data.entity.entities.recruiting.RecruitTreeDataEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.recruiting.RecruitTreeData;

/**
 * Created by alexeyverbitskiy on 3/14/17.
 */

public class RecruitTreeDataMapper implements Mapper<RecruitTreeDataEntity, RecruitTreeData> {

  private RecruitingMapperFactory recruitingMapperFactory;

  public RecruitTreeDataMapper(RecruitingMapperFactory recruitingMapperFactory) {
    this.recruitingMapperFactory = recruitingMapperFactory;
  }

  @Override public RecruitTreeData transform(RecruitTreeDataEntity obj) {
    RecruitTreeData recruitTreeData = new RecruitTreeData();
    recruitTreeData.setTotalPlayersInTree(obj.getTotalPlayersInTree());
    recruitTreeData.setTree(recruitingMapperFactory.getRecruitTreeMapper().transform(obj.getTree()));

    return recruitTreeData;
  }
}
