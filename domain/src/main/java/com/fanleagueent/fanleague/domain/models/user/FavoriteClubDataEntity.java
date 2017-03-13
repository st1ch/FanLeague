package com.fanleagueent.fanleague.domain.models.user;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * Created by alexeyverbitskiy on 11/7/16.
 */

public class FavoriteClubDataEntity {

    @SerializedName("clubs")
    private List<FavoriteClubEntity> favoriteClubEntityList;

    public List<FavoriteClubEntity> getFavoriteClubEntityList() {
        return favoriteClubEntityList;
    }
}
