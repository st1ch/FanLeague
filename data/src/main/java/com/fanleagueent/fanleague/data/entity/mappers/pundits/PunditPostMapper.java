package com.fanleagueent.fanleague.data.entity.mappers.pundits;

import com.fanleagueent.fanleague.data.entity.entities.pundits.PunditPostEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.data.entity.mappers.MapperFactory;
import com.fanleagueent.fanleague.domain.models.pundits.PunditPost;

/**
 * Created by Artem Getman on 15.03.17.
 * a.e.getman@gmail.com
 */

public class PunditPostMapper implements Mapper<PunditPostEntity, PunditPost> {

  private MapperFactory mapperFactory;

  public PunditPostMapper(MapperFactory mapperFactory) {
    this.mapperFactory = mapperFactory;
  }

  @Override public PunditPost transform(PunditPostEntity obj) {
    PunditPost punditPost = new PunditPost();

    punditPost.setId(obj.getId());
    punditPost.setTitle(obj.getTitle());
    punditPost.setSlug(obj.getSlug());
    punditPost.setStatus(obj.getStatus());
    punditPost.setContent(obj.getContent());
    punditPost.setWeek(obj.getWeek());
    punditPost.setVideo(obj.isVideo());
    punditPost.setVideo(obj.getVideo());
    punditPost.setExpert(
        mapperFactory.gamesMapperFactory().getExpertMapper().transform(obj.getExpert()));
    punditPost.setImage(
        mapperFactory.punditsMapperFactory().getPostImageMapper().transform(obj.getImage()));
    punditPost.setPunditRecommendations(mapperFactory.gamesMapperFactory()
        .getPunditRecommendationListMapper()
        .transform(obj.getPunditRecommendations()));
    punditPost.setPublishedAt(obj.getPublishedAt());
    punditPost.setHasBet(obj.isHasBet());

    return punditPost;
  }
}
