package com.fanleagueent.fanleague.domain.models.leagues;

/**
 * Created by alexeyverbitskiy on 12/20/16.
 */

public class SimpleLeagueMember {

  private String id;
  private String displayName;
  private boolean isAdmin;
  private boolean isOwner;

  public String getId() {
    return id;
  }

  public String getDisplayName() {
    return displayName;
  }

  public boolean isAdmin() {
    return isAdmin;
  }

  public boolean isOwner() {
    return isOwner;
  }

  public void setId(String id) {
    this.id = id;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public void setAdmin(boolean admin) {
    isAdmin = admin;
  }

  public void setOwner(boolean owner) {
    isOwner = owner;
  }

  @Override public String toString() {
    return "SimpleLeagueMember{"
        + "id='"
        + id
        + '\''
        + ", displayName='"
        + displayName
        + '\''
        + ", isAdmin="
        + isAdmin
        + ", isOwner="
        + isOwner
        + '}';
  }
}
