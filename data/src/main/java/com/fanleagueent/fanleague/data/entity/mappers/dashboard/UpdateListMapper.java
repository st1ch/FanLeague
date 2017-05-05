package com.fanleagueent.fanleague.data.entity.mappers.dashboard;

import com.fanleagueent.fanleague.data.entity.entities.dashboard.UpdateEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.dashboard.Update;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Artem Getman on 05.05.17.
 * a.e.getman@gmail.com
 */

public class UpdateListMapper implements Mapper<List<UpdateEntity>, List<Update>> {

  private DashboardMapperFactory dashboardMapperFactory;

  public UpdateListMapper(DashboardMapperFactory dashboardMapperFactory) {
    this.dashboardMapperFactory = dashboardMapperFactory;
  }

  @Override public List<Update> transform(List<UpdateEntity> obj) {
    List<Update> updates = new ArrayList<>();

    for (UpdateEntity entity : obj) {
      updates.add(dashboardMapperFactory.getUpdateMapper().transform(entity));
    }

    return updates;
  }
}
