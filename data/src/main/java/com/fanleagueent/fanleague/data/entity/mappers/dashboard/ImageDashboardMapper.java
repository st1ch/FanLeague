package com.fanleagueent.fanleague.data.entity.mappers.dashboard;

import com.fanleagueent.fanleague.data.entity.entities.dashboard.ImageDashboardEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.dashboard.ImageDashboard;

/**
 * Created by Artem Getman on 05.05.17.
 * a.e.getman@gmail.com
 */

public class ImageDashboardMapper implements Mapper<ImageDashboardEntity, ImageDashboard> {
  @Override public ImageDashboard transform(ImageDashboardEntity obj) {
    return ImageDashboard.builder().appImage(obj.getAppImage()).build();
  }
}
