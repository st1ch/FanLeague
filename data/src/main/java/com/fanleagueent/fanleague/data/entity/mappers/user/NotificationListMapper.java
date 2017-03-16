package com.fanleagueent.fanleague.data.entity.mappers.user;

import com.fanleagueent.fanleague.data.entity.entities.user.NotificationListEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.user.NotificationList;

/**
 * Created by alexeyverbitskiy on 3/14/17.
 */

public class NotificationListMapper implements Mapper<NotificationListEntity, NotificationList> {

  private UserMapperFactory userMapperFactory;

  public NotificationListMapper(UserMapperFactory userMapperFactory) {
    this.userMapperFactory = userMapperFactory;
  }

  @Override public NotificationList transform(NotificationListEntity obj) {
    NotificationList notificationList = new NotificationList();
    notificationList.setNotificationValuesEmail(userMapperFactory.getNotificationValuesMapper().transform(obj.getNotificationValuesEntityEmail()));
    notificationList.setNotificationValuesPush(userMapperFactory.getNotificationValuesMapper().transform(obj.getNotificationValuesEntityPush()));

    return notificationList;
  }
}
