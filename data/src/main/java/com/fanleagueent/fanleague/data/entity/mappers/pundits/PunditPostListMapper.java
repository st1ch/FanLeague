package com.fanleagueent.fanleague.data.entity.mappers.pundits;

import com.fanleagueent.fanleague.data.entity.entities.pundits.PunditPostEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.pundits.PunditPost;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Artem Getman on 15.03.17.
 * a.e.getman@gmail.com
 */

public class PunditPostListMapper implements Mapper<List<PunditPostEntity>, List<PunditPost>> {

  private PunditsMapperFactory punditsMapperFactory;

  public PunditPostListMapper(PunditsMapperFactory punditsMapperFactory) {
    this.punditsMapperFactory = punditsMapperFactory;
  }

  @Override public List<PunditPost> transform(List<PunditPostEntity> obj) {
    List<PunditPost> punditPosts = new ArrayList<>();

    for (PunditPostEntity entity : obj) {
      punditPosts.add(punditsMapperFactory.getPunditPostMapper().transform(entity));
    }

    return punditPosts;
  }
}
