package com.fanleagueent.fanleague.domain.models.games;

import com.fanleagueent.fanleague.domain.models.user.Avatar;
import java.util.Date;
import java.util.List;

/**
 * Created by st1ch on 05.01.17.
 */

public class Pundit {

  private String id;

  private Avatar avatarEntity;

  private String title;

  private String content;

  private Expert expert;

  private String status;

  private List<PunditRecommendation> recommendations;

  private Date publishDate;

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

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Expert getExpert() {
    return expert;
  }

  public void setExpert(Expert expert) {
    this.expert = expert;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public List<PunditRecommendation> getRecommendations() {
    return recommendations;
  }

  public void setRecommendations(List<PunditRecommendation> recommendations) {
    this.recommendations = recommendations;
  }

  public Date getPublishDate() {
    return publishDate;
  }

  public void setPublishDate(Date publishDate) {
    this.publishDate = publishDate;
  }

  @Override public String toString() {
    return "PunditEntity{" +
        "id='" + id + '\'' +
        ", avatarEntity=" + avatarEntity +
        ", title='" + title + '\'' +
        ", content='" + content + '\'' +
        ", expert=" + expert +
        ", status='" + status + '\'' +
        ", recommendations=" + recommendations +
        ", publishDate=" + publishDate +
        '}';
  }
}
