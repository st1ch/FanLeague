package com.fanleagueent.fanleague.domain.models.games;

import com.fanleagueent.fanleague.domain.models.user.Avatar;

/**
 * Created by st1ch on 10.01.17.
 */

public class Expert {

  private String id;

  private String name;

  private String detail;

  private Avatar avatarEntity;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

  public Avatar getAvatarEntity() {
    return avatarEntity;
  }

  public void setAvatarEntity(Avatar avatarEntity) {
    this.avatarEntity = avatarEntity;
  }

  @Override public String toString() {
    return "ExpertEntity{"
        + "id='"
        + id
        + '\''
        + ", name='"
        + name
        + '\''
        + ", detail='"
        + detail
        + '\''
        + ", avatarEntity="
        + avatarEntity
        + '}';
  }
}
