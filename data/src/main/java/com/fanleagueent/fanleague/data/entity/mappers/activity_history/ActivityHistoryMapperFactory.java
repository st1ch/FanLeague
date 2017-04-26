package com.fanleagueent.fanleague.data.entity.mappers.activity_history;

import com.fanleagueent.fanleague.data.entity.entities.activity_history.ActivityHistoryAllDataEntity;
import com.fanleagueent.fanleague.data.entity.entities.activity_history.ActivityHistoryBetEntity;
import com.fanleagueent.fanleague.data.entity.entities.activity_history.ActivityHistoryGroupEntity;
import com.fanleagueent.fanleague.data.entity.entities.activity_history.ActivityHistoryUserEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.activity_history.ActivityHistoryAllData;
import com.fanleagueent.fanleague.domain.models.activity_history.ActivityHistoryBet;
import com.fanleagueent.fanleague.domain.models.activity_history.ActivityHistoryGroup;
import com.fanleagueent.fanleague.domain.models.activity_history.ActivityHistoryUser;
import java.util.List;

public interface ActivityHistoryMapperFactory {
  Mapper<ActivityHistoryAllDataEntity, ActivityHistoryAllData> getActivityHistoryAllDataMapper();

  Mapper<List<ActivityHistoryAllDataEntity>, List<ActivityHistoryAllData>> getActivityHistoryAllDataListMapper();

  Mapper<ActivityHistoryBetEntity, ActivityHistoryBet> getActivityHistoryBetMapper();

  Mapper<List<ActivityHistoryBetEntity>, List<ActivityHistoryBet>> getActivityHistoryBetListMapper();

  Mapper<ActivityHistoryGroupEntity, ActivityHistoryGroup> getActivityHistoryGroupMapper();

  Mapper<List<ActivityHistoryGroupEntity>, List<ActivityHistoryGroup>> getActivityHistoryGroupListMapper();

  Mapper<ActivityHistoryUserEntity, ActivityHistoryUser> getActivityHistoryUserMapper();

  Mapper<List<ActivityHistoryUserEntity>, List<ActivityHistoryUser>> getActivityHistoryUserListMapper();
}
