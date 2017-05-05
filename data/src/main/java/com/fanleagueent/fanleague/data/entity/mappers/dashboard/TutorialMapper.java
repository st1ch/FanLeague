package com.fanleagueent.fanleague.data.entity.mappers.dashboard;

import com.fanleagueent.fanleague.data.entity.entities.dashboard.TutorialEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.dashboard.Tutorial;

/**
 * Created by Artem Getman on 05.05.17.
 * a.e.getman@gmail.com
 */

public class TutorialMapper implements Mapper<TutorialEntity, Tutorial> {
  @Override public Tutorial transform(TutorialEntity obj) {
    return Tutorial.builder()
        .id(obj.getId())
        .image(obj.getImage())
        .title(obj.getTitle())
        .video(obj.getVideo())
        .build();
  }
}
