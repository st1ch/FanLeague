package com.fanleagueent.fanleague.domain.models.activity_history;

import java.util.Date;

/**
 * Created by alexeyverbitskiy on 3/3/17.
 */

public class ActivityHistoryAllData {
  private String id;

  private String teamId;

  private String memberId;

  private String type;

  private Date createdAt;

  private Date updatedAt;

  private String text;

  private String title;

  private ActivityHistoryUser activityHistoryUserEntity;

  private ActivityHistoryGroup activityHistoryTeam;

  private ActivityHistoryGroup activityHistoryLeague;

  private ActivityHistoryUser activityHistorySender;

  private ActivityHistoryUser activityHistoryMember;

  public String getId() {
    return id;
  }

  public String getTeamId() {
    return teamId;
  }

  public String getMemberId() {
    return memberId;
  }

  public TYPE getType() {
    switch (type) {
      case "bet":
        return TYPE.BET;
      case "friend_request":
        return TYPE.FRIEND;
      case "team":
        return TYPE.TEAM;
      case "league":
        return TYPE.LEAGUE;
      default:
        return null;
    }
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

  public ActivityHistoryUser getActivityHistoryUserEntity() {
    return activityHistoryUserEntity;
  }

  public ActivityHistoryGroup getActivityHistoryTeam() {
    return activityHistoryTeam;
  }

  public ActivityHistoryGroup getActivityHistoryLeague() {
    return activityHistoryLeague;
  }

  public ActivityHistoryUser getActivityHistorySender() {
    return activityHistorySender;
  }

  public ActivityHistoryUser getActivityHistoryMember() {
    return activityHistoryMember;
  }

  public void setId(String id) {
    this.id = id;
  }

  public void setTeamId(String teamId) {
    this.teamId = teamId;
  }

  public void setMemberId(String memberId) {
    this.memberId = memberId;
  }

  public void setType(String type) {
    this.type = type;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  public void setText(String text) {
    this.text = text;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setActivityHistoryUser(ActivityHistoryUser activityHistoryUserEntity) {
    this.activityHistoryUserEntity = activityHistoryUserEntity;
  }

  public void setActivityHistoryTeam(ActivityHistoryGroup activityHistoryTeam) {
    this.activityHistoryTeam = activityHistoryTeam;
  }

  public void setActivityHistoryLeague(ActivityHistoryGroup activityHistoryLeague) {
    this.activityHistoryLeague = activityHistoryLeague;
  }

  public void setActivityHistorySender(ActivityHistoryUser activityHistorySender) {
    this.activityHistorySender = activityHistorySender;
  }

  public void setActivityHistoryMember(ActivityHistoryUser activityHistoryMember) {
    this.activityHistoryMember = activityHistoryMember;
  }

  public enum TYPE {
    BET, FRIEND, TEAM, LEAGUE
  }

  @Override public String toString() {
    return "ActivityHistoryAllData{"
        + "id='"
        + id
        + '\''
        + ", teamId='"
        + teamId
        + '\''
        + ", memberId='"
        + memberId
        + '\''
        + ", type='"
        + type
        + '\''
        + ", createdAt="
        + createdAt
        + ", updatedAt="
        + updatedAt
        + ", text='"
        + text
        + '\''
        + ", title='"
        + title
        + '\''
        + ", activityHistoryUserEntity="
        + activityHistoryUserEntity
        + ", activityHistoryTeam="
        + activityHistoryTeam
        + ", activityHistoryLeague="
        + activityHistoryLeague
        + ", activityHistorySender="
        + activityHistorySender
        + ", activityHistoryMember="
        + activityHistoryMember
        + '}';
  }
}
