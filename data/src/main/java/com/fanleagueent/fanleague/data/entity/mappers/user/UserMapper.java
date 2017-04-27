package com.fanleagueent.fanleague.data.entity.mappers.user;

import com.fanleagueent.fanleague.data.entity.entities.user.UserEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.user.User;

/**
 * Created by alexeyverbitskiy on 3/14/17.
 */

public class UserMapper implements Mapper<UserEntity, User> {

  private UserMapperFactory userMapperFactory;

  public UserMapper(UserMapperFactory userMapperFactory) {
    this.userMapperFactory = userMapperFactory;
  }

  @Override public User transform(UserEntity obj) {
    //TODO User not full check User Entity
    return User.builder()
        .id(obj.getId())
        .firstName(obj.getFirstName())
        .lastName(obj.getLastName())
        .username(obj.getUsername())
        .displayName(obj.getDisplayName())
        .fullName(obj.getFullName())
        .email(obj.getEmail())
        .createdAt(obj.getCreatedAt())
        .updatedAt(obj.getUpdatedAt())
        .isFriends(obj.isFriends())
        .avatar(userMapperFactory.getAvatarMapper().transform(obj.getAvatarEntity()))
        .profession(obj.getProfession())
        .nationality(obj.getNationality())
        .birthday(obj.getBirthday())
        .sex(obj.getSex())
        .favouriteFootballClubId(obj.getFavouriteFootballClubId())
        .favouriteYouthClub(obj.getFavouriteYouthClub())
        .yearlyEarnings(obj.getYearlyEarnings())
        .weeklyDepositLimit(userMapperFactory.getWeeklyDepositLimitMapper().transform(obj.getWeeklyDepositLimitEntity()))
        .isGoogleConnected(obj.isGoogleConnected())
        .isFacebookConnected(obj.isFacebookConnected())
        .level(obj.getLevel())
        .displayNameIdent(userMapperFactory.getDisplayNameIdentMapper().transform(obj.getDisplayNameIdentEntity()))
        .profileViewPermission(userMapperFactory.getProfileViewPermissionMapper().transform(obj.getProfileViewPermissionEntity()))
        .wallet(userMapperFactory.getWalletMapper().transform(obj.getWalletEntity()))
        .build();
  }
}
