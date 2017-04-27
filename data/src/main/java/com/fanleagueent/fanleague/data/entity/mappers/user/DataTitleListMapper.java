package com.fanleagueent.fanleague.data.entity.mappers.user;

import com.fanleagueent.fanleague.data.entity.entities.user.DataTitleEntity;
import com.fanleagueent.fanleague.data.entity.mappers.Mapper;
import com.fanleagueent.fanleague.domain.models.user.DataTitle;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by alexeyverbitskiy on 3/14/17.
 */

public class DataTitleListMapper implements Mapper<List<DataTitleEntity>, List<DataTitle>> {

  private UserMapperFactory userMapperFactory;

  public DataTitleListMapper(UserMapperFactory userMapperFactory) {
    this.userMapperFactory = userMapperFactory;
  }

  @Override public List<DataTitle> transform(List<DataTitleEntity> obj) {
    List<DataTitle> dataTitles = new ArrayList<>();

    for (DataTitleEntity dataTitle : obj) {
      dataTitles.add(userMapperFactory.getDataTitleMapper().transform(dataTitle));
    }

    return dataTitles;
  }
}
