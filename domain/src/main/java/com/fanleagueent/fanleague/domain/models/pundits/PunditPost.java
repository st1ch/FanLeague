package com.fanleagueent.fanleague.domain.models.pundits;

import com.fanleagueent.fanleague.domain.models.games.Expert;
import com.fanleagueent.fanleague.domain.models.games.PunditRecommendation;
import java.util.Date;
import java.util.List;

/**
 * Created by st1ch on 08.02.17.
 */

public class PunditPost implements Comparable<PunditPost> {
  private String id;
  private String title;
  private String slug;
  private String status;
  private String content;
  private int week;
  private boolean isVideo;
  private String video;
  private Expert expert;
  private PostImage image;
  private PostImage contentImage;
  private List<PunditRecommendation> punditRecommendations;
  private Date publishedAt;
  private boolean hasBet;

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

  public Expert getExpert() {
    return expert;
  }

  public void setExpert(Expert expert) {
    this.expert = expert;
  }

  public PostImage getImage() {
    return image;
  }

  public void setImage(PostImage image) {
    this.image = image;
  }

  public List<PunditRecommendation> getPunditRecommendations() {
    return punditRecommendations;
  }

  public void setPunditRecommendations(List<PunditRecommendation> punditRecommendations) {
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

  public PostImage getContentImage() {
    return contentImage;
  }

  public void setContentImage(PostImage contentImage) {
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

    PunditPost that = (PunditPost) o;

    return id != null ? id.equals(that.id) : that.id == null;
  }

  @Override public int hashCode() {
    return id != null ? id.hashCode() : 0;
  }

  @Override public int compareTo(PunditPost o) {
    return id.compareTo(o.getId());
  }
}
