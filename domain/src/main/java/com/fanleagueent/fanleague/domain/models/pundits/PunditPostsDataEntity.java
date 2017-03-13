package com.fanleagueent.fanleague.domain.models.pundits;

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

  public void setPosts(List<PunditPostEntity> posts) {
    this.posts = posts;
  }

  public int getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(int totalCount) {
    this.totalCount = totalCount;
  }

  @Override public String toString() {
    return "PunditPostsDataEntity{" + "posts=" + posts + ", totalCount=" + totalCount + '}';
  }
}
