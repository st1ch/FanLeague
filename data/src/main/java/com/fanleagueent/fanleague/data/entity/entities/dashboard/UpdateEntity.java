package com.fanleagueent.fanleague.data.entity.entities.dashboard;

import com.google.gson.annotations.SerializedName;
import java.util.Date;
import lombok.Getter;

/**
 * Created by alexeyverbitskiy on 3/28/17.
 */

public class UpdateEntity {
  @SerializedName("_id") @Getter private String id;

  @SerializedName("title") @Getter private String title;

  @SerializedName("slug") @Getter private String slug;

  @SerializedName("status") @Getter private String image;

  @SerializedName("content") @Getter private String content;

  @SerializedName("content_without_tags") @Getter private String contentWithoutTags;

  @SerializedName("is_with_video") @Getter private boolean isWithVideo;

  @SerializedName("video") @Getter private String video;

  @SerializedName("published_at") @Getter private Date publishedAt;

  @SerializedName("author") @Getter private String author;

  @SerializedName("image_sizes") @Getter private ImageDashboardEntity imageDashboard;
}
