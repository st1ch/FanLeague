package com.fanleagueent.fanleague.data.entity.mappers.user;

import com.fanleagueent.fanleague.data.entity.entities.user.DataTitleEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.user.DataTitle;

/**
 * Created by alexeyverbitskiy on 3/14/17.
 */

public class DataTitleMapper implements Mapper<DataTitleEntity, DataTitle> {


  public DataTitleMapper() {
  }

  @Override public DataTitle transform(DataTitleEntity obj) {
    return new DataTitle(obj.getId(), obj.getTitle(), obj.getIdent());
  }
}
