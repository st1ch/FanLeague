package com.fanleagueent.fanleague.domain.models.authorization;

import com.fanleagueent.fanleague.domain.models.user.User;

/**
 * Created by alexey on 21.10.16.
 */

public class Authorization {
  private String accessToken;
  private User user;

  public String getAccessToken() {
    return accessToken;
  }

  public User getUser() {
    return user;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public void setUser(User user) {
    this.user = user;
  }

  @Override public String toString() {
    return "Authorization{" + "accessToken='" + accessToken + '\'' + ", user=" + user + '}';
  }
}
