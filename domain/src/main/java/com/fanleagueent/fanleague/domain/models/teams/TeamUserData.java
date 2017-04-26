package com.fanleagueent.fanleague.domain.models.teams;

import com.fanleagueent.fanleague.domain.models.user.User;

/**
 * Created by st1ch on 23.11.16.
 */

public class TeamUserData {
  private User userEntity;
  private Team team;

  public User getUserEntity() {
    return userEntity;
  }

  public Team getTeam() {
    return team;
  }

  public void setUserEntity(User userEntity) {
    this.userEntity = userEntity;
  }

  public void setTeam(Team team) {
    this.team = team;
  }

  @Override public String toString() {
    return "TeamUserData{" + "userEntity=" + userEntity + ", team=" + team + '}';
  }
}
