package com.fanleagueent.fanleague.domain.models.dashboard;

import lombok.Getter;
import lombok.ToString;
import lombok.experimental.Builder;

/**
 * Created by alexeyverbitskiy on 3/28/17.
 */
@Builder @ToString public class Tutorial {
  @Getter private String id;
  @Getter private String title;
  @Getter private String video;
  @Getter private String image;
}
