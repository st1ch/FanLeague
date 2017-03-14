package com.fanleagueent.fanleague.data.entity.entities.leagues;

import com.google.gson.annotations.SerializedName;

/**
 * Created by alexeyverbitskiy on 12/20/16.
 */

public class SimpleLeagueMemberEntity {

  @SerializedName("_id") private String id;

  @SerializedName("display_name") private String displayName;

  @SerializedName("is_admin") private boolean isAdmin;

  @SerializedName("is_owner") private boolean isOwner;

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
}
