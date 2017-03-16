package com.fanleagueent.fanleague.data.entity.mappers.user;

import com.fanleagueent.fanleague.data.entity.entities.user.DataTitleEntity;
import com.fanleagueent.fanleague.data.entity.entities.user.ProfessionsEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.user.DataTitle;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by alexeyverbitskiy on 3/14/17.
 */

public class ProfessionMapper implements Mapper<ProfessionsEntity, List<DataTitle>> {

  private UserMapperFactory userMapperFactory;

  public ProfessionMapper(UserMapperFactory userMapperFactory) {
    this.userMapperFactory = userMapperFactory;
  }

  @Override public List<DataTitle> transform(ProfessionsEntity obj) {
    List<DataTitle> dataTitleList = new ArrayList<>();
    for (DataTitleEntity dataTitleEntity : obj.getDataTitles()) {
      dataTitleList.add(userMapperFactory.getDataTitleMapper().transform(dataTitleEntity));
    }
    return dataTitleList;
  }
}
