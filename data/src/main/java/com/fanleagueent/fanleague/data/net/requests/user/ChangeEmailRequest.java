package com.fanleagueent.fanleague.data.net.requests.user;

import com.google.gson.annotations.SerializedName;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor public class ChangeEmailRequest {

  @SerializedName("email") @NonNull private String email;

  @SerializedName("password") @NonNull private String password;
}
