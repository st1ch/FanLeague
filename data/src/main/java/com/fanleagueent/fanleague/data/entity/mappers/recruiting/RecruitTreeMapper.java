package com.fanleagueent.fanleague.data.entity.mappers.recruiting;

import com.fanleagueent.fanleague.data.entity.entities.recruiting.RecruitTreeEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.recruiting.RecruitTree;

/**
 * Created by alexeyverbitskiy on 3/14/17.
 */

public class RecruitTreeMapper implements Mapper<RecruitTreeEntity, RecruitTree> {

  private RecruitingMapperFactory recruitingMapperFactory;

  public RecruitTreeMapper(RecruitingMapperFactory recruitingMapperFactory) {
    this.recruitingMapperFactory = recruitingMapperFactory;
  }

  @Override public RecruitTree transform(RecruitTreeEntity obj) {
    RecruitTree recruitTree = new RecruitTree();
    recruitTree.setLevel1Items(recruitingMapperFactory.getRecruitUserListMapper().transform(obj.getLevel1Items()));
    recruitTree.setLevel2Items(recruitingMapperFactory.getRecruitUserListMapper().transform(obj.getLevel2Items()));
    recruitTree.setLevel3Items(recruitingMapperFactory.getRecruitUserListMapper().transform(obj.getLevel3Items()));
    recruitTree.setLevel4Items(recruitingMapperFactory.getRecruitUserListMapper().transform(obj.getLevel4Items()));
    recruitTree.setLevel5Items(recruitingMapperFactory.getRecruitUserListMapper().transform(obj.getLevel5Items()));

    return recruitTree;
  }
}
