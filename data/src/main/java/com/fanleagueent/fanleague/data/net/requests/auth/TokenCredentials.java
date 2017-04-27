package com.fanleagueent.fanleague.data.net.requests.auth;

import com.google.gson.annotations.SerializedName;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * Created by st1ch on 09.11.2016.
 */

@RequiredArgsConstructor public class TokenCredentials {

  @SerializedName("code") @NonNull private String token;
}
