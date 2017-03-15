package com.fanleagueent.fanleague.data.entity.mappers.locker_room;

import com.fanleagueent.fanleague.data.entity.entities.locker_room.PrivacyEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.locker_room.Privacy;

/**
 * Created by Artem Getman on 15.03.17.
 * a.e.getman@gmail.com
 */

public class PrivacyMapper implements Mapper<PrivacyEntity, Privacy> {
  @Override public Privacy transform(PrivacyEntity obj) {
    return new Privacy.Builder()
        .memberSince(obj.isMemberSinceVisible())
        .favouriteClub(obj.isFavouriteClubVisible())
        .favouriteYouthClub(obj.isFavouriteYouthClubVisible())
        .profession(obj.isProfessionVisible())
        .averageWinningBets(obj.isAverageWinningBetsVisible())
        .bestScore(obj.isBestScoreVisible())
        .age(obj.isAgeVisible())
        .sex(obj.isSexVisible())
        .nationality(obj.isNationalityVisible())
        .recruitTreeSize(obj.isRecruitTreeSizeVisible())
        .build();
  }
}
