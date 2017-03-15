package com.fanleagueent.fanleague.data.entity.mappers.recruiting;

import com.fanleagueent.fanleague.data.entity.entities.recruiting.RecruitGroupEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.recruiting.RecruitGroup;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by alexeyverbitskiy on 3/14/17.
 */

public class RecruitGroupMapMapper implements Mapper<Map<String, RecruitGroupEntity>, Map<String, RecruitGroup>> {

  private RecruitingMapperFactory recruitingMapperFactory;

  public RecruitGroupMapMapper(RecruitingMapperFactory recruitingMapperFactory) {
    this.recruitingMapperFactory = recruitingMapperFactory;
  }

  @Override public Map<String, RecruitGroup> transform(Map<String, RecruitGroupEntity> obj) {
    Map<String, RecruitGroup> recruitGroupMap = new LinkedHashMap<>();

    for (Map.Entry<String, RecruitGroupEntity> entityEntry : obj.entrySet()) {
      recruitGroupMap.put(entityEntry.getKey(), recruitingMapperFactory.getRecruitGroupMapper().transform(entityEntry.getValue()));
    }

    return recruitGroupMap;
  }
}
