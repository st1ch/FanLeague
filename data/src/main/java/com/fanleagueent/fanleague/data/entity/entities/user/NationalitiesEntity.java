package com.fanleagueent.fanleague.data.entity.entities.user;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import lombok.Getter;

/**
 * Created by alexeyverbitskiy on 11/4/16.
 */

public class NationalitiesEntity {
  @SerializedName("nationalities") private @Getter List<DataTitleEntity> dataTitles;
}
