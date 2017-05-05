package com.fanleagueent.fanleague.data.entity.mappers.dashboard;

import com.fanleagueent.fanleague.data.entity.entities.dashboard.TutorialEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.dashboard.Tutorial;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Artem Getman on 05.05.17.
 * a.e.getman@gmail.com
 */

public class TutorialListMapper implements Mapper<List<TutorialEntity>, List<Tutorial>> {

  private DashboardMapperFactory dashboardMapperFactory;

  public TutorialListMapper(DashboardMapperFactory dashboardMapperFactory) {
    this.dashboardMapperFactory = dashboardMapperFactory;
  }

  @Override public List<Tutorial> transform(List<TutorialEntity> obj) {
    List<Tutorial> tutorials = new ArrayList<>();

    for (TutorialEntity entity : obj) {
      tutorials.add(dashboardMapperFactory.getTutorialMapper().transform(entity));
    }

    return tutorials;
  }
}
