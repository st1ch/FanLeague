package com.fanleagueent.fanleague.data.entity.mappers.pundits;

import com.fanleagueent.fanleague.data.entity.entities.pundits.PostImageEntity;
import com.fanleagueent.fanleague.data.entity.entities.pundits.PunditPostDataEntity;
import com.fanleagueent.fanleague.data.entity.entities.pundits.PunditPostEntity;
import com.fanleagueent.fanleague.data.entity.entities.pundits.PunditPostsDataEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.data.entity.mappers.MapperFactory;
import com.fanleagueent.fanleague.domain.models.pundits.PostImage;
import com.fanleagueent.fanleague.domain.models.pundits.PunditPost;
import com.fanleagueent.fanleague.domain.models.pundits.PunditPostData;
import com.fanleagueent.fanleague.domain.models.pundits.PunditPostsData;
import java.util.List;

/**
 * Created by Artem Getman on 15.03.17.
 * a.e.getman@gmail.com
 */

public class PunditsMapperFactoryImpl implements PunditsMapperFactory {

  private MapperFactory mapperFactory;

  public PunditsMapperFactoryImpl(MapperFactory mapperFactory) {
    this.mapperFactory = mapperFactory;
  }

  @Override public Mapper<PostImageEntity, PostImage> getPostImageMapper() {
    return new PostImageMapper();
  }

  @Override public Mapper<PunditPostDataEntity, PunditPostData> getPunditPostDataMapper() {
    return new PunditPostDataMapper(mapperFactory);
  }

  @Override public Mapper<PunditPostEntity, PunditPost> getPunditPostMapper() {
    return new PunditPostMapper(mapperFactory);
  }

  @Override public Mapper<List<PunditPostEntity>, List<PunditPost>> getPunditPostListMapper() {
    return new PunditPostListMapper(this);
  }

  @Override public Mapper<PunditPostsDataEntity, PunditPostsData> getPunditPostsDataMapper() {
    return new PunditPostsDataMapper(this);
  }
}
