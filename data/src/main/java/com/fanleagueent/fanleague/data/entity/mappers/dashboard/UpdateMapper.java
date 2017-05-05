package com.fanleagueent.fanleague.data.entity.mappers.dashboard;

import com.fanleagueent.fanleague.data.entity.entities.dashboard.UpdateEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.dashboard.Update;

/**
 * Created by Artem Getman on 05.05.17.
 * a.e.getman@gmail.com
 */

public class UpdateMapper implements Mapper<UpdateEntity, Update> {

  private DashboardMapperFactory dashboardMapperFactory;

  public UpdateMapper(DashboardMapperFactory dashboardMapperFactory) {
    this.dashboardMapperFactory = dashboardMapperFactory;
  }

  @Override public Update transform(UpdateEntity obj) {
    return Update.builder()
        .id(obj.getId())
        .title(obj.getTitle())
        .slug(obj.getSlug())
        .image(obj.getImage())
        .content(obj.getContent())
        .contentWithoutTags(obj.getContentWithoutTags())
        .isWithVideo(obj.isWithVideo())
        .video(obj.getVideo())
        .publishedAt(obj.getPublishedAt())
        .author(obj.getAuthor())
        .imageDashboard(
            dashboardMapperFactory.getImageDashboardMapper().transform(obj.getImageDashboard()))
        .build();
  }
}
