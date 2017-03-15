package com.fanleagueent.fanleague.data.entity.mappers.locker_room;

import com.fanleagueent.fanleague.data.entity.entities.locker_room.WallEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.locker_room.Wall;

/**
 * Created by Artem Getman on 15.03.17.
 * a.e.getman@gmail.com
 */

public class WallMapper implements Mapper<WallEntity, Wall> {

  @Override public Wall transform(WallEntity obj) {
    Wall  wall = new Wall();

    wall.setMemberSince(obj.getMemberSince());
    wall.setFavouriteClub(obj.getFavouriteClub());
    wall.setFavouriteYouthClub(obj.getFavouriteYouthClub());
    wall.setProfession(obj.getProfession());
    wall.setAverageWinningBets(obj.getAverageWinningBets());
    wall.setBestScore(obj.getBestScore());
    wall.setAge(obj.getAge());
    wall.setSex(obj.getSex());
    wall.setNationality(obj.getNationality());
    wall.setNationalityIdent(obj.getNationalityIdent());
    wall.setRecruitTreeSize(obj.getRecruitTreeSize());

    return wall;
  }
}
