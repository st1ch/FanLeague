package com.fanleagueent.fanleague.data.entity.mappers.recruiting;

import com.fanleagueent.fanleague.data.entity.entities.recruiting.RecruitUserEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.recruiting.RecruitUser;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by alexeyverbitskiy on 3/14/17.
 */

public class RecruitUserListMapper implements Mapper<List<RecruitUserEntity>, List<RecruitUser>> {

  private RecruitingMapperFactory recruitingMapperFactory;

  public RecruitUserListMapper(RecruitingMapperFactory recruitingMapperFactory) {
    this.recruitingMapperFactory = recruitingMapperFactory;
  }

  @Override public List<RecruitUser> transform(List<RecruitUserEntity> obj) {
    List<RecruitUser> recruitUserList = new ArrayList<>();

    for (RecruitUserEntity recruitUserEntity : obj) {
      recruitUserList.add(recruitingMapperFactory.getRecruitUserMapper().transform(recruitUserEntity));
    }

    return recruitUserList;
  }
}
