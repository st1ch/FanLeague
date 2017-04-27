package com.fanleagueent.fanleague.data.entity.entities.user;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import lombok.Getter;

public class CountriesEntity {
  @SerializedName("countries") @Getter List<DataTitleEntity> dataTitles;
}