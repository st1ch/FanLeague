package com.fanleagueent.fanleague.data.entity.entities.games;

import com.fanleagueent.fanleague.data.entity.entities.user.AvatarEntity;
import com.google.gson.annotations.SerializedName;
import java.util.Date;
import java.util.List;

/**
 * Created by st1ch on 05.01.17.
 */

public class PunditEntity {

  @SerializedName("_id") private String id;

  @SerializedName("image_sizes") private AvatarEntity avatarEntity;

  @SerializedName("title") private String title;

  @SerializedName("content") private String content;

  @SerializedName("expert") private ExpertEntity expert;

  @SerializedName("status") private String status;

  @SerializedName("expert_bets") private List<PunditRecommendationEntity> recommendations;

  @SerializedName("published_at") private Date publishDate;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AvatarEntity getAvatarEntity() {
    return avatarEntity;
  }

  public void setAvatarEntity(AvatarEntity avatarEntity) {
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

  public ExpertEntity getExpert() {
    return expert;
  }

  public void setExpert(ExpertEntity expert) {
    this.expert = expert;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public List<PunditRecommendationEntity> getRecommendations() {
    return recommendations;
  }

  public void setRecommendations(List<PunditRecommendationEntity> recommendations) {
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
