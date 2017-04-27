package com.fanleagueent.fanleague.data.net.requests.user;

import com.fanleagueent.fanleague.domain.models.user.DisplayNameIdent;
import com.google.gson.annotations.SerializedName;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * Created by st1ch on 11.11.2016.
 */

@RequiredArgsConstructor public class ChangeDisplayNameRequest {
  @SerializedName("display_name_ident") @NonNull private DisplayNameIdent displayNameIdent;
}
