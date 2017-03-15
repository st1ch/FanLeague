package com.fanleagueent.fanleague.data.entity.entities.pundits;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * Created by st1ch on 08.02.17.
 */

public class PunditPostsDataEntity {
  @SerializedName("posts") private List<PunditPostEntity> posts;
  @SerializedName("total") private int totalCount;

  public List<PunditPostEntity> getPosts() {
    return posts;
  }

  public int getTotalCount() {
    return totalCount;
  }
}
