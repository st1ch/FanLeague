package com.fanleagueent.fanleague.data.entity.entities.activity_history;

import android.support.annotation.Nullable;
import com.google.gson.annotations.SerializedName;
import java.util.Date;

/**
 * Created by alexeyverbitskiy on 3/3/17.
 */

public class ActivityHistoryAllDataEntity {
  @SerializedName("_id") private String id;

  @SerializedName("team_id") private String teamId;

  @SerializedName("member_id") private String memberId;

  @SerializedName("type") private String type;

  @SerializedName("created_at") private Date createdAt;

  @SerializedName("updated_at") private Date updatedAt;

  @SerializedName("text") private String text;

  @SerializedName("title") private String title;

  @Nullable @SerializedName("user") private ActivityHistoryUserEntity activityHistoryUserEntity;

  @Nullable @SerializedName("team") private ActivityHistoryGroupEntity activityHistoryTeam;

  @Nullable @SerializedName("league") private ActivityHistoryGroupEntity activityHistoryLeague;

  @Nullable @SerializedName("sender") private ActivityHistoryUserEntity activityHistorySender;

  @Nullable @SerializedName("member") private ActivityHistoryUserEntity activityHistoryMember;

  public String getId() {
    return id;
  }

  public String getTeamId() {
    return teamId;
  }

  public String getMemberId() {
    return memberId;
  }

  public Date getCreatedAt() {
    return createdAt;
  }

  public Date getUpdatedAt() {
    return updatedAt;
  }

  public String getText() {
    return text;
  }

  public String getTitle() {
    return title;
  }

  public String getType() {
    return type;
  }

  @Nullable public ActivityHistoryUserEntity getActivityHistoryUserEntity() {
    return activityHistoryUserEntity;
  }

  @Nullable public ActivityHistoryGroupEntity getActivityHistoryTeam() {
    return activityHistoryTeam;
  }

  @Nullable public ActivityHistoryGroupEntity getActivityHistoryLeague() {
    return activityHistoryLeague;
  }

  @Nullable public ActivityHistoryUserEntity getActivityHistorySender() {
    return activityHistorySender;
  }

  @Nullable public ActivityHistoryUserEntity getActivityHistoryMember() {
    return activityHistoryMember;
  }

}
