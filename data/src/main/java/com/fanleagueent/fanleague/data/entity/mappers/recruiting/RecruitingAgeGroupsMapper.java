package com.fanleagueent.fanleague.data.entity.mappers.recruiting;

import com.fanleagueent.fanleague.data.entity.entities.recruiting.RecruitAgeGroupsEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.recruiting.RecruitAgeGroups;

/**
 * Created by alexeyverbitskiy on 3/14/17.
 */

public class RecruitingAgeGroupsMapper implements Mapper<RecruitAgeGroupsEntity, RecruitAgeGroups> {

  private RecruitingMapperFactory recruitingMapperFactory;

  public RecruitingAgeGroupsMapper(RecruitingMapperFactory recruitingMapperFactory) {
    this.recruitingMapperFactory = recruitingMapperFactory;
  }

  @Override public RecruitAgeGroups transform(RecruitAgeGroupsEntity obj) {
    RecruitAgeGroups recruitAgeGroups = new RecruitAgeGroups();
    recruitAgeGroups.setGroup18to25(recruitingMapperFactory.getRecruitGroupMapper().transform(obj.getGroup18to25()));
    recruitAgeGroups.setGroup26to35(recruitingMapperFactory.getRecruitGroupMapper().transform(obj.getGroup26to35()));
    recruitAgeGroups.setGroup36to45(recruitingMapperFactory.getRecruitGroupMapper().transform(obj.getGroup36to45()));
    recruitAgeGroups.setGroup46to55(recruitingMapperFactory.getRecruitGroupMapper().transform(obj.getGroup46to55()));
    recruitAgeGroups.setGroup56plus(recruitingMapperFactory.getRecruitGroupMapper().transform(obj.getGroup56plus()));

    return recruitAgeGroups;
  }
}
