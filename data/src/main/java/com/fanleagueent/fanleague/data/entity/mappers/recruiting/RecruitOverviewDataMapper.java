package com.fanleagueent.fanleague.data.entity.mappers.recruiting;

import com.fanleagueent.fanleague.data.entity.entities.recruiting.RecruitOverviewDataEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.recruiting.RecruitOverviewData;

/**
 * Created by alexeyverbitskiy on 3/14/17.
 */

public class RecruitOverviewDataMapper implements Mapper<RecruitOverviewDataEntity, RecruitOverviewData> {
  private RecruitingMapperFactory recruitingMapperFactory;

  public RecruitOverviewDataMapper(RecruitingMapperFactory recruitingMapperFactory) {
    this.recruitingMapperFactory = recruitingMapperFactory;
  }

  @Override public RecruitOverviewData transform(RecruitOverviewDataEntity obj) {
    RecruitOverviewData recruitOverviewData = new RecruitOverviewData();
    recruitOverviewData.setAgeGroups(recruitingMapperFactory.getRecruitGroupMapMapper().transform(obj.getAgeGroups()));
    recruitOverviewData.setNationalityGroups(recruitingMapperFactory.getRecruitGroupMapMapper().transform(obj.getNationalityGroups()));
    recruitOverviewData.setFavouriteClubGroups(recruitingMapperFactory.getRecruitGroupMapMapper().transform(obj.getFavouriteClubGroups()));
    recruitOverviewData.setFansInTree(recruitingMapperFactory.getFansInTreeMapper().transform(obj.getFansInTreeEntity()));
    recruitOverviewData.setTotalPlayersInTree(obj.getTotalPlayersInTree());
    recruitOverviewData.setTotalPlayersInTreeDifference(obj.getTotalPlayersInTreeDifference());
    recruitOverviewData.setTotalEarnedCredits(obj.getTotalEarnedCredits());

    return recruitOverviewData;
  }
}
