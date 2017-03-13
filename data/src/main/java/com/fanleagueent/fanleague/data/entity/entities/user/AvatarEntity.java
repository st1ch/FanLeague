package com.fanleagueent.fanleague.data.entity.entities.user;

import com.google.gson.annotations.SerializedName;

/**
 * Created by alexeyverbitskiy on 11/7/16.
 */

public class AvatarEntity {
    @SerializedName("original_image")
    private String originalImage;

    @SerializedName("medium_image")
    private String mediumImage;

    public AvatarEntity(){}

    public AvatarEntity(String imagePath) {
        mediumImage = imagePath;
    }

    public String getOriginalImage() {
        return originalImage;
    }

    public String getMediumImage() {
        return mediumImage;
    }

    public void setMediumImage(String mediumImage) {
        this.mediumImage = mediumImage;
    }

    @Override
    public String toString() {
        return "AvatarEntity{" +
                "originalImage='" + originalImage + '\'' +
                ", mediumImage='" + mediumImage + '\'' +
                '}';
    }
}
