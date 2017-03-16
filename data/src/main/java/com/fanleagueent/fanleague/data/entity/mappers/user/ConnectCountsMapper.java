package com.fanleagueent.fanleague.data.entity.mappers.user;

import com.fanleagueent.fanleague.data.entity.entities.user.ConnectCountsEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.user.ConnectCounts;

/**
 * Created by alexeyverbitskiy on 3/14/17.
 */

public class ConnectCountsMapper implements Mapper<ConnectCountsEntity, ConnectCounts> {

  public ConnectCountsMapper() {
  }

  @Override public ConnectCounts transform(ConnectCountsEntity obj) {
    ConnectCounts connectCounts = new ConnectCounts();
    connectCounts.setFriends(obj.getFriends());
    connectCounts.setLeagues(obj.getLeagues());
    connectCounts.setTeams(obj.getTeams());

    return connectCounts;
  }
}
