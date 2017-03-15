package com.fanleagueent.fanleague.data.entity.mappers.locker_room;

import com.fanleagueent.fanleague.data.entity.entities.locker_room.PublicWallEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.locker_room.PublicWall;

/**
 * Created by Artem Getman on 15.03.17.
 * a.e.getman@gmail.com
 */

public class PublicWallMapper implements Mapper<PublicWallEntity, PublicWall> {

  @Override public PublicWall transform(PublicWallEntity obj) {
    PublicWall publicWall = new PublicWall();

    publicWall.setMemberSince(obj.getMemberSince());
    publicWall.setFavouriteClub(obj.getFavouriteClub());
    publicWall.setFavouriteClubCurrentPosition(obj.getFavouriteClubCurrentPosition());
    publicWall.setFavouriteClubDifferencePosition(obj.getFavouriteClubDifferencePosition());
    publicWall.setFavouriteYouthClub(obj.getFavouriteYouthClub());
    publicWall.setProfession(obj.getProfession());
    publicWall.setProfessionCurrentPosition(obj.getProfessionCurrentPosition());
    publicWall.setProfessionDifferencePosition(obj.getProfessionDifferencePosition());
    publicWall.setAverageWinningBets(obj.getAverageWinningBets());
    publicWall.setBestScore(obj.getBestScore());
    publicWall.setAge(obj.getAge());
    publicWall.setAgeCurrentPosition(obj.getAgeCurrentPosition());
    publicWall.setAgeDifferencePosition(obj.getAgeDifferencePosition());
    publicWall.setSex(obj.getSex());
    publicWall.setSexCurrentPosition(obj.getSexCurrentPosition());
    publicWall.setSexDifferencePosition(obj.getSexDifferencePosition());
    publicWall.setNationality(obj.getNationality());
    publicWall.setNationalityIdent(obj.getNationalityIdent());
    publicWall.setNationalityCurrentPosition(obj.getNationalityCurrentPosition());
    publicWall.setNationalityDifferencePosition(obj.getNationalityDifferencePosition());
    publicWall.setRecruitTreeSize(obj.getRecruitTreeSize());

    return publicWall;
  }
}
