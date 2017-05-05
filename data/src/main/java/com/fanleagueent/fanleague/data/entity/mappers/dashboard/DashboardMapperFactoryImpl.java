package com.fanleagueent.fanleague.data.entity.mappers.dashboard;

import com.fanleagueent.fanleague.data.entity.entities.dashboard.CommunityEntity;
import com.fanleagueent.fanleague.data.entity.entities.dashboard.DashboardDataEntity;
import com.fanleagueent.fanleague.data.entity.entities.dashboard.DashboardEntity;
import com.fanleagueent.fanleague.data.entity.entities.dashboard.GameWeekDashboardEntity;
import com.fanleagueent.fanleague.data.entity.entities.dashboard.ImageDashboardEntity;
import com.fanleagueent.fanleague.data.entity.entities.dashboard.LastBetEntity;
import com.fanleagueent.fanleague.data.entity.entities.dashboard.LatestScoreEntity;
import com.fanleagueent.fanleague.data.entity.entities.dashboard.TutorialEntity;
import com.fanleagueent.fanleague.data.entity.entities.dashboard.UpdateDataEntity;
import com.fanleagueent.fanleague.data.entity.entities.dashboard.UpdateEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.data.entity.mappers.MapperFactory;
import com.fanleagueent.fanleague.domain.models.dashboard.Community;
import com.fanleagueent.fanleague.domain.models.dashboard.Dashboard;
import com.fanleagueent.fanleague.domain.models.dashboard.DashboardData;
import com.fanleagueent.fanleague.domain.models.dashboard.GameWeekDashboard;
import com.fanleagueent.fanleague.domain.models.dashboard.ImageDashboard;
import com.fanleagueent.fanleague.domain.models.dashboard.LastBet;
import com.fanleagueent.fanleague.domain.models.dashboard.LatestScore;
import com.fanleagueent.fanleague.domain.models.dashboard.Tutorial;
import com.fanleagueent.fanleague.domain.models.dashboard.Update;
import com.fanleagueent.fanleague.domain.models.dashboard.UpdateData;
import java.util.List;

/**
 * Created by Artem Getman on 05.05.17.
 * a.e.getman@gmail.com
 */

public class DashboardMapperFactoryImpl implements DashboardMapperFactory {

  private MapperFactory mapperFactory;

  public DashboardMapperFactoryImpl(MapperFactory mapperFactory) {
    this.mapperFactory = mapperFactory;
  }

  @Override public Mapper<CommunityEntity, Community> getCommunityMapper() {
    return new CommunityMapper();
  }

  @Override public Mapper<DashboardDataEntity, DashboardData> getDashboardDataMapper() {
    return new DashboardDataMapper(this);
  }

  @Override public Mapper<DashboardEntity, Dashboard> getDashboardMapper() {
    return new DashboardMapper(mapperFactory);
  }

  @Override public Mapper<GameWeekDashboardEntity, GameWeekDashboard> getGameweekDashboardMapper() {
    return new GameweekDashboardMapper();
  }

  @Override public Mapper<ImageDashboardEntity, ImageDashboard> getImageDashboardMapper() {
    return new ImageDashboardMapper();
  }

  @Override public Mapper<LastBetEntity, LastBet> getLastBetMapper() {
    return new LastBetMapper();
  }

  @Override public Mapper<LatestScoreEntity, LatestScore> getLatestScoreMapper() {
    return new LatestScoreMapper(this);
  }

  @Override public Mapper<TutorialEntity, Tutorial> getTutorialMapper() {
    return new TutorialMapper();
  }

  @Override public Mapper<List<TutorialEntity>, List<Tutorial>> getTutorialListMapper() {
    return new TutorialListMapper(this);
  }

  @Override public Mapper<UpdateDataEntity, UpdateData> getUpdateDataMapper() {
    return new UpdateDataMapper(this);
  }

  @Override public Mapper<UpdateEntity, Update> getUpdateMapper() {
    return new UpdateMapper(this);
  }

  @Override public Mapper<List<UpdateEntity>, List<Update>> getUpdateListMapper() {
    return new UpdateListMapper(this);
  }
}
