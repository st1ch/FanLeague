package com.fanleagueent.fanleague.data.entity.mappers.authorization;

import com.fanleagueent.fanleague.data.entity.entities.authorization.AuthorizationEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.data.entity.mappers.MapperFactory;
import com.fanleagueent.fanleague.domain.models.authorization.Authorization;

/**
 * Created by Artem Getman on 14.03.17.
 * a.e.getman@gmail.com
 */

public class AuthorizationDataMapper implements Mapper<AuthorizationEntity, Authorization> {

  private MapperFactory mapperFactory;

  public AuthorizationDataMapper(MapperFactory mapperFactory) {
    this.mapperFactory = mapperFactory;
  }

  @Override public Authorization transform(AuthorizationEntity obj) throws RuntimeException {
    Authorization authorization = new Authorization();

    authorization.setUser(
        mapperFactory.userMapperFactory().getUserMapper().transform(obj.getUserEntity()));
    authorization.setAccessToken(obj.getAccessToken());

    return authorization;
  }
}
