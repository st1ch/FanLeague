package com.fanleagueent.fanleague.domain.models.user;

/**
 * Created by alexey on 12.11.16.
 */

public class NotificationList {
    private NotificationValues notificationValuesPush;
    private NotificationValues notificationValuesEmail;

    public NotificationValues getNotificationValuesPush() {
        return notificationValuesPush;
    }

    public NotificationValues getNotificationValuesEmail() {
        return notificationValuesEmail;
    }

    public void setNotificationValuesPush(NotificationValues notificationValuesPush) {
        this.notificationValuesPush = notificationValuesPush;
    }

    public void setNotificationValuesEmail(NotificationValues notificationValuesEmail) {
        this.notificationValuesEmail = notificationValuesEmail;
    }
}
