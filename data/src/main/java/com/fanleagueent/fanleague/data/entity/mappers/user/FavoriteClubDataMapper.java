package com.fanleagueent.fanleague.data.entity.mappers.user;

import com.fanleagueent.fanleague.data.entity.entities.user.FavoriteClubDataEntity;
import com.fanleagueent.fanleague.data.entity.entities.user.FavoriteClubEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.user.FavoriteClub;
import com.fanleagueent.fanleague.domain.models.user.FavoriteClubData;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by alexeyverbitskiy on 3/14/17.
 */

public class FavoriteClubDataMapper implements Mapper<FavoriteClubDataEntity, FavoriteClubData> {
  private UserMapperFactory userMapperFactory;

  public FavoriteClubDataMapper(UserMapperFactory userMapperFactory) {
    this.userMapperFactory = userMapperFactory;
  }

  @Override public FavoriteClubData transform(FavoriteClubDataEntity obj) {
    FavoriteClubData favoriteClubData = new FavoriteClubData();
    List<FavoriteClub> favoriteClubList = new ArrayList<>();

    for (FavoriteClubEntity favoriteClubEntity : obj.getFavoriteClubEntityList()) {
      favoriteClubList.add(userMapperFactory.getFavoriteClubMapper().transform(favoriteClubEntity));
    }
    favoriteClubData.setFavoriteClubList(favoriteClubList);
    return favoriteClubData;
  }
}
