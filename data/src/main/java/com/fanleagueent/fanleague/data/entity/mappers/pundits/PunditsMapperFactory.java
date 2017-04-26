package com.fanleagueent.fanleague.data.entity.mappers.pundits;

import com.fanleagueent.fanleague.data.entity.entities.pundits.PostImageEntity;
import com.fanleagueent.fanleague.data.entity.entities.pundits.PunditPostDataEntity;
import com.fanleagueent.fanleague.data.entity.entities.pundits.PunditPostEntity;
import com.fanleagueent.fanleague.data.entity.entities.pundits.PunditPostsDataEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.pundits.PostImage;
import com.fanleagueent.fanleague.domain.models.pundits.PunditPost;
import com.fanleagueent.fanleague.domain.models.pundits.PunditPostData;
import com.fanleagueent.fanleague.domain.models.pundits.PunditPostsData;
import java.util.List;

/**
 * Created by Artem Getman on 15.03.17.
 * a.e.getman@gmail.com
 */

public interface PunditsMapperFactory {
  Mapper<PostImageEntity, PostImage> getPostImageMapper();

  Mapper<PunditPostDataEntity, PunditPostData> getPunditPostDataMapper();

  Mapper<PunditPostEntity, PunditPost> getPunditPostMapper();

  Mapper<List<PunditPostEntity>, List<PunditPost>> getPunditPostListMapper();

  Mapper<PunditPostsDataEntity, PunditPostsData> getPunditPostsDataMapper();
}
