package com.fanleagueent.fanleague.data.entity.mappers.recruiting;

import com.fanleagueent.fanleague.data.entity.entities.recruiting.RecruitUserEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.data.entity.mappers.MapperFactory;
import com.fanleagueent.fanleague.domain.models.recruiting.RecruitUser;

/**
 * Created by alexeyverbitskiy on 3/14/17.
 */

public class RecruitUserMapper implements Mapper<RecruitUserEntity, RecruitUser> {

  private MapperFactory mapperFactory;

  public RecruitUserMapper(MapperFactory mapperFactory) {
    this.mapperFactory = mapperFactory;
  }

  @Override public RecruitUser transform(RecruitUserEntity obj) {
    RecruitUser recruitUser = new RecruitUser();
    recruitUser.setId(obj.getId());
    recruitUser.setEmail(obj.getEmail());
    recruitUser.setUsername(obj.getUsername());
    recruitUser.setDisplayName(obj.getDisplayName());
    recruitUser.setFullName(obj.getFullName());
    recruitUser.setAvatarEntity(mapperFactory.userMapperFactory().getAvatarMapper().transform(obj.getAvatarEntity()));
    recruitUser.setFriendship(mapperFactory.userMapperFactory().getFriendshipMapper().transform(obj.getFriendship()));
    recruitUser.setFacebookConnected(obj.isFacebookConnected());
    recruitUser.setGoogleConnected(obj.isGoogleConnected());
    recruitUser.setLevel(obj.getLevel());
    recruitUser.setExpPercentage(obj.getExpPercentage());
    recruitUser.setNationality(obj.getNationality());
    recruitUser.setAverageWinningBets(obj.getAverageWinningBets());
    recruitUser.setHasBetMedal(obj.isHasBetMedal());
    recruitUser.setTreeSize(obj.getTreeSize());
    recruitUser.setStatus(obj.getStatus());

    return recruitUser;
  }
}
