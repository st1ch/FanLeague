package com.fanleagueent.fanleague.data.entity.mappers.activity_history;

import com.fanleagueent.fanleague.data.entity.entities.activity_history.ActivityHistoryBetEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.activity_history.ActivityHistoryBet;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Artem Getman on 21.03.17.
 * a.e.getman@gmail.com
 */

public class BetListMapper
    implements Mapper<List<ActivityHistoryBetEntity>, List<ActivityHistoryBet>> {

  private ActivityHistoryMapperFactory activityHistoryMapperFactory;

  public BetListMapper(ActivityHistoryMapperFactory activityHistoryMapperFactory) {
    this.activityHistoryMapperFactory = activityHistoryMapperFactory;
  }

  @Override public List<ActivityHistoryBet> transform(List<ActivityHistoryBetEntity> obj) {
    List<ActivityHistoryBet> activityHistoryBets = new ArrayList<>();

    for (ActivityHistoryBetEntity entity : obj) {
      activityHistoryBets.add(
          activityHistoryMapperFactory.getActivityHistoryBetMapper().transform(entity));
    }

    return activityHistoryBets;
  }
}
