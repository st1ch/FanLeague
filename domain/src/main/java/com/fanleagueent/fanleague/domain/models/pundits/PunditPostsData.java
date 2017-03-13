package com.fanleagueent.fanleague.domain.models.pundits;

import java.util.List;

/**
 * Created by st1ch on 08.02.17.
 */

public class PunditPostsData {
  private List<PunditPost> posts;
  private int totalCount;

  public List<PunditPost> getPosts() {
    return posts;
  }

  public void setPosts(List<PunditPost> posts) {
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
