package com.fanleagueent.fanleague.data.entity.mappers.pundits;

import com.fanleagueent.fanleague.data.entity.entities.pundits.PunditPostsDataEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.pundits.PunditPostsData;

/**
 * Created by Artem Getman on 15.03.17.
 * a.e.getman@gmail.com
 */

public class PunditPostsDataMapper implements Mapper<PunditPostsDataEntity, PunditPostsData> {

  private PunditsMapperFactory mapperFactory;

  public PunditPostsDataMapper(PunditsMapperFactory mapperFactory) {
    this.mapperFactory = mapperFactory;
  }

  @Override public PunditPostsData transform(PunditPostsDataEntity obj) {
    PunditPostsData punditPostsData = new PunditPostsData();

    punditPostsData.setPosts(mapperFactory.getPunditPostListMapper().transform(obj.getPosts()));
    punditPostsData.setTotalCount(obj.getTotalCount());

    return punditPostsData;
  }
}
