package com.fanleagueent.fanleague.domain.models.games;

import com.fanleagueent.fanleague.domain.models.user.Avatar;
import java.util.List;

/**
 * Created by st1ch on 05.01.17.
 */

public class PunditSimple {

  private String id;

  private Avatar avatarEntity;

  private String name;

  private List<PunditRecommendation> recommendations;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Avatar getAvatarEntity() {
    return avatarEntity;
  }

  public void setAvatarEntity(Avatar avatarEntity) {
    this.avatarEntity = avatarEntity;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<PunditRecommendation> getRecommendations() {
    return recommendations;
  }

  public void setRecommendations(List<PunditRecommendation> recommendations) {
    this.recommendations = recommendations;
  }

  @Override public String toString() {
    return "PunditSimpleEntity{" +
        "id='" + id + '\'' +
        ", avatarEntity=" + avatarEntity +
        ", name='" + name + '\'' +
        ", recommendations=" + recommendations +
        '}';
  }
}
