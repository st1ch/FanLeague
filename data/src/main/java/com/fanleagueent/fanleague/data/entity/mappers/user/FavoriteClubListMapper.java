package com.fanleagueent.fanleague.data.entity.mappers.user;

import com.fanleagueent.fanleague.data.entity.entities.user.FavoriteClubEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.user.FavoriteClub;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by alexeyverbitskiy on 3/14/17.
 */

public class FavoriteClubListMapper implements Mapper<List<FavoriteClubEntity>, List<FavoriteClub>> {

  private UserMapperFactory userMapperFactory;

  public FavoriteClubListMapper(UserMapperFactory userMapperFactory) {
    this.userMapperFactory = userMapperFactory;
  }

  @Override public List<FavoriteClub> transform(List<FavoriteClubEntity> obj) {
    List<FavoriteClub> favoriteClubList = new ArrayList<>();

    for (FavoriteClubEntity favoriteClubEntity : obj) {
      favoriteClubList.add(userMapperFactory.getFavoriteClubMapper().transform(favoriteClubEntity));
    }

    return favoriteClubList;
  }
}
