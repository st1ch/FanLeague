package com.fanleagueent.fanleague.data.entity.entities.recruiting;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Artem Getman on 21.02.17.
 * a.e.getman@gmail.com
 */

public class ClubEntity {
  @SerializedName("_id") private String id;
  @SerializedName("name") private String name;
  @SerializedName("updated_at") private String updatedAt;
  @SerializedName("admin_team_id") private String adminTeamId;

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getUpdatedAt() {
    return updatedAt;
  }

  public String getAdminTeamId() {
    return adminTeamId;
  }
}
