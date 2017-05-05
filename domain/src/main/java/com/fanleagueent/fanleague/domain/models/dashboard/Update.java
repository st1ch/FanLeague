package com.fanleagueent.fanleague.domain.models.dashboard;

import java.util.Date;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.Builder;

/**
 * Created by alexeyverbitskiy on 3/28/17.
 */
@Builder @ToString public class Update {
  @Getter private String id;
  @Getter private String title;
  @Getter private String slug;
  @Getter private String image;
  @Getter private String content;
  @Getter private String contentWithoutTags;
  @Getter private boolean isWithVideo;
  @Getter private String video;
  @Getter private Date publishedAt;
  @Getter private String author;
  @Getter private ImageDashboard imageDashboard;
}
