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

public interface RecruitingMapperFactory {
  Mapper<ClubEntity, Club> getClubMapper();

  Mapper<FansInTreeEntity, FansInTree> getFansInTreeMapper();

  Mapper<InviteLinkEntity, InviteLink> getInviteLinkMapper();

  Mapper<RecruitGroupEntity, RecruitGroup> getRecruitGroupMapper();

  Mapper<RecruitAgeGroupsEntity, RecruitAgeGroups> getRecruitAgeGroupsMapper();

  Mapper<RecruitInvitesDataEntity, RecruitInvitesData> getRecruitInvitesDataMapper();

  Mapper<RecruitOverviewDataEntity, RecruitOverviewData> getRecruitOverviewDataMapper();

  Mapper<RecruitTreeDataEntity, RecruitTreeData> getRecruitTreeDataMapper();

  Mapper<RecruitTreeEntity, RecruitTree> getRecruitTreeMapper();

  Mapper<RecruitUserEntity, RecruitUser> getRecruitUserMapper();

  Mapper<List<RecruitUserEntity>, List<RecruitUser>> getRecruitUserListMapper();

  Mapper<Map<String, RecruitGroupEntity>, Map<String, RecruitGroup>> getRecruitGroupMapMapper();
}
