package com.fanleagueent.fanleague.data.net.requests.user;

import com.google.gson.annotations.SerializedName;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * Created by Artem Getman on 28.03.17.
 * a.e.getman@gmail.com
 */

@RequiredArgsConstructor public class ChangeDepositRequest {
  @SerializedName("deposit_limit") @NonNull private float depositLimit;
}
