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

public interface DashboardMapperFactory {
  Mapper<CommunityEntity, Community> getCommunityMapper();

  Mapper<DashboardDataEntity, DashboardData> getDashboardDataMapper();

  Mapper<DashboardEntity, Dashboard> getDashboardMapper();

  Mapper<GameWeekDashboardEntity, GameWeekDashboard> getGameweekDashboardMapper();

  Mapper<ImageDashboardEntity, ImageDashboard> getImageDashboardMapper();

  Mapper<LastBetEntity, LastBet> getLastBetMapper();

  Mapper<LatestScoreEntity, LatestScore> getLatestScoreMapper();

  Mapper<TutorialEntity, Tutorial> getTutorialMapper();

  Mapper<List<TutorialEntity>, List<Tutorial>> getTutorialListMapper();

  Mapper<UpdateDataEntity, UpdateData> getUpdateDataMapper();

  Mapper<UpdateEntity, Update> getUpdateMapper();

  Mapper<List<UpdateEntity>, List<Update>> getUpdateListMapper();
}
