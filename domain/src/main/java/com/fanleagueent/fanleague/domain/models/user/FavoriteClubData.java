package com.fanleagueent.fanleague.domain.models.user;

import java.util.List;

/**
 * Created by alexeyverbitskiy on 11/7/16.
 */

public class FavoriteClubData {

    private List<FavoriteClub> favoriteClubList;

    public List<FavoriteClub> getFavoriteClubList() {
        return favoriteClubList;
    }

    public void setFavoriteClubList(List<FavoriteClub> favoriteClubList) {
        this.favoriteClubList = favoriteClubList;
    }
}
