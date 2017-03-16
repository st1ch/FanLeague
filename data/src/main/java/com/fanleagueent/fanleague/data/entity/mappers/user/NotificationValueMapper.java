package com.fanleagueent.fanleague.data.entity.mappers.user;

import com.fanleagueent.fanleague.data.entity.entities.user.NotificationValuesEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.user.NotificationValues;

/**
 * Created by alexeyverbitskiy on 3/14/17.
 */

public class NotificationValueMapper implements Mapper<NotificationValuesEntity, NotificationValues> {

  public NotificationValueMapper() {
  }

  @Override
  public NotificationValues transform(NotificationValuesEntity obj) {
    NotificationValues notificationValues = new NotificationValues();
    notificationValues.setFriendsSignup(obj.isFriendsSignup());
    notificationValues.setTeamsInvitations(obj.isTeamsInvitations());
    notificationValues.setLeagueInvitations(obj.isLeagueInvitations());
    notificationValues.setTeamsInvitations(obj.isTeamsInvitations());
    notificationValues.setGameResults(obj.isGameResults());
    notificationValues.setInbox(obj.isInbox());
    notificationValues.setUpcomingMatchday(obj.isUpcomingMatchday());
    notificationValues.setWinnings(obj.isWinnings());

    return notificationValues;
  }
}
