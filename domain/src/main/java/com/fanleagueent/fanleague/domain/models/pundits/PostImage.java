package com.fanleagueent.fanleague.domain.models.pundits;

/**
 * Created by st1ch on 08.02.17.
 */

public class PostImage {
  private String originalImage;
  private String appImage;

  public String getOriginalImage() {
    return originalImage;
  }

  public void setOriginalImage(String originalImage) {
    this.originalImage = originalImage;
  }

  public String getAppImage() {
    return appImage;
  }

  public void setAppImage(String appImage) {
    this.appImage = appImage;
  }

  @Override public String toString() {
    return "PostImageEntity{"
        + "originalImage='"
        + originalImage
        + '\''
        + ", appImage='"
        + appImage
        + '\''
        + '}';
  }
}
