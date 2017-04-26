package com.fanleagueent.fanleague.data.entity.entities.user;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * Created by alexeyverbitskiy on 11/4/16.
 */
@RequiredArgsConstructor public class DataTitleEntity {
  @SerializedName("_id") @Getter @NonNull private String id;

  @SerializedName("title") @Getter @NonNull private String title;

  @SerializedName("ident") @Getter @NonNull private String ident;
}
