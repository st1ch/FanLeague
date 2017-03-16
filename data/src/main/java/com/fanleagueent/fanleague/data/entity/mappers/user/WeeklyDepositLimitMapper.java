package com.fanleagueent.fanleague.data.entity.mappers.user;

import com.fanleagueent.fanleague.data.entity.entities.user.WeeklyDepositLimitEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.user.WeeklyDepositLimit;

/**
 * Created by alexeyverbitskiy on 3/14/17.
 */

public class WeeklyDepositLimitMapper implements Mapper<WeeklyDepositLimitEntity, WeeklyDepositLimit> {

  public WeeklyDepositLimitMapper() {
  }

  @Override public WeeklyDepositLimit transform(WeeklyDepositLimitEntity obj) {
    WeeklyDepositLimit weeklyDepositLimit = new WeeklyDepositLimit();
    weeklyDepositLimit.setCurrent(obj.getCurrent());
    weeklyDepositLimit.setPending(obj.getPending());
    weeklyDepositLimit.setPendingMessage(obj.getPendingMessage());

    return weeklyDepositLimit;
  }
}
