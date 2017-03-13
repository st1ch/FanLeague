package com.fanleagueent.fanleague.domain.models.user;

import java.util.List;

/**
 * Created by alexeyverbitskiy on 11/8/16.
 */

public class UserGeneralData {
    private User user;
    private List<DataTitle> professionList;
    private List<DataTitle> nationalityList;
    private List<FavoriteClub> favoriteClubList;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<DataTitle> getProfessionList() {
        return professionList;
    }

    public void setProfessionList(List<DataTitle> professionList) {
        this.professionList = professionList;
    }

    public List<DataTitle> getNationalityList() {
        return nationalityList;
    }

    public void setNationalityList(List<DataTitle> nationalityList) {
        this.nationalityList = nationalityList;
    }

    public List<FavoriteClub> getFavoriteClubList() {
        return favoriteClubList;
    }

    public void setFavoriteClubList(List<FavoriteClub> favoriteClubList) {
        this.favoriteClubList = favoriteClubList;
    }
}
