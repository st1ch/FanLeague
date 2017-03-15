package com.fanleagueent.fanleague.data.entity.mappers.recruiting;

import com.fanleagueent.fanleague.data.entity.entities.recruiting.FansInTreeEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.recruiting.FansInTree;

/**
 * Created by alexeyverbitskiy on 3/14/17.
 */

public class FansInTreeMapper implements Mapper<FansInTreeEntity, FansInTree> {

  private RecruitingMapperFactory recruitingMapperFactory;

  public FansInTreeMapper(RecruitingMapperFactory recruitingMapperFactory) {
    this.recruitingMapperFactory = recruitingMapperFactory;
  }

  @Override public FansInTree transform(FansInTreeEntity obj) {
    FansInTree fansInTree = new FansInTree();
    fansInTree.setCount(obj.getCount());
    fansInTree.setClub(recruitingMapperFactory.getClubMapper().transform(obj.getClub()));

    return fansInTree;
  }
}
