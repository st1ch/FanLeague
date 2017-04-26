package com.fanleagueent.fanleague.data.entity.mappers.pundits;

import com.fanleagueent.fanleague.data.entity.entities.pundits.PostImageEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.pundits.PostImage;

/**
 * Created by Artem Getman on 15.03.17.
 * a.e.getman@gmail.com
 */

public class PostImageMapper implements Mapper<PostImageEntity, PostImage> {

  @Override public PostImage transform(PostImageEntity obj) {
    PostImage postImage = new PostImage();

    postImage.setAppImage(obj.getAppImage());
    postImage.setOriginalImage(obj.getOriginalImage());

    return postImage;
  }
}
