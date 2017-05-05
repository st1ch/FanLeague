package com.fanleagueent.fanleague.data.entity.mappers.dashboard;

import com.fanleagueent.fanleague.data.entity.entities.dashboard.CommunityEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.dashboard.Community;

/**
 * Created by Artem Getman on 05.05.17.
 * a.e.getman@gmail.com
 */

public class CommunityMapper implements Mapper<CommunityEntity, Community> {

  @Override public Community transform(CommunityEntity obj) {
    return Community.builder()
        .total(obj.getTotal())
        .totalGrowth(obj.getTotalGrowth())
        .tree(obj.getTree())
        .treeGrowth(obj.getTreeGrowth())
        .build();
  }
}
