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
    return Privacy.builder()
        .memberSince(obj.isMemberSince())
        .favouriteClub(obj.isFavouriteClub())
        .favouriteYouthClub(obj.isFavouriteYouthClub())
        .profession(obj.isProfession())
        .averageWinningBets(obj.isAverageWinningBets())
        .bestScore(obj.isBestScore())
        .age(obj.isAge())
        .sex(obj.isSex())
        .nationality(obj.isNationality())
        .recruitTreeSize(obj.isRecruitTreeSize())
        .build();
  }
}
