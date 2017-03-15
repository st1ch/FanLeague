package com.fanleagueent.fanleague.data.entity.mappers.locker_room;

import com.fanleagueent.fanleague.data.entity.entities.locker_room.LockerUserEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.data.entity.mappers.MapperFactory;
import com.fanleagueent.fanleague.domain.models.locker_room.LockerUser;

/**
 * Created by Artem Getman on 15.03.17.
 * a.e.getman@gmail.com
 */

public class LockerUserMapper implements Mapper<LockerUserEntity, LockerUser> {

  private MapperFactory mapperFactory;

  public LockerUserMapper(MapperFactory mapperFactory) {
    this.mapperFactory = mapperFactory;
  }

  @Override public LockerUser transform(LockerUserEntity obj) {
    LockerUser lockerUser = new LockerUser();

    lockerUser.setId(obj.getId());
    lockerUser.setAvatarEntity(
        mapperFactory.userMapperFactory().getAvatarMapper().transform(obj.getAvatarEntity()));
    lockerUser.setDisplayName(obj.getDisplayName());
    lockerUser.setAverageWinningBets(obj.getAverageWinningBets());
    lockerUser.setTotalPlayedWeeks(obj.getTotalPlayedWeeks());
    lockerUser.setAverageWinningBetsDifference(obj.getAverageWinningBetsDifference());
    lockerUser.setCommonRatingPosition(obj.getCommonRatingPosition());
    lockerUser.setDifferenceRatingPosition(obj.getDifferenceRatingPosition());
    lockerUser.setCurrentLevelExp(obj.getCurrentLevelExp());
    lockerUser.setExpPercentage(obj.getExpPercentage());
    lockerUser.setNextLevel(obj.getNextLevel());
    lockerUser.setNextLevelExp(obj.getNextLevelExp());
    lockerUser.setHasBetMedal(obj.hasBetMedal());
    lockerUser.setNationality(obj.getNationality());
    lockerUser.setLevel(obj.getLevel());
    lockerUser.setPrivacy(mapperFactory.lockerRoomMapperFactory()
        .getPrivacyMapper()
        .transform(obj.getPrivacyEntity()));
    lockerUser.setFriendship(
        mapperFactory.userMapperFactory().getFriendshipMapper().transform(obj.getFriendship()));

    return lockerUser;
  }
}
