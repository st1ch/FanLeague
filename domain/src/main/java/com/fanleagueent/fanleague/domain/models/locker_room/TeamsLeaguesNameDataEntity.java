package com.fanleagueent.fanleague.domain.models.locker_room;

/**
 * Created by st1ch on 23.01.17.
 */

public class TeamsLeaguesNameDataEntity {

  private String name;
  private TeamsLeaguesListDataEntity teamsLeaguesListDataEntity;

  public TeamsLeaguesNameDataEntity(String name, TeamsLeaguesListDataEntity teamsLeaguesListDataEntity) {
    this.name = name;
    this.teamsLeaguesListDataEntity = teamsLeaguesListDataEntity;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TeamsLeaguesListDataEntity getTeamsLeaguesListDataEntity() {
    return teamsLeaguesListDataEntity;
  }

  public void setTeamsLeaguesListDataEntity(TeamsLeaguesListDataEntity teamsLeaguesListDataEntity) {
    this.teamsLeaguesListDataEntity = teamsLeaguesListDataEntity;
  }

  @Override public String toString() {
    return "TeamsLeaguesNameDataEntity{" +
        "name='" + name + '\'' +
        ", teamsLeaguesListDataEntity=" + teamsLeaguesListDataEntity +
        '}';
  }
}
