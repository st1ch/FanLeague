package com.fanleagueent.fanleague.data.entity.mappers.activity_history;

import com.fanleagueent.fanleague.data.entity.entities.activity_history.ActivityHistoryAllDataEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.activity_history.ActivityHistoryAllData;

/**
 * Created by Artem Getman on 13.03.17.
 * a.e.getman@gmail.com
 */

public class AllDataMapper
    implements Mapper<ActivityHistoryAllDataEntity, ActivityHistoryAllData> {

  private ActivityHistoryMapperFactory abstractMapperFactory;

  public AllDataMapper(ActivityHistoryMapperFactory abstractMapperFactory) {
    this.abstractMapperFactory = abstractMapperFactory;
  }

  @Override public ActivityHistoryAllData transform(ActivityHistoryAllDataEntity obj) {
    ActivityHistoryAllData activityHistoryAllData = new ActivityHistoryAllData();

    activityHistoryAllData.setId(obj.getId());
    activityHistoryAllData.setTeamId(obj.getTeamId());
    activityHistoryAllData.setMemberId(obj.getMemberId());
    activityHistoryAllData.setType(obj.getType());
    activityHistoryAllData.setUpdatedAt(obj.getUpdatedAt());
    activityHistoryAllData.setCreatedAt(obj.getCreatedAt());
    activityHistoryAllData.setText(obj.getText());
    activityHistoryAllData.setTitle(obj.getTitle());
    activityHistoryAllData.setActivityHistoryUser(
        abstractMapperFactory.getActivityHistoryUserMapper()
            .transform(obj.getActivityHistoryUserEntity()));
    activityHistoryAllData.setActivityHistoryTeam(
        abstractMapperFactory.getActivityHistoryGroupMapper()
            .transform(obj.getActivityHistoryTeam()));
    activityHistoryAllData.setActivityHistoryLeague(
        abstractMapperFactory.getActivityHistoryGroupMapper()
            .transform(obj.getActivityHistoryLeague()));
    activityHistoryAllData.setActivityHistorySender(
        abstractMapperFactory.getActivityHistoryUserMapper()
            .transform(obj.getActivityHistorySender()));
    activityHistoryAllData.setActivityHistoryMember(
        abstractMapperFactory.getActivityHistoryUserMapper()
            .transform(obj.getActivityHistoryMember()));

    return activityHistoryAllData;
  }
}
