package com.fanleagueent.fanleague.data.entity.mappers.recruiting;

import com.fanleagueent.fanleague.data.entity.entities.recruiting.ClubEntity;
import com.fanleagueent.fanleague.data.entity.entities.recruiting.FansInTreeEntity;
import com.fanleagueent.fanleague.data.entity.entities.recruiting.InviteLinkEntity;
import com.fanleagueent.fanleague.data.entity.entities.recruiting.RecruitAgeGroupsEntity;
import com.fanleagueent.fanleague.data.entity.entities.recruiting.RecruitGroupEntity;
import com.fanleagueent.fanleague.data.entity.entities.recruiting.RecruitInvitesDataEntity;
import com.fanleagueent.fanleague.data.entity.entities.recruiting.RecruitOverviewDataEntity;
import com.fanleagueent.fanleague.data.entity.entities.recruiting.RecruitTreeDataEntity;
import com.fanleagueent.fanleague.data.entity.entities.recruiting.RecruitTreeEntity;
import com.fanleagueent.fanleague.data.entity.entities.recruiting.RecruitUserEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.data.entity.mappers.MapperFactory;
import com.fanleagueent.fanleague.domain.models.recruiting.Club;
import com.fanleagueent.fanleague.domain.models.recruiting.FansInTree;
import com.fanleagueent.fanleague.domain.models.recruiting.InviteLink;
import com.fanleagueent.fanleague.domain.models.recruiting.RecruitAgeGroups;
import com.fanleagueent.fanleague.domain.models.recruiting.RecruitGroup;
import com.fanleagueent.fanleague.domain.models.recruiting.RecruitInvitesData;
import com.fanleagueent.fanleague.domain.models.recruiting.RecruitOverviewData;
import com.fanleagueent.fanleague.domain.models.recruiting.RecruitTree;
import com.fanleagueent.fanleague.domain.models.recruiting.RecruitTreeData;
import com.fanleagueent.fanleague.domain.models.recruiting.RecruitUser;
import java.util.List;
import java.util.Map;

/**
 * Created by alexeyverbitskiy on 3/14/17.
 */

public class RecruitingMapperFactoryImpl implements RecruitingMapperFactory {

  private MapperFactory mapperFactory;

  public RecruitingMapperFactoryImpl(MapperFactory mapperFactory) {
    this.mapperFactory = mapperFactory;
  }

  @Override public Mapper<ClubEntity, Club> getClubMapper() {
    return new ClubMapper();
  }

  @Override public Mapper<FansInTreeEntity, FansInTree> getFansInTreeMapper() {
    return new FansInTreeMapper(this);
  }

  @Override public Mapper<InviteLinkEntity, InviteLink> getInviteLinkMapper() {
    return new InviteLinkMapper();
  }

  @Override public Mapper<RecruitGroupEntity, RecruitGroup> getRecruitGroupMapper() {
    return new RecruitingGroupMapper();
  }

  @Override public Mapper<RecruitAgeGroupsEntity, RecruitAgeGroups> getRecruitAgeGroupsMapper() {
    return new RecruitingAgeGroupsMapper(this);
  }

  @Override
  public Mapper<RecruitInvitesDataEntity, RecruitInvitesData> getRecruitInvitesDataMapper() {
    return new RecruitInvitesDataMapper(this);
  }

  @Override
  public Mapper<RecruitOverviewDataEntity, RecruitOverviewData> getRecruitOverviewDataMapper() {
    return new RecruitOverviewDataMapper(this);
  }

  @Override public Mapper<RecruitTreeDataEntity, RecruitTreeData> getRecruitTreeDataMapper() {
    return new RecruitTreeDataMapper(this);
  }

  @Override public Mapper<RecruitTreeEntity, RecruitTree> getRecruitTreeMapper() {
    return new RecruitTreeMapper(this);
  }

  @Override public Mapper<RecruitUserEntity, RecruitUser> getRecruitUserMapper() {
    return new RecruitUserMapper(mapperFactory);
  }

  @Override public Mapper<List<RecruitUserEntity>, List<RecruitUser>> getRecruitUserListMapper() {
    return new RecruitUserListMapper(this);
  }

  @Override
  public Mapper<Map<String, RecruitGroupEntity>, Map<String, RecruitGroup>> getRecruitGroupMapMapper() {
    return new RecruitGroupMapMapper(this);
  }
}
