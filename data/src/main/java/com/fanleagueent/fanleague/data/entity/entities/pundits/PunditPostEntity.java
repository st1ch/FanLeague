package com.fanleagueent.fanleague.data.entity.entities.pundits;

import com.fanleagueent.fanleague.data.entity.entities.games.ExpertEntity;
import com.fanleagueent.fanleague.data.entity.entities.games.PunditRecommendationEntity;
import com.google.gson.annotations.SerializedName;
import java.util.Date;
import java.util.List;

/**
 * Created by st1ch on 08.02.17.
 */

public class PunditPostEntity {
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

  public String getTitle() {
    return title;
  }

  public String getSlug() {
    return slug;
  }

  public String getStatus() {
    return status;
  }

  public String getContent() {
    return content;
  }

  public boolean isVideo() {
    return isVideo;
  }

  public ExpertEntity getExpert() {
    return expert;
  }

  public PostImageEntity getImage() {
    return image;
  }

  public List<PunditRecommendationEntity> getPunditRecommendations() {
    return punditRecommendations;
  }

  public Date getPublishedAt() {
    return publishedAt;
  }

  public int getWeek() {
    return week;
  }

  public String getVideo() {
    return video;
  }

  public PostImageEntity getContentImage() {
    return contentImage;
  }

  public boolean isHasBet() {
    return hasBet;
  }
}
