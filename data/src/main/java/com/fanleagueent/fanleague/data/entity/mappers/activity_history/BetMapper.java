package com.fanleagueent.fanleague.data.entity.mappers.activity_history;

import com.fanleagueent.fanleague.data.entity.entities.activity_history.ActivityHistoryBetEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.activity_history.ActivityHistoryBet;

/**
 * Created by Artem Getman on 13.03.17.
 * a.e.getman@gmail.com
 */

public class BetMapper implements Mapper<ActivityHistoryBetEntity, ActivityHistoryBet> {

  @Override public ActivityHistoryBet transform(ActivityHistoryBetEntity obj)
      throws RuntimeException {
    ActivityHistoryBet activityHistoryBet = new ActivityHistoryBet();
    //todo empty
    return activityHistoryBet;
  }
}
