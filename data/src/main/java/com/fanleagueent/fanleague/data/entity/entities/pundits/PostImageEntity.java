package com.fanleagueent.fanleague.data.entity.entities.pundits;

import com.google.gson.annotations.SerializedName;

/**
 * Created by st1ch on 08.02.17.
 */

public class PostImageEntity {
  @SerializedName("original_image") private String originalImage;
  @SerializedName("app_image") private String appImage;

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
