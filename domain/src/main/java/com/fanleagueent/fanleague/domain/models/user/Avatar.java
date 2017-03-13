package com.fanleagueent.fanleague.domain.models.user;

/**
 * Created by alexeyverbitskiy on 11/7/16.
 */

public class Avatar {
    private String originalImage;
    private String mediumImage;

    public Avatar(){}

    public Avatar(String imagePath) {
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
