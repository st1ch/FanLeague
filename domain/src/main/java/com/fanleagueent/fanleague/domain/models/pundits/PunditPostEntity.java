package com.fanleagueent.fanleague.domain.models.pundits;

import android.support.annotation.NonNull;
import com.fanleagueent.fanleague.data.entity.entities.games.ExpertEntity;
import com.fanleagueent.fanleague.data.entity.entities.games.PunditRecommendationEntity;
import com.google.gson.annotations.SerializedName;
import java.util.Date;
import java.util.List;

/**
 * Created by st1ch on 08.02.17.
 */

public class PunditPostEntity implements Comparable<PunditPostEntity> {
  @SerializedName("_id") private String id;
  @SerializedName("title") private String title;
  @SerializedName("slug") private String slug;
  @SerializedName("status") private String status;
  @SerializedName("content") private String content;
  @SerializedName("week") private int week;
  @SerializedName("is_with_video") private boolean isVideo;
  @SerializedName("video") private String video;
  @SerializedName("expert") private ExpertEntity expert;
  @SerializedName("image_sizes") private PostImageEntity image;
  @SerializedName("additional_image_sizes") private PostImageEntity contentImage;
  @SerializedName("expert_bets") private List<PunditRecommendationEntity> punditRecommendations;
  @SerializedName("published_at") private Date publishedAt;
  @SerializedName("has_bet") private boolean hasBet;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public boolean isVideo() {
    return isVideo;
  }

  public void setVideo(boolean video) {
    isVideo = video;
  }

  public ExpertEntity getExpert() {
    return expert;
  }

  public void setExpert(ExpertEntity expert) {
    this.expert = expert;
  }

  public PostImageEntity getImage() {
    return image;
  }

  public void setImage(PostImageEntity image) {
    this.image = image;
  }

  public List<PunditRecommendationEntity> getPunditRecommendations() {
    return punditRecommendations;
  }

  public void setPunditRecommendations(List<PunditRecommendationEntity> punditRecommendations) {
    this.punditRecommendations = punditRecommendations;
  }

  public Date getPublishedAt() {
    return publishedAt;
  }

  public void setPublishedAt(Date publishedAt) {
    this.publishedAt = publishedAt;
  }

  public int getWeek() {
    return week;
  }

  public void setWeek(int week) {
    this.week = week;
  }

  public String getVideo() {
    return video;
  }

  public void setVideo(String video) {
    this.video = video;
  }

  public PostImageEntity getContentImage() {
    return contentImage;
  }

  public void setContentImage(PostImageEntity contentImage) {
    this.contentImage = contentImage;
  }

  public boolean isHasBet() {
    return hasBet;
  }

  public void setHasBet(boolean hasBet) {
    this.hasBet = hasBet;
  }

  @Override public String toString() {
    return "PunditPostEntity{"
        + "id='"
        + id
        + '\''
        + ", title='"
        + title
        + '\''
        + ", slug='"
        + slug
        + '\''
        + ", status='"
        + status
        + '\''
        + ", content='"
        + content
        + '\''
        + ", week="
        + week
        + ", isVideo="
        + isVideo
        + ", video='"
        + video
        + '\''
        + ", expert="
        + expert
        + ", image="
        + image
        + ", contentImage="
        + contentImage
        + ", punditRecommendations="
        + punditRecommendations
        + ", publishedAt="
        + publishedAt
        + ", hasBet="
        + hasBet
        + '}';
  }

  @Override public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    PunditPostEntity that = (PunditPostEntity) o;

    return id != null ? id.equals(that.id) : that.id == null;
  }

  @Override public int hashCode() {
    return id != null ? id.hashCode() : 0;
  }

  @Override public int compareTo(@NonNull PunditPostEntity o) {
    return id.compareTo(o.getId());
  }
}
