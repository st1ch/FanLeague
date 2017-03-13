package com.fanleagueent.fanleague.domain.models.user;

import com.fanleagueent.fanleague.data.entity.entities.DataTitle;
import java.util.List;

/**
 * Created by alexeyverbitskiy on 11/8/16.
 */

public class UserGeneralData {
    private User user;
    private List<DataTitle> professionList;
    private List<DataTitle> nationalityList;
    private List<FavoriteClubEntity> favoriteClubEntityList;

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

    public List<FavoriteClubEntity> getFavoriteClubEntityList() {
        return favoriteClubEntityList;
    }

    public void setFavoriteClubEntityList(List<FavoriteClubEntity> favoriteClubEntityList) {
        this.favoriteClubEntityList = favoriteClubEntityList;
    }
}
