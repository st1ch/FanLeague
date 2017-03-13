package com.fanleagueent.fanleague.data.entity.entities.user;

import com.google.gson.annotations.SerializedName;

/**
 * Created by alexey on 12.11.16.
 */

public class NotificationListEntity {
    @SerializedName("push")
    private NotificationValuesEntity notificationValuesEntityPush;

    @SerializedName("email")
    private NotificationValuesEntity notificationValuesEntityEmail;

    public NotificationValuesEntity getNotificationValuesEntityPush() {
        return notificationValuesEntityPush;
    }

    public NotificationValuesEntity getNotificationValuesEntityEmail() {
        return notificationValuesEntityEmail;
    }
}
